<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template name="previousSearchesEnquiryTypes">
        <xsl:choose>
            <xsl:when test="EnquiryType='1'">Registered Office / Company Profile</xsl:when>
            <xsl:when test="EnquiryType='2'">Profile &amp; Credit</xsl:when>
            <xsl:when test="EnquiryType='3'">Financial Analysis</xsl:when>
            <xsl:when test="EnquiryType='4'">On-line Report</xsl:when>
            <xsl:when test="EnquiryType='6'">Written Report</xsl:when>
            <xsl:when test="EnquiryType='7'">Microfiche / Document Copy Request</xsl:when>
            <xsl:when test="EnquiryType='8'">Director Information</xsl:when>
            <xsl:when test="EnquiryType='C'">CPU Link Enquiry</xsl:when>
            <xsl:when test="EnquiryType='D'">e-series Gold Report</xsl:when>
            <xsl:when test="EnquiryType='E'">e-series Silver Report</xsl:when>
            <xsl:when test="EnquiryType='F'">e-series Bronze Report</xsl:when>
            <xsl:when test="EnquiryType='G'">e-series Basic</xsl:when>
            <xsl:when test="EnquiryType='H'">Document Image</xsl:when>
            <xsl:when test="EnquiryType='I'">Corporate Tree</xsl:when>
            <xsl:when test="EnquiryType='J'">Enhanced Corporate Tree</xsl:when>
            <xsl:when test="EnquiryType='L'">BIGNet Report</xsl:when>
            <xsl:when test="EnquiryType='M'">Report Builder</xsl:when>
            <xsl:when test="EnquiryType='N'">Commercial Autoscore Application</xsl:when>
            <xsl:when test="EnquiryType='O'">Commercial Autoscore Reprocess Decision</xsl:when>
            <xsl:when test="EnquiryType='P'">Mortgages &amp; Charges</xsl:when>
            <xsl:when test="EnquiryType='Q'">Credit Card Report</xsl:when>
            <xsl:when test="EnquiryType='X'">XML Bespoke Delivery</xsl:when>
        </xsl:choose>
    </xsl:template>








    <xsl:template name="xsl_previous_searches">
        <div class="section" id="previous_searches">

            <h2>previous searches</h2>
            
            <br style="clear:both"/>
<div class="matrixLabel" id="company_ratio_and_disclosure_items_details">Summary of Previous Searches</div>
<div class="matrix" id="company_ratio_and_disclosure_items_details_matrix">

    <table cellspacing="0" cellpadding="0">
        <tr>
                <th style="background:#fff"></th>
                <th style="text-align:center">last 3 months</th>
                <th style="text-align:center">last 6 months</th>
                <th style="text-align:center">last 12 months</th>
        </tr>
        <tr>
            <th><span>number of searches</span></th>
            <td>
                <xsl:value-of select="Identification/PrevSearches/NumPrevSearch3Mth"/>
            </td>
            <td>
                <xsl:value-of select="Identification/PrevSearches/NumPrevSearch6Mth"/>
            </td>
            <td>
                <xsl:value-of select="Identification/PrevSearches/NumPrevSearch12Mth"/>
            </td>
       </tr>


      
</table>
</div>

<div class="matrixLabel" id="company_ratio_and_disclosure_items_details">Details of Previous Searches </div>
<div class="matrix" id="company_ratio_and_disclosure_items_details_matrix">

    <table cellspacing="0" cellpadding="0">
        <tr>
                <th style="text-align:center">Date</th>
                <th style="text-align:center">Search Type</th>
                <th style="text-align:center">SIC Code</th>
                <th style="text-align:center">SIC Description</th>
        </tr>
        <xsl:for-each select="Identification/PrevSearches/PreviousSearchDetail">
            <tr>
                <td> 
                        <xsl:value-of select="SearchDate/DD"/>/<xsl:value-of select="SearchDate/MM"/>/<xsl:value-of select="SearchDate/CCYY"/>
                </td>
                <td>
                    <xsl:call-template name="previousSearchesEnquiryTypes"></xsl:call-template>
                        
                    </td>
                <td>
                    <xsl:value-of select="SICInformation/Type"/>
                    </td>
                <td>
                    <xsl:value-of select="SICInformation/Description"/>
                    </td>

           </tr>
        </xsl:for-each>


      
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
        <xsl:for-each select="Financials/Ratios[position() &lt; 3]"><td>
            <span><xsl:value-of select="NumEmployees"/></span>
        </td>

    </xsl:for-each>
        <td> <xsl:value-of select="Financials/PercentageChange/PercentChangeNumEmployees"/></td>
    <td></td>
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

<br style="clear:both"/>
<div class="dataLabel" style="clear:both;width:550px">Number of found directors</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorsFound"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directors not found</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorsNotFound"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">NOC flag</div>
<div class="dataValue">
    <xsl:if test="DirectorExpandedSummary/NocFlag = 'Y'">
        Notice of corrections exist
    </xsl:if>
    <xsl:if test="DirectorExpandedSummary/NocFlag = 'N'">
        No notice of corrections
    </xsl:if>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directors disqualified</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDisqualifications"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of convictions</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumConvictions"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of CIFAS records</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumCIFAS"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorships"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of current directorships</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumCurrrentDirships"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of current dissolved directorships</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumCurrentDissolvedDirships"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of previous directorships</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumPreviousDirectorships"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of failed directorships</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectoirshipsFailed"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships not failed</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsNotFailed"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have a compulsory liquidator appointed</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsCompulsoryLiquidator"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have a liquidator appointed by creditors</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsCreditorLiquidator"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have a liquidator appointed by members</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsMemberLiqidator"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have a liquidator appointed by persons unknown</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsUnknownLiquidator"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have a winding up order</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsWindUpOrder"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have an appointment of an administrator</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsAdministraitorAppointed"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have a discharge of an administrator</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsAdministraitorDischarge"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have an appointment of an administrative receiver</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsAppointmentAdministrativeReceiver"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have a receiver appointed</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsReceiverAppointed"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have had a cessation of an administrative receiver</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsAdministrativeReceiverCessation"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have had a cessation of a receiver</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsReceiverCessation"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have had an approval of voluntary arrangements</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsApprovalVoluntaryArrangements"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have had a completion of voluntary arrangements</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsCompletionVoluntaryArrangements"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have had a revocation of voluntary arrangements</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsRevocationVoluntaryArrangements"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have has a suspension of voluntary arrangements</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsSuspensionVoluntaryArrangements"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have been reinstated</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsReinstated"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Number of directorships for companies that have been dissolved</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/NumDirectorshipsDissolved"/>
</div>
<div class="dataLabel" style="clear:both;width:550px">Director number for directors found</div>
<div class="dataValue">
    <xsl:value-of select="DirectorExpandedSummary/DirectorNumbers"/>
</div>
<br style="clear:both"/><br style="clear:both"/>
<div class="dataLabel" style="clear:both;width:550px">Number of Notices of Correction</div>
<div class="dataValue">
    <xsl:value-of select="NoticeOfCorrection/NumCorrections"/>
</div>




<br/>
</div>
</xsl:template>
</xsl:stylesheet>