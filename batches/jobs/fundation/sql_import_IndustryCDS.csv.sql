START TRANSACTION;
SET SQL_SAFE_UPDATES=0; 
DELETE FROM `fundation_uat`.`industrycds` ;
LOAD DATA LOW_PRIORITY LOCAL INFILE './IndustryCDS.csv' 
INTO TABLE `fundation_uat`.`industrycds` CHARACTER SET latin1 FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' ESCAPED BY '"' LINES TERMINATED BY '\r\n' IGNORE 1 LINES 
(@ColVar0, `PTIndCdsSector`, `PTIndCdsSubSector`, `FinalNaicsCode`, @ColVar4, @ColVar5, @ColVar6, @ColVar7, @ColVar8, @ColVar9) 
SET 
`PTIndCdsIndustry` = @ColVar0,
`PTIndCdsRiskBucket` = @ColVar4,
`PTIndCdsMaxLoanAmt` = @ColVar5,
`PTIndCdsMinTenure` = @ColVar6,
`PTIndCdsMaxLoanTermYrs` = @ColVar7,
`PTIndCdsIndicProfitMargin` = ROUND(REPLACE(@ColVar8, '$', '')),
`PTIndCdsMaxStar` = @ColVar9;
COMMIT;
SHOW WARNINGS;

