USE TestingSystem;

-- Question 1:
DROP PROCEDURE IF EXISTS GetAccountOfDepartment;
DELIMITER $$
CREATE PROCEDURE GetAccountOfDepartment(IN in_department_name VARCHAR(30))
	BEGIN
		SELECT 
			b.AccountID, b.FullName
        FROM 
			Department a
            INNER JOIN `Account` b ON a.DepartmentID = b.DepartmentID
		WHERE
			DepartmentName = in_department_name;
    END$$
DELIMITER ;

CALL GetAccountOfDepartment('CSKH');

-- Question 2:
DROP PROCEDURE IF EXISTS GetTotalAccount;
DELIMITER $$
CREATE PROCEDURE GetTotalAccount()
	BEGIN
		SELECT 
			a.GroupID, a.GroupName, COUNT(b.AccountID) AS 'Total'
		FROM
			`Group` a
            LEFT JOIN groupaccount b ON a.GroupID = b.GroupID
		GROUP BY 
			a.GroupID;
    END$$
DELIMITER ;

CALL GetTotalAccount();

-- Question 3:
DROP PROCEDURE IF EXISTS p_Q3;
DELIMITER $$
CREATE PROCEDURE p_Q3()
	BEGIN
		SELECT 
			a.TypeID, a.TypeName, COUNT(b.QuestionID)
		FROM 
			typequestion a
            LEFT JOIN Question b ON a.TypeID = b.TypeID
		WHERE
			MONTH(CreateDate) = MONTH(CURDATE())
        GROUP BY 
			a.TypeID;
    END$$
DELIMITER ;

CALL p_Q3();

-- Question 4:
DROP PROCEDURE IF EXISTS p_Q4;
DELIMITER $$
CREATE PROCEDURE p_Q4()
	BEGIN
		SELECT 
			a.TypeID
		FROM 
			typequestion a
            INNER JOIN Question b ON a.TypeID = b.TypeID
        GROUP BY 
			a.TypeID
		HAVING
			COUNT(b.QuestionID) = 
            (SELECT COUNT(QuestionID) 
            FROM Question 
            GROUP BY TypeID ORDER BY COUNT(questionID) DESC LIMIT 1);
    END$$
DELIMITER ;

CALL p_Q4();

-- Question 5:
DROP PROCEDURE IF EXISTS p_Q5;
DELIMITER $$
CREATE PROCEDURE p_Q5()
	BEGIN
		SELECT 
			a.TypeName
		FROM 
			typequestion a
            INNER JOIN Question b ON a.TypeID = b.TypeID
        GROUP BY 
			a.TypeID
		HAVING
			COUNT(b.QuestionID) = 
            (SELECT COUNT(QuestionID) 
            FROM Question 
            GROUP BY TypeID ORDER BY COUNT(questionID) DESC LIMIT 1);
    END$$
DELIMITER ;

CALL p_Q5;

-- Question 6:
DROP PROCEDURE IF EXISTS p_Q6;
DELIMITER $$
CREATE PROCEDURE p_Q6(IN in_String VARCHAR(30))
	BEGIN
		SELECT a.GroupName 
        FROM `group` a
        WHERE a.GroupName LIKE CONCAT("%",in_String,"%");
		SELECT b.Username 
        FROM `account` b
        WHERE b.Username LIKE CONCAT("%",in_String,"%");
    END$$
DELIMITER ;


CALL p_Q6("1");

-- Cách 2 Q6:
DROP PROCEDURE IF EXISTS p_Q6;
DELIMITER $$
CREATE PROCEDURE p_Q6 (IN in_string VARCHAR(50))
	BEGIN
	WITH CTE_Q6 AS 
    (SELECT groupName FROM `group` 
	UNION
	SELECT username FROM `account`)
	SELECT groupName AS `Result` FROM CTE_Q6  WHERE groupName LIKE CONCAT ('%',in_string,'%');
    END$$
DELIMITER ;
call p_Q6('1'); 

-- Question 7:
DROP PROCEDURE IF EXISTS p_Q7;
DELIMITER $$
CREATE PROCEDURE p_Q7(IN in_FullName VARCHAR(50), IN in_Email VARCHAR(50))
	BEGIN
		DECLARE var_UserName 		VARCHAR(30) DEFAULT SUBSTRING_INDEX(in_Email,'@',1);
        DECLARE var_DepartmentID	TINYINT UNSIGNED DEFAULT 11;
        DECLARE var_PositionID		TINYINT UNSIGNED DEFAULT 1;
        DECLARE var_CreateDate		DATE DEFAULT NOW();
        
        INSERT INTO `Account` (Email, UserName, FullName, DepartmentID, PositionID, CreateDate)
        VALUES	(in_Email, var_UserName, in_FullName, var_DepartmentID, var_PositionID, var_CreateDate);
    END$$
DELIMITER ;

CALL p_Q7("Trần Anh","tanhtuan@gmail.com");

-- Question 8:
DROP PROCEDURE IF EXISTS p_Q8;
DELIMITER $$
CREATE PROCEDURE p_Q8(IN in_TypeQues ENUM("Essay","Multiple_Choice"))
	BEGIN
		SELECT 
			a.QuestionID, a.Content
		FROM 
			Question a
            INNER JOIN TypeQuestion b ON a.TypeID = b.TypeID
		WHERE 
			b.TypeName = in_TypeQues
		GROUP BY 
			a.TypeID
		HAVING
			CHAR_LENGTH(a.Content) = MAX(CHAR_LENGTH(a.Content));
    END$$
