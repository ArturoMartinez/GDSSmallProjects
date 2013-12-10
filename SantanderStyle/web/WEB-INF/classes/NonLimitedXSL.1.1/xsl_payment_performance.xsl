<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    <xsl:template name="xsl_payment_performance">
        <div class="section" id="payment_performance" style="overflow:hidden">
        <h2>payment performance</h2>
           
            <div class="subSectionInsert" style="width:45%">
                <h3  >Summary Based On The Information Supplied From Our Sources</h3>
                <div>

                    This company pays its accounts on average <xsl:value-of select="/NonLtdBusinessData/PaymentPerformance/PaymentFull/DBTMonthly[last()]/DBT"/> days beyond terms. (<span class="toMonthName"><xsl:value-of select="/NonLtdBusinessData/PaymentPerformance/PaymentFull/DBTMonthly[last()]/ExpMonth/MM"/></span>&#xA0;<xsl:value-of select="/NonLtdBusinessData/PaymentPerformance/PaymentFull/DBTMonthly[last()]/ExpMonth/CCYY"/>)
                    
                    <br/>
                        There is <xsl:call-template name="PaymentPatternValues"/> payment pattern.
                    <br/>
                        This company pays <xsl:call-template name="PaymentTermValues"/>.
                </div>
               
            </div>
         
            
          
            <br style="clear:both"/>
            <h3 style="margin-bottom:5px">Days beyond terms trend</h3>
            <div style="margin:10px">All figures refer to days beyond terms (DBT)</div>
            <div class="td60 matrix" id="payment_profile_current_days_beyond_terms_matrix" style="overflow:auto;margin-bottom:0px">
                
                <table cellspacing="0" cellpadding="0" >
                    
                    <tr>
                        <th style="background:#fff;border:none;text-align:center"><span>trend</span></th>
                        
                        
                        <td style="background:#fff;border:none" colspan="{count(PaymentPerformance/PaymentFull/CompanyDBTMonthly)}">
                            
                        </td>
                        
                    </tr>
                    
                    <tr>
                        <th style="background:#fff;border:none;border-right:1px solid #bbb;border-bottom:1px solid #aaa"></th>
                        <xsl:for-each select="PaymentPerformance/PaymentFull/DBTMonthly">
                            <td style="width:60px">
                                <xsl:value-of select="ExpMonth/CCYY"/>/
                                <xsl:value-of select="ExpMonth/MM"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    
                    <tr>
                        <th><span>business</span></th>
                        <xsl:for-each select="PaymentPerformance/PaymentFull/DBTMonthly">
                            <td >
                                <xsl:value-of select="DBT"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th><span>number of experiences</span></th>
                        <xsl:for-each select="PaymentPerformance/PaymentFull/DBTMonthly">
                            <td >
                                <xsl:value-of select="NumExp"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    
                    
                </table>
            </div>
           
            <h3 style="margin-bottom:5px">Additional informations</h3>
                 <div class="dataLabel"> Date Ownership Terminated</div>
                <div class="dataValue">
                    <span  class="toMonthName">
                    <xsl:value-of select="Identification/ConsumerCreditLicenceSummary/DateOwnershipCommenced-Mm"/></span>&#xA0;
                    <xsl:value-of select="Identification/ConsumerCreditLicenceSummary/DateOwnershipCommenced-Yyyy"/>
                    
                </div>

                <div class="dataLabel"> Date Ownership Commenced</div>
                <div class="dataValue">
                    <span  class="toMonthName">
                    <xsl:value-of select="Identification/ConsumerCreditLicenceSummary/DateOwnershipTerminated-Mm"/></span>&#xA0;
                    <xsl:value-of select="Identification/ConsumerCreditLicenceSummary/DateOwnershipTerminated-Yyyy"/>
                </div>

                <div class="dataLabel">Main Data Outside Ownership Range</div>
                <div class="dataValue">
                    <xsl:choose>
                        <xsl:when test="Identification/ConsumerCreditLicenceSummary/MainDataOutsideOwnership='Y'">
                            Data outside range
                        </xsl:when>
                        <xsl:when test="Identification/ConsumerCreditLicenceSummary/MainDataOutsideOwnership='N'">
                            No data outside range
                        </xsl:when>
                    </xsl:choose>
                </div>
                
                <div class="dataLabel"> Associated Data Outside Ownership Range</div>
                <div class="dataValue">
                    <xsl:choose>
                        <xsl:when test="Identification/ConsumerCreditLicenceSummary/MainDataOutsideOwnership='Y'">
                            Data outside range
                        </xsl:when>
                        <xsl:when test="Identification/ConsumerCreditLicenceSummary/MainDataOutsideOwnership='N'">
                            No data outside range
                        </xsl:when>
                    </xsl:choose>
                </div>
                

          
                <div class="dataLabel" style="width:400px">Number of accounts on cash / pro forma terms during the last year</div>
                <div class="dataValue"><xsl:value-of select="PaymentPerformance/PaymentAbbrev/NumberCashFirst"/>&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0; </div>
           
            <div class="dataLabel" style="width:400px"> Number of accounts placed for collection last month</div>
                <div class="dataValue"><xsl:value-of select="PaymentPerformance/PaymentAbbrev/NumberCollection"/>&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0; </div>
            
            <div class="dataLabel" style="width:400px">Value of accounts placed for collection last month</div>
            <div class="dataValue"><xsl:value-of select="PaymentPerformance/PaymentFull/ValCollection"/>&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;</div>
           
            <div class="dataLabel" style="width:400px">Number of accounts placed for collection in last 2 years</div>
        <div class="dataValue "><xsl:value-of select="PaymentPerformance/PaymentFull/NumberCollectionLast2Years"/>&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;</div>
         
            <br style="clear:both"/>
            <div class="dataLabel"> Unpaid account</div><div class="dataValue" style="overflow:auto">
                <xsl:value-of select="PaymentPerformance/PaymentAbbrev/AcctsUnpaid1Month"/>
                have received no payment for 1 month
                <br style="clear:both"/>
                <xsl:value-of select="PaymentPerformance/PaymentAbbrev/AcctsUnpaid2Months"/>
                have received no payment for 2 months
                <br style="clear:both"/>
                <xsl:value-of select="PaymentPerformance/PaymentAbbrev/AcctsUnpaid3Months"/>
                have received no payment for 3 months
            </div>
            <br style="clear:both"/>
    </div>
    </xsl:template>
</xsl:stylesheet>