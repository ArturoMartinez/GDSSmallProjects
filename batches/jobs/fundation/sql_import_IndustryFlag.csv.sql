START TRANSACTION;
SET SQL_SAFE_UPDATES=0; 
DELETE FROM `fundation_uat`.`industryflag`;
LOAD DATA LOW_PRIORITY LOCAL INFILE './IndustryFlag.csv' 
INTO TABLE `fundation_uat`.`industryflag` 
FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' ESCAPED BY '"' LINES TERMINATED BY '\r\n' IGNORE 1 LINES 
(@ColVar0, @ColVar1, @ColVar2, @ColVar3, @ColVar4, @ColVar5, @ColVar6, @ColVar7, @ColVar8, @ColVar9, @ColVar10, @ColVar11, @ColVar12, @ColVar13, @ColVar14, @ColVar15, @ColVar16, @ColVar17, @ColVar18) 
SET 
`FinalNaicsCode` = @ColVar0,
`PTIndFlagPerCapitaIncomeInd` = @ColVar1,
`PTIndFlagPerCapIncThold` = COALESCE(NULLIF(REPLACE(@ColVar2, ',', ''), ''), 0),
`PTIndFlagPerCapIncScoreMfier` = COALESCE(NULLIF(@ColVar3, ''), 0),
`PTIndFlagElderlyInd` = @ColVar4, 
`PTIndFlagElderlyThold` = ROUND(REPLACE(@ColVar5, '%', '')), 
`PTIndFlagElderlyScoreMfier` =  COALESCE(NULLIF(@ColVar6, ''), 0), 
`PTIndFlagYoungAdultInd` = @ColVar7, 
`PTIndFlagYoungAdultThold` = COALESCE(NULLIF(@ColVar8, ''), 0), 
`PTIndFlagYoungAdultScoreMfier` = COALESCE(NULLIF(@ColVar9, ''), 0), 
`PTIndFlagJuvenileInd` = @ColVar10, 
`PTIndFlagJuvenileThold` =  COALESCE(NULLIF(@ColVar11, ''), 0), 
`PTIndFlagJuvenileScoreMfier` = COALESCE(NULLIF(@ColVar12, ''), 0), 
`PTIndFlagPopulationInd` = @ColVar13, 
`PTIndFlagPopulationThold` = COALESCE(NULLIF(@ColVar14, ''), 0), 
`PTIndFlagPopulationScoreMfier` = COALESCE(NULLIF(@ColVar15, ''), 0), 
`PTIndFlagNumBusInd` = @ColVar16, 
`PTIndFlagNumBusThold` =  COALESCE(NULLIF(@ColVar17, ''), 0),
`PTIndFlagNumBusScoreMfier` = COALESCE(NULLIF(@ColVar18, ''), 0);
SHOW WARNINGS;
COMMIT;

