<?xml version="1.0" encoding="UTF-8" ?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <link rel="stylesheet" type="text/css" href="style.css"/>

	<xsl:include href="include.xsl"/>
	
	<xsl:template match="*">
	        
		<table>
		   
		   <xsl:apply-templates select="phone"/>	
		</table>
				
	</xsl:template>
        
	<xsl:template match="phone">
           
            <table>
		<tr><td><xsl:element name="a">
		          <xsl:attribute name="href">LinksServlet?name=<xsl:value-of select="name"/></xsl:attribute>
		          <xsl:value-of select="name"/>
		        </xsl:element>
		     </td>

		</tr>
            </table>
       
            <img src="images/banner.png" alt="Banner"/>
                
	</xsl:template>
        
	
        
	
</xsl:transform>