<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    <xsl:template name="xsl_company_ratio_and_disclosure_items">
        <div class="section" id="company_ratio_and_disclosure_items">

            <h2>company ratio &amp; disclosure items</h2>
            <div class="dataLabel">date latest account</div>	<div class="dataValue">
            <xsl:value-of select="Identification/FilingDetails/LatestAccounts/DD"/>&#160;
            <span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestAccounts/MM"/></span>&#160;
            <xsl:value-of select="Identification/FilingDetails/LatestAccounts/CCYY"/>

        </div><div class="dataLabel" style="clear:both">date latest returns</div>	<div class="dataValue">

        <xsl:value-of select="Identification/FilingDetails/LatestReturns/DD"/>&#160;
        <span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestReturns/MM"/></span>&#160;
        <xsl:value-of select="Identification/FilingDetails/LatestReturns/CCYY"/>
    </div>
    <div class="dataLabel" style="clear:both">account ref. date</div>		<div class="dataValue">

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
        <th><span>Impairment Charges</span></th>
        <xsl:for-each select="Financials/Accounts"><td class="num">
            <span><xsl:value-of select="DisclosureItems/ImpairmentCharges"/></span>
        </td></xsl:for-each>
    </tr>
    <tr>
        <th><span>Dividends</span></th>
        <xsl:for-each select="Financials/Accounts"><td class="num">
            <span><xsl:value-of select="DiscontinuedOperations/Dividends"/></span>
        </td></xsl:for-each>
    </tr>
    <tr>
        <th style="background:#fff;padding-top:5px;border:none"><span>discontinued operations</span></th>
        <xsl:for-each select="Financials/Accounts/DisclosureItems"><td style="background:#fff;border:none">

        </td></xsl:for-each>
    </tr>
    <tr>
        <th><span>turnover</span></th>
        <xsl:for-each select="Financials/Accounts"><td class="num">
            <span><xsl:value-of select="DiscontinuedOperations/Turnover"/></span>
        </td></xsl:for-each>
    </tr>
    <tr>
        <th><span>gross profit</span></th>
        <xsl:for-each select="Financials/Accounts"><td class="num">
            <span><xsl:value-of select="DiscontinuedOperations/GrossProfit"/></span>
        </td></xsl:for-each>
    </tr>
    <tr>
        <th><span>operating profit</span></th>
        <xsl:for-each select="Financials/Accounts"><td class="num">
            <span><xsl:value-of select="DiscontinuedOperations/OperatingProfit"/></span>
        </td></xsl:for-each>
    </tr>
    <tr>
        <th><span>pre-tax profit</span></th>
        <xsl:for-each select="Financials/Accounts"><td class="num">
            <span><xsl:value-of select="DiscontinuedOperations/PreTaxProfits"/></span>
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

            <xsl:for-each select="Financials/Ratios[position() &lt; 3]">
                <td>
                   <xsl:value-of select="DateOfAccounts/DD"/>&#160;
                   <span class="toMonthName"><xsl:value-of select="DateOfAccounts/MM"/></span>&#160;
                   <xsl:value-of select="DateOfAccounts/CCYY"/>
               </td>
           </xsl:for-each>




           <th style="text-align:center">
            % change
        </th>

        <th style="text-align:center">
            Industry Median
        </th>

    </tr>

    <tr>
        <th><span>return on capital (%)</span></th>

        <xsl:for-each select="Financials/Ratios[position() &lt; 3]"><td>
            <xsl:value-of select="ReturnOnCapital"/>
        </td></xsl:for-each>


        <td> <xsl:value-of select="Financials/PercentageChange/PercentChangeReturnOnCapital"/></td>

        <td>
            <span><xsl:value-of select="Financials/Quartiles/MedianQuartiles/ReturnOnCapitalMedian"/></span>
        </td>
    </tr>
    <tr>
        <th><span>pre-tax profit margin (%)</span></th>
        <xsl:for-each select="Financials/Ratios[position() &lt; 3]"><td>
            <xsl:value-of select="PreTaxProfitMargin"/>
        </td></xsl:for-each>
        <td> <xsl:value-of select="Financials/PercentageChange/PercentChangePreTaxProfitMargin"/></td>
        <td>
            <span><xsl:value-of select="Financials/Quartiles/MedianQuartiles/PreTaxMarginMedian"/></span>
        </td>


    </tr>

    <tr>
        <th><span>credit period (days)</span></th>
        <xsl:for-each select="Financials/Ratios[position() &lt; 3]"><td>
            <xsl:value-of select="CreditPeriod"/>
        </td></xsl:for-each>
        
        <td> <xsl:value-of select="Financials/PercentageChange/PercentChangeCreditPeriod"/></td>
        <td>
            <span><xsl:value-of select="Financials/Quartiles/MedianQuartiles/CreditPeriodMedian"/></span>
        </td>
        
    </tr>

    <tr>
        <th><span>liquidity</span></th>
        <xsl:for-each select="Financials/Ratios[position() &lt; 3]"><td>
            <xsl:value-of select="CurrentRatio"/>
        </td></xsl:for-each>
         <td>
              <span><xsl:value-of select="Financials/PercentageChange/PercentChangeCurrentRatio"/></span>
        </td>
        <td>
            <span><xsl:value-of select="Financials/Quartiles/MedianQuartiles/CurrentRatioMedian"/></span>
        </td>

    </tr>

    <tr>
        <th><span>borrowing ratio (%)</span></th>
        <xsl:for-each select="Financials/Ratios[position() &lt; 3]"><td>
            <xsl:value-of select="BorrowingRatio"/>
        </td></xsl:for-each>
        <td> <xsl:value-of select="Financials/PercentageChange/PercentChangeBorrowingRatio"/></td>
        <td>
            <span><xsl:value-of select="Financials/Quartiles/MedianQuartiles/BorrowingRatioMedian"/></span>
        </td>
    </tr>

    <tr>
        <th><span>equity gearing (%)</span></th>
        <xsl:for-each select="Financials/Ratios[position() &lt; 3]"><td>
            <xsl:value-of select="EquityGearing"/>
        </td></xsl:for-each>
        <td> <xsl:value-of select="Financials/PercentageChange/PercentChangeEquityGearing"/></td>
        <td>
            <span><xsl:value-of select="Financials/Quartiles/MedianQuartiles/EquityGearingMedian"/></span>
        </td>
    </tr>

    <tr>
        <th><span>debt gearing (%)</span></th>
        <xsl:for-each select="Financials/Ratios[position() &lt; 3]"><td>
            <xsl:value-of select="DebtGearing"/>
        </td></xsl:for-each>
        <td> <xsl:value-of select="Financials/PercentageChange/PercentChangeDebtGearing"/></td>
        <td>
            <span><xsl:value-of select="Financials/Quartiles/MedianQuartiles/DebtGearingMedian"/></span>
        </td>
    </tr>

    <tr>
        <th><span>number of employees</span></th>
        <xsl:for-each select="Financials/Ratios[position() &lt; 3]">
            <td>
            <span><xsl:value-of select="NumEmployees"/></span>
        </td>

    </xsl:for-each>
        <td> <xsl:value-of select="Financials/PercentageChange/PercentChangeNumEmployees"/></td>
    <td>N/A</td>
