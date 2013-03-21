<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    <xsl:template name="xsl_payment_profile">
        <div class="section" id="payment_profile" style="overflow:hidden">
        <h2>payment profile</h2>
           
            <div class="subSectionInsert" style="width:45%">
                <h3  >Summary Based On The Information Supplied From Our Sources</h3>
                <div id="notFound">This company pays ???
                    <xsl:value-of select="PaymentPerformance/PaymentFull/PaymentToTerms"/>
                </div>
                <div id="notFound">There is ??? payment pattern
                    <xsl:value-of select="PaymentPerformance/PaymentFull/PaymentPattern"/>
                </div>
                <div  class="doubt">This company has <xsl:value-of select="PaymentPerformance/PaymentFull/NumberCollection"/> accounts placed for collection.
                    
                </div>
                <div class="doubt">This company has <xsl:value-of select="PaymentPerformance/PaymentFull/UnpaidAccountsDetails/UnpaidAccounts"/> outstanding unpaid accounts.
                    
                </div>
                <div id="notFound">This company pays 
                    <xsl:value-of select="PaymentPerformance/PaymentFull/PaymentToTerms"/>
                     its terms.</div>
            </div>
         
            <div class="subSectionInsert" style="width:45%;overflow:auto;text-align:center" >
                  <h3>Current days beyond terms</h3>
                <div class="matrix " id="payment_profile_current_days_beyond_terms_matrix">
                   
                    <table cellspacing="0" cellpadding="0"   style="margin:auto">
                        
                         <tr>
                             <th style="background:#fff;border:none;text-align:right"><span>days beyond terms (DBT) for </span></th>
                             <td style="background:#fff;border:none;text-align:left">
                                <span id="notfound">???</span>
                            </td>
                        </tr>
                           
                           <tr>
                               <th><span>Company</span></th>
                               <td class="doubt">
                                   <span id="notfound">???</span>
                               </td>
                           </tr>
                        
                        <tr>
                            <th><span>number of accounts</span></th>
                            <td>
                                <span id="notfound">???</span>
                            </td>
                        </tr>
                        
                        <tr>
                            <th><span>DBT (month to date)</span></th>
                            <td class="doubt">
                                <span id="notfound">???</span>
                            </td>
                        </tr>
                        
                        <tr>
                            <th><span>number of accounts (month to date)</span></th>
                            <td>
                                <span id="notfound">???</span>
                            </td>
                        </tr>
                        
                        <tr>
                            <th><span>industry</span></th>
                            <td>
                                <span id="notfound">???</span>
                            </td>
                        </tr>
                        
                        <tr>
                            <th><span>industry type for comparison</span></th>
                            <td>
                                <xsl:value-of select="PaymentPerformance/PaymentFull/IndustrySICDesc"/>
                            </td>
                        </tr>
                                  
                    </table>
                </div>
             </div>
          
            <br style="clear:both"/>
            <h3 style="margin-bottom:5px">Days beyond terms trend</h3>
            <div style="margin:10px">All figures refer to days beyond terms (DBT)</div>
            <div class="td60 matrix" id="payment_profile_current_days_beyond_terms_matrix" style="overflow:auto;margin-bottom:0px">
                
                <table cellspacing="0" cellpadding="0" >
                    
                    <tr>
                        <th style="background:#fff;border:none;text-align:center"><span>trend</span></th>
                        
                        
                        <td style="background:#fff;border:none" colspan="{count(PaymentPerformance/PaymentFull/CompanyDBTMonthly)}">
                            
                        </td>
                        
                    </tr>
                    
                    <tr>
                        <th style="background:#fff;border:none;border-right:1px solid #bbb;border-bottom:1px solid #aaa"></th>
                        <xsl:for-each select="PaymentPerformance/PaymentFull/CompanyDBTMonthly">
                            <td  style="width:60px">
                                <xsl:value-of select="CompanyExpMonth/CCYY"/>/
                                <xsl:value-of select="CompanyExpMonth/MM"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    
                    <tr>
                        <th><span>company</span></th>
                        <xsl:for-each select="PaymentPerformance/PaymentFull/CompanyDBTMonthly">
                            <td >
                                <xsl:value-of select="CompanyDBT"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th><span>industry</span></th>
                        <xsl:for-each select="PaymentPerformance/PaymentFull/CompanyDBTMonthly">
                            <td >
                                <xsl:value-of select="../IndDBTMonthly/IndustryDBT"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    
                    
                </table>
            </div>
            <div class="matrix" id="payment_profile_current_days_beyond_terms_matrix" style="overflow:auto;margin-top:0px">
                
                <table cellspacing="0" cellpadding="0" >
                    
                    <tr>
                        <th style="background:#fff;border:none;text-align:center"><span>Average</span></th>
                        
                        <td style="background:#fff;border:none" colspan="4">
                            
                        </td>
                        
                    </tr>
                    
                    <tr>
                        <th style="background:#fff;border:none;border-right:1px solid #aaa;border-bottom:1px solid #aaa"></th>
                       
                        <th style="text-align:center">
                            current
                        </th>
                        <th style="text-align:center">
                            last 3 months
                        </th>
                        <th style="text-align:center">
                            last 6 months
                        </th>
                        <th style="text-align:center">
                            last 12 months
                        </th>
                        
                    </tr>
                    
                    <tr>
                        <th><span>company</span></th>
                        <td>
                            <span>
                                <xsl:value-of select="ManagementInfo/LimitedCompanyDelphiPayment/AverageCurrentDaysBeyondTerm"/>
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
                        <th><span>industry</span></th>
                        <td>
                            <span id="notfound">???</span>
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
            <div style="margin:10px">
            </div>
            <div class="td60 matrix" id="payment_profile_current_days_beyond_terms_matrix" style="overflow:auto;margin-bottom:0px">
                <table cellspacing="0" cellpadding="0" style="float:left;margin:5px" >
                    <tr>
                        <th style="background:#fff;border:none;text-align:center" colspan="5">Payment Performance By Size Of Account For <span id="notfound">???(date)</span></th>
                        
                    </tr>
                    
                    
                    <tr>
                        <th style="background:#fff;border:none;border-right:1px solid #aaa;border-bottom:1px solid #aaa"></th>
                        
                        <th style="text-align:center">
                            £1 - £1,000
                        </th>
                        <th style="text-align:center">
                            1,001 - £10,000
                        </th>
                        <th style="text-align:center">
                            £10,001 - £100,000
                            £100,000+
                            
                        </th>
                        <th style="text-align:center">
                            £100,000+
                        </th>
                        
                    </tr>
                    
                    <tr>
                        <th><span>company</span></th>
                        <td>
                            <xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT1K"/>
                            <xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT1k"/>
                        </td>
                        <td>
                            <xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT10K"/>
                        </td>
                        <td>
                            <xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT100K"/>
                        </td>
                        <td>
                            <xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT100KPlus"/>
                        </td>
                    </tr>
                    
                    <tr>
                        <th><span>industry</span></th>
                        <td>
                            <xsl:value-of select="/LtdCompanyData/PaymentPerformance/PaymentFull/IndNumberDBT1K"/>
                        </td>
                        <td>
                            <xsl:value-of select="/LtdCompanyData/PaymentPerformance/PaymentFull/IndNumberDBT10K"/>
                        </td>
                        <td>
                            <xsl:value-of select="/LtdCompanyData/PaymentPerformance/PaymentFull/IndNumberDBT100K"/>
                        </td>
                        <td>
                            <xsl:value-of select="/LtdCompanyData/PaymentPerformance/PaymentFull/IndNumberDBT100KPlus"/>
                        </td>
                    </tr>
                </table>
                <table cellspacing="0" cellpadding="0" style="float:left;margin:5px">
                    <tr>
                        <th style="background:#fff;border:none;text-align:center" colspan="5">Payment by different terms</th>
                        
                    </tr>
                    
                    
                    <tr>
                        <th style="background:#fff;border:none;border-right:1px solid #aaa;border-bottom:1px solid #aaa"></th>
                        
                        <th style="text-align:center">
                            DBT
                        </th>
                        <th style="text-align:center">
                            accounts
                        </th>
                        
                    </tr>
                    <xsl:for-each select="PaymentPerformance/PaymentFull/CommonTerms">
                        
                    <tr>
                        <th><span>
                            <xsl:value-of select="CommonTermsText"/>
                        </span></th>
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
            <span id="notfound">calculation required ???</span>
            
            
            <div style="margin:10px;font-weight:bold">Unpaid accounts</div>
            <span id="notfound">calculation required ???</span>
    </div>
    </xsl:template>
</xsl:stylesheet>