<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

 <xsl:template name="companyTypeValues">
        <xsl:param name="curValue" />
         <xsl:choose>
 <xsl:when test="$curValue = '00'"> Unknown</xsl:when>
 <xsl:when test="$curValue = '01'"> Bank</xsl:when>
 <xsl:when test="$curValue = '02'"> Finance House</xsl:when>
 <xsl:when test="$curValue = '03'"> Retailer</xsl:when>
 <xsl:when test="$curValue = '04'"> Mail Order</xsl:when>
 <xsl:when test="$curValue = '06'"> Rental</xsl:when>
 <xsl:when test="$curValue = '08'"> Building Society</xsl:when>
 <xsl:when test="$curValue = '09'"> Credit Card</xsl:when>
 <xsl:when test="$curValue = '10'"> Utility</xsl:when>
 <xsl:when test="$curValue = '11'"> Other</xsl:when>
 <xsl:when test="$curValue = '12'"> Motor Finance</xsl:when>
 <xsl:when test="$curValue = '13'"> Fuel Suppliers</xsl:when>
 <xsl:when test="$curValue = '15'"> Council</xsl:when>
 <xsl:when test="$curValue = '16'"> Media Services</xsl:when>
 <xsl:when test="$curValue = '17'"> Communications</xsl:when>
 <xsl:when test="$curValue = '18'"> Debt Collection</xsl:when>
 <xsl:when test="$curValue = '19'"> Hotel Travel</xsl:when>
 <xsl:when test="$curValue = '20'"> Leasing</xsl:when>
 <xsl:when test="$curValue = '21'"> Mortgage</xsl:when>
 <xsl:when test="$curValue = '22'"> Stockbroker</xsl:when>
 <xsl:when test="$curValue = '23'"> Gambling</xsl:when>
 <xsl:when test="$curValue = '24'"> Credit Union</xsl:when>
 <xsl:when test="$curValue = '25'"> Factoring</xsl:when>
 <xsl:when test="$curValue = '26'"> Student Loans Company</xsl:when>
 <xsl:when test="$curValue = '27'"> Home Creditd CAIS Company Type </xsl:when>
 <xsl:when test="$curValue = '28'"> Educationsly mapped to Old CAIS Company Type</xsl:when> 
 <xsl:when test="$curValue = '29'"> Health Services</xsl:when>
 <xsl:when test="$curValue = '30'"> Cluby mapped to 03 Retailer</xsl:when> 
 <xsl:when test="$curValue = '31'"> TV Shopping</xsl:when>
 <xsl:when test="$curValue = '32'"> Agricultural Finance</xsl:when>
 <xsl:when test="$curValue = '33'"> Broker</xsl:when>
 <xsl:when test="$curValue = '34'"> Internet Service Provider</xsl:when>
 <xsl:when test="$curValue = '35'"> Housing</xsl:when>
 <xsl:when test="$curValue = '36'"> Housing Association</xsl:when>
 <xsl:when test="$curValue = '37'"> Home Office</xsl:when>
 <xsl:when test="$curValue = '38 '">Department For Transport</xsl:when>
 <xsl:when test="$curValue = '39'"> Central Government Agency (Other)</xsl:when>
 <xsl:when test="$curValue = '40'"> Police Service</xsl:when>
 <xsl:when test="$curValue = '41'"> Ministry Of Defence</xsl:when>
 <xsl:when test="$curValue = '42'"> The Cabinet Office</xsl:when>
 <xsl:when test="$curValue = '43'"> HM Treasury</xsl:when>
 <xsl:when test="$curValue = '44'"> DWP</xsl:when>
 <xsl:when test="$curValue = '45'"> DCA</xsl:when>
 <xsl:when test="$curValue = '46'"> NDPB</xsl:when>
 <xsl:when test="$curValue = '47'"> Department of Health</xsl:when>
 <xsl:when test="$curValue = '48'"> Chamber of Commerce</xsl:when>
 <xsl:when test="$curValue = '49'"> Local and Regional Government</xsl:when>
 <xsl:when test="$curValue = '50'"> Interpol</xsl:when>
 <xsl:when test="$curValue = '51'"> SOCA</xsl:when>
 <xsl:when test="$curValue = '52'"> Court</xsl:when>
 <xsl:when test="$curValue = '53'"> Local Government</xsl:when>
 <xsl:when test="$curValue = '54'"> Regional Government</xsl:when>
 <xsl:when test="$curValue = '55'"> National Government</xsl:when>
 <xsl:when test="$curValue = '56'"> DVLA</xsl:when>
 <xsl:when test="$curValue = '57'"> Passport Agency</xsl:when>
 <xsl:when test="$curValue = '58'"> Royal Mail</xsl:when>
 <xsl:when test="$curValue = '59'"> DEFRA</xsl:when>
 <xsl:when test="$curValue = '60'"> Experian International</xsl:when>
 <xsl:when test="$curValue = '61'"> Home Shopping</xsl:when>
            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="$curValue" /></xsl:when>

        </xsl:choose>
    </xsl:template>

    
</xsl:stylesheet>