</tr>

<tr>
    <th><span>avg. employee remuneration £</span></th>
    <xsl:for-each select="Financials/Ratios[position() &lt; 3]"><td class="num">
            <span><xsl:value-of select="AvgRemPerEmp"/></span>
        </td></xsl:for-each>
    <td> <xsl:value-of select="Financials/PercentageChange/PercentChangeAvgEmpPerRem"/></td>
    <td class="num">
        <span><xsl:value-of select="Financials/Quartiles/MedianQuartiles/AvgRemPerEmpMedian"/></span>
    </td>
</tr>

<tr>
    <th><span>turnover/employee £</span></th>
    <xsl:for-each select="Financials/Ratios[position() &lt; 3]">
        <td class="num">
            <span><xsl:value-of select="TurnoverPerEmp"/></span>
        </td>
    </xsl:for-each>
    
    <td> <xsl:value-of select="Financials/PercentageChange/PercentChangeTurnoverPerEmp"/></td>
    <td class="num">
        <span><xsl:value-of select="Financials/Quartiles/MedianQuartiles/TurnoverPerEmpMedian"/></span>
    </td>
</tr>

<tr>
    <th><span>pre-tax profit/employee £</span></th>
    <xsl:for-each select="Financials/Ratios[position() &lt; 3]">
        <td class="num">
            <span><xsl:value-of select="ProfitPerEmp"/></span>
        </td>
    </xsl:for-each>
    <td> <xsl:value-of select="Financials/PercentageChange/PercentChangeProfPerEmp"/></td>
    <td class="num">
        <span><xsl:value-of select="Financials/Quartiles/MedianQuartiles/ProfitPerEmpMedian"/></span>
    </td>
</tr>

</table>
</div>

<br/>
</div>
</xsl:template>
</xsl:stylesheet>