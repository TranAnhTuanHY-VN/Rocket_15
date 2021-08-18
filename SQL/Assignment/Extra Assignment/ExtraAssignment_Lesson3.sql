DROP DATABASE IF EXISTS ExtraAssignment3;
CREATE DATABASE ExtraAssignment3;

USE ExtraAssignment3;
CREATE TABLE Trainee
(
	TraineeID 			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Full_Name 			VARCHAR(50) NOT NULL,
    Birth_Date 			TIMESTAMP NOT NULL,
    Gender 				ENUM('Male','Female','Unknown'),
    ET_IQ				TINYINT UNSIGNED NOT NULL,CHECK(ET_IQ<=20),
    ET_Gmath			TINYINT	UNSIGNED NOT NULL,CHECK(ET_Gmath<=20),
    ET_English			TINYINT	UNSIGNED NOT NULL,CHECK(ET_English<=50),
    Training_Class		VARCHAR(20) NOT NULL,
    Evaluation_Notes	TEXT
);

-- Question 1: Them 10 ban ghi.
INSERT INTO Trainee
VALUES 		(1,'John Cena','2001-09-20','Male',10,9,30,'KHMT','abcxyz'),
			(2,'Peter','2000-08-20','Male',9,15,20,'KTPM','bcd'),
            (3,'David','1999-07-20','Male',5,20,40,'CNTT','cde'),
            (4,'Cristiano','1995-06-20','Male',20,20,50,'HTTT','aabc'),
            (5,'Nguyen Thi A','2000-05-20','FeMale',15,5,30,'KHMT','quac'),
            (6,'Tran Van C','2000-04-20','Male',10,10,30,'KTPM','xyz'),
            (7,'Tran Thi D','2002-03-20','FeMale',10,15,35,'KHMT','yz'),
            (8,'Jony Dang','1999-02-20','Male',10,5,40,'CNTT','zbc'),
            (9,'Dao Van E','2000-01-20','FeMale',10,10,30,'KHMT','hxyz'),
			(10,'Ngo Van B','1999-12-20','Male',10,10,30,'KHMT','hyz');

-- Question 2:
SELECT MONTH(Birth_Date), COUNT(*) AS "Total", GROUP_CONCAT(Full_Name) AS "List Trainee" FROM Trainee GROUP BY MONTH(Birth_Date);
-- Question 3:
SELECT Full_Name, YEAR(CURDATE()) - YEAR(Birth_Date) AS 'Tuoi', Gender, CHAR_LENGTH(Full_Name) 
FROM Trainee ORDER BY CHAR_LENGTH(Full_Name) DESC LIMIT 1;
-- Nhiều thằng bằng nhau thì tìm max_length xong tìm thủ công
-- CHAR_LENGTH: Tính độ dài tính cả ký tự. 
-- Question 4:
SELECT TraineeID, Full_Name, Birth_Date, Gender FROM Trainee 
WHERE (ET_IQ + ET_Gmath) >= 20 AND ET_IQ >= 8 AND ET_Gmath >= 8 AND ET_English >=18;
-- Question 5:
DELETE FROM Trainee WHERE TraineeID = 3;
-- Question 6:
UPDATE Trainee SET Training_Class = '2' WHERE TraineeID = 5;