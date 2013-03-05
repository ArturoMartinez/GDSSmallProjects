USE fundation_uat;
DROP TABLE IF EXISTS `demographic`;
CREATE TABLE demographic
(
    `BusCurZipCode`                   varchar(5)    NOT NULL,
    `PTDemPerCapitaIncome`            bigint(10)    DEFAULT NULL,
    `PTDemPctPopulationO50`           int(3)        DEFAULT NULL,
    `PTDemPctPopulation20and34`       int(3)        DEFAULT NULL,
    `PTDemPctPopulationU19`           int(3)        DEFAULT NULL,
    `PTDemTotalPopulation`            bigint(12)    DEFAULT NULL,
    `PTDemNumBusinesses`              bigint(12)    DEFAULT NULL,
    `PTDemTotalHouseholds`            bigint(10)    DEFAULT NULL,
    `PTDemPercentWhite`               int(3)        DEFAULT NULL,
    `PTDemPercentBlack`               int(3)        DEFAULT NULL,
    `PTDemPercentHispanic`            int(3)        DEFAULT NULL,
    `PTDemPercentAsian`               int(3)        DEFAULT NULL,
    `PTDemPercentOther`               int(3)        DEFAULT NULL,
    `PTDemPersonsPerHousehold`        decimal(4, 2) DEFAULT NULL,
    `PTDemAverageHouseValue`          bigint(10)    DEFAULT NULL,
    `PTDemMedianAge`                  int(3)        DEFAULT NULL,
    `PTDemPercentFamilyHouseholds`    int(3)        DEFAULT NULL,
    `PTDemPercentVacantHouses`        int(3)        DEFAULT NULL,
    PRIMARY KEY (`BusCurZipCode`)
);


DROP TABLE IF EXISTS `industrycds`;
CREATE TABLE industrycds
(
    `FinalNaicsCode`                  int(6)       NOT NULL,
    `PTIndCdsIndustry`                varchar(255)  DEFAULT NULL,
    `PTIndCdsSector`                  varchar(255)  DEFAULT NULL,
    `PTIndCdsSubSector`               varchar(255)  DEFAULT NULL,
    `PTIndCdsRiskBucket`              int(2)       DEFAULT NULL,
    `PTIndCdsMaxLoanAmt`              int(6)       DEFAULT NULL,
    `PTIndCdsMinTenure`               int(2)       DEFAULT NULL,
    `PTIndCdsMaxLoanTermYrs`          int(2)       DEFAULT NULL,
    `PTIndCdsIndicProfitMargin`       int(3)       DEFAULT NULL,
    PRIMARY KEY (`FinalNaicsCode`)
);

DROP TABLE IF EXISTS `industryflag`;
CREATE TABLE industryflag
(
    `FinalNaicsCode`                  int(6)        NOT NULL,
    `PTIndFlagPerCapitaIncomeInd`     int(1)        DEFAULT NULL,
    `PTIndFlagPerCapIncThold`         bigint(10)    DEFAULT NULL,
    `PTIndFlagPerCapIncScoreMfier`    int(3)        DEFAULT NULL,
    `PTIndFlagElderlyInd`             int(1)        DEFAULT NULL,
    `PTIndFlagElderlyThold`           int(3)        DEFAULT NULL,
    `PTIndFlagElderlyScoreMfier`      int(3)        DEFAULT NULL,
    `PTIndFlagYoungAdultInd`          int(1)        DEFAULT NULL,
    `PTIndFlagYoungAdultThold`        int(3)        DEFAULT NULL,
    `PTIndFlagYoungAdultScoreMfier`   int(3)        DEFAULT NULL,
    `PTIndFlagJuvenileInd`            int(1)        DEFAULT NULL,
    `PTIndFlagJuvenileThold`          int(3)        DEFAULT NULL,
    `PTIndFlagJuvenileScoreMfier`     int(3)        DEFAULT NULL,
    `PTIndFlagPopulationInd`          int(1)        DEFAULT NULL,
    `PTIndFlagPopulationThold`        bigint(12)    DEFAULT NULL,
    `PTIndFlagPopulationScoreMfier`   int(3)        DEFAULT NULL,
    `PTIndFlagNumBusInd`              int(1)        DEFAULT NULL,
    `PTIndFlagNumBusThold`            bigint(12)    DEFAULT NULL,
    `PTIndFlagNumBusScoreMfier`       int(3)        DEFAULT NULL,
    PRIMARY KEY (`FinalNaicsCode`)
);

DROP TABLE IF EXISTS `industrysic`;
CREATE TABLE industrysic
(
    `FinalSicCode`                    int(6)        NOT NULL,
    `PTIndSicNaicsCode`               varchar(6)    DEFAULT NULL,
    `PTIndSicDescription`             varchar(50)   DEFAULT NULL, 
    `PTIndSicUnits`                   int(6)        DEFAULT NULL,
    `PTIndSicP25`                     int(8)        DEFAULT NULL,
    `PTIndSicP75`                     int(8)        DEFAULT NULL,
    PRIMARY KEY (`FinalSicCode`)
);

DROP TABLE IF EXISTS `usuryrate`;
CREATE TABLE usuryrate
(
    `BusCurStateCode`                 varchar(2)    NOT NULL,
    `PTUsuryRate`                     int(10)       DEFAULT NULL,
    PRIMARY KEY (`BusCurStateCode`)
);

