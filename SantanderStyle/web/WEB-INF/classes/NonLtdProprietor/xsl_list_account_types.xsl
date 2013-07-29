<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

 <xsl:template name="accountTypeValues">
        <xsl:param name="curValue" />
         <xsl:choose>
 <xsl:when test="$curValue = '00'"> Bank</xsl:when>
 <xsl:when test="$curValue = '01'"> Hire purchase/Conditional sale</xsl:when>
 <xsl:when test="$curValue = '02'"> Unsecured loan (personal loans etc)</xsl:when>
 <xsl:when test="$curValue = '03'"> Mortgage</xsl:when>
 <xsl:when test="$curValue = '04'"> Budget (revolving account)</xsl:when>
 <xsl:when test="$curValue = '05'"> Credit card/Store card</xsl:when>
 <xsl:when test="$curValue = '06'"> Charge card</xsl:when>
 <xsl:when test="$curValue = '07'"> Rental (TV, brown and white goods)</xsl:when>
 <xsl:when test="$curValue = '08'"> Mail Order</xsl:when>
 <xsl:when test="$curValue = '11'"> Overdraft</xsl:when>
 <xsl:when test="$curValue = '12'"> CML member</xsl:when>
 <xsl:when test="$curValue = '13'"> CML member </xsl:when>
 <xsl:when test="$curValue = '14'"> CML member</xsl:when>
 <xsl:when test="$curValue = '15'"> Current accounts </xsl:when>
 <xsl:when test="$curValue = '16'"> Second mortgage (secured loan)</xsl:when>
 <xsl:when test="$curValue = '17'"> Credit sale fixed term</xsl:when>
 <xsl:when test="$curValue = '18'"> Communications </xsl:when>
 <xsl:when test="$curValue = '19'"> Fixed term deferred payment</xsl:when>
 <xsl:when test="$curValue = '20'"> Variable subscription</xsl:when>
 <xsl:when test="$curValue = '21'"> Public utility</xsl:when>
 <xsl:when test="$curValue = '22'"> Finance lease</xsl:when>
 <xsl:when test="$curValue = '23'"> Operating lease</xsl:when>
 <xsl:when test="$curValue = '24'"> Unpresentable - cheques</xsl:when>
 <xsl:when test="$curValue = '25'"> Flexible Mortgages</xsl:when>
 <xsl:when test="$curValue = '26'"> Consolidated Debt</xsl:when>
 <xsl:when test="$curValue = '27'"> Combined Credit Account</xsl:when>
 <xsl:when test="$curValue = '28'"> Pay Day Loans</xsl:when>
 <xsl:when test="$curValue = '29'"> Balloon HP</xsl:when>
 <xsl:when test="$curValue = '30'"> Residential Mortgage</xsl:when>
 <xsl:when test="$curValue = '31'"> Buy To Let Mortgage</xsl:when>
 <xsl:when test="$curValue = '32'"> 100+% LTV Mortgage</xsl:when>
 <xsl:when test="$curValue = '33'"> Current Account Offset Mortgage</xsl:when>
 <xsl:when test="$curValue = '34'"> Investment Offset Mortgage</xsl:when>
 <xsl:when test="$curValue = '35'"> Shared Ownership Mortgage</xsl:when>
 <xsl:when test="$curValue = '36'"> Contingency Liability</xsl:when>
 <xsl:when test="$curValue = '37'"> Store Card</xsl:when>
 <xsl:when test="$curValue = '38'"> Multi Function Card</xsl:when>
 <xsl:when test="$curValue = '39'"> Water</xsl:when>
 <xsl:when test="$curValue = '40'"> Gas </xsl:when>
 <xsl:when test="$curValue = '41'"> Electricity</xsl:when>
 <xsl:when test="$curValue = '42'"> Oil</xsl:when>
 <xsl:when test="$curValue = '43'"> Duel Fuel</xsl:when>
 <xsl:when test="$curValue = '44'"> Fuel Card (not motor fuel)</xsl:when>
 <xsl:when test="$curValue = '45'"> House Insurance</xsl:when>
 <xsl:when test="$curValue = '46'"> Car Insurance</xsl:when>
 <xsl:when test="$curValue = '47'"> Life Insurance</xsl:when>
 <xsl:when test="$curValue = '48'"> Health Insurance</xsl:when>
 <xsl:when test="$curValue = '49'"> Card Protection</xsl:when>
 <xsl:when test="$curValue = '50'"> Mortgage Protection</xsl:when>
 <xsl:when test="$curValue = '51'"> Payment Protection</xsl:when>
 <xsl:when test="$curValue = '52'"> Tax</xsl:when>
 <xsl:when test="$curValue = '53'"> Mobile</xsl:when>
 <xsl:when test="$curValue = '54'"> Fixed Line</xsl:when>
 <xsl:when test="$curValue = '55'"> Cable </xsl:when>
 <xsl:when test="$curValue = '56'"> Satellite</xsl:when>
 <xsl:when test="$curValue = '57'"> Business Line</xsl:when>
 <xsl:when test="$curValue = '58'"> Broadband</xsl:when>
 <xsl:when test="$curValue = '59'"> Multi Communications</xsl:when>
 <xsl:when test="$curValue = '60'"> Student Loan</xsl:when>
 <xsl:when test="$curValue = '61'"> Home Credit</xsl:when>
 <xsl:when test="$curValue = '62'"> Education</xsl:when>
 <xsl:when test="$curValue = '63'"> Property Rental</xsl:when>
 <xsl:when test="$curValue = '64'"> Other Rental</xsl:when>
 <xsl:when test="$curValue = '65'"> Fines</xsl:when>
 <xsl:when test="$curValue = '66'"> Court Actions</xsl:when>
 <xsl:when test="$curValue = '67'"> Child Maintenance</xsl:when>
 <xsl:when test="$curValue = '68'"> Asset</xsl:when>
 <xsl:when test="$curValue = '69'"> Mortgage and Unsecured Loan</xsl:when>
 <xsl:when test="$curValue = '70'"> Gambling</xsl:when>
        </xsl:choose>
    </xsl:template>

    
</xsl:stylesheet>