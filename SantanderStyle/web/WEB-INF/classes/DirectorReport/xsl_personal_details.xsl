<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_personal_details">
        <div class="section" id="personal_details">
            <h2>personnal details</h2>
            
            <ul>
                <li>
                    <label>Name</label>
                    <div class="dataValue">
                        <xsl:call-template name="commaSeparatedValue">
                            <xsl:with-param name="curValue" select="DirectorDetails/Name/*">
                            </xsl:with-param>
                            <xsl:with-param name="separator" select="' '">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label>date of birth</label>
                    <div class="dataValue">
                        <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="DirectorDetails/DateOfBirth">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label>Nationality</label>
                    <div class="dataValue">
                        <xsl:value-of select="DirectorDetails/Nationality"/>
                    </div>
                </li>

                <li>
                    <label>Latest Filed Address</label>
                    <div class="dataValue">
                        <xsl:call-template name="commaSeparatedValue">
                            <xsl:with-param name="curValue" select="DirectorDetails/Location/*">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label>Previous Names</label>
                    <div class="dataValue">
                        <xsl:for-each select="PreviousNames">
                         <xsl:call-template name="commaSeparatedValue">
                            <xsl:with-param name="curValue" select="Name/*">
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:for-each>

                </div>
            </li>
        </ul>
            <h4>Previous Addresses</h4>
            <br/>
        <ul>
            <xsl:for-each select="PreviousAddresses">
                <li>
                    <label>Date Of Change</label>
                    <div class="dataValue">
                        <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="DateChanged">
                            </xsl:with-param>
                        </xsl:call-template>

                    </div>
                </li>
                <li>
                    <label>Address</label>
                    <div class="dataValue">
                        <xsl:call-template name="commaSeparatedValue">
                            <xsl:with-param name="curValue" select="Location/*">
                            </xsl:with-param>
                        </xsl:call-template>

                    </div>
                </li>
            </xsl:for-each>
        </ul>

    </div>
</xsl:template>
</xsl:stylesheet>