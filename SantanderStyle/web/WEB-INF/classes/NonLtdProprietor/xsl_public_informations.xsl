<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_public_informations">
        <div class="section" id="public_informations">
            <h2>public informations</h2>
            <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/PublicInformation">
                <div  style="margin-left:15px;width:100%">
                    &#x2022;&#xA0;<xsl:value-of select="PublicInfoDetails/Name/Title"/>&#xA0;
                <xsl:value-of select="PublicInfoDetails/Name/Surname"/>&#xA0;
                    <xsl:value-of select="PublicInfoDetails/Name/Forename"/> - 
                    <xsl:value-of select="PublicInfoDetails/Location/HouseNumber"/>&#xA0;
                    <xsl:value-of select="PublicInfoDetails/Location/Street"/>
                    &#xA0;
                    <xsl:value-of select="PublicInfoDetails/Location/Street2"/>
                    &#xA0;
                    <xsl:value-of select="PublicInfoDetails/Location/Postcode"/>
                    &#xA0;
                    <xsl:value-of select="PublicInfoDetails/Location/PostTown"/>
                    &#xA0;
                    <xsl:value-of select="PublicInfoDetails/Location/Country"/>
                    
                   <br style="clear:both"/>
                    
                    <div class="dataLabel">date</div><div class="dataValue" style="font-weight:normal">
                        <xsl:value-of select="PublicInfoDetails/InformationDate/DD"/>&#160;
                        <span class="toMonthName"><xsl:value-of select="PublicInfoDetails/InformationDate/MM"/></span>&#160;
                        <xsl:value-of select="PublicInfoDetails/InformationDate/CCYY"/>&#160;
                    </div>
                    <br style="clear:both"/>
                    <div class="dataLabel">court name</div><div class="dataValue" style="font-weight:normal"><xsl:value-of select="PublicInfoDetails/CourtPlaintiff"/></div>
                    <br style="clear:both"/>
                    <div class="dataLabel">amount</div><div class="dataValue num devise" style="font-weight:normal">
                        <xsl:value-of select="PublicInfoDetails/AmountPounds"/>
                    </div>
                    <br style="clear:both"/>
                    
                    <div class="dataLabel">case number</div><div class="dataValue" style="font-weight:normal"><xsl:value-of select="PublicInfoDetails/CameraNumber"/></div>
                    <br style="clear:both"/>
                    
                    <div class="dataLabel">type</div><div class="dataValue" style="font-weight:normal">
                        <xsl:value-of select="PublicInfoDetails/InformationType"/>
                    </div>
                    <br style="clear:both"/>
                </div>
                
            </xsl:for-each>
           
        </div>
    </xsl:template>
</xsl:stylesheet>
