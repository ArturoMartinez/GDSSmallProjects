<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_legal_notices">
        <div class="section" id="legal_notices">
            <h2>legal notices</h2>
            <h3>Winding up petitions</h3>
            <xsl:for-each select="LegalNotices/WindUp/Petition">
                
                <div class="dataLabel">date of petition presentation</div>
                <div class="dataValue"><xsl:value-of select="PresentationDate/CCYY"/> /
                    <xsl:value-of select="PresentationDate/MM"/> /
                    <xsl:value-of select="PresentationDate/DD"/></div>
                <br style="clear:both"/>
                
                <div class="dataLabel">date of petition publication</div>
                <div class="dataValue"><xsl:value-of select="PublicationDate/CCYY"/> /
                    <xsl:value-of select="PublicationDate/MM"/> /
                    <xsl:value-of select="PublicationDate/DD"/></div>
                <br style="clear:both"/>
                
                <div class="dataLabel">date of hearingn</div>
                <div class="dataValue">
                    <xsl:value-of select="HearingDate/CCYY"/> /
                    <xsl:value-of select="HearingDate/MM"/> /
                    <xsl:value-of select="HearingDate/DD"/>
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">court</div>
                <div class="dataValue">
                    <xsl:value-of select="CourtName"/>
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">petitioners</div>
                <div class="dataValue" style="width:600px">
                    <xsl:for-each select="Petitioners">
                        <div style="border-bottom:1px dotted #DDD;font-size:10px">
                            <xsl:value-of select="Name"/><br/>
                            <xsl:value-of select="PetitionerLocation/LocationLine1"/>&#xA0;
                            <xsl:value-of select="PetitionerLocation/LocationLine2"/>&#xA0;
                            <xsl:value-of select="PetitionerLocation/LocationLine3"/>&#xA0;
                            <xsl:value-of select="PetitionerLocation/LocationLine4"/>&#xA0;
                            <xsl:value-of select="PetitionerLocation/LocationLine5"/>&#xA0;
                            <xsl:value-of select="PetitionerLocation/Postcode"/>
                        </div>
                        
                    </xsl:for-each>
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">solicitors</div>
                <div class="dataValue" style="width:600px">
                    <xsl:for-each select="Solicitors">
                        <div style="border-bottom:1px dotted #DDD;font-size:10px">
                            <xsl:value-of select="Name"/><br/>
                            <xsl:value-of select="SolicitorLocation/LocationLine1"/>&#xA0;
                            <xsl:value-of select="SolicitorLocation/LocationLine2"/>&#xA0;
                            <xsl:value-of select="SolicitorLocation/LocationLine3"/>&#xA0;
                            <xsl:value-of select="SolicitorLocation/LocationLine4"/>&#xA0;
                            <xsl:value-of select="SolicitorLocation/LocationLine5"/>&#xA0;
                            <xsl:value-of select="SolicitorLocation/Postcode"/>
                        </div>
                        
                    </xsl:for-each>
                </div>
                <br style="clear:both"/>
                <div style="border-bottom:1px solid #EEE;width:100%;margin:5px 0px 10px 0px"></div>
                
            </xsl:for-each>
            
            <h3>Winding up dismissal</h3>
            <xsl:for-each select="LegalNotices/WindUp/Dismissal">
                <div class="dataLabel">publication date</div>
                <div class="dataValue"><xsl:value-of select="PublicationDate/CCYY"/> /
                    <xsl:value-of select="PublicationDate/MM"/> /
                    <xsl:value-of select="PublicationDate/DD"/></div>
                <br style="clear:both"/>
                
                <div class="dataLabel">original petition date</div>
                <div class="dataValue"><xsl:value-of select="OriginalPetitionDate/CCYY"/> /
                    <xsl:value-of select="OriginalPetitionDate/MM"/> /
                    <xsl:value-of select="OriginalPetitionDate/DD"/></div>
                <br style="clear:both"/>
                
                <div class="dataLabel">hearing date</div>
                <div class="dataValue"><xsl:value-of select="HearingDate/CCYY"/> /
                    <xsl:value-of select="HearingDate/MM"/> /
                    <xsl:value-of select="HearingDate/DD"/></div>
                <br style="clear:both"/>
                
                <div class="dataLabel">dismissal date</div>
                <div class="dataValue"><xsl:value-of select="DismissalDate/CCYY"/> /
                    <xsl:value-of select="DismissalDate/MM"/> /
                    <xsl:value-of select="DismissalDate/DD"/></div>
                <br style="clear:both"/>
                
                <div style="border-bottom:1px solid #EEE;width:100%;margin:5px 0px 10px 0px"></div>
            </xsl:for-each>
            
            <h3>Winding up order</h3>
            <xsl:for-each select="LegalNotices/WindUp/Order">
                <div class="dataLabel">publication date</div>
                <div class="dataValue"><xsl:value-of select="PublicationDate/CCYY"/> /
                    <xsl:value-of select="PublicationDate/MM"/> /
                    <xsl:value-of select="PublicationDate/DD"/></div>
                <br style="clear:both"/>
                
                <div class="dataLabel">Order date</div>
                <div class="dataValue"><xsl:value-of select="OrderDate/CCYY"/> /
                    <xsl:value-of select="OrderDate/MM"/> /
                    <xsl:value-of select="OrderDate /DD"/></div>
                <br style="clear:both"/>
                
                <div class="dataLabel">trading name</div>
                <div class="dataValue">
                    <xsl:value-of select="TradingName"/>
                </div>
                <br style="clear:both"/>
                
                <div style="border-bottom:1px solid #EEE;width:100%;margin:5px 0px 10px 0px"></div>
            </xsl:for-each>
            
            <h3>Winding up resolution</h3>
            <xsl:for-each select="LegalNotices/WindUp/Resolution">
                <div class="dataLabel">publication date</div>
                <div class="dataValue"><xsl:value-of select="PublicationDate/CCYY"/> /
                    <xsl:value-of select="PublicationDate/MM"/> /
                    <xsl:value-of select="PublicationDate/DD"/></div>
                <br style="clear:both"/>
                
                <div class="dataLabel">resolution date</div>
                <div class="dataValue"><xsl:value-of select="ResolutionDate/CCYY"/> /
                    <xsl:value-of select="ResolutionDate/MM"/> /
                    <xsl:value-of select="ResolutionDate /DD"/></div>
                <br style="clear:both"/>
                
                <div class="dataLabel">trading name</div>
                <div class="dataValue">
                    <xsl:value-of select="TradingName"/>
                </div>
                <br style="clear:both"/>
                
                <div style="border-bottom:1px solid #EEE;width:100%;margin:5px 0px 10px 0px"></div>
            </xsl:for-each>
            
        </div>
    </xsl:template>
</xsl:stylesheet>
