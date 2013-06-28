<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_CAIS">
        <div class="section" id="CAIS">
            <h2>CAIS</h2>
            <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/CAIS">


                <xsl:for-each select="CAISDetails">
                    <div style="margin:10px 0px 0px 10px">
                        <xsl:if test="JointAccount='M'">
                            <strong>Joint Account</strong>
                        </xsl:if>

                        <xsl:if test="JointAccount='J'">
                            <strong>Joint Account</strong>
                        </xsl:if>
                        <br style="clear:both"/>
                        <div class="dataValue">
                            <strong>&#x2022;&#xA0;</strong><xsl:value-of select="Name/Title"/>&#xA0;
                                <xsl:value-of select="Name/Surname"/>&#xA0; <xsl:value-of
                                select="Name/Forename"/>&#xA0;-&#xA0; <xsl:value-of
                                select="Location/HouseNumber"/>&#xA0; <xsl:value-of
                                select="Location/Street"/>&#xA0; <xsl:value-of
                                select="Location/Street2"/>&#xA0; <xsl:value-of
                                select="Location/PostTown"/>&#xA0; <xsl:value-of
                                select="Location/Postcode"/>&#xA0; <xsl:value-of
                                select="Location/Country"/>
                        </div>
                        <br style="clear:both"/>

                        <div class="dataLabel">current status</div>
                        <div class="dataValue ">
                            <xsl:value-of select="AccountStatus"/>
                        </div>
                        <br style="clear:both"/>

                        <div class="dataLabel">worst status</div>
                        <div class="dataValue">
                            <xsl:value-of select="WorstStatus"/>
                        </div>
                        <br style="clear:both"/>

                        <div class="dataLabel">date of birth</div>
                        <div class="dataValue">
                            <xsl:value-of select="DateOfBirth/DD"/>&#160;
                        <span class="toMonthName"><xsl:value-of select="DateOfBirth/MM"/></span>&#160;
                        <xsl:value-of select="DateOfBirth/CCYY"/>&#160;
                        </div>
                        <br style="clear:both"/>

                        <div class="dataLabel">company type</div>
                        <div class="dataValue">
                            <xsl:value-of select="CompanyType"/>
                        </div>
                        <br style="clear:both"/>
                        <div class="dataLabel">account type</div>
                        <div class="dataValue">
                            <xsl:value-of select="AccountType"/>
                        </div>
                        <br style="clear:both"/>
                        <div class="dataLabel">status 1-2</div>
                        <div class="dataValue">
                            <xsl:value-of select="Status1To2"/>
                        </div>
                        <br style="clear:both"/>
                        <div class="dataLabel">status 3+</div>
                        <div class="dataValue">
                            <xsl:value-of select="StatusTo3"/>
                        </div>
                        <br style="clear:both"/>
                        <div class="dataLabel">start date</div>
                        <div class="dataValue">
                            <xsl:value-of select="CAISAccStartDate/DD"/>&#160;
                        <span class="toMonthName"><xsl:value-of select="CAISAccStartDate/MM"/></span>&#160;
                        <xsl:value-of select="CAISAccStartDate/CCYY"/>&#160;
                        </div>
                        <br style="clear:both"/>
                        <div class="dataLabel">default date</div>
                        <div class="dataValue" id="notFound">???</div>
                        <br style="clear:both"/>
                        <div class="dataLabel">current balance</div>
                        <div class="dataValue num">
                            <xsl:value-of select="Balance/Amount"/>
                        </div>
                        <br style="clear:both"/>
                        <div class="dataLabel">default balance</div>
                        <div class="dataValue num">
                            <xsl:value-of select="CurrentDefBalance/Amount"/>
                        </div>

                        <br style="clear:both"/>
                        <div class="dataLabel">overdraft balance</div>
                        <div class="dataValue" id="notFound"> ??? </div>
                        <br style="clear:both"/>
                        <div class="dataLabel">overdraft limit</div>
                        <div class="dataValue" id="notFound"> ??? </div>

                        <br style="clear:both"/>
                        <div class="dataLabel">overdraft limit</div>
                        <div class="dataValue" id="notFound"> ??? </div>

                        <br style="clear:both"/>
                        <div class="dataLabel">arrangement</div>
                        <div class="dataValue" id="notFound"> ??? </div>
                        <br style="clear:both"/>
                        <br style="clear:both"/>

                    </div>


                </xsl:for-each>
            </xsl:for-each>
        </div>
    </xsl:template>
</xsl:stylesheet>
