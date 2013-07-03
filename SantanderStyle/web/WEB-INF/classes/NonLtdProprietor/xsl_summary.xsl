<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_summary">
        <div class="section" id="summary">
            <h2>summary</h2>

            <h3>search details</h3>

            <div class="dataLabel">person</div>
            <div class="dataValue" id="notFound">???</div>
            <br style="clear:both"/>

            <div class="dataLabel">match</div>
            <div class="dataValue" id="notFound">???</div>
            <br style="clear:both"/>

            <div class="dataLabel">source</div>
            <div class="dataValue" id="notFound">???</div>
            <br style="clear:both"/>

            <h3>public information</h3>

            <div class="dataLabel">number</div>
            <div class="dataValue">
                <xsl:value-of
                    select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/PublicInfoSummary/Number"
                />
            </div>
            <br style="clear:both"/>

            <div class="dataLabel numeric">total amount</div>
            <div class="dataValue num devise">
                <xsl:value-of
                    select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/PublicInfoSummary/TotalAmount"
                />
            </div>
            <br style="clear:both"/>

            <div class="dataLabel">latest</div>
            <div class="dataValue stringDateToReadable">
                <xsl:value-of
                    select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/PublicInfoSummary/DateOfLatest"
                />
            </div>
            <br style="clear:both"/>

            <h3>Previous search</h3>

            <div class="dataLabel">0-3 months</div>
            <div class="dataValue">
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/CAISPrevSearches/NumberUpTo3Months"/>
            </div>
            <br style="clear:both"/>

            <div class="dataLabel">4-6 months</div>
            <div class="dataValue">
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/CAISPrevSearches/Num3To6Months"/>
            </div>
            <br style="clear:both"/>

            <div class="dataLabel">7-12 months</div>
            <div class="dataValue">
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/CAISPrevSearches/Num6To12Months"/>
            </div>
            <br style="clear:both"/>

            <h3>messages</h3>
            <span id="notFound" style="margin:20px">I assume that this content is calculated
                depending on some business rules. Need to know what are these rules and where to
                find values.</span>
            <br style="clear:both"/>

            <h3>CAIS</h3>
            <div class="dataLabel">number</div>
            <div class="dataValue">
                <xsl:value-of
                    select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/Number"
                />
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">total balance</div>
            <div class="dataValue num devise">
                <xsl:value-of
                    select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/TotalBalance"
                />
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">worst current</div>
            <div class="dataValue">
                <xsl:value-of
                    select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/WorstCurrent"
                />
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">worst historical</div>
            <div class="dataValue">
                <xsl:value-of
                    select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/WorstHistorical"
                />
            </div>
            <br style="clear:both"/>

            <br/>
        </div>
    </xsl:template>
</xsl:stylesheet>
