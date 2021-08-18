DROP DATABASE IF EXISTS TestingSystem;
CREATE DATABASE TestingSystem;
-- QUestion  1,2:Tối ưu, thêm các constrain:
USE TestingSystem;
CREATE TABLE Department (
    DepartmentID 	TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    DepartmentName 	VARCHAR(30) NOT NULL UNIQUE KEY
);
CREATE TABLE Position (
    PositionID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    PositionName 	VARCHAR(30) NOT NULL UNIQUE KEY
);
CREATE TABLE Account (
    AccountID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Email 			VARCHAR(40) UNIQUE KEY,
    Username 		VARCHAR(20) NOT NULL UNIQUE KEY,
    FullName 		VARCHAR(20) NOT NULL,
    DepartmentID 	TINYINT UNSIGNED,
    PositionID 		TINYINT UNSIGNED,
    CreateDate 		DATE
);
CREATE TABLE `Group` (
    GroupID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    GroupName 		VARCHAR(20) NOT NULL UNIQUE KEY,
    CreatorID 		TINYINT UNSIGNED NOT NULL,
    CreateDate 		DATE
);
CREATE TABLE GroupAccount (
    GroupID 		TINYINT UNSIGNED NOT NULL,
    AccountID 		TINYINT UNSIGNED NOT NULL,
    JoinDate 		DATE,
    PRIMARY KEY(GroupID,AccountID)
);
CREATE TABLE TypeQuestion (
    TypeID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    TypeName 		VARCHAR(30) NOT NULL
);
CREATE TABLE CategoryQuestion (
    CategoryID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    CategoryName 	VARCHAR(20) NOT NULL UNIQUE KEY
);
CREATE TABLE Question (
    QuestionID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Content 		VARCHAR(50),
    CategoryID 		TINYINT UNSIGNED,
    TypeID 			TINYINT UNSIGNED,
    CreatorID 		TINYINT UNSIGNED,
    CreateDate 		DATE
);
CREATE TABLE Answer (
    AnswerID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Content 		VARCHAR(50)	NOT NULL,
    QuestionID 		TINYINT UNSIGNED NOT NULL,
    isCorrect 		BOOLEAN
);
CREATE TABLE Exam (
    ExamID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Code 			SMALLINT NOT NULL UNIQUE KEY,
    Title 			VARCHAR(40),
    CategoryID 		TINYINT UNSIGNED ,
    Duration 		TINYINT ,
    CreatorID 		TINYINT UNSIGNED,
    CreateDate 		DATE
);
CREATE TABLE ExamQuestion (
    ExamID 			TINYINT UNSIGNED NOT NULL,
    QuestionID 		TINYINT UNSIGNED NOT NULL,
    PRIMARY KEY(ExamID,QuestionID)
);
-- Question 3: Insert data
INSERT INTO Department (DepartmentName)	
VALUES 				(	N'marketing1'	),
					(	N'sales1'	),
					(	N'kế toán1'	),
					(	N'nhân sự1'	),
					(	N'kĩ thuật1'	);
SELECT * FROM department;
INSERT INTO Position  (PositionName)		
VALUES 				(	N'abc'),
					(	N'def'	),
					(	N'gik'	),
					(	N'hiih'	),
					(	N'haha'	),
					(	N'cộng tác ');
SELECT * FROM Position;
INSERT INTO `Account`  								
VALUES 				(6, '6@gmail.com','six','nguyen van A',1,1,'2021-06-20'),
					(1, '1@gmail.com','one','nguyen van B',2,2,'2021-06-20'),
					(2, '2@gmail.com','two','nguyen van B',2,2,'2021-06-20'),
					(3, '3@gmail.com','three','nguyen van B',2,2,'2021-06-20');
					(7, '7@gmail.com','seven','nguyen van B',2,2,'2021-06-20'),
					(8, '8@gmail.com','eight','nguyen van C',3,3,'2021-06-20'),
					(4, '4@gmail.com','four','nguyen van D',4,4,'2021-06-20'),
					(5, '5@gmail.com','five','nguyen van E',5,5,'2021-06-20');
INSERT INTO `Group`									
VALUES				(1, 'group1',1,'2021-6-28'),
					(2, 'group2',2,'2021-6-28'),
					(3, 'group3',3,'2021-6-28'),
					(4, 'group4',4,'2021-6-28'),
					(5, 'group5',5,'2021-6-28');
INSERT INTO  GroupAccount 	
VALUES 				(1,1,'2021-6-23'),
					(2,2,'2021-6-23'),
					(3,3,'2021-6-23'),
					(4,4,'2021-6-23'),
					(5,5,'2021-6-23');
INSERT INTO TypeQuestion  
VALUES 				(1,N'loại 1'),
					(2,N'loại 2'),
					(3,N'loại 3'),
					(4,N'loại 4'),
					(5,N'loại 5');
INSERT INTO CategoryQuestion  
VALUES				(1,N'Toán'),
					(2,N'Văn'),
					(3,N'Anh'),
					(4,N'Lý'),
					(5,N'Hóa');
INSERT INTO `Question` 
VALUES 			    (1,N'content1',1,1,1,'2021-6-26'),
					(2,N'content2',2,2,2,'2021-6-26'),
					(3,N'content3',3,3,3,'2021-6-26'),
					(4,N'content4',4,4,4,'2021-6-26'),
					(5,N'content5',5,5,5,'2021-6-26');
INSERT INTO `answer` 
VALUES				(1,'content1',1,1),
					(2,'content2',2,2),
					(3,'content3',3,3),
					(4,'content4',4,4),
					(5,'content5',5,5);
INSERT INTO exam  
VALUES 				(1,211,N'Giữa kì 1',1,90,1,'2021-6-15'),
					(2,212,N'Giữa kì 2',2,45,2,'2021-6-15'),
					(3,213,N'Giữa kì 3',3,90,3,'2021-6-15'),
					(4,214,N'Giữa kì 4',4,90,4,'2021-6-15'),
					(5,215,N'Giữa kì 5',5,45,5,'2021-6-15');

INSERT INTO ExamQuestion 
VALUES 				(1,1),
					(2,2),
					(3,3),
					(4,4),
					(5,5);
                                                                            