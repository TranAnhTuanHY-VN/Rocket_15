USE TestingSystem;

/*Exercise 1:*/
-- Question 1:
SELECT a.UserName, a.FullName, b.DepartmentName 
FROM `Account` a LEFT JOIN Department b ON a.DepartmentID = b.DepartmentID;

-- Question 2:
SELECT * FROM `Account` WHERE CreateDate > '2010-12-20';

-- Question 3:
SELECT a.AccountID, a.UserName, a.FullName 
FROM `Account` a JOIN Position b ON a.PositionID=b.PositionID WHERE PositionName='DEV';

-- Question 4:
SELECT a.*, COUNT(*) AS 'Total' FROM Department a 
JOIN `Account` b ON a.DepartmentID=b.DepartmentID 
GROUP BY a.DepartmentID HAVING COUNT(*) > 3;

-- Question 5:
SELECT a.QuestionID, a.Content, COUNT(*) AS 'SL'
FROM Question a INNER JOIN ExamQuestion b ON a.QuestionID = b.QuestionID
GROUP BY a.QuestionID HAVING COUNT(*) = (SELECT COUNT(*) FROM ExamQuestion GROUP BY QuestionID ORDER BY COUNT(*) DESC LIMIT 1);

SELECT * FROM ExamQuestion;

-- Question 6:
SELECT a.CategoryID, a.CategoryName, COUNT(b.CategoryID) AS 'Total'
FROM CategoryQuestion a LEFT JOIN Question b ON a.CategoryID = b.CategoryID 
GROUP BY CategoryID;

-- Question 7:
SELECT a.QuestionID, a.Content, COUNT(b.QuestionID) AS 'Total'
FROM Question a LEFT JOIN ExamQuestion b ON a.QuestionID = b.QuestionID
GROUP BY QuestionID;
Select * from examquestion;

-- Question 8:
SELECT a.QuestionID, a.Content, COUNT(b.QuestionID)
FROM Question a INNER JOIN Answer b ON a.QuestionID = b.QuestionID
GROUP BY QuestionID HAVING COUNT(b.QuestionID) = (SELECT COUNT(QuestionID) FROM Answer GROUP BY QuestionID ORDER BY COUNT(QuestionID) DESC LIMIT 1);

-- Question 9:
SELECT a.GroupID, a.GroupName, COUNT(b.AccountID) AS "Total Account"
FROM `Group` a LEFT JOIN GroupAccount b ON a.GroupID = b.GroupID
GROUP BY GroupID;

-- Question 10:
SELECT a.PositionID, a.PositionName, COUNT(b.AccountID) AS "Total Account"
FROM Position a LEFT JOIN `Account` b ON a.PositionID = b.PositionID
GROUP BY PositionID 
HAVING COUNT(b.AccountID) = 
(SELECT COUNT(AccountID) FROM `Account` a RIGHT JOIN Position b ON a.PositionID = b.PositionID 
GROUP BY b.PositionID ORDER BY COUNT(AccountID) ASC LIMIT 1);

-- Question 11:
-- Cần làm ntn
-- Cách 1:
SELECT
	b.DepartmentName,
    c.PositionName,
    count(a.AccountID) As total_employee
FROM
	account a
    INNER JOIN department b ON a.DepartmentID = b.DepartmentID
    INNER JOIN position c ON a.PositionID = c.PositionID
GROUP BY
	b.DepartmentName,
    c.PositionName;
    
-- Cách 2: Subquery 
SELECT 
	-- a.DepartmentID,
    (SELECT DepartmentName FROM Department WHERE DepartmentID = a.DepartmentID) AS DepartmentName,
	-- a.PositionID,
    (SELECT PositionName FROM position WHERE PositionID = a.PositionID) AS PositionName,
    count(*) AS total_employee
FROM 
	account a 
GROUP BY
	a.DepartmentID,
    a.PositionID;

-- Cách 3:
-- cross join
-- Bước 1: Tạo khung bảng 
CREATE VIEW ResultQ11 AS
SELECT
	b.DepartmentName,
    c.PositionName,
    count(a.AccountID) As total_employee
FROM
	account a
    INNER JOIN department b ON a.DepartmentID = b.DepartmentID
    INNER JOIN position c ON a.PositionID = c.PositionID
GROUP BY
	b.DepartmentName,
    c.PositionName;

SELECT * FROM ResultQ11;


SELECT 
	t.DepartmentName, t.PositionName,
	CASE WHEN t.total > 0 then t.total ELSE 0 END AS total
FROM 
	(SELECT 
	a.DepartmentName,
    b.PositionName,
    (select total_employee FROM ResultQ11 WHERE DepartmentName = a.DepartmentName AND PositionName = b.PositionName) AS total
FROM 
	Department a 
    CROSS JOIN Position b 
ORDER BY DepartmentName, PositionName) t ;
-- -----------------------------------------------
SELECT 
	t.DepartmentName, t.PositionName, count(t.AccountID) AS employee
FROM
(SELECT 
	a.DepartmentName,
    b.PositionName,
    c.AccountID
FROM 
	Department a 
    CROSS JOIN Position b 
    LEFT JOIN Account c ON  a.DepartmentID = c.DepartmentID AND b.PositionID = c.PositionID
ORDER BY DepartmentName, PositionName) t
GROUP BY t.DepartmentName, t.PositionName;

-- Question 12:
SELECT a.QuestionID, a.Content, b.TypeName, c.UserName AS "QuestionCreator", d.Content AS "Answer"
FROM Question a
LEFT JOIN TypeQuestion b ON a.TypeID = b.TypeID
LEFT JOIN `Account` c ON a.CreatorID = c.AccountID
LEFT JOIN Answer d ON a.QuestionID = d. QuestionID;

-- Question 13:
SELECT * FROM TypeQuestion;
SELECT a.TypeName, COUNT(QuestionID) AS "Total"
FROM TypeQuestion a
LEFT JOIN Question b ON a.TypeID = b.TypeID
WHERE a.TypeName = "Trắc nghiệm" OR a.TypeName = "Tự luận"
GROUP BY a.TypeID;

-- Question 14-15: SAME QUESION 
SELECT a.GroupID, a.GroupName
FROM `Group` a
LEFT JOIN GroupAccount b ON a.GroupID = b.GroupID
GROUP BY a.GroupID HAVING COUNT(AccountID) = 0 ;

-- Question 16:
SELECT a.QuestionID, a.Content
FROM Question a LEFT JOIN answer b ON a.QuestionID = b.QuestionID
GROUP BY QuestionID HAVING COUNT(AnswerID)=0;


/*Exercise2*/
-- Question 17:
SELECT a.AccountID, b.UserName, b.FullName 
FROM GroupAccount a INNER JOIN `Account` b
ON a.AccountID = b.AccountID WHERE GroupID = 1
UNION
SELECT a.AccountID, b.UserName, b.FullName 
FROM GroupAccount a INNER JOIN `Account` b
ON a.AccountID = b.AccountID WHERE GroupID = 2;

-- Question 18:
SELECT a.GroupID, b.GroupName, COUNT(a.AccountID) AS 'SL'
FROM GroupAccount a INNER JOIN `Group` b
ON a.GroupID = b.GroupID 
GROUP BY a.GroupID HAVING COUNT(a.AccountID) > 5
UNION ALL
SELECT a.GroupID, b.GroupName, COUNT(a.AccountID) AS 'SL'
FROM GroupAccount a INNER JOIN `Group` b
ON a.GroupID = b.GroupID 
GROUP BY a.GroupID HAVING COUNT(a.AccountID) < 7;