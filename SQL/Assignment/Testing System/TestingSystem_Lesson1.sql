drop database if exists Lesson1;
create database Lesson1;

use Lesson1;
CREATE TABLE Department (
    DepartmentID VARCHAR(20),
    DepartmentName VARCHAR(20)
);
CREATE TABLE Position (
    PositionID VARCHAR(20),
    PositionName VARCHAR(20)
);
CREATE TABLE Account (
    AccountID VARCHAR(20),
    Email VARCHAR(30),
    Username VARCHAR(20),
    FullName VARCHAR(20),
    DepartmentID VARCHAR(20),
    PositionID VARCHAR(20),
    CreateDate DATETIME
);
CREATE TABLE `Group` (
    GroupID VARCHAR(20),
    GroupName VARCHAR(20),
    CreatorID VARCHAR(20),
    CreateDate DATETIME
);
CREATE TABLE GroupAccount (
    GroupID VARCHAR(20),
    AccountID VARCHAR(20),
    JoinDate DATETIME
);
CREATE TABLE TypeQuestion (
    TypeID VARCHAR(20),
    TypeName VARCHAR(20)
);
CREATE TABLE CategoryQuestion (
    CategoryID VARCHAR(20),
    CategoryName VARCHAR(20)
);
CREATE TABLE Question (
    QuestionID VARCHAR(20),
    Content VARCHAR(20),
    CategoryID VARCHAR(20),
    TypeID VARCHAR(20),
    CreatorID VARCHAR(20),
    CreateDate DATETIME
);
CREATE TABLE Answer (
    AnswerID VARCHAR(20),
    Content VARCHAR(20),
    QuestionID VARCHAR(20),
    isCorrect BOOLEAN
);
CREATE TABLE Exam (
    ExamID VARCHAR(20),
    Code VARCHAR(20),
    Title VARCHAR(20),
    CategoryID VARCHAR(20),
    Duration VARCHAR(20),
    CreatorID VARCHAR(20),
    CreateDate DATETIME
);
CREATE TABLE ExamQuestion (
    ExamID VARCHAR(20),
    QuestionID VARCHAR(20)
);