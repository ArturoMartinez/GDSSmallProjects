<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="previousSearchesEnquiryTypes">
        <xsl:choose>
            <xsl:when test="EnquiryType='0'">Risk Report</xsl:when>
            <xsl:when test="EnquiryType='1'">Registered Office / Company Profile</xsl:when>
            <xsl:when test="EnquiryType='2'">Profile &amp; Credit</xsl:when>
            <xsl:when test="EnquiryType='3'">Financial Analysis</xsl:when>
            <xsl:when test="EnquiryType='4'">On-line Report</xsl:when>
            <xsl:when test="EnquiryType='6'">Written Report</xsl:when>
            <xsl:when test="EnquiryType='7'">Microfiche / Document Copy Request</xsl:when>
            <xsl:when test="EnquiryType='8'">Director Information</xsl:when>
            <xsl:when test="EnquiryType='C'">CPU Link Enquiry</xsl:when>
            <xsl:when test="EnquiryType='D'">e-series Gold Report</xsl:when>
            <xsl:when test="EnquiryType='E'">e-series Silver Report</xsl:when>
            <xsl:when test="EnquiryType='F'">e-series Bronze Report</xsl:when>
            <xsl:when test="EnquiryType='G'">e-series Basic</xsl:when>
            <xsl:when test="EnquiryType='H'">Document Image</xsl:when>
            <xsl:when test="EnquiryType='I'">Corporate Tree</xsl:when>
            <xsl:when test="EnquiryType='J'">Enhanced Corporate Tree</xsl:when>
            <xsl:when test="EnquiryType='L'">BIGNet Report</xsl:when>
            <xsl:when test="EnquiryType='M'">Report Builder</xsl:when>
            <xsl:when test="EnquiryType='N'">Commercial Autoscore Application</xsl:when>
            <xsl:when test="EnquiryType='O'">Commercial Autoscore Reprocess Decision</xsl:when>
            <xsl:when test="EnquiryType='P'">Mortgages &amp; Charges</xsl:when>
            <xsl:when test="EnquiryType='Q'">Credit Card Report</xsl:when>
            <xsl:when test="EnquiryType='X'">Credit Profile</xsl:when>
            <xsl:when test="EnquiryType='W'">Full Profile</xsl:when>
            <xsl:when test="EnquiryType='Y'">Business Profile</xsl:when>
            <xsl:when test="EnquiryType='Z'">Business Confirmation</xsl:when>
            <xsl:when test="EnquiryType=''">Miscellaneous</xsl:when>
            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="EnquiryType" /></xsl:when>
        </xsl:choose>
    </xsl:template>

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
                                select="Identification/PrevSearches/NumPrevSearch3Mth"
                            />
                        </td>
                        <td>
                            <xsl:value-of
                                select="Identification/PrevSearches/NumPrevSearch6Mth"
                            />
                        </td>
                        <td>
                            <xsl:value-of
                                select="Identification/PrevSearches/NumPrevSearch12Mth"
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
                        <th style="width:120px">
                            <span>date</span>
                        </th>

                        <th style="width:200px">
                            <span>search type</span>
                        </th>

                        <th>
                            <span>SIC code</span>
                        </th>
                        <th>
                            <span>SIC description</span>
                        </th>
                        <!--<th>
                            <span>NOC</span>
                        </th>-->

                    </tr>
                    <xsl:for-each select="Identification/PrevSearches/PrevSearchDetail">
                        
                    <tr>
                        <td style="text-align:left;padding-left:5px">
                            <xsl:value-of select="SearchDate/DD"/>/<xsl:value-of select="SearchDate/MM"/>/<xsl:value-of select="SearchDate/CCYY"/>
                        </td>
                        <td style="width:200px;text-align:left;text-indent:5px;">
                           <xsl:call-template name="previousSearchesEnquiryTypes" >
                                <xsl:with-param name="curvalue" select="EnquiryType"></xsl:with-param>
                           </xsl:call-template>
                        </td>
                        <td style="text-align">
                            <xsl:value-of select="SICInformation/Type"/>
                        </td>
                        <td style="white-space:nowrap">
                            <xsl:value-of select="SICInformation/Description"/>
                        </td>
                        <!--<td id="notFound">
                            ???
                        </td>-->


                    </tr>
                    </xsl:for-each>


                </table>
            </div>


        </div>
    </xsl:template>
</xsl:stylesheet>
