USE Adventureworks;

/* Exercise 1: */
-- Question 1:
SELECT 
	`Name`
FROM 
	Product
WHERE 
	ProductSubcategoryID IN 
    (SELECT ProductSubcategoryID FROM Productsubcategory WHERE `Name`='Saddles');
    
-- Quesiton 2:
SELECT 
	`Name`
FROM 
	Product
WHERE 
	`Name` LIKE '%Bot%';
    
-- Question 3:
WITH MIN_ListPrice
AS
(
	SELECT 	
		MIN(ListPrice)
	FROM 	
		Product
	WHERE 	
		ProductSubcategoryID = 3
)
SELECT 	
	`Name`
FROM 	
	Product
WHERE	
	ListPrice = (SELECT * FROM MIN_ListPrice);

/* Exercise 2*/
-- Question 1:
SELECT 	
	a.`Name`, b.`Name` 
FROM	
	countryregion a 
    INNER JOIN stateprovince b ON a.CountryRegionCode = b.CountryRegionCode;

-- Question 2:
SELECT 	
	a.`Name`, b.`Name` 
FROM	
	countryregion a 
	INNER JOIN stateprovince b ON a.CountryRegionCode = b.CountryRegionCode
WHERE a.`Name` IN('Canada','Germany') ORDER BY a.`Name` ASC;

-- Question 3:
SELECT 	
	b.SalesOrderID, b.OrderDate, a.SalesPersonID, a.Bonus, a.SalesYTD
FROM	
	salesperson a 
    INNER JOIN salesorderheader b ON a.SalesPersonID = b.SalesPersonID;

-- Question 4:
SELECT 		
	b.SalesOrderID, b.OrderDate, c.Title, a.Bonus, a.SalesYTD
FROM		
	salesperson a
    INNER JOIN salesorderheader b ON a.SalesPersonID = b.SalesPersonID
	INNER JOIN	employee c ON a.SalesPersonID = c.EmployeeID;
