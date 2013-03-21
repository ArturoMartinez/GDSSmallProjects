<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    
    <xsl:template name="UKSUbStatus">
        <xsl:choose>
            <xsl:when test="SubStatus='L'">LIVE</xsl:when>
            <xsl:when test="SubStatus='D'">DORMANT</xsl:when>
            <xsl:when test="SubStatus='S'">DISSOLVED</xsl:when>
        </xsl:choose>
    </xsl:template>
    
    <xsl:template name="UKSUbLegalStatus">
        <xsl:choose>
            <xsl:when test="SubLegalStatus='1'">Registered Office / Company Profile</xsl:when>
            <xsl:when test="SubLegalStatus='2'">Profile and Credit</xsl:when>
            <xsl:when test="SubLegalStatus='3'">Financial Analysis</xsl:when>
            <xsl:when test="SubLegalStatus='4'">On-line Report</xsl:when>
            <xsl:when test="SubLegalStatus='6'">Written Report</xsl:when>
            <xsl:when test="SubLegalStatus='7'">Microfiche / Document Copy Request</xsl:when>
            <xsl:when test="SubLegalStatus='8'">Director Information</xsl:when>
            <xsl:when test="SubLegalStatus='C'">CPU Link Enquiry</xsl:when>
            <xsl:when test="SubLegalStatus='D'">e-series Gold Report</xsl:when>
            <xsl:when test="SubLegalStatus='E'">e-series Silver Report</xsl:when>
            <xsl:when test="SubLegalStatus='F'">e-series Bronze Report</xsl:when>
            <xsl:when test="SubLegalStatus='G'">e-series Basic</xsl:when>
            <xsl:when test="SubLegalStatus='H'">Document Image</xsl:when>
            <xsl:when test="SubLegalStatus='I'">Corporate Tree</xsl:when>
            <xsl:when test="SubLegalStatus='J'">Enhanced Corporate Tree</xsl:when>
            <xsl:when test="SubLegalStatus='L'">BIGNet Report</xsl:when>
            <xsl:when test="SubLegalStatus='M'">Report Builder</xsl:when>
            <xsl:when test="SubLegalStatus='N'">Commercial Autoscore Application</xsl:when>
            <xsl:when test="SubLegalStatus='O'">Commercial Autoscore Reprocess Decision</xsl:when>
            <xsl:when test="SubLegalStatus='P'">Mortgages and Charges</xsl:when>
            <xsl:when test="SubLegalStatus='Q'">Credit Card Report</xsl:when>
            <xsl:when test="SubLegalStatus='X'">XML Bespoke Delivery</xsl:when>
        </xsl:choose>
    </xsl:template>
    
    <xsl:template name="xsl_corporate_structure">
        <div class="section" id="corporate_structure">


            <h2>corporate structure</h2>

            <div class="dataLabel">principal shareholders</div>

            <div class="dataValue">
                <xsl:for-each select="CorporateStructure/CompanyOwnership/CorporateShareholder">
                    Reg. Number : <xsl:value-of select="RegNumber"/>
                    <br/>
                    <xsl:value-of select="Name"/>
                    <br/>
                    <xsl:value-of select="Country"/>
                    <br style="clear:both"/>
                    <br style="clear:both"/>
                </xsl:for-each>
            </div>

            <br style="clear:both"/>

            <br/>
            <div class="dataLabel">UK direct subsidiaries</div>
            <div class="dataValue">
                <xsl:for-each select="CorporateStructure/Subsidiaries/UKSubsidiaries"> Reg. number:
                        <xsl:value-of select="SubRegNumber"/>
                    <br style="clear:both"/>
                    Status : <xsl:call-template name="UKSUbStatus"></xsl:call-template><br style="clear:both"/>
                    Legal Status : <xsl:call-template name="UKSUbLegalStatus"></xsl:call-template>
                    <br style="clear:both"/>
                    <xsl:value-of select="SubName"/>
                    <br style="clear:both"/>
                    <br style="clear:both"/>
                </xsl:for-each>
            </div>
            <br style="clear:both"/>
            <br/>
            <div class="dataLabel">corporate tree report shareholders</div>
            <div class="dataValue" id="notFound">??? Need to know where to get data and how to
                layout it</div>
            <br/>

        </div>
    </xsl:template>

</xsl:stylesheet>
