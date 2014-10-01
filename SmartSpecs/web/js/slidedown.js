//hide specs
$(document).ready(function() {
    $("#buttonh").click(function() {
        $("#specs").slideUp(1000);
    });
});
//show specs
$(document).ready(function() {
    $("#buttons").click(function() {
        $("#specs").slideDown(1000);
        $("#buying").hide();
    });
});

//hide buying
$(document).ready(function() {
    $("#buying").hide(function() {
    });
});

//show buying
$(document).ready(function() {
    $("#buttonh").click(function() {
        $("#buying").fadeIn(1500);
    });
});
//fade out banner
$(document).ready(function() {
    $("#banner").click(function() {
        $(this).fadeOut(1000);
    });
});

//show about
$(document).ready(function() {
    $("#aboutbut").click(function() {
        $("#more").hide();
        $("#video").hide();
          $("#headtohead").hide();
        $("#about").slideDown(1000);
    });
});

//hide about
$(document).ready(function() {
    $("#morebut").click(function() {
        $("#about").slideUp(1000);
    });
});

//show more
$(document).ready(function() {
    $("#morebut").click(function() {
        $("#video").hide();
        $("#about").hide();
        $("#more").slideDown(1000);
          $("#headtohead").hide();
    });
});

//show video
$(document).ready(function() {
    $("#videobut").click(function() {
        $("#more").hide();
        $("#about").hide();
        $("#headtohead").hide();
        $("#video").slideDown(1000);
    });
});

//Show Head to head
$(document).ready(function() {
    $("#vrsbut").click(function() {
        $("#more").hide();
        $("#about").hide();
        $("#video").hide();
        $("#headtohead").slideDown(1000);
    });
});

//request to server for date & time
var XHRObject = false;
if (window.XMLHttpRequest) {
    XHRObject = new XMLHttpRequest();
}
else if (window.ActiveXObject) {
    XHRObject = new ActiveXObject("Microsoft.XMLHTTP");
}

function getServerTime(divID) {
    if (XHRObject) {
        var obj = document.getElementById(divID);
        XHRObject.open("GET", "timeServer.jsp");
        XHRObject.onreadystatechange = function() {
            if (XHRObject.readyState == 4 && XHRObject.status == 200)
            {
                obj.innerHTML = XHRObject.responseText;
            }
        }
        XHRObject.send(null);
    }
}

//load xml data according to element id
function loadXMLDoc(url)
{
    var xmlhttp;
    var txt, x, xx, i;
    if (window.XMLHttpRequest)
    {// code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp = new XMLHttpRequest();
    }
    else
    {// code for IE6, IE5
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function()
    {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
        {
            txt = "<table border='1' id='table1'><tr><th>Name</th><th>Cost (16GB)</th><th>Cost (32GB)</th></tr>";
            x = xmlhttp.responseXML.documentElement.getElementsByTagName("smartphone");

            for (i = 0; i < x.length; i++)
            {

                txt = txt + "<tr>";
                xx = x[i].getElementsByTagName("name");
                {
                    try
                    {
                        txt = txt + "<td>" + xx[0].firstChild.nodeValue + "</td>";
                    }
                    catch (er)
                    {
                        txt = txt + "<td> </td>";
                    }
                }
                xx = x[i].getElementsByTagName("cost");
                {
                    try
                    {
                        var xx1 = xx[0].getElementsByTagName("sixteen");
                        txt = txt + "<td>" + xx1[0].firstChild.nodeValue + "</td>";
                        var xx2 = xx[0].getElementsByTagName("thirtytwo");
                        txt = txt + "<td>" + xx2[0].firstChild.nodeValue + "</td>";
                    }

                    catch (er)
                    {
                        txt = txt + "<td> </td>";
                    }
                }
                txt = txt + "</tr>";
            }
            txt = txt + "</table>";
            document.getElementById('specsXML').innerHTML = txt;
        }
    }
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}







