<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">



    <xsl:template name="xsl_profit_and_loss">
    <div class="section" id="profit_and_loss">
        
        <h2>profit &amp; loss</h2>
        <div class="dataLabel">date latest account</div>	<div class="dataValue">
           <xsl:value-of select="Identification/FilingDetails/LatestAccounts/DD"/>&#160;
             <span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestAccounts/MM"/></span>&#160;
            <xsl:value-of select="Identification/FilingDetails/LatestAccounts/CCYY"/>
        </div><br style="clear:both"/>
        <div class="dataLabel">date latest returns</div>	<div class="dataValue">
            <xsl:value-of select="Identification/FilingDetails/LatestReturns/DD"/>&#160;
             <span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestReturns/MM"/></span>&#160;
            <xsl:value-of select="Identification/FilingDetails/LatestReturns/CCYY"/>
        </div>
            <br style="clear:both"/>
        <div class="dataLabel">account ref. date</div>		<div class="dataValue">
        <xsl:value-of select="Identification/FilingDetails/AccountsRefDate/DD"/>&#160;
             <span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/AccountsRefDate/MM"/></span>&#160;
          
        </div><br style="clear:both"/>
        <div class="matrixLabel" id="profit_and_loss_details">profit and loss details</div>
        <div class="matrix" id="profit_and_loss_details_matrix">
            
            <table cellspacing="0" cellpadding="0">
                <tr>
                    <th><span>date of account</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td>
                            <xsl:value-of select="DateOfAccounts/DD"/>&#160;<span class="toMonthName"><xsl:value-of select="DateOfAccounts/MM"/></span>&#160;<xsl:value-of select="DateOfAccounts/CCYY"/>

                    </td>
                    </xsl:for-each>
                </tr>
                <tr>
                    <th><span>accounting standard</span></th>
                    <xsl:for-each select="Financials/Accounts">
                        <td><xsl:call-template name="accountTypes"/></td>
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
                    <th><span>cost of sales</span>
                        <div class="inCellSubTitle" style="margin-top:5px">Exceptional Items (UK GAAP Only)</div>
                        <div class="inCellSubTitle"> Other Direct Items</div>
                        <div class="inCellSubTitle"> Total Expenses</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss">
                        <td style="vertical-align:top;" class="num">
                           
                                <span><xsl:value-of select="CostOfSales"/></span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="ExceptionalItemsPreGP"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherDirectItems"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="TotalExpenses"/>
                                </div>
                            
                        </td>
                    </xsl:for-each>
                </tr>

                <tr>
                    <th><span>Gross Profit</span>
                        <div class="inCellSubTitle" style="margin-top:5px">Operating Expenses</div>
                        <div class="inCellSubTitle">Operating Income</div>
                        <div class="inCellSubTitle">Exceptional Items (UK GAAP Only)</div>
                        <div class="inCellSubTitle"> Profit/Loss On Disposal</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss">
                        <td style="vertical-align:top;" class="num">
                           
                                <span><xsl:value-of select="GrossProfit"/></span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="OperatingExpenses"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OperatingIncome"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="ExceptionalItemsPreOP"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="ProfitLossOnDisposal"/>
                                </div>
                            
                        </td>
                    </xsl:for-each>
                </tr>

                <tr>
                    <th><span>turnover/sales</span>
                        <div class="inCellSubTitle" style="margin-top:5px">home nation</div>
                        <div class="inCellSubTitle">europe</div>
                        <div class="inCellSubTitle">rest of the world</div>
                        <div class="inCellSubTitle">export</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="TurnoverSalesDetails">
                                <span><xsl:value-of select="TurnoverSales"/></span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="HomeNation"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Europe"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="RestOfTheWorld"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Export"/>
                                </div>
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>exceptionnal items pre OP</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="ExceptionalItemsPreOP"/></span></td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>exceptionnal items pre EBT</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="ExceptionalItemsPreEBT"/></span></td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>total expenses</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="TotalExpenses"/></span></td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>operating income</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="OperatingIncome"/></span></td></xsl:for-each>
                </tr>
                
                
                <tr>
                    <th><span>operating profit</span>
                        <div class="inCellSubTitle" style="margin-top:5px">Share Of Profits</div>
                        <div class="inCellSubTitle">Other Income</div>
                        <div class="inCellSubTitle">Interest Receivable</div>
                        <div class="inCellSubTitle"> Interest Payable</div>
                        <div class="inCellSubTitle" style="background:#EEE">- To Bank</div>
                        <div class="inCellSubTitle" style="background:#EEE">- On Hire Purchase</div>
                        <div class="inCellSubTitle" style="background:#EEE">- On Leasing</div>
                        <div class="inCellSubTitle" style="background:#EEE">- Other</div>
                        <div class="inCellSubTitle">Other Transactions</div>
                        <div class="inCellSubTitle">Exceptional Items (UK GAAP Only)</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss">
                        <td style="vertical-align:top;" class="num">
                           
                                <span><xsl:value-of select="OperatingProfit"/>&#xA0;</span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="ShareOfProfits"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherIncome"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="InterestReceivable"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="InterestPayableDetails/InterestPayable"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="InterestPayableDetails/ToBank"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="InterestPayableDetails/OnHirePurchase"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="InterestPayableDetails/OnLeasing"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="InterestPayableDetails/Other"/>
                                </div>

                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OtherTransactions"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="ExceptionalItemsPreEBT"/>
                                </div>
                            
                        </td>
                    </xsl:for-each>
                </tr>
                
               
                
                <tr>
                    <th><span>pre tax profit loss</span>
                        <div class="inCellSubTitle" style="margin-top:5px">taxation</div>
                        <div class="inCellSubTitle">extraordinary items</div>
                        <div class="inCellSubTitle">minority interests UK GAAP</div>
                        <div class="inCellSubTitle">dividends</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss">
                        <td style="vertical-align:top;" class="num">
                           
                                <span><xsl:value-of select="PreTaxProfitLoss"/>&#xA0;</span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="Taxation"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="ExtraordinaryItems"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="MinorityInterestsUKGAAP"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Dividends"/>
                                </div>
                        </td>
                    </xsl:for-each>
                </tr>
                            
               
                <tr>
                    <th><span>net profit loss</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="NetProfitLoss"/></span></td></xsl:for-each>
                </tr>
               
            </table>
        </div><br/>
    </div>
    </xsl:template>
</xsl:stylesheet>