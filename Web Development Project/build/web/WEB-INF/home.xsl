<?xml version="1.0" encoding="UTF-8" ?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <link rel="stylesheet" type="text/css" href="style.css"/>
<script language="javascript" type="text/javascript" src="js/slidedown.js"></script>
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
            <hr/>
            <div id="banner2">
                <h3 id="linkh"><a href="search.html" id="links"> Check out the latest reviews on the S4, Note 3, iPhone 5S and iPhone 5C!</a></h3>
                <img src="images/iphoneflat.jpg" alt="Banner"/>
            </div>
                
                
            
            
	</xsl:template>
        
	
        
	
</xsl:transform>