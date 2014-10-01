<?xml version="1.0" encoding="UTF-8" ?>

<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:include href="include.xsl"/>

    
    <xsl:param name="vEventName"/>
    <xsl:param name="vNextName"/>
    <xsl:param name="vPrevName"/>
	
    <xsl:template match="*">
        
        <xsl:apply-templates select="phone/smartphones"/>
    </xsl:template>
	
    <xsl:template match="smartphones">
		
        <xsl:for-each select="smartphone">
            <xsl:if test="./name=$vEventName">
 
                <html>
                    <head>
                        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
                        </script>
                        <script language="javascript" type="text/javascript" src="js/slidedown.js"></script>
                        <script language="javascript" type="text/javascript" src="jquery-1.3.js"></script>
                        
                        <link rel="stylesheet" type="text/css" href="style.css"/>
                        
                        
                    </head>
                    <body>
                        
                        <div id="wrapper">
              

                            <img id="banner" src="images/banner.png" alt="Banner"/>
                            <div id="iphone5cimage1">
                                
                        
                                <xsl:element name="img">
                            
                                    <xsl:attribute name="src">
                                        <xsl:value-of select="./image"/>
                                    </xsl:attribute>
                                </xsl:element>
                                
                                <xsl:value-of select="images"/>

                                <br/>
                                <br/>
                                
                                <div id="param">
                                    <xsl:element name="a">
                                        <xsl:attribute name="href">PhoneSpecsServlet?name=<xsl:value-of select="$vNextName"/></xsl:attribute>Next</xsl:element>
                        
                                    <xsl:element name="a">
                                        <xsl:attribute name="href">PhoneSpecsServlet?name=<xsl:value-of select="$vPrevName"/></xsl:attribute>Prev</xsl:element>
                                    <br/>
                                    <br/>
                                    <button id="buttons" class="buttons">Specifications</button>
                                    <button id="buttonh" class="buttonh">Where to Buy</button>
                                    <h2 id="cost">
                                        <center>
                                            <xsl:value-of select="cost/name"/>
                                        </center>
                                        <br/>
                                   
                                        
                                        <xsl:value-of select="cost/sixteen"/>
                                        <br/>
                                       
                                        <xsl:value-of select="cost/thirtytwo"/>
                                     
                                        <br/>
                                        <xsl:value-of select="cost/sixtyfour"/>
                                        <br/>
                                        <br/>
                                    </h2> 
                                </div>
                               
                                 <div id="specsXML">
                                <button id="xmlinfo" onclick="loadXMLDoc('smartspecs.xml')">Compare Prices</button>
                            </div>
                            </div>
                           
                              
                            
                            
                         
                            <div id="iphone5cspecs">
                                <div id="specs">
                                    <b>Model</b>
                                    <br/>
                                    <xsl:value-of select="name"/>
                                    <br/>
                                    <b>Display</b>
                                    <br/>
                                    <xsl:value-of select="display/size"/>
                                    <br/>
                                    <xsl:value-of select="display/resolution"/>
                                    <br/>
                                    <xsl:value-of select="display/features"/>
                                    <br/>
                          
                                    <hr id="hr2"/>
                                    <b>Camera</b>
                                    <br/>
                                    <xsl:value-of select="camera/pixels"/>
                                    <br/>
                                    <xsl:value-of select="camera/flash"/>
                                    <br/>
                                    <xsl:value-of select="camera/camcorder"/>
                                    <br/>
                                    <xsl:value-of select="camera/front"/>
                                    <br/>

                                    <hr id="hr2"/> 
			     
                                    <b>Design</b>
                                    <br/>
                                    <xsl:value-of select="design/dimensions"/>
                                    <br/>
                                    <xsl:value-of select="design/material"/>
                                    <br/>
                                    <xsl:value-of select="design/operatingsystem"/>
                            
                                    <br/>
                                    <hr id="hr2"/>	      
                                    <b>Hardware</b>
                                    <br/>
                                    <xsl:value-of select="hardware/features"/>
                                    <br/>
                                    <xsl:value-of select="hardware/chip"/>
                                    <br/>
                                    <xsl:value-of select="hardware/processor"/>
                                    <br/>
                                    <xsl:value-of select="hardware/graphics"/>
                                    <br/>
                                    <xsl:value-of select="hardware/storage"/>
                                   
                                </div>
                                
                           
                                <div id="buying">
                                    <xsl:value-of select="stores"/>
                                    <p id="stores">
                                        <h1 align="center">Where to Buy?</h1>
                                        
                                        <a href="http://www.meteor.ie/">
                                            <img src="images/meteorlogo.jpg" alt="HTML tutorial" width="100" height="120"/>
                                        </a>

                                        <a href="http://www.o2online.ie/o2/">
                                            <img src="images/o2logo.jpg" alt="HTML tutorial" width="80" height="80"/>
                                        </a>
                                        
                                        <a href="http://www.carphonewarehouse.ie/aspx/Homepage.aspx">
                                            <img src="images/carfone.jpg" alt="HTML tutorial" width="100" height="150"/>
                                        </a>  
                                        <a href="http://www.three.ie/">
                                            <img src="images/three.png" alt="HTML tutorial" width="60" height="70"/>
                                        </a>
                                        <a href="http://www.vodafone.ie/">
                                            <img src="images/voda.jpg" alt="HTML tutorial" width="60" height="70"/>
                                        </a>
                                        
                                    </p>
                                   
                                </div>
                                
                            </div>
                           
                            
                            
                            
                        </div>
                        
                        
                       
                    </body>
                </html>
            </xsl:if>
        </xsl:for-each>
		
    </xsl:template>
	
</xsl:transform>