USE testingsystem;

-- Question 1:
DROP TRIGGER IF EXISTS Trg_Q1;
DELIMITER $$
CREATE TRIGGER Trg_Q1
BEFORE INSERT ON `Group`
FOR EACH ROW
BEGIN
	IF NEW.CreateDate < NOW() - INTERVAL 1 YEAR -- = DATE_SUB(NOW(), interval 1 year)
    THEN
		SIGNAL SQLSTATE '12345' -- disallow this record
        SET MESSAGE_TEXT='Entry date must not be more than 1 year ago';
        END IF;
END$$
DELIMITER ;

SELECT * FROM `GROUP`;
INSERT INTO `Group`
VALUE (13,'Thirteen ',10,'2019-1-21');

-- Question 2:
DROP TRIGGER IF EXISTS Trg_Q2;
DELIMITER $$
CREATE TRIGGER Trg_Q2
BEFORE INSERT ON Account
FOR EACH ROW
BEGIN
	IF NEW.DepartmentID = (SELECT DepartmentID FROM Department WHERE DepartmentName = 'Sales')
    THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'Department "Sale" cannot add more user';
	END IF;
END$$
DELIMITER ;
SELECT DepartmentID FROM Department WHERE DepartmentName = 'Sale';
INSERT INTO Account
VALUE (14,'ass22@gmail.com','ass','ass bitch',2,10,'2021-5-20');

-- Question3:
DROP TRIGGER IF EXISTS Trg_Q3;
DELIMITER $$
CREATE TRIGGER Trg_Q3
BEFORE INSERT ON GroupAccount
FOR EACH ROW
BEGIN
	DECLARE var_TotalAccountInGroup		TINYINT;
    SELECT COUNT(AccountID) INTO var_TotalAccountInGroup
    FROM GroupAccount
    WHERE GroupID = NEW.GroupID;
    IF var_TotalAccountInGroup >= 5
    THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT='Cant add more User to This Group';
	END IF;
END$$
DELIMITER ;

INSERT INTO GroupAccount
VALUE (1,1,'2021-2-20');

-- Question4:
DROP TRIGGER IF EXISTS Trg_Q4;
DELIMITER $$
CREATE TRIGGER Trg_Q4
BEFORE INSERT ON ExamQuestion
FOR EACH ROW
BEGIN
	DECLARE var_CountQuesInExam TINYINT; 
	SELECT count(EQ.ExamID) INTO var_CountQuesInExam 
    FROM examquestion
	WHERE ExamID = NEW.ExamID; 
		IF (var_CountQuesInExam >10) THEN 
			SIGNAL SQLSTATE '12345' 
			SET MESSAGE_TEXT = 'Num Question in this Exam is limited 10';
	END IF;
END$$
DELIMITER ;

INSERT INTO `examquestion` VALUES (6, 2);

-- Question5:
DROP TRIGGER IF EXISTS Trg_Q5;
DELIMITER $$
CREATE TRIGGER Trg_Q5
BEFORE DELETE ON Account 
FOR EACH ROW
BEGIN
	DECLARE v_Email VARCHAR(50); 
    SET v_Email = 'admin@gmail.com';
    IF (OLD.Email = v_Email) THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'This User Admin, U cant delete it!!'; 
    END IF;
END$$
DELIMITER ;

INSERT INTO Account VALUE (14,'admin@gmail.com','admin','admin',10,10,'2020-10-20');
DELETE FROM Account WHERE AccountID=14;

-- Question6:
DROP TRIGGER IF EXISTS Trg_Q6;
DELIMITER $$
CREATE TRIGGER Trg_Q6
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN
	DECLARE v_WaittingRoom VARCHAR(50); 
	SELECT D.DepartmentID INTO v_WaittingRoom 
    FROM 
		department D 
	WHERE
		D.DepartmentName = 'Waitting Room';
	IF (NEW.DepartmentID IS NULL ) 
    THEN 
		SET NEW.DepartmentID = v_WaittingRoom; 
	END IF;
END$$
DELIMITER ;

INSERT INTO `Account`(AccountID,Email,Username,FullName,PositionID,CreateDate)
VALUE (15,'15@gmail.com','Fifteen','Fifteen Number',10,'2020-2-20');


