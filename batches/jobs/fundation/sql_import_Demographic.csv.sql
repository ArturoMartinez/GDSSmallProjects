START TRANSACTION;
SET SQL_SAFE_UPDATES=0; 
DELETE FROM `fundation_uat`.`demographic` ;
LOAD DATA LOW_PRIORITY LOCAL INFILE './Demographic.csv' 
INTO TABLE `fundation_uat`.`demographic` 
FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' ESCAPED BY '"' LINES TERMINATED BY '\r\n' IGNORE 1 LINES 
(`BusCurZipCode`, @ColVar1, @ColVar2, @ColVar3, @ColVar4, @ColVar5, @ColVar6, @ColVar7, @ColVar8, @ColVar9, @ColVar10, @ColVar11, @ColVar12, @ColVar13, @ColVar14, @ColVar15, @ColVar16, @ColVar17) 
SET 
`PTDemPerCapitaIncome` 		= COALESCE(NULLIF(REPLACE(REPLACE(@ColVar1, '%', ''), '#N/A', ''), ''), 0),
`PTDemPctPopulationO50` 	= REPLACE(@ColVar2, '%', ''),
`PTDemPctPopulation20and34` 	= REPLACE(@ColVar3, '%', ''),
`PTDemPctPopulationU19` 	= REPLACE(@ColVar4, '%', ''),
`PTDemTotalPopulation` 		= @ColVar5,
`PTDemNumBusinesses` 		= COALESCE(NULLIF(REPLACE(REPLACE(@ColVar6, '%', ''), '#N/A', ''), ''), 0),
`PTDemTotalHouseholds` 		= @ColVar7, 
`PTDemPercentWhite` 		= COALESCE(NULLIF(REPLACE(REPLACE(@ColVar8, '%', ''), '#N/A', ''), ''), 0),
`PTDemPercentBlack` 		= COALESCE(NULLIF(REPLACE(REPLACE(@ColVar9, '%', ''), '#N/A', ''), ''), 0),
`PTDemPercentHispanic` 		= COALESCE(NULLIF(REPLACE(REPLACE(@ColVar10, '%', ''), '#N/A', ''), ''), 0),
`PTDemPercentAsian` 		= COALESCE(NULLIF(REPLACE(REPLACE(@ColVar11, '%', ''), '#N/A', ''), ''), 0),
`PTDemPercentOther` 		= COALESCE(NULLIF(REPLACE(REPLACE(@ColVar12, '%', ''), '#N/A', ''), ''), 0),
`PTDemPersonsPerHousehold` 	= COALESCE(NULLIF(REPLACE(REPLACE(@ColVar13, '%', ''), '#N/A', ''), ''), 0),
`PTDemAverageHouseValue` 	= COALESCE(NULLIF(REPLACE(REPLACE(@ColVar14, '%', ''), '#N/A', ''), ''), 0), 
`PTDemMedianAge` 		= COALESCE(NULLIF(REPLACE(REPLACE(@ColVar15, '%', ''), '#N/A', ''), ''), 0),
`PTDemPercentFamilyHouseholds` 	= REPLACE(@ColVar16, '%', ''),
`PTDemPercentVacantHouses` 	= REPLACE(@ColVar17, '%', '');
COMMIT;
SHOW WARNINGS;
