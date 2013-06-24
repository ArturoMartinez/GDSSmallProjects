<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_instalment_cais">
        <div class="section" id="insaltment_cais">

            <h2>instalment CAIS</h2>
            <h3>instalment CAIS summary - All contributors' data</h3>

            <div class="matrix td60 thcenter" id="instalment_cais_contributor_matrix"
                style="min-height:0px;margin-bottom:20px">
                    <table cellspacing="0" cellpadding="0">
                        <tr>
                            <th style="width:130px">
                                <span>date</span>
                            </th>
                            <th>
                                <span>0</span>
                            </th>
                            <th>
                                <span>1</span>
                            </th>
                            <th>
                                <span>2</span>
                            </th>
                            <th>
                                <span>3</span>
                            </th>
                            <th>
                                <span>4</span>
                            </th>
                            <th>
                                <span>5</span>
                            </th>
                            <th>
                                <span>6</span>
                            </th>
                            <th>
                                <span>U</span>
                            </th>
                            <th>
                                <span>8</span>
                            </th>
                            <th>
                                <span>active balance (£)</span>
                            </th>
                            <th>
                                <span>number of accounts</span>
                            </th>
                            <th>
                                <span>default balance (£)</span>
                            </th>
                        </tr>
                        <xsl:for-each select="LtdCompanyCAISSummary/MonthlyData">
                            <tr>
                                <td>
                                    <span class="toMonthName">
                                        <xsl:value-of select="Month-Yyyy"/></span>&#160;<span><xsl:value-of select="Month-Mm"/></span>
                                    
                                </td>
                                <td>
                                    <span>
                                        <xsl:value-of select="Status0"/>
                                    </span>
                                </td>
                                <td>
                                    <span>
                                        <xsl:value-of select="Status1"/>
                                    </span>
                                </td>
                                <td>
                                    <span>
                                        <xsl:value-of select="Status2"/>
                                    </span>
                                </td>
                                <td>
                                    <span>
                                        <xsl:value-of select="Status3"/>
                                    </span>
                                </td>
                                <td>
                                    <span>
                                        <xsl:value-of select="Status4"/>
                                    </span>
                                </td>
                                <td>
                                    <span>
                                        <xsl:value-of select="Status5"/>
                                    </span>
                                </td>
                                <td>
                                    <span>
                                        <xsl:value-of select="Status6"/>
                                    </span>
                                </td>
                                <td>
                                    <span>
                                        <xsl:value-of select="StatusU"/>
                                    </span>
                                </td>
                                <td>
                                    <span>
                                        <xsl:value-of select="Status89"/>
                                    </span>
                                </td>
                                <td class="num">
                                    <span>
                                        <xsl:value-of select="CurrentBalance"/>
                                    </span>
                                </td>

                                <td class="num">
                                    <span>
                                        <xsl:value-of select="NumActiveAccounts"/>
                                    </span>
                                </td>

                                <td class="num">
                                    <span>
                                        <xsl:value-of select="DefaultBalance"/>
                                    </span>
                                </td>
                            </tr>
                        </xsl:for-each>

                    </table>
            </div>


            <h3 style="margin-top:0px">instalment CAIS details</h3>
            <div class="dataLabel">address</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/RegisteredOffice/LocationLine1"/>&#xA0;
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine2"/>&#xA0;
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine3"/>&#xA0;
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine4"/>&#xA0;
                    <xsl:value-of select="Identification/RegisteredOffice/LocationLine5"/>&#xA0;
                    <xsl:value-of select="Identification/RegisteredOffice/Postcode"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">company type</div>
            <div class="dataValue">
            <xsl:value-of select="LtdCompanyCAISDetails/CompanyType"/></div>
            <br style="clear:both"/>
            <div class="dataLabel">account type</div>
            <div class="dataValue">
                <xsl:value-of select="LtdCompanyCAISDetails/AccountType"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">balance</div>
            <div class="dataValue">
                <xsl:value-of select="LtdCompanyCAISDetails/CurrentBalance"/></div>
            <br style="clear:both"/>
            <div class="dataLabel">status</div>
            <div class="dataValue">
                <xsl:value-of select="LtdCompanyCAISDetails/AccountStatus12"/></div>
            <br style="clear:both"/>
            <div class="dataLabel">total status 1 - 2</div>
            <div class="dataValue">
                <xsl:value-of select="LtdCompanyCAISDetails/Status1To2"/></div>
            <br style="clear:both"/>
            <div class="dataLabel">total status 3+</div>
            <div class="dataValue">
                <xsl:value-of select="LtdCompanyCAISDetails/Status3To9"/></div>
            <br style="clear:both"/>
            <div class="dataLabel">CAIS file last update</div>
            <div class="dataValue">
                <xsl:value-of select="LtdCompanyCAISDetails/CaisLastUpdate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LtdCompanyCAISDetails/CaisLastUpdate/MM"/></span>&#xA0;<xsl:value-of select="LtdCompanyCAISDetails/CaisLastUpdate/YYYY"/>
                </div>
            <br style="clear:both"/>
            <div class="dataLabel">default date</div>
            <div class="dataValue">
                <xsl:value-of select="LtdCompanyCAISDetails/DefaultDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LtdCompanyCAISDetails/DefaultDate/MM"/></span>&#xA0;<xsl:value-of select="LtdCompanyCAISDetails/DefaultDate/YYYY"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">Default balance</div>
            <div class="dataValue">
                <xsl:value-of select="LtdCompanyCAISDetails/DefaultBalance"/>
            </div>
            <br style="clear:both"/>

        </div>

    </xsl:template>
</xsl:stylesheet>
