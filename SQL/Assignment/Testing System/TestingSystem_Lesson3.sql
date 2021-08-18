USE TestingSystem;
-- Question 1: Thêm ít nhất 10 record vào mỗi bảng:
INSERT INTO Department (DepartmentName)	
VALUES 				(	N'marketing'	),
					(	N'sales'		),
					(	N'kế toán'		),
					(	N'nhân sự'		),
                    (	N'bảo vệ'		),
                    (	N'tài vụ'		),
                    (	N'hành chính'	),
                    (	N'CSKH'			),
                    (	N'vật tư'		),
					(	N'kĩ thuật'		);
SELECT * FROM Department ORDER BY DepartmentID ASC;

INSERT INTO Position  (PositionName)
VALUES 				(	N'DEV'				),
					(	N'trưởng phòng'		),
					(	N'phó phòng'		),
					(	N'nhân viên'		),
                    (	N'giám đốc'			),
                    (	N'phó giám đốc'		),
                    (	N'thư ký'			),
                    (	N'tổng giám đốc'	),
                    (	N'phó tổng giám đốc'),
					(	N'cộng tác viên'	);
SELECT * FROM Position ORDER BY PositionID ASC;

INSERT INTO `Account`  								
VALUES 				(1, '1@gmail.com','one','nguyen van A',1,2,'2021-01-20'),
					(2, '2@gmail.com','two','nguyen thi B',2,3,'2021-02-20'),
					(3, '3@gmail.com','three','tran van C',3,4,'2021-03-20'),
					(4, '4@gmail.com','four','dao thanh D',4,5,'2021-04-20'),
                    (5, '5@gmail.com','five','le van A',5,6,'2021-05-2'),
					(6, '6@gmail.com','six','ngo van B',6,7,'2021-05-20'),
					(7, '7@gmail.com','seven','luong thi C',7,8,'2021-04-20'),
					(8, '8@gmail.com','eight','tran van D',8,9,'2021-03-20'),
					(9, '9@gmail.com','nine','nguyen thi E',9,10,'2021-02-20'),
					(10, '10@gmail.com','ten','le van E',10,1,'2021-01-20');
SELECT * FROM account;
                    
INSERT INTO `Group`									
VALUES				(1, 'group1',10,'2021-6-28'),
					(2, 'group2',9,'2021-7-28'),
					(3, 'group3',9,'2021-8-28'),
					(4, 'group4',8,'2021-9-28'),
                    (5, 'group5',7,'2021-10-28'),
					(6, 'group6',6,'2021-11-28'),
					(7, 'group7',7,'2021-12-28'),
					(8, 'group8',5,'2021-6-28'),
					(9, 'group9',7,'2021-7-28'),
					(10, 'group10',1,'2021-7-20');
SELECT * FROM `Group`;
                    
INSERT INTO  GroupAccount 	
VALUES 				(1,2,'2021-6-23'),
					(2,4,'2021-5-23'),
					(3,7,'2021-4-23'),
					(4,1,'2021-6-23'),
                    (5,7,'2021-6-23'),
					(6,9,'2021-5-23'),
					(7,4,'2021-5-23'),
					(8,9,'2021-5-23'),
					(9,5,'2021-3-23'),
					(10,3,'2021-6-23');
SELECT * FROM groupaccount;
                    
INSERT INTO TypeQuestion  
VALUES 				(1,N'loại 1'),
					(2,N'loại 2'),
					(3,N'loại 3'),
					(4,N'loại 4'),
                    (5,N'loại 5'),
					(6,N'loại 6'),
					(7,N'loại 7'),
					(8,N'loại 8'),
					(9,N'loại 9'),
					(10,N'loại 10');
SELECT * FROM typequestion;
                    
INSERT INTO CategoryQuestion  
VALUES				(1,N'Toán'),
					(2,N'Văn'),
					(3,N'Anh'),
					(4,N'Lý'),
                    (5,N'CTDL'),
					(6,N'CNXH'),
					(7,N'LSĐCSVN'),
					(8,N'PLĐC'),
					(9,N'XLA'),
					(10,N'SQL');
SELECT * FROM categoryquestion;

