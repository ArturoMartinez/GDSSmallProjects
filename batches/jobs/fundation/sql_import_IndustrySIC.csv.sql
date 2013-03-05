START TRANSACTION;
SET SQL_SAFE_UPDATES=0; 
DELETE FROM `fundation_uat`.`industrysic`;
LOAD DATA LOW_PRIORITY LOCAL INFILE './IndustrySIC.csv' 
INTO TABLE `fundation_uat`.`industrysic` 
CHARACTER SET latin1 FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' ESCAPED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES 
(@ColVar0, `PTIndSicNaicsCode`, `PTIndSicDescription`, @ColVar3, @ColVar4, @ColVar5) 
SET 
`FinalSicCode` = @ColVar0, 
`PTIndSicUnits` = @ColVar3, 
`PTIndSicP25` = COALESCE(NULLIF(@ColVar4, ''), 0), 
`PTIndSicP75` = COALESCE(NULLIF(@ColVar5, ''), 0);
SHOW WARNINGS;
COMMIT;