-- Question7:
DROP TRIGGER IF EXISTS Trg_Q7;
DELIMITER $$
CREATE TRIGGER Trg_Q7
BEFORE INSERT ON Answer 
FOR EACH ROW
BEGIN

END$$
DELIMITER ;


-- Question 8:
DROP TRIGGER IF EXISTS Trg_Q8;
DELIMITER $$
CREATE TRIGGER Trg_Q8
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN
	IF NEW.Gender = 'Nam' 
    THEN
		SET NEW.Gender = 'M';
	ELSEIF NEW.Gender = 'Nu' 
    THEN 
		SET NEW.Gender = 'F';
	ELSEIF NEW.Gender = 'Chưa xác định' THEN 
		SET NEW.Gender = 'U';
	END IF ;
END$$
DELIMITER ;
-- data not exist in database

-- Question 9:
DROP TRIGGER IF EXISTS Trg_Q9;
DELIMITER $$
CREATE TRIGGER Trg_Q9
BEFORE DELETE ON `exam`
FOR EACH ROW
BEGIN
	DECLARE v_CreateDate DATETIME;
	SET v_CreateDate =  DATE_SUB(NOW(),INTERVAL 2 DAY);
	IF (OLD.CreateDate > v_CreateDate) THEN
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT = 'Cant Delete This Exam!!';
	END IF ;      
END $$
DELIMITER ;

DELETE FROM exam WHERE ExamID =1; 

-- Question 10:
-- Update
DROP TRIGGER IF EXISTS Trg_Q10_1;
DELIMITER $$
CREATE TRIGGER Trg_Q10_1
BEFORE UPDATE ON `question`
FOR EACH ROW
BEGIN
	DECLARE v_CountQuesByID TINYINT;
	SET v_CountQuesByID =  -1;
	SELECT count(1) INTO v_CountQuesByID 
    FROM 
		examquestion ex  
    WHERE 
		ex.QuestionID = NEW.QuestionID;
	IF (v_CountQuesByID != -1) THEN
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT = 'Cant Update This Question';
	END IF ;      
END $$
DELIMITER ;

UPDATE `question` SET `Content` = 'Question Test'
WHERE `QuestionID` = '253'; 

-- DELETE
DROP TRIGGER IF EXISTS Trg_Q10_2;
DELIMITER $$
CREATE TRIGGER Trg_Q10_2
BEFORE DELETE ON `question`
FOR EACH ROW
BEGIN
	DECLARE v_CountQuesByID TINYINT;
	SET v_CountQuesByID =  -1;
	SELECT count(1) INTO v_CountQuesByID 
    FROM 
		examquestion ex  
	WHERE 
		ex.QuestionID = OLD.QuestionID;
	IF (v_CountQuesByID != -1) THEN
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT = 'Cant Delete This Question';
	END IF ;      
END $$
DELIMITER ;

DELETE FROM `testingsystem`.`question` WHERE (`QuestionID` = '253');

-- Question 12:
SELECT * FROM exam;
SELECT 
	e.ExamID, e.Code, e.Title , 
    CASE WHEN Duration <= 30 THEN 'Short time' 
		WHEN Duration <= 60 THEN 'Medium time'
	ELSE 'Longtime' 
    END AS Duration, e.CreateDate, e.Duration 
FROM exam e;

-- Question 13:
SELECT GA.GroupID, COUNT(GA.GroupID), 
		CASE
			WHEN COUNT(GA.GroupID) <= 5 THEN 'few' 
			WHEN COUNT(GA.GroupID) <= 20  THEN 'normal' 
		ELSE 'higher' 
		END AS the_number_user_amount
FROM groupaccount GA
GROUP BY GA.GroupID;

-- Question 14:
SELECT D.DepartmentName, 
	CASE 
		WHEN COUNT(A.DepartmentID) = 0 THEN 'Không có User' 
		ELSE COUNT(A.DepartmentID)
	END AS SL
FROM department D 
LEFT JOIN  account A  ON D.DepartmentID = A.DepartmentID
GROUP BY d.DepartmentID; 