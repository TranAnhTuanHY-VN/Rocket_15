USE TestingSystem;
-- Question 1:
CREATE OR REPLACE VIEW DS_NVSale
AS
	SELECT 
		a.AccountID, a.Email, a.UserName, a.FullName
    FROM 
		`Account` a 
        INNER JOIN Department b ON a.DepartmentID = b.DepartmentID
    WHERE
		b.DepartmentName = 'Sales';
    
SELECT * FROM DS_NVSale;

-- Question 2:
CREATE OR REPLACE VIEW DS_Question2
AS
SELECT 
	a.AccountID, a.Email, a.UserName, a.FullName
FROM 
	`Account` a 
    LEFT JOIN GroupAccount b ON a.AccountID = b.AccountID
GROUP BY 
	a.AccountID 
HAVING 
	COUNT(b.GroupID) = (SELECT COUNT(GroupID) FROM GroupAccount 
    GROUP BY AccountID ORDER BY COUNT(GroupID) DESC LIMIT 1);	

SELECT * FROM DS_Question2;

-- Question 3:
CREATE OR REPLACE VIEW VIEW_Question3
AS
SELECT 
	QuestionID, Content
FROM 
	Question
WHERE 
	CHAR_LENGTH(Content) > 300;
 
-- Question 4:
CREATE OR REPLACE VIEW VIEW_Q4
AS
SELECT
	a.DepartmentID, a.DepartmentName
FROM
	Department a
    INNER JOIN `Account` b ON a.DepartmentID = b.DepartmentID
GROUP BY 
	a.DepartmentID
HAVING 
	COUNT(b.AccountID)=(SELECT COUNT(AccountID) FROM `Account` GROUP BY DepartmentID ORDER BY COUNT(AccountID) DESC LIMIT 1);
    
SELECT * FROM VIEW_Q4;

-- Question 5:
CREATE OR REPLACE VIEW VIEW_Q5
AS
SELECT
	a.QuestionID, a.Content
FROM 
	Question a
    INNER JOIN `Account` b ON a.CreatorID = b.AccountID
WHERE
	b.FullName LIKE 'Nguyen%';
    
SELECT * FROM VIEW_Q5;
SELECT * FROM Account;