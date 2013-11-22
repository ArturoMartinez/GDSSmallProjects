<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">


    <xsl:template name="xsl_balance_sheet">
    <div class="section" id="balance_sheet">
        <h2>balance sheet</h2>
        <div class="dataLabel">date latest account</div>	<div class="dataValue ">
        
         
                <xsl:value-of select="Identification/FilingDetails/LatestAccounts/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestAccounts/MM"/></span>&#xA0;<xsl:value-of select="Identification/FilingDetails/LatestAccounts/CCYY"/>
        
        </div>
        <div class="dataLabel" style="clear:both">date latest returns</div>	<div class="dataValue ">
        <xsl:value-of select="Identification/FilingDetails/LatestReturns/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestReturns/MM"/></span>&#xA0;<xsl:value-of select="Identification/FilingDetails/LatestReturns/CCYY"/></div>
         
        <div class="dataLabel" style="clear:both">account ref. date</div>		<div class="dataValue ">
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
                        <td><xsl:call-template name="accountTypes"/> </td>
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
                    <th>investment assets
                        <div class="inCellSubTitle" style="margin-top:5px">Property</div>
                        <div class="inCellSubTitle">Subsidiary/Associate/Joint</div>
                        <div class="inCellSubTitle">Other Investments</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/InvestmentAssetsDetails">
                                <span><xsl:value-of select="InvestmentAssets"/>&#xA0;</span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="Property"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="SubsidiaryAssociateJoint"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherInvestments"/>
                                </div>
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>

                <tr>
                    <th>financial assets
                        <div class="inCellSubTitle" style="margin-top:5px">Finance Lease/Hire Purchase</div>
                        <div class="inCellSubTitle">Group Loans</div>
                        <div class="inCellSubTitle">Directors Loans</div>
                        <div class="inCellSubTitle">Other Loans</div>
                        <div class="inCellSubTitle">Other Financial Assets</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" >
                            <xsl:for-each select="BalanceSheet/FinancialAssetsNonCurrentDetails">
                                <span><xsl:value-of select="FinanceLeasesHirePurchase"/>&#xA0;</span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="GroupLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="DirectorsLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherLoans"/>
                                </div>

                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherFinancialAssets"/>
                                </div>
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>

                 <tr>
                    <th>other non-current assets
                        <div class="inCellSubTitle" style="margin-top:5px">Long term trades</div>
                        <div class="inCellSubTitle">Subsidiary/Associate/Join</div>
                        <div class="inCellSubTitle">Assets Held For Resale</div>
                        <div class="inCellSubTitle">Other</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/OtherNonCurrentAssetsDetails">
                                <span><xsl:value-of select="OtherNonCurrentAssets"/>&#xA0;</span>
                                 <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="LongTermTrade"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="SubsidiaryAssociateJoint"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="AssetsHeldForResale"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Other"/>
                                </div>
                               
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
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
                        <div class="inCellSubTitle">Subsidiary/Associate/Joint</div>
                        <div class="inCellSubTitle">Prepayments/Accruals</div>
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
                                    <xsl:value-of select="DebtorsSubsidiaryAssociateJoint"/>
                                </div>
                                <div class="inCellSubValue" >&#xA0;
                                    <xsl:value-of select="PrepaymentsAccruals"/>
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
                    <th>total cash
                        <div class="inCellSubTitle" style="margin-top:5px">Bank/In Han</div>
                        <div class="inCellSubTitle">Cash Equivalents</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/TotalCashDetails">
                                <span><xsl:value-of select="TotalCash"/>&#xA0;</span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="BankInHand"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="CashEquivalents"/>
                                </div>
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>

                 <tr>
                    <th>financial assets
                        <div class="inCellSubTitle" style="margin-top:5px">Finance Lease/Hire Purchase</div>
                        <div class="inCellSubTitle">Group Loans</div>
                        <div class="inCellSubTitle">Directors Loans</div>
                        <div class="inCellSubTitle">Other Loans</div>
                        <div class="inCellSubTitle">Other Financial Assets</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/FinancialAssetsCurrentDetails">
                                <span><xsl:value-of select="FinanceLeasesHirePurchase"/>&#xA0;</span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="GroupLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="DirectorsLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherLoans"/>
                                </div>

                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherFinancialAssets"/>
                                </div>
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>

                <tr>
                    <th>other current assets
                        <div class="inCellSubTitle" style="margin-top:5px">Assets Held For Resale</div>
                        <div class="inCellSubTitle">Other</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/OtherCurrentAssetsDetails">
                                <span><xsl:value-of select="OtherCurrentAssets"/>&#xA0;</span>
                                 <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="AssetsHeldForResale"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Other"/>
                                </div>
                                
                               
                            </xsl:for-each>
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
                    <th>creditors
                        <div class="inCellSubTitle" style="margin-top:5px">Accounts Payable/Trade Creditors</div>
                        <div class="inCellSubTitle">Subsidiary/Associate/Joint</div>
                        <div class="inCellSubTitle">Group Loans (UK GAAP Only)</div>
                        <div class="inCellSubTitle">Directors Loans (UK GAAP Only)</div>
                        <div class="inCellSubTitle">Accruals/Deferred Income</div>
                        <div class="inCellSubTitle">Social Security/VAT</div>
                        <div class="inCellSubTitle">Taxation Payable</div>
                        <div class="inCellSubTitle">other creditors</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/CreditorsDetails">
                                <span>
                                    <xsl:value-of select="Creditors"/>&#xA0;
                                </span>
                            
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="AccountsPayableTradeCreditors"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="SubsidiaryAssociateJoint"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="GroupLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="DirectorLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="AccrualsDeferredIncome"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="SocialSecurityVAT"/>
                                </div>
                            
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="TaxationPayable"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherCreditors"/>
                                </div>
                            </xsl:for-each>                            
                        </td>
                    </xsl:for-each>
                </tr>


                <tr>
                    <th>Financial Liabilities
                        <div class="inCellSubTitle" style="margin-top:5px">Bank Overdraft</div>
                        <div class="inCellSubTitle">Finance Lease/Hire Purchase</div>
                        <div class="inCellSubTitle">Finance Lease</div>
                        <div class="inCellSubTitle">Hire Purchase</div>
                        <div class="inCellSubTitle">Group Loans</div>
                        <div class="inCellSubTitle">Director Loans</div>
                        <div class="inCellSubTitle">Other Short Term Loans</div>
                        <div class="inCellSubTitle">Grants</div>
                        <div class="inCellSubTitle">Other Financial Liabilities</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/FinancialLiabilitiesDetails">

                                <span><xsl:value-of select="FinancialLiabilities"/>&#xA0;</span>

                                 <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="BankOverdraft"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="FinanceLeasesHirePurchase"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="FinanceLeasesHirePurchase"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="HirePurchase"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="GroupLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="DirectorLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherShortTermLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Grants"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherFinancialLiabilities"/>
                                </div>
                                
                                
                               
                            </xsl:for-each>
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
                    <th><span>total current liabilities</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td class="num">
                            <span>
                                <xsl:value-of select="BalanceSheet/TotalCurrentLiabilities"/>
                            </span>
                        </td>
                    </xsl:for-each>
                </tr>



                <!--<tr>
                    <th>total current liabilities
                        <div class="inCellSubTitle" style="margin-top:5px">trade creditors</div>
                        <div >group liabilities</div>
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
                </tr>-->

                <tr>
                    <th>other current liabilities
                        <div class="inCellSubTitle" style="margin-top:5px">Assets Held For Resale</div>
                        <div class="inCellSubTitle">Other</div>
                        <div class="inCellSubTitle">Dividends (UK GAAP Only)</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/OtherCurrentLiabilitiesDetails">
                                <span><xsl:value-of select="OtherCurrentLiabilities"/>&#xA0;</span>
                                 <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="AssetsHeldForResale"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Other"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Dividends"/>
                                </div>
                                
                               
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>

                <tr>
                    <th>
                        Long Term Financial Liabilities
                        <div class="inCellSubTitle" style="margin-top:5px">Finance Lease/Hire Purchase</div>
                        <div class="inCellSubTitle">Finance Lease</div>
                        <div class="inCellSubTitle">Hire Purchase</div>
                        <div class="inCellSubTitle">Group Loans</div>
                        <div class="inCellSubTitle">Director Loans</div>
                        <div class="inCellSubTitle">Other Long Term Loans</div>
                        <div class="inCellSubTitle">Grants</div>
                        <div class="inCellSubTitle">Other Financial Liabilities</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/LongTermFinancialLiabilitiesDetails">
                                <span><xsl:value-of select="FinancialLiabilities"/>&#xA0;</span>
                                 <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="FinanceLeasesHirePurchase"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="FinanceLease"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="HirePurchase"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="GroupLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="DirectorLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherLongTermLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Grants"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherFinancialLiabilities"/>
                                </div>
                                
                               
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>
                
                <tr>
                    <th>
                        Other Non-Current Liabilities
                        <div class="inCellSubTitle" style="margin-top:5px">Long Term Trade</div>
                        <div class="inCellSubTitle">Subsidiary/Associate/Joint</div>
                        <div class="inCellSubTitle">- Group Loans (UK GAAP Only)</div>
                        <div class="inCellSubTitle">- Director Loans (UK GAAP Only)</div>
                        <div class="inCellSubTitle">Assets Held For Resale</div>
                        <div class="inCellSubTitle">Accruals</div>
                        <div class="inCellSubTitle">Preference Shares</div>
                        <div class="inCellSubTitle">Other</div>
                        
                    </th>
                    <xsl:for-each select="Financials/Accounts">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="BalanceSheet/OtherNonCurrentLiabilitiesDetails">
                                <span><xsl:value-of select="OtherNonCurrentLiabilities"/>&#xA0;</span>
                                 <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="LongTermTrade"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="SubsidiaryAssociateJoint"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="GroupLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="DirectorLoans"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="AssetsHeldForResale"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Accruals"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="PreferenceShares"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Other"/>
                                </div>
                                
                               
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>

                 <tr>
                    <th><span>total non-current liabilities</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td class="num">
                            <span>
                                <xsl:value-of select="BalanceSheet/TotalNonCurrentLiabilities"/>
                            </span>
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
               <!-- <tr>
                    <th>total long term liabilities</th>
                    <xsl:for-each select="Financials/Accounts">
                        <td class="num">
                            <span>
                                <xsl:value-of select="BalanceSheet/TotalNonCurrentLiabilities"/>
                            </span>
                        </td>
                    </xsl:for-each>
                </tr>
                <tr>
                    <th>
                        <div class="inCellSubTitle" >group long term liabilities</div>
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
                              
                               <div class="inCellSubValue"  >&#xA0;
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
               </tr>-->
                
               <tr>
                  <th>total provisions
                     <div class="inCellSubTitle" style="margin-top:5px">deferred taxation</div>
                     <div class="inCellSubTitle">pension</div>
                     <div class="inCellSubTitle">other provisions</div>
                  </th>
                  <xsl:for-each select="Financials/Accounts">
                     <td style="vertical-align:top;" class="num">
                        <xsl:for-each select="BalanceSheet/ProvisionsDetails">
                           <div >&#xA0;
                              <xsl:value-of select="Provisions"/>
                           </div>
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
                    <th><span>minority interests (UK GAAP Only)</span></th>
                  <xsl:for-each select="Financials/Accounts">
                     <td>
                        <span class="num">
                           <xsl:value-of select="BalanceSheet/MinorityInterestsUKGAAP"/>
                        </span>
                     </td>
                  </xsl:for-each>
               </tr>
                
               <tr>
                    <th><span>total net assets</span>
                     <div class="inCellSubTitle" style="margin-top:5px">Interest In Own Shares</div>
                     <div class="inCellSubTitle">Currency Translation Reserve</div>
                  </th>
                  <xsl:for-each select="Financials/Accounts">
                     <td  class="num">
                        <span>
                           <xsl:value-of select="BalanceSheet/NetAssets"/>
                        </span>
                        <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                           <xsl:value-of select="BalanceSheet/InterestInOwnShares"/>
                        </div>
                        <div class="inCellSubValue">&#xA0;
                           <xsl:value-of select="BalanceSheet/CurrencyTranslationReserve"/>
                        </div>
                            
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
                        <div class="inCellSubValue">&#xA0;
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
                    <th><span>Minority Interests (IFRS Only)</span></th>
                  <xsl:for-each select="Financials/Accounts">
                     <td  class="num">
                        <span>
                           <xsl:value-of select="BalanceSheet/MinorityInterestsIFRS"/>
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