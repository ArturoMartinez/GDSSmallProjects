<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_company_identification_details">
        <div class="section" id="company_identification_details">
            <h2>company identification details</h2>
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialName"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">registerd number</div>
            <div class="dataValue">
                <xsl:value-of select="RegNumber"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">legal form</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/LegalStatus"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">date incorporated</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/IncorporationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/IncorporationDate/MM"/></span>&#xA0;<xsl:value-of select="Identification/IncorporationDate/CCYY"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">registered office</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/RegisteredOffice/LocationLine1"/>&#xA0;
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine2"/>&#xA0;
                    <xsl:value-of select="Identification/RegisteredOffice/Postcode"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">trading address</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/TradingLocation/LocationLine1"/>&#xA0;
                    <xsl:value-of select="Identification/TradingLocation/LocationLine2"/>&#xA0;
                    <xsl:value-of select="Identification/TradingLocation/Postcode"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">SIC codes (1980)</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/SICInformation1980/Code"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">SIC description (1980)</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/SICInformation1980/Description"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">SIC Codes (1992)</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/SICInformation1992/Code"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">SIC description (1992)</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/SICInformation1992/Description"/>
            </div>
            <br style="clear:both"/>
            <xsl:if test="Identification/PreviousNames/NumPrevNames[.> 0]"><br style="clear:both"/>
                <div class="dataLabel">previous names</div>
                <div class="dataValue">
                    <xsl:for-each select="Identification/PreviousNames/PreviousName">
                        <div style="float:left;width:100px">
                            <xsl:value-of select="DateChanged/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DateChanged/MM"/></span>&#xA0;<xsl:value-of select="DateChanged/CCYY"/>
                             : </div>
                        <div style="float:left;width:300px;overflow:auto">
                            <xsl:value-of select="Name"/>
                        </div>
                        <br style="clear:both"/>
                    </xsl:for-each>
                </div>
            
            <br style="clear:both"/>
            </xsl:if>
            <xsl:if test="Identification/PreviousAddresses/NumPrevAddresses[.>0]"><br style="clear:both"/>
            <div class="dataLabel">previous registered office</div>
            <div class="dataValue">
                <xsl:for-each select="Identification/PreviousAddresses/PreviousCRO">
                    <div style="float:left;width:100px"><xsl:value-of select="DateChanged/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DateChanged/MM"/></span>&#xA0;<xsl:value-of select="DateChanged/CCYY"/>
                              : </div>
                    <div style="float:left;width:300px;overflow:auto">
                        <xsl:value-of select="RegisteredOffice/LocationLine1"/>&#xA0;
                        <xsl:value-of select="RegisteredOffice/LocationLine2"/>&#xA0;
                        <xsl:value-of select="RegisteredOffice/LocationLine3"/>&#xA0;
                        <xsl:value-of select="RegisteredOffice/LocationLine4"/>&#xA0;
                    </div>
                    <br style="clear:both"/>
                </xsl:for-each>
            </div><br style="clear:both"/>
            <br style="clear:both"/>
            </xsl:if>
            <div class="dataLabel">account type</div>
            <div class="dataValue doubt">
                <xsl:value-of select="Identification/FilingDetails/LatestAccountType"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">account ref. date</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/FilingDetails/AccountsRefDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/AccountsRefDate/MM"/></span>
                             
              
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">date latest accounts</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/FilingDetails/LatestAccounts/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestAccounts/MM"/></span>&#xA0;<xsl:value-of select="Identification/FilingDetails/LatestAccounts/CCYY"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">date latest returns</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/FilingDetails/LatestReturns/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/FilingDetails/LatestReturns/MM"/></span>&#xA0;<xsl:value-of select="Identification/FilingDetails/LatestReturns/CCYY"/></div>
            <br style="clear:both"/>
        </div>
    </xsl:template>
</xsl:stylesheet>
