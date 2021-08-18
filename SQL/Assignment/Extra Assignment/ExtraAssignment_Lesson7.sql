USE testingsystem_assignment_extra_6;

-- Excercise 1:
DROP TRIGGER IF EXISTS trg_e1;
DELIMITER $$
CREATE TRIGGER trg_e1
BEFORE INSERT ON project_modules
FOR EACH ROW
BEGIN
	IF (NEW.ProjectModulesDate < (SELECT ProjectStartDate FROM projects WHERE ProjectID = NEW.ProjectID))
    OR
    (NEW.ProjectModulesCompletedOn < (SELECT ProjectCompletedOn FROM projects WHERE ProjectID = NEW.ProjectID))
    THEN
		SIGNAL SQLSTATE '12345' -- disallow this record
        SET MESSAGE_TEXT='Date has problems!';
        END IF;
END$$
DELIMITER ;


-- Exercises 2:
USE ExtraAssignment3;
CREATE VIEW E2
AS
	SELECT TraineeID, Full_Name, Birth_Date, Gender 
    FROM 
		Trainee 
	WHERE (ET_IQ + ET_Gmath) >= 20 
		AND ET_IQ >= 8 
        AND ET_Gmath >= 8 
        AND ET_English >=18;
SELECT * FROM E2;