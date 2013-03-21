<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_previous_searches">
        <div class="section" id="previous_searches">
            <h2>previous searches</h2>

            <h3>summary of previous searches</h3>


            <div class="td60 matrix" id="summary_of_previous_searches"
                style="overflow:auto;margin-bottom:0px">

                <table cellspacing="0" cellpadding="0" style="margin-bottom:0px">

                    <tr>
                        <th style="background:#fff;border:none;text-align:center"/>


                        <th>
                            <span>last 3 months</span>
                        </th>

                        <th>
                            <span>last 6 months</span>
                        </th>
                        <th>
                            <span>last 12 months</span>
                        </th>

                    </tr>
                    <tr>
                        <th>
                            <span>number of searches</span>
                        </th>
                        <td>
                            <xsl:value-of
                                select="/NonLtdBusinessData/Identification/PrevSearches/NumPrevSearch3Mth"
                            />
                        </td>
                        <td>
                            <xsl:value-of
                                select="/NonLtdBusinessData/Identification/PrevSearches/NumPrevSearch6Mth"
                            />
                        </td>
                        <td>
                            <xsl:value-of
                                select="/NonLtdBusinessData/Identification/PrevSearches/NumPrevSearch12Mth"
                            />
                        </td>


                    </tr>


                </table>
            </div>

            <h3 style="margin-top:0px">details of previous searches</h3>


            <div class="td60 matrix" id="summary_of_previous_searches"
                style="overflow:auto;margin-bottom:0px">

                <table cellspacing="0" cellpadding="0">

                    <tr>
                        <th>
                            <span>date</span>
                        </th>

                        <th>
                            <span>search type</span>
                        </th>

                        <th>
                            <span>SIC code</span>
                        </th>
                        <th>
                            <span>SIC description</span>
                        </th>
                        <th>
                            <span>NOC</span>
                        </th>

                    </tr>
                    <xsl:for-each select="Identification/PrevSearches/PrevSearchDetail">
                        
                    <tr>
                        <td>
                            <xsl:value-of select="SearchDate"/>
                        </td>
                        <td>
                            <xsl:value-of select="EnquiryType"/>
                        </td>
                        <td>
                            <xsl:value-of select="SICInformation/Type"/>
                        </td>
                        <td>
                            <xsl:value-of select="SICInformation/Description"/>
                        </td>
                        <td id="notFound">
                            ???
                        </td>


                    </tr>
                    </xsl:for-each>


                </table>
            </div>


        </div>
    </xsl:template>
</xsl:stylesheet>
