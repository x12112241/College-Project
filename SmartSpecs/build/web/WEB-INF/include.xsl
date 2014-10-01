<?xml version="1.0" encoding="UTF-8" ?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="/">
        <html>
            
            <head>
                <link rel="stylesheet" type="text/css" href="style.css"/>

                <title>Smart Specs</title>
            </head>
            <body>
                
                <div id="wrapper">
                    
                    <a href="index.jsp" id="links">Homepage</a>
                    <a href="HomeServlet" id="links">Phones Home</a>
                    <a href="search.html" id="links">Smart Spec Reviews</a>
                  
                    <hr id="hr1"/>
                

                    <xsl:for-each select="phone">
                                               
                    </xsl:for-each>                    

                    <xsl:apply-templates select="*"/>
                    <hr id="hr1"/>
                   
                </div>
                
                
                
         
            </body>
        </html>
    </xsl:template>

</xsl:transform>