DELIMITER ;

CALL p_Q8("Essay");

-- Question 9:
DROP PROCEDURE IF EXISTS p_Q9;
DELIMITER $$
CREATE PROCEDURE p_Q9(IN in_ExamID TINYINT UNSIGNED)
	BEGIN
		DELETE FROM ExamQuestion 
        WHERE		ExamID = in_ExamID;
        DELETE FROM Exam
        WHERE		ExamID = in_ExamID;
    END$$
DELIMITER ;

CALL p_Q9(10);

-- Question 10:
DROP PROCEDURE IF EXISTS p_Q10;
DELIMITER $$
CREATE PROCEDURE p_Q10()
	BEGIN
		DECLARE var_ExamID 				TINYINT UNSIGNED;
        DECLARE var_CountExam			TINYINT UNSIGNED DEFAULT 0;
        DECLARE var_CountExamQuestion	TINYINT UNSIGNED DEFAULT 0;
        DECLARE v_print_Del_info_Exam VARCHAR(50);
        DECLARE i TINYINT UNSIGNED DEFAULT 1;

       
		DROP TABLE IF EXISTS ExamCreateBefore3Years;
        CREATE TABLE ExamCreateBefore3Years(
			ID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            ExamID	TINYINT UNSIGNED
        );
		
        INSERT INTO ExamCreateBefore3Years(ExamID)
		SELECT ExamID 
		FROM Exam
		WHERE
		(YEAR(NOW())-YEAR(CreateDate))=0;
        
		SELECT count(1) INTO var_CountExam FROM ExamCreateBefore3Years; 
		SELECT count(1) INTO var_CountExamquestion 
        FROM examquestion ex
		INNER JOIN ExamCreateBefore3Years et ON  ex.ExamID = et.ExamID;
-- Thực hiện xóa trên bảng Exam và ExamQuestion sử dụng Procedure đã tạo ở Question9 bên trên
		WHILE (i <= var_CountExam) DO
			SELECT ExamID INTO var_ExamID FROM ExamCreateBefore3Years WHERE ID=i; 
			CALL p_Q9(var_ExamID); 
        SET i = i +1;
		END WHILE;
-- In câu thông báo 
		SELECT CONCAT("DELETE ",var_CountExam," IN Exam AND ", var_CountExamquestion ," IN ExamQuestion") INTO v_print_Del_info_Exam;  
		SIGNAL SQLSTATE '45000'  
		SET MESSAGE_TEXT = v_print_Del_info_Exam ;      
-- Xóa bảng tạm sau khi hoàn thành
	DROP TABLE IF EXISTS ExamIDBefore3Year_Temp;
    END$$
DELIMITER ;

CALL p_Q10();


-- Question 11:
DROP PROCEDURE IF EXISTS p_Q11;
DELIMITER $$
CREATE PROCEDURE p_Q11(IN in_DepartmentName VARCHAR(30))
	BEGIN
		DECLARE var_DepartmentID TINYINT UNSIGNED;
        SELECT var_DepartmentID = DepartmentID
        FROM Department
        WHERE
			DepartmentName = in_DepartmentName;
            
		UPDATE `Account`
        SET 
			DepartmentID = 11
		WHERE 
			DepartmentID = var_DepartmentID;
            
		DELETE FROM Department 
        WHERE 
			DepartmentName = in_DepartmentName;
    END$$
DELIMITER ;

CALL p_Q11();

-- Question 12:
DROP PROCEDURE IF EXISTS p_Q12;
DELIMITER $$
CREATE PROCEDURE p_Q12()
	BEGIN
		DROP TABLE IF EXISTS MonthsPerYear;
        CREATE TABLE MonthsPerYear(
			MonthID 	TINYINT UNSIGNED PRIMARY KEY
        );
        INSERT INTO MonthsPerYear 
        VALUES (1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12);
        SELECT M.MonthID AS `Month`, COUNT(MONTH(Q.CreateDate)) AS SL  
        FROM MonthsPerYear M
		LEFT JOIN (SELECT * FROM Question Q1 WHERE YEAR(Q1.CreateDate) = YEAR(NOW()) )  Q 
		ON M.MonthID = MONTH(Q.CreateDate) 
		GROUP BY M.MonthID;
    END$$
DELIMITER ;

CALL p_Q12();

-- Question 13:
DROP PROCEDURE IF EXISTS p_Q13;
DELIMITER $$
CREATE PROCEDURE p_Q13()
	BEGIN
        SELECT 
			MONTH(CreateDate), YEAR(CreateDate), 
            CASE WHEN COUNT(QuestionID) = 0 THEN 'không có câu hỏi nào trong tháng'
					ELSE COUNT(QuestionID)
			END AS 'SL'
		FROM 
			Question
		WHERE
			CreateDate > now() - INTERVAL 6 MONTH
            AND
            CreateDate < now()
		GROUP BY
			MONTH(CreateDate);
	END$$
DELIMITER ;
CALL p_Q13();
