<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_public_informations">
        <div class="section" id="public_informations">
            <h2>public informations</h2>
            <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/PublicInformation">
                <div class="dataLabel" style="width:100%">
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
                        <xsl:value-of select="PublicInfoDetails/InformationDate"/>
                    </div>
                    <br style="clear:both"/>
                    <div class="dataLabel">court name</div><div class="dataValue" style="font-weight:normal" id="notFound">???</div>
                    <br style="clear:both"/>
                    <div class="dataLabel">amount</div><div class="dataValue numeric" style="font-weight:normal">
                        <xsl:value-of select="PublicInfoDetails/AmountPounds"/>
                    </div>
                    <br style="clear:both"/>
                    
                    <div class="dataLabel">case number</div><div class="dataValue" style="font-weight:normal" id="notFound">???</div>
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
