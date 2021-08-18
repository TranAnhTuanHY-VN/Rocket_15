-- Question 1:
DROP DATABASE IF EXISTS ExtraAssignment4;
CREATE DATABASE ExtraAssignment4;
USE ExtraAssignment4;
CREATE TABLE Department(
	Department_Number 	INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name 	VARCHAR(30) NOT NULL
);
CREATE TABLE Employee(
	Employee_Number 	INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Employee_Name		VARCHAR(30) NOT NULL,
    Department_Number	INT UNSIGNED NOT NULL,
    FOREIGN KEY(Department_Number) REFERENCES Department(Department_Number)
);
CREATE TABLE Employee_Skill(
	Employee_Number		INT UNSIGNED NOT NULL,
    Skill_Code			VARCHAR(30) NOT NULL,
    Date_Registered		DATE,
    PRIMARY KEY(Employee_Number,Skill_Code),
    FOREIGN KEY(Employee_Number) REFERENCES Employee(Employee_Number)
);

-- Question 2:
INSERT INTO Department VALUES 		(1,"Kinh doanh"),
									(2,"DEV"),
									(3,"TEST"),
									(4,"Marketing"),
									(5,"Design"),
									(6,"UI/UX"),
									(7,"HR"),
									(8,"FE"),
									(9,"BE"),
									(10,"Kế toán");

INSERT INTO Employee VALUES			(1, "John", 1),
									(2, "Peter", 3),
									(3, "Cristiano", 5),
									(4, "Jerry", 6),
									(5, "Tom", 9),
									(6, "Tran", 10),
									(7, "Nguyen", 6),
									(8, "Jonhly", 1),
									(9, "Pham", 9),
									(10, "Le", 8);

INSERT INTO Employee_Skill VALUES	(1, "Python", '2020-10-20'),
									(2, "C#", '2021-1-20'),
                                    (3, "Java", '2020-2-20'),
                                    (4, "C++", '2020-3-20'),
                                    (5, "JavaScript", '2020-4-20'),
                                    (6, "ReactJS", '2020-11-20'),
                                    (7, "WinForm", '2020-12-20'),
                                    (8, "PhP", '2020-8-20'),
                                    (9, "SQL", '2020-9-20'),
                                    (10, "MySQL", '2020-10-20'),
                                    (10,"Java",'2019-10-20');
                                    
-- Question 3:
SELECT a.Employee_Name
FROM Employee a INNER JOIN Employee_Skill b ON a.Employee_Number = b.Employee_Number
WHERE Skill_Code = "Java";

-- Question 4:
SELECT a.Department_Number, a.Department_Name, COUNT(b.Employee_Number) AS "Total"
FROM Department a INNER JOIN Employee b ON a.Department_Number = b.Department_Number
GROUP BY Department_Number HAVING Total > 3;

-- Question 5:
SELECT a.Department_Number, a.Department_Name, COUNT(b.Employee_Number) AS "SLNV"
FROM Department a LEFT JOIN Employee b ON a.Department_Number = b.Department_Number
GROUP BY a.Department_Number;

-- Question 6:
SELECT a.Employee_Number, a.Employee_Name, COUNT(b.Skill_Code) AS "SL Skill"
FROM Employee a INNER JOIN Employee_Skill b ON a.Employee_Number = b.Employee_Number
GROUP BY a.Employee_Number HAVING COUNT(b.Skill_Code) > 1;