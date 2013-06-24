<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_balance_sheet">
    <div class="section" id="balance_sheet">
        <h2>balance sheet</h2>
        <div class="dataLabel">date latest account</div>	<div class="dataValue ">


                <xsl:value-of select="Identification/FilingDetails/LatestAccounts/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestAccounts/MM"/></span>&#xA0;<xsl:value-of select="Identification/FilingDetails/LatestAccounts/CCYY"/>
           
        </div>
        <br style="clear:both"/>
        <div class="dataLabel">date latest returns</div>	<div class="dataValue ">
        <xsl:value-of select="Identification/FilingDetails/LatestReturns/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestReturns/MM"/></span>&#xA0;<xsl:value-of select="Identification/FilingDetails/LatestReturns/CCYY"/></div>
         
        <br style="clear:both"/>
        <div class="dataLabel">account ref. date</div>		<div class="dataValue ">
        <xsl:value-of select="Identification/FilingDetails/AccountsRefDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/AccountsRefDate/MM"/></span>&#xA0;<xsl:value-of select="Identification/FilingDetails/AccountsRefDate/CCYY"/>

        </div>
        <br style="clear:both"/>
        
        <div class="matrixLabel" id="balance_sheet_f_details">financial details</div>
        <div class="matrix" id="balance_sheet_f_details_matrix">
            
            <table cellspacing="0" cellpadding="0">
                <tr>
                    <th><span>date of account</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td>
                             <xsl:value-of select="DateOfAccounts/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DateOfAccounts/MM"/></span>&#xA0;<xsl:value-of select="DateOfAccounts/CCYY"/>
                            </td>
                    </xsl:for-each>
                </tr>
                <tr>
                    <th><span>accounting standard</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td><span id="notFound">??</span></td>
                    </xsl:for-each>
                </tr>
                <tr>
                    <th><span>number of weeks</span></th>
                    <xsl:for-each select="Financials/Accounts"><td><xsl:value-of select="AccountingPeriod"/></td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>currency</span></th><xsl:for-each select="Financials/Accounts"><td><xsl:value-of select="Currency"/></td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>tangible assets</span>
                        <div class="inCellSubTitle" style="margin-top:5px">land &amp; buildings</div>
                        <div class="inCellSubTitle">freehold</div>
                        <div class="inCellSubTitle">leasehold</div>
                        <div class="inCellSubTitle">fixtures &amp; fittings</div>
                        <div class="inCellSubTitle">plant &amp; vehicles</div>
                        <div class="inCellSubTitle">plant</div>
                        <div class="inCellSubTitle">vehicles</div>
                        <div class="inCellSubTitle">in course of constrution</div>
                        <div class="inCellSubTitle">other tangible assets</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/TangibleAssetsDetails">
                                <span><xsl:value-of select="TangibleAssets"/></span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="LandBuildings"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Freehold"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Leasehold"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="FixturesFittings"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="PlantVehicles"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Plant"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Vehicles"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="AssetsInCourseConstruction"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherTangibleAssets"/>
                                </div>
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>
                <tr>
                    <th><span>Intangible assets</span></th><xsl:for-each select="Financials/Accounts"><td class="num">
                        <span><xsl:value-of select="BalanceSheet/IntangibleAssets"/></span>
                    </td></xsl:for-each>
                </tr>
                <tr>
                    <th>other non-current assets</th><xsl:for-each select="Financials/Accounts"><td class="num">
                        <span><xsl:value-of select="BalanceSheet/OtherNonCurrentAssetsDetails"/></span>
                    </td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>total fixed/non-current assets</span></th><xsl:for-each select="Financials/Accounts"><td class="num">
                        <span><xsl:value-of select="BalanceSheet/TotalFixedNonCurrentAssets"/></span>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th>inventories
                        <div class="inCellSubTitle" style="margin-top:5px">raw material/stocks</div>
                        <div class="inCellSubTitle">work in progress</div>
                        <div class="inCellSubTitle">finished goods</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/InventoriesDetails">
                                <span><xsl:value-of select="Inventories"/>&#xA0;</span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="RawMaterialStock"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="WorkInProgress"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="FinishedGoods"/>
                                </div>
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>
                
                <tr>
                    <th>debtors
                        <div class="inCellSubTitle" style="margin-top:5px">trade debtors</div>
                        <div class="inCellSubTitle">group loans</div>
                        <div class="inCellSubTitle">directors loans</div>
                        <div class="inCellSubTitle">other debtors</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/DebtorsDetails">
                                <span><xsl:value-of select="Debtors"/></span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="AccountsReceivableTradeDebtors"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="DebtorsGroupLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="DebtorsDirectorLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherDebtors"/>
                                </div>
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>
                <tr>
                    <th><span>cash at bank</span></th><xsl:for-each select="Financials/Accounts">
                        <td class="num">
                            <span><xsl:value-of select="BalanceSheet/TotalCashDetails/TotalCash"/></span>
                        </td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>other current assets</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td class="num">
                            <span>
                                <xsl:value-of select="BalanceSheet/OtherCurrentAssetsDetails/OtherCurrentAssets"/>
                            </span>
                        </td>
                    </xsl:for-each>
                </tr>
                <tr>
                    <th><span>total current assets</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td class="num">
                            <span>
                                <xsl:value-of select="BalanceSheet/TotalCurrentAssets"/>
                            </span>
                        </td>
                    </xsl:for-each>
                </tr>
                <tr>
                    <th>total current liabilities
                        <div class="inCellSubTitle" style="margin-top:5px">trade creditors</div>
                        <div class="inCellSubTitle">group liabilities</div>
                        <div class="inCellSubTitle">director liabilities</div>
                        <div class="inCellSubTitle">taxation</div>
                        <div class="inCellSubTitle">social security/VAT</div>
                        <div class="inCellSubTitle">accruals/deferred income</div>
                        <div class="inCellSubTitle">bank overdraft</div>
                        <div class="inCellSubTitle">hire purchase/leasing</div>
                        <div class="inCellSubTitle">hire purchase</div>
                        <div class="inCellSubTitle">leasing</div>
                        <div class="inCellSubTitle">short loans</div>
                        <div class="inCellSubTitle">dividends</div>
                        <div class="inCellSubTitle">other current</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                                <span>
                                    <xsl:value-of select="BalanceSheet/TotalCurrentLiabilities"/>
                                </span>
                            
                            
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="BalanceSheet/CreditorsDetails/AccountsPayableTradeCreditors"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/CreditorsDetails/GroupLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/CreditorsDetails/DirectorLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/CreditorsDetails/TaxationPayable"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/CreditorsDetails/SocialSecurityVAT"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/CreditorsDetails/AccrualsDeferredIncome"/>
                                </div>
                            
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/FinancialLiabilitiesDetails/BankOverdraft"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/FinancialLiabilitiesDetails/FinanceLeasesHirePurchase"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/FinancialLiabilitiesDetails/HirePurchase"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/FinancialLiabilitiesDetails/FinanceLease"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/FinancialLiabilitiesDetails/OtherShortTermLoans"/>
                                </div>
                            
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/OtherCurrentLiabilitiesDetails/Dividends"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="BalanceSheet/OtherCurrentLiabilitiesDetails/OtherCurrentLiabilities"/>
                                </div>
                            
                        </td>
                    </xsl:for-each>
                </tr>
                <tr>
                    <th><span>working capital</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td class="num">
                            <span>
                                <xsl:value-of select="BalanceSheet/WorkingCapital"/>
                            </span>
                        </td>
                    </xsl:for-each>
                </tr>
                <tr>
                    <th><span>capital employed</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td class="num">
                            <span>
                                <xsl:value-of select="BalanceSheet/CapitalEmployed"/>
                            </span>
                        </td>
                    </xsl:for-each>
                </tr>
                <tr>
                    <th>total long term liabilities
                        <div class="inCellSubTitle" style="margin-top:5px">group long term liabilities</div>
                        <div class="inCellSubTitle">director long term liabilities</div>
                        <div class="inCellSubTitle">hire purchase/leasing</div>
                        <div class="inCellSubTitle">hire purchase</div>
                        <div class="inCellSubTitle">leasing</div>
                        <div class="inCellSubTitle">other long term loans</div>
                        <div class="inCellSubTitle">other long term liabilities</div>
                        <div class="inCellSubTitle">accruals/deferred income</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/LongTermFinancialLiabilitiesDetails">
                                <span id="notFound">??</span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                         <xsl:value-of select="GroupLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="DirectorLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="FinanceLeasesHirePurchase"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="HirePurchase"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="FinanceLease"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherLongTermLoans"/>                                    
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherFinancialLiabilities"/>
                                </div>
                            </xsl:for-each>
                            <xsl:for-each select="BalanceSheet/CreditorsDetails">
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="AccrualsDeferredIncome"/>
                                </div>
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>
                
                <tr>
                    <th>total provisions
                        <div class="inCellSubTitle" style="margin-top:5px">deferred taxation</div>
                        <div class="inCellSubTitle">pension</div>
                        <div class="inCellSubTitle">other provisions</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/ProvisionsDetails">
                                <span>
                                    <xsl:value-of select="Provisions"/>
                                </span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="DeferredTaxation"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Pension"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherProvision"/>
                                </div>
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>minority interests</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td class="num">
                            <span>
                                <xsl:value-of select="BalanceSheet/MinorityInterestsUKGAAP"/>
                            </span>
                        </td>
                    </xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>total net assets</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td class="num doubt">
                            <span>
                                <xsl:value-of select="BalanceSheet/TotalCurrentAssets"/>
                            </span>
                        </td>
                    </xsl:for-each>
                </tr>
                
                <tr>
                    <th>issued capital
                        <div class="inCellSubTitle" style="margin-top:5px">ordinary shares</div>
                        <div class="inCellSubTitle">preference share</div>
                        <div class="inCellSubTitle">other issued capital</div>
                        <div class="inCellSubTitle">share premium account</div>
                        <div class="inCellSubTitle">revaluation reserve</div>
                        <div class="inCellSubTitle">retained earnings</div>
                        <div class="inCellSubTitle">other reserves</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/IssuedCapitalDetails">
                                <span>
                                    <xsl:value-of select="IssuedCapital"/>
                                </span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="OrdinaryShares"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="PreferenceShares"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Other"/>
                                </div>
                            </xsl:for-each>
                            
                            <div class="inCellSubValue">&#xA0;
                                <xsl:value-of select="BalanceSheet/SharePremium"/>
                            </div>
                            
                            <div class="inCellSubValue">&#xA0;
                                <xsl:value-of select="BalanceSheet/RevaluationReserve"/>
                            </div>
                            
                            <div class="inCellSubValue">&#xA0;
                                <xsl:value-of select="BalanceSheet/RetainedEarnings"/>
                            </div>
                            <div class="inCellSubValue doubt">&#xA0;
                                <xsl:value-of select="BalanceSheet/Other"/>
                            </div>
                            
                        </td>
                    </xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>total shareholder's funds</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td class="num">
                            <span>
                                <xsl:value-of select="BalanceSheet/TotalShareholdersFunds"/>
                            </span>
                        </td>
                    </xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>net worth</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td class="num">
                            <span>
                                <xsl:value-of select="BalanceSheet/NetWorth"/>
                            </span>
                        </td>
                    </xsl:for-each>
                </tr>
                
            </table>
        </div><br/>
    </div>
    </xsl:template>
</xsl:stylesheet>