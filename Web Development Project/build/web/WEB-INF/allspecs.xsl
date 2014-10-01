<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : allspecs.xsl
    Created on : 11 December 2013, 13:03
    Author     : Brian Murphy
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <xsl:include href="include.xsl"/>
        <html>
            <head>
                <title>All Specs</title>
                <script>
function loadXMLDoc(url)
{
var xmlhttp;
var txt,x,xx,i;
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    txt="<table border='1'><tr><th>Name</th><th>Cost(16)</th><th>Cost(32)</th></tr>";
    x=xmlhttp.responseXML.documentElement.getElementsByTagName("phone");
    
    for (i=0;i<x.length;i++)
      {
          
      txt=txt + "<tr>";
      xx=x[i].getElementsByTagName("name");
        {
        try
          {
          txt=txt + "<td>" + xx[0].firstChild.nodeValue + "</td>";
          }
        catch (er)
          {
          txt=txt + "<td> </td>";
          }
        }
      xx=x[i].getElementsByTagName("cost");
        {
        try
          {
          var xx1 = xx[0].getElementsByTagName("sixteen");
          txt=txt + "<td>" + xx1[0].firstChild.nodeValue + "</td>";
          var xx2 = xx[0].getElementsByTagName("thirtytwo");
          txt=txt + "<td>" + xx2[0].firstChild.nodeValue + "</td>";
          }
        catch (er)
          {
          txt=txt + "<td> </td>";
          }
        }
      txt=txt + "</tr>";
      }
    txt=txt + "</table>";
    document.getElementById('specsXML').innerHTML=txt;
    }
  }
xmlhttp.open("GET",url,true);
xmlhttp.send();
}
</script>

            </head>
            <body>
                
                <div id="specsXML">
<button onclick="loadXMLDoc('smartspecs.xml')">Get Specs Info</button>
</div>

            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
