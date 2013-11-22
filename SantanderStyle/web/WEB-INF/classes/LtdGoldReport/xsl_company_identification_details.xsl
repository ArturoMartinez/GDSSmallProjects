<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">


    <xsl:template name="legalForms">
        <xsl:param name="curValue"/>
        <xsl:choose>
           <xsl:when test="$curValue =''">Blank</xsl:when>
            <xsl:when test="$curValue = '1'">Private Unlimited</xsl:when>
            <xsl:when test="$curValue = '2'">Private Limited</xsl:when>
            <xsl:when test="$curValue = '3'">PLC</xsl:when>
            <xsl:when test="$curValue = '4'">Old Public Company</xsl:when>
            <xsl:when test="$curValue = '5'">Private Company Limited by Guarantee (Exempt from using word “Limited”)</xsl:when>
            <xsl:when test="$curValue = '6'">Limited Partnership</xsl:when>
            <xsl:when test="$curValue = '7'">Private Limited Company Without Share Capital</xsl:when>
            <xsl:when test="$curValue = '8'">Company Converted / Closed</xsl:when>
            <xsl:when test="$curValue = '9'">Private Unlimited Company Without Share Capital</xsl:when>
            <xsl:when test="$curValue = '0'">Other</xsl:when>
            <xsl:when test="$curValue = 'A'">Private Company Limited by Shares (Exempt from using word Limited)</xsl:when>
        </xsl:choose>
    </xsl:template>



    <xsl:template name="xsl_company_identification_details">
        <div class="section" id="company_identification_details">
            <h2>company identification details</h2>
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialName"/>
            </div>
            <div class="dataLabel" style="clear:both">registerd number</div>
            <div class="dataValue">
                <xsl:value-of select="RegNumber"/>
            </div>
            <div class="dataLabel" style="clear:both">legal form</div>
            <div class="dataValue">
                <xsl:call-template name="legalForms"><xsl:with-param name="curValue" select="Identification/LegalStatus"/></xsl:call-template>
               
            </div>
            <div class="dataLabel" style="clear:both">date incorporated</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/IncorporationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/IncorporationDate/MM"/></span>&#xA0;<xsl:value-of select="Identification/IncorporationDate/CCYY"/>
            </div>
            <div class="dataLabel" style="clear:both">registered office</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/RegisteredOffice/LocationLine1"/>&#xA0;,
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine2"/>&#xA0;,
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine3"/>&#xA0;,
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine4"/>&#xA0;,
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine5"/>&#xA0;
                    <xsl:value-of select="Identification/RegisteredOffice/Postcode"/>
            </div>
            <div class="dataLabel" style="clear:both">trading address</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/TradingLocation/LocationLine1"/>&#xA0;
                    <xsl:value-of select="Identification/TradingLocation/LocationLine2"/>&#xA0;
                    
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine3"/>&#xA0;,
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine4"/>&#xA0;,
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine5"/>&#xA0;
                    <xsl:value-of select="Identification/TradingLocation/Postcode"/>
            </div>
            <div class="dataLabel" style="clear:both">telephone number</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/TradingTelephoneNum"/>
                   
            </div>
            <div class="dataLabel" style="clear:both">SIC codes (1980)</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/SICInformation1980/Code"/>
            </div>
            <div class="dataLabel" style="clear:both">SIC description (1980)</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/SICInformation1980/Description"/>
            </div>
            <div class="dataLabel" style="clear:both">SIC Codes (1992)</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/SICInformation1992/Code"/>
            </div>
            <div class="dataLabel" style="clear:both">SIC description (1992)</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/SICInformation1992/Description"/>
            </div>
            <div class="dataLabel" style="clear:both">Principal Activities</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/PrincipalActivities"/>
            </div>
            <br style="clear:both"/>
            <xsl:if test="Identification/PreviousNames/NumPrevNames[.> 0]"><div class="dataLabel" style="clear:both">previous names</div>
                <div class="dataValue">
                    <xsl:for-each select="Identification/PreviousNames/PreviousName">
                        <div style="float:left;overflow:auto">
                            <xsl:value-of select="Name"/>
                       
                            (until <xsl:value-of select="DateChanged/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DateChanged/MM"/></span>&#xA0;<xsl:value-of select="DateChanged/CCYY"/>
                             )</div>
                        
                        <br style="clear:both"/>
                    </xsl:for-each>
                </div>
            
            <br style="clear:both"/>
            </xsl:if>
            <xsl:if test="Identification/PreviousAddresses/NumPrevAddresses[.>0]"><div class="dataLabel" style="clear:both">previous registered office</div>
            <div class="dataValue">
                <xsl:for-each select="Identification/PreviousAddresses/PreviousCRO">
                   
                    <div style="float:left;overflow:auto">
                        <xsl:value-of select="RegisteredOffice/LocationLine1"/>&#xA0;
                        <xsl:value-of select="RegisteredOffice/LocationLine2"/>&#xA0;
                        <xsl:value-of select="RegisteredOffice/LocationLine3"/>&#xA0;
                        <xsl:value-of select="RegisteredOffice/LocationLine4"/>&#xA0;
                        <xsl:value-of select="RegisteredOffice/Postcode"/>&#xA0;

                        (until <xsl:value-of select="DateChanged/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DateChanged/MM"/></span>&#xA0;<xsl:value-of select="DateChanged/CCYY"/>)
                    </div>
                    <br style="clear:both"/>
                </xsl:for-each>
            </div><br style="clear:both"/>
            <br style="clear:both"/>
            </xsl:if>
            <div class="dataLabel">account type</div>
            <div class="dataValue">
                <xsl:call-template name="LatestAccountTypeList"></xsl:call-template>
            </div>
            <div class="dataLabel" style="clear:both">account ref. date</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/FilingDetails/AccountsRefDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/AccountsRefDate/MM"/></span>
                             
              
            </div>
            <div class="dataLabel" style="clear:both">date latest accounts</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/FilingDetails/LatestAccounts/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestAccounts/MM"/></span>&#xA0;<xsl:value-of select="Identification/FilingDetails/LatestAccounts/CCYY"/>
            </div>
            <div class="dataLabel" style="clear:both">date latest returns</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/FilingDetails/LatestReturns/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestReturns/MM"/></span>&#xA0;<xsl:value-of select="Identification/FilingDetails/LatestReturns/CCYY"/></div>
           
            <div class="dataLabel" style="clear:both">Auditor/Accountant</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/Auditor/Auditors"/></div>

            <div class="dataLabel" style="clear:both">Bankers</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/Bank/BankName"/>
                <br style="clear:both"/>
                <xsl:value-of select="Identification/Bank/BankLocation"/>
            </div>
        </div>
    </xsl:template>
</xsl:stylesheet>
