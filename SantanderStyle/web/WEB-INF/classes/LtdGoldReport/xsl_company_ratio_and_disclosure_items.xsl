<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    <xsl:template name="xsl_company_ratio_and_disclosure_items">
        <div class="section" id="company_ratio_and_disclosure_items">
        
            <h2>company ratio &amp; disclosure items</h2>
        <div class="dataLabel">date latest account</div>	<div class="dataValue doubt">
            <xsl:value-of select="Identification/FilingDetails/LatestAccounts/DD"/>&#160;
             <span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestAccounts/MM"/></span>&#160;
            <xsl:value-of select="Identification/FilingDetails/LatestAccounts/CCYY"/>

        </div><br style="clear:both"/>
        <div class="dataLabel">date latest returns</div>	<div class="dataValue doubt">

             <xsl:value-of select="Identification/FilingDetails/LatestReturns/DD"/>&#160;
             <span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestReturns/MM"/></span>&#160;
            <xsl:value-of select="Identification/FilingDetails/LatestReturns/CCYY"/>
        </div>
            <br style="clear:both"/>
        <div class="dataLabel">account ref. date</div>		<div class="dataValue doubt">

        <xsl:value-of select="Identification/FilingDetails/AccountsRefDate/DD"/>&#160;
             <span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/AccountsRefDate/MM"/></span>
        </div><br style="clear:both"/>
            <div class="matrixLabel" id="company_ratio_and_disclosure_items_details">company ratio &amp; disclosure items details</div>
            <div class="matrix" id="company_ratio_and_disclosure_items_details_matrix">
            
            <table cellspacing="0" cellpadding="0">
                <tr>
                    <th><span>date of account</span></th>
                    <xsl:for-each select="Financials/Ratios">
                        <td>
                             <xsl:value-of select="DateOfAccounts/DD"/>&#160;
             <span class="toMonthName"><xsl:value-of select="DateOfAccounts/MM"/></span>&#160;
            <xsl:value-of select="DateOfAccounts/CCYY"/>
                            </td>
                    </xsl:for-each>
                </tr>
                
                
                <tr>
                    <th style="background:#fff;padding-top:5px;border:none"><span>ratios</span></th>
                    <xsl:for-each select="Financials/Ratios"><td style="background:#fff;border:none"></td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>ratio</span></th>
                    <xsl:for-each select="Financials/Ratios"><td>
                        <xsl:value-of select="CurrentRatio"/>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>acid test</span></th>
                    <xsl:for-each select="Financials/Ratios"><td>
                        <xsl:value-of select="AcidTest"/>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>credit period( days)</span></th>
                    <xsl:for-each select="Financials/Ratios"><td>
                        <xsl:value-of select="CreditPeriod"/>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>return on capital (%)</span></th>
                    <xsl:for-each select="Financials/Ratios"><td>
                        <xsl:value-of select="ReturnOnCapital"/>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>pre tax profit margin (%)</span></th>
                    <xsl:for-each select="Financials/Ratios"><td>
                        <xsl:value-of select="PreTaxProfitMargin"/>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>borrow ratio (%)</span></th>
                    <xsl:for-each select="Financials/Ratios"><td>
                        <xsl:value-of select="BorrowingRatio"/>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>equity gearing(%)</span></th>
                    <xsl:for-each select="Financials/Ratios"><td>
                        <xsl:value-of select="EquityGearing"/>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>debt gearing(%)</span></th>
                    <xsl:for-each select="Financials/Ratios"><td>
                        <xsl:value-of select="DebtGearing"/>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>average remuneration</span></th>
                    <xsl:for-each select="Financials/Ratios"><td class="num">
                        <span><xsl:value-of select="AvgRemPerEmp"/></span>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>profit/Employee £</span></th>
                    <xsl:for-each select="Financials/Ratios"><td class="num">
                        <span><xsl:value-of select="ProfitPerEmp"/></span>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>sales/Employee £</span></th>
                    <xsl:for-each select="Financials/Ratios"><td class="num">
                        <span><xsl:value-of select="TurnoverPerEmp"/></span>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th style="background:#fff;padding-top:5px;border:none"><span>disclosure items</span></th>
                    <xsl:for-each select="Financials/Accounts/DisclosureItems"><td style="background:#fff;border:none">
                        
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>depreciation charges</span></th>
                    <xsl:for-each select="Financials/Accounts/DisclosureItems"><td class="num">
                        <span><xsl:value-of select="DepreciationCharges"/></span>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>amortisation charges</span></th>
                    <xsl:for-each select="Financials/Accounts/DisclosureItems"><td class="num">
                        <span><xsl:value-of select="AmortisationCharges"/></span>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>discontinued operations</span></th>
                    <xsl:for-each select="Financials/Accounts/DiscontinuedOperations"><td class="num">
                        <span><xsl:value-of select="PreTaxProfits"/></span>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th style="background:#fff;padding-top:5px;border:none">&#xA0;</th>
                    <xsl:for-each select="Financials/Accounts/DisclosureItems"><td style="background:#fff;border:none">
                        &#xA0;
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>number of employees</span></th>
                    <xsl:for-each select="Financials/Accounts/DisclosureItems"><td class="num">
                        <span><xsl:value-of select="NumberEmployees"/></span>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>employees' remuneration</span></th>
                    <xsl:for-each select="Financials/Accounts/DisclosureItems"><td class="num">
                        <span><xsl:value-of select="EmployeeRemunerationDetails/EmployeeRemuneration"/></span>
                    </td></xsl:for-each>
                </tr>
                
                <tr>
                    <th><span>directors' remuneration</span></th>
                    <xsl:for-each select="Financials/Accounts/DisclosureItems"><td class="num">
                        <span><xsl:value-of select="DirectorRemunerationDetails/DirectorRemuneration"/></span>
                    </td></xsl:for-each>
                </tr>
            </table>
            </div>
            
                <div class="matrixLabel" id="key_ratios_industry_comparisons">key ratios - industry comparisons</div>
                <div class="matrix" id="key_ratios_industry_comparisons_matrix">
                    
                    <table cellspacing="0" cellpadding="0">
                        <tr>
                            <th><span>date of account</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles">
                                <td>
 <xsl:value-of select="DateOfAccounts/DD"/>&#160;
             <span class="toMonthName"><xsl:value-of select="DateOfAccounts/MM"/></span>&#160;
            <xsl:value-of select="DateOfAccounts/CCYY"/>
                            </td>

                            </xsl:for-each>
                        </tr>
                        
                        <tr>
                            <th><span>return on capital (%)</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles"><td>
                                <span><xsl:value-of select="ReturnOnCapitalMedian"/></span>
                            </td></xsl:for-each>
                        </tr>
                        <tr>
                            <th><span>pre-tax profit margin (%)</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles"><td>
                                <span><xsl:value-of select="PreTaxMarginMedian"/></span>
                            </td></xsl:for-each>
                        </tr>
                        
                        <tr>
                            <th><span>credit period (days)</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles"><td>
                                <span><xsl:value-of select="CreditPeriodMedian"/></span>
                            </td></xsl:for-each>
                        </tr>
                        
                        <tr>
                            <th><span>liquidity</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles"><td>
                                <span id="notFound">???</span>
                            </td></xsl:for-each>
                        </tr>
                        
                        <tr>
                            <th><span>borrowing ratio (%)</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles"><td>
                                <span><xsl:value-of select="BorrowingRatioMedian"/></span>
                            </td></xsl:for-each>
                        </tr>
                        
                        <tr>
                            <th><span>equity gearing (%)</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles"><td>
                                <span><xsl:value-of select="EquityGearingMedian"/></span>
                            </td></xsl:for-each>
                        </tr>
                        
                        <tr>
                            <th><span>debt gearing (%)</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles"><td>
                                <span><xsl:value-of select="DebtGearingMedian"/></span>
                            </td></xsl:for-each>
                        </tr>
                        
                        <tr>
                            <th><span>number of employees</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles"><td>
                                <span id="notFound">???</span>
                            </td></xsl:for-each>
                        </tr>
                                                
                        <tr>
                            <th><span>avg. employee remuneration £</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles"><td class="num">
                                <span><xsl:value-of select="AvgRemPerEmpMedian"/></span>
                            </td></xsl:for-each>
                        </tr>
                        
                        <tr>
                            <th><span>turnover/employee £</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles"><td class="num">
                                <span><xsl:value-of select="TurnoverPerEmpMedian"/></span>
                            </td></xsl:for-each>
                        </tr>
                        
                        <tr>
                            <th><span>pre-tax profit/employee £</span></th>
                            <xsl:for-each select="Financials/Quartiles/MedianQuartiles"><td class="num">
                                <span><xsl:value-of select="ProfitPerEmpMedian"/></span>
                            </td></xsl:for-each>
                        </tr>
                        
                    </table>
                </div>
            
        <br/>
    </div>
    </xsl:template>
</xsl:stylesheet>