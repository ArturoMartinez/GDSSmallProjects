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
                    <th><span>operating profit</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="OperatingIncome"/></span></td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>share of profit</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="ShareOfProfits"/></span></td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>other income</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="OtherIncome"/></span></td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>profit loss on disposal</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="ProfitLossOnDisposal"/></span></td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>interest receivable</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="InterestReceivable"/></span></td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>interest payable</span>
                        <div class="inCellSubTitle" style="margin-top:5px">to bank</div>
                        <div class="inCellSubTitle">other</div>
                        <div class="inCellSubTitle">on hire purchase</div>
                        <div class="inCellSubTitle">on leasing</div>
                    </th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss">
                        <td style="vertical-align:top;" class="num">
                            <xsl:for-each select="InterestPayableDetails">
                                <span><xsl:value-of select="InterestPayable"/></span>
                                <div class="inCellSubValue"  style="margin-top:5px">&#xA0;
                                    <xsl:value-of select="ToBank"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="Other"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OnHirePurchase"/>
                                </div>
                                <div class="inCellSubValue">&#xA0;
                                    <xsl:value-of select="OnLeasing"/>
                                </div>
                            </xsl:for-each>
                        </td>
                    </xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>other transaction</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="OtherTransactions"/></span></td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>pre tax profit loss</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="PreTaxProfitLoss"/></span></td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>taxation</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="Taxation"/></span></td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>extraordinary items</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="ExtraordinaryItems"/></span></td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>net profit loss</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="NetProfitLoss"/></span></td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>minority interests UK GAAP</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="MinorityInterestsUKGAAP"/></span></td></xsl:for-each>
                </tr>
                <tr>
                    <th><span>dividends</span></th>
                    <xsl:for-each select="Financials/Accounts/ProfitLoss"><td class="num"><span><xsl:value-of select="Dividends"/></span></td></xsl:for-each>
                </tr>
            </table>
        </div><br/>
    </div>
    </xsl:template>
</xsl:stylesheet>