INSERT INTO `Question` 
VALUES 			    (1,N'content1',1,10,10,'2021-1-26'),
					(2,N'content2',2,9,3,'2021-2-26'),
					(3,N'content3',3,8,3,'2021-3-26'),
					(4,N'content4',4,7,2,'2021-2-26'),
                    (5,N'content5',5,6,4,'2021-1-26'),
					(6,N'content6',6,5,6,'2021-1-26'),
					(7,N'content7',7,4,5,'2021-4-26'),
					(8,N'content8',8,3,7,'2021-5-26'),
					(9,N'content9',9,2,8,'2021-6-26'),
					(10,N'content10',10,1,9,'2020-10-26');
SELECT * FROM question;                    

INSERT INTO `answer` 
VALUES				(1,'content1',1,1),
					(2,'content2',2,2),
					(3,'content3',3,3),
					(4,'content4',4,4),
                    (5,'content5',5,5),
					(6,'content6',6,3),
					(7,'content7',6,2),
					(8,'content8',3,1),
					(9,'content9',2,9),
					(10,'content10',1,10);
SELECT * FROM answer;
				
INSERT INTO Exam  
VALUES 				(1,211,N'Giữa kì 1',1,90,1,'2021-6-15'),
					(2,212,N'Giữa kì 2',2,60,2,'2021-5-15'),
					(3,213,N'Giữa kì 3',3,45,3,'2021-4-15'),
					(4,214,N'Giữa kì 4',4,30,4,'2021-3-15'),
					(5,215,N'Giữa kì 5',5,30,5,'2021-5-15'),
                    (6,216,N'Giữa kì 6',5,15,1,'2021-2-15'),
					(7,217,N'Giữa kì 7',4,90,6,'2021-1-15'),
					(8,218,N'Giữa kì 8',3,90,7,'2021-2-15'),
					(9,219,N'Giữa kì 9',9,60,8,'2021-4-15'),
					(10,2110,N'Giữa kì 10',10,15,1,'2021-1-15');
SELECT * FROM Exam;

INSERT INTO ExamQuestion 
VALUES 				(1,1),
					(2,2),
					(3,3),
					(4,5),
					(5,9),
                    (6,4),
					(7,9),
					(8,7),
					(1,2),
					(10,7);
SELECT * FROM ExamQuestion;

-- Question 2: 
SELECT * FROM Department ORDER BY DepartmentID ASC;

-- Question 3:
SELECT DepartmentID FROM Department WHERE DepartmentName = 'Sales';

-- Question 4:
-- Exist multiple accounts with the same full name length 
SELECT AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate, LENGTH(FullName) AS 'Length of Name'
FROM Account WHERE LENGTH(FullName)=(SELECT MAX(LENGTH(FullName)) FROM Account);
-- Exist one Account has max length of FullName
SELECT AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate, LENGTH(FullName) AS 'Length of Name'
FROM Account ORDER BY LENGTH(FullName) DESC LIMIT 1;

-- Question 5:
SELECT AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate, LENGTH(FullName) AS 'Length of Name'
FROM Account WHERE DepartmentID = 3 ORDER BY LENGTH(FullName) DESC LIMIT 1;

-- Question 6:
SELECT GroupName FROM `Group` WHERE CreateDate < '2019-12-20';

-- Question 7:
SELECT QuestionID, COUNT(*) AS "Total Answer" FROM Answer GROUP BY QuestionID HAVING "Total Answer" >= 2;

-- Question 8:
SELECT ExamID FROM Exam WHERE Duration >= 60 AND CreateDate < '2019-12-20';

-- Question 9:
SELECT * FROM `Group` ORDER BY CreateDate ASC LIMIT 5;

-- Question 10:
SELECT DepartmentID, COUNT(*) AS 'Total Employee' FROM `Account` WHERE DepartmentID = 2 GROUP BY DepartmentID;

-- Question 11:
SELECT AccountID, UserName, FullName FROM `Account` WHERE FullName LIKE 'D%o';

-- Question 12:
DELETE FROM Exam WHERE CreateDate < '2019-12-20';

-- Question 13:
DELETE FROM Question WHERE Content LIKE N'câu hỏi%';

-- Question 14:
UPDATE `Account` SET FullName = N'Nguyễn Bá Lộc', Email = 'loc.nguyenba@vti.com.vn' WHERE AccountID = 5;

-- Question 15:
UPDATE GroupAccount SET GroupID = 4 WHERE AccountID = 5;
