<?xml version="1.0" encoding="UTF-8" ?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<link rel="stylesheet" type="text/css" href="style.css"/>

	<xsl:include href="include.xsl"/>
        <xsl:param name="vPhoneName"/>
	
	<xsl:template match="*">
		<xsl:apply-templates select="phone"/>
	</xsl:template>

        <xsl:template match="phone">
            <xsl:if test="name=$vPhoneName">
                <xsl:apply-templates select="smartphones"/>
            </xsl:if>
        </xsl:template>

	<xsl:template match="smartphones">
		        
		<xsl:for-each select="smartphone">
		      <xsl:element name="a">
                          <xsl:attribute name="href">PhoneSpecsServlet?name=<xsl:value-of select="name"/></xsl:attribute>
                          <xsl:value-of select="name"/> 
                             
                      </xsl:element>
		</xsl:for-each>
              <img src="images/banner.png" alt="Banner"/>
	</xsl:template>
        
        
        
	
</xsl:transform>