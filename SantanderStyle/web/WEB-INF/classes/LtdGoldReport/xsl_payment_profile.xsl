<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">



    <xsl:template name="xsl_payment_profile">

        <xsl:variable name="previousMonth">
           <xsl:for-each select="PaymentPerformance/PaymentFull/CompanyDBTMonthly">
            <xsl:sort select="CompanyExpMonth/CCYY" data-type="number" order="descending"/>
            <xsl:sort select="CompanyExpMonth/MM" data-type="number" order="descending"/>
            <xsl:if test="position()=2">
                <xsl:value-of select="CompanyExpMonth/MM"/>
            </xsl:if>
        </xsl:for-each>
    </xsl:variable>


    <div class="section" id="payment_profile" style="overflow:hidden">
        <h2>payment profile
        </h2>

        <div class="subSectionInsert" style="width:45%">
            <h3>Summary Based On The Information Supplied From Our Sources</h3>
            <div>
                <xsl:call-template name="IndustryPaymentPatternValues"/>
            </div>
            <div>
                <div>There is <xsl:call-template name="PaymentPatternValues"/> payment pattern
            </div>
        </div>
        <div >This company has <xsl:value-of
            select="PaymentPerformance/PaymentFull/NumberCollection"/> account<xsl:if test="PaymentPerformance/PaymentFull/NumberCollection > 1">s</xsl:if> placed
            for collection. </div>
            <div >This company has <xsl:value-of select='sum(PaymentPerformance/PaymentFull/UnpaidAccountsDetails/UnpaidAccounts)'/> outstanding unpaid account<xsl:if test="sum(PaymentPerformance/PaymentFull/UnpaidAccountsDetails/UnpaidAccounts)>1" >s</xsl:if>. </div>
            <div>
                This company pays <xsl:call-template name="PaymentTermValues"/>

            </div>
        </div>

        <div class="subSectionInsert" style="width:45%;overflow:auto;text-align:center">
            <h3>Current days beyond terms</h3>

            <div class="matrix " id="payment_profile_current_days_beyond_terms_matrix">

                <table cellspacing="0" cellpadding="0" style="margin:auto">

                    


                    <xsl:for-each select="PaymentPerformance/PaymentFull/CompanyDBTMonthly">
                        <xsl:sort select="CompanyExpMonth/CCYY" data-type="number" order="descending"/>
                        <xsl:sort select="CompanyExpMonth/MM" data-type="number" order="descending"/>
                        <xsl:if test="position()=2">
                            <tr>
                                <th style="background:#fff;border:none;text-align:right">
                                    <span>days beyond terms (DBT) for </span>
                                </th>
                                <td style="background:#fff;border:none;text-align:left"> <span class="toMonthName"><xsl:value-of select="CompanyExpMonth/MM"/></span> / <xsl:value-of select="CompanyExpMonth/CCYY"/></td>
                            </tr>
                            
                            <tr>
                                <th>
                                    <span>Company</span>
                                </th>
                                <td><xsl:value-of select="CompanyDBT"/></td>
                            </tr>

                            <tr>
                                <th>
                                    <span>number of accounts</span>
                                </th>
                                <td>
                                    <xsl:value-of select="CompanyNumExp"/>
                                </td>
                            </tr>
                            
                            
                        </xsl:if>
                    </xsl:for-each>
                    <xsl:for-each select="PaymentPerformance/PaymentFull/CompanyDBTMonthly">
                        <xsl:sort select="CompanyExpMonth/CCYY" data-type="number" order="descending"/>
                        <xsl:sort select="CompanyExpMonth/MM" data-type="number" order="descending"/>
                        <xsl:if test="position()=1">
                            <xsl:variable name="curDbtCompanyMonthToDate" select="CompanyDBT"/>
                            <xsl:variable name="curDbtNumAccountMonthToDate" select="CompanyNumExp"/>
                            <tr>
                                <th>
                                    <span>DBT (month to date)  </span>
                                </th>
                                <td>
                                    <xsl:value-of select="CompanyDBT"
                                        />
                                    </td>
                                </tr>

                                <tr>
                                    <th>
                                        <span>number of accounts (month to date)</span>
                                    </th>
                                    <td>
                                        <xsl:value-of select="CompanyNumExp"/>
                                    </td>
                                </tr>
                            </xsl:if>

                        </xsl:for-each>

                        
                        <xsl:for-each select="PaymentPerformance/PaymentFull/IndDBTMonthly">
                           <xsl:sort select="IndExpMonth/CCYY" data-type="number" order="descending"/>
                           <xsl:sort select="IndExpMonth/MM" data-type="number" order="descending"/>
                           <xsl:if test="$previousMonth = IndExpMonth/MM" >
                            <tr>
                                <th>
                                    <span>industry</span>
                                </th>
                                <td>
                                    <xsl:value-of
                                        select="IndustryDBT"/>
                                    </td>
                                </tr>

                                <tr>
                                    <th>
                                        <span>industry type for comparison</span>
                                    </th>
                                    <td>
                                        <xsl:value-of
                                            select="../IndustrySICDesc"/>

                                        </td>
                                    </tr>

                                </xsl:if>
                            </xsl:for-each>
                        </table>
                    </div>
                </div>
                

                <br style="clear:both"/>
                <h3 style="margin-bottom:5px">Days beyond terms trend</h3>
                <div style="margin:10px">All figures refer to days beyond terms (DBT)</div>
                <div class="td60 matrix" id="payment_profile_current_days_beyond_terms_matrix"
                    style="overflow:auto;margin-bottom:0px">

                    <table cellspacing="0" cellpadding="0">

                        <tr>
                            <th style="background:#fff;border:none;text-align:center">
                                <span>trend</span>
                            </th>


                            <td style="background:#fff;border:none"
                                colspan="{count(PaymentPerformance/PaymentFull/CompanyDBTMonthly)}"> </td>

                            </tr>

                            <tr>
                                <th
                                    style="background:#fff;border:none;border-right:1px solid #bbb;border-bottom:1px solid #aaa"/>
                                    <xsl:for-each select="PaymentPerformance/PaymentFull/CompanyDBTMonthly">
                                        <xsl:if test="position() &lt; 13">
                                            <td style="padding:5px">
                                                <span class="toMonthName"><xsl:value-of select="CompanyExpMonth/MM"
                                                    /></span>&#160;<xsl:value-of select="CompanyExpMonth/CCYY"/>
                                                </td>
                                            </xsl:if>
                                        </xsl:for-each>
                                    </tr>

                                    <tr>
                                        <th>
                                            <span>company</span>
                                        </th>
                                        <xsl:for-each select="PaymentPerformance/PaymentFull/CompanyDBTMonthly">
                                            <xsl:if test="position() &lt; 13">
                                                <td>
                                                    <xsl:value-of select="CompanyDBT"/>
                                                    
                                                </td>
                                            </xsl:if>
                                        </xsl:for-each>
                                    </tr>
                                    <tr>
                                        <th>
                                            <span>industry</span>
                                        </th>
                                        <xsl:for-each select="PaymentPerformance/PaymentFull/IndDBTMonthly">
                                            <xsl:if test="position() &lt; 13">
                                                <td>
                                                    <xsl:value-of select="IndustryDBT"/>
                                                    
                                                </td>
                                            </xsl:if>
                                        </xsl:for-each>
                                    </tr>


                                </table>
                            </div>
                            <div class="matrix" id="payment_profile_current_days_beyond_terms_matrix"
                                style="overflow:auto;margin-top:0px">

                                <table cellspacing="0" cellpadding="0">

                                    <tr>
                                        <th style="background:#fff;border:none;text-align:center">
                                            <span>Average</span>
                                        </th>

                                        <td style="background:#fff;border:none" colspan="4"> </td>

                                    </tr>

                                    <tr>
                                        <th
                                            style="background:#fff;border:none;border-right:1px solid #aaa;border-bottom:1px solid #aaa"/>

                                            <th style="text-align:center"> current </th>
                                            <th style="text-align:center"> last 3 months </th>
                                            <th style="text-align:center"> last 6 months </th>
                                            <th style="text-align:center"> last 12 months </th>

                                        </tr>

                                        <tr>
                                            <th>
                                                <span>company</span>
                                            </th>
                                            <td>
                                                <span>
                                                    <xsl:variable name="lastCompanyDBTMonth" select="PaymentPerformance/PaymentFull/CompanyDBTMonthly[last()]/CompanyExpMonth/MM"/>

                                                    
                                                    <xsl:variable name="lastCompanyDBTYear" select="PaymentPerformance/PaymentFull/CompanyDBTMonthly[last()]/CompanyExpMonthCCYY"/>
                                                    <xsl:value-of select="PaymentPerformance/PaymentFull/CompanyDBTMonthly[12]/CompanyDBT"/>
                                                    
                                                </span>
                                            </td>
                                            <td>
                                                <xsl:value-of select="PaymentPerformance/PaymentFull/AvgDBT3Mnths"/>
                                            </td>
                                            <td>
                                                <xsl:value-of select="PaymentPerformance/PaymentFull/AvgDBT6Mnths"/>
                                            </td>
                                            <td>
                                                <xsl:value-of select="PaymentPerformance/PaymentFull/AvgDBT12Mnths"/>
                                            </td>
                                        </tr>

                                        <tr>
                                            <th>
                                                <span>industry</span>
                                            </th>
                                            <td>

                                                <xsl:variable name="lastIndDBTMonth" select="PaymentPerformance/PaymentFull/IndDBTMonthly[last()]/IndExpMonth/MM"/>
                                                <xsl:variable name="lastIndDBTYear" select="PaymentPerformance/PaymentFull/IndDBTMonthly[last()]/IndExpMonth/CCYY"/>
                                                
                                                <xsl:value-of select="PaymentPerformance/PaymentFull/IndDBTMonthly[12]/IndustryDBT"/>


                                            </td>
                                            <td>
                                                <xsl:value-of select="PaymentPerformance/PaymentFull/IndAvgDBT3Mnths"/>
                                            </td>
                                            <td>
                                                <xsl:value-of select="PaymentPerformance/PaymentFull/IndAvgDBT6Mnths"/>
                                            </td>
                                            <td>
                                                <xsl:value-of select="PaymentPerformance/PaymentFull/IndAvgDBT12Mnths"/>
                                            </td>
                                        </tr>
                                    </table>
                                </div>

                                <h3 style="margin-bottom:5px">Days Beyond Terms Breakdown</h3>
                                <div style="margin:10px"> </div>
                                <div class="td60 matrix" id="payment_profile_current_days_beyond_terms_matrix"
                                    style="overflow:auto;margin-bottom:0px">
                                    <table cellspacing="0" cellpadding="0" style="float:left;margin:5px">
                                        <tr>
                                            <th style="background:#fff;border:none;text-align:center" colspan="5">Payment Performance By Size Of Account For 
                                                <span class="toMonthName"><xsl:value-of select="PaymentPerformance/PaymentFull/CompanyDBTMonthly[last()]/CompanyExpMonth/MM"/></span> / <xsl:value-of select="PaymentPerformance/PaymentFull/CompanyDBTMonthly[last()]/CompanyExpMonth/CCYY"/></th>

                                            </tr>


                                            <tr>
                                                <th
                                                    style="background:#fff;border:none;border-right:1px solid #aaa;border-bottom:1px solid #aaa"/>

                                                    <th style="text-align:center"> £1 - £1,000 </th>
                                                    <th style="text-align:center"> £1,001 - £10,000 </th>
                                                    <th style="text-align:center"> £10,001 - £100,000 </th>
                                                    <th style="text-align:center"> £100,000+ </th>

                                                </tr>

                                                <tr>
                                                    <th>
                                                        <span>company</span>
                                                    </th>
                                                    <td>
                                                        <xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT1K"/>
                                                    </td>
                                                    <td>
                                                        <xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT10K"/>
                                                    </td>
                                                    <td>
                                                        <xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT100K"/>
                                                    </td>
                                                    <td>
                                                        <xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT100KPlus"
                                                            />
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <th>
                                                            <span>industry</span>
                                                        </th>
                                                        <td>
                                                            <xsl:value-of
                                                                select="PaymentPerformance/PaymentFull/IndNumberDBT1K"
                                                                />
                                                            </td>
                                                            <td>
                                                                <xsl:value-of
                                                                    select="PaymentPerformance/PaymentFull/IndNumberDBT10K"
                                                                    />
                                                                </td>
                                                                <td>
                                                                    <xsl:value-of
                                                                        select="PaymentPerformance/PaymentFull/IndNumberDBT100K"
                                                                        />
                                                                    </td>
                                                                    <td>
                                                                        <xsl:value-of
                                                                            select="PaymentPerformance/PaymentFull/IndNumberDBT100KPlus"
                                                                            />
                                                                        </td>
                                                                    </tr>
                                                                </table>
                                                                <table cellspacing="0" cellpadding="0" style="float:left;margin:5px">
                                                                    <tr>
                                                                        <th style="background:#fff;border:none;text-align:center" colspan="5"
                                                                            >Payment by different terms</th>

                                                                        </tr>


                                                                        <tr>
                                                                            <th style="background:#fff;border:none;border-right:1px solid #aaa;border-bottom:1px solid #aaa"/>

                                                                            <th style="text-align:center"> DBT </th>
                                                                            <th style="text-align:center"> accounts </th>

                                                                        </tr>
                                                                        <xsl:for-each select="PaymentPerformance/PaymentFull/CommonTerms">

                                                                            <tr>
                                                                                <th>
                                                                                    <span>
                                                                                        <xsl:value-of select="CommonTermsText"/>
                                                                                    </span>
                                                                                </th>
                                                                                <td>
                                                                                    <xsl:value-of select="CommonTermsDBT"/>
                                                                                </td>
                                                                                <td>
                                                                                    <xsl:value-of select="CommonTermsNumExp"/>
                                                                                </td>
                                                                            </tr>
                                                                        </xsl:for-each>



                                                                    </table>
                                                                </div>
                                                                <br style="clear:both"/>
                                                                <h3 style="margin-bottom:5px">Additional informations</h3>

                                                                <div style="margin:10px;font-weight:bold">Other payment informations</div>
                                                                <div style="margin:10px;font-weight:bold">Unpaid accounts</div>
                                                                <span class="num" style="margin-left:15px">
                                                                    <xsl:value-of select="ScoringData/LimitedCompanyDelphiPayment/NumberUnpaidAccountsLastMonth"/>
                                                                    account(s) have received no payment for 1 month.

                                                                </span>
                                                                <br style="clear:both"/>
                                                                <br style="clear:both"/>
                                                            </div>
                                                        </xsl:template>
                                                    </xsl:stylesheet>
