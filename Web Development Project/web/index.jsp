<%-- 
    Document   : index
    Created on : 21-Jun-2011, 21:14:27
    Author     : scr2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Smart Specs</title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <script language="javascript" type="text/javascript" src="js/jquery-1.3.js"></script>
        <script language="javascript" type="text/javascript" src="js/slidedown.js"></script>
        <script language="javascript" type="text/javascript" src="js/script.js"></script>

    </head>
    <body>
        <div id="wrapper">
            <form action="HomeServlet">
                <div id="heading"><h3>Welcome to Smart Specs</h3></div>
                <div id="enterbutton"> <input type="Submit" value ="Enter" id="enter"></div>
                <div id="serverTime">
                    <h4><b onmouseover="getServerTime('serverTime')">Date & Time</b></h4></div>
                <div id="login"> <a  id="loginlink" href="ProtectedServlet">User Login</a></div>

            </form>


            <hr id="hr1"/>

            <img id="bannerindex" src="images/banner.png" alt="Banner"/>
            <button id="aboutbut" class="aboutbut">About</button>
            <button id="morebut" class="morebut">More</button>
            <button id="vrsbut" class="vrsbut">Head To Head</button>
            <button id="videobut" class="videobut">Latest Video</button>
            <div id="about">
                <p>Smart Specs is a Smartphone comparison site that enables visitors to
                    compare the latest Apple and Samsung products on the market such as
                    the iPhone 5S & Samsung Galaxy S4 etc.</p>

                <p>In the head to head tab there is a brief comparison between the iPhone 5s and the Samsung Galaxy S4
                    We will be constantly doing comparisons between the most popular smartphones on the market each season</p>

                <p> Smart Specs also write there own reviews from there own personal 
                    experiences with the phones. This provides users with an insight to what
                    to expect if they were to choose to purchase one of them.</p> 



            </div>
            <div id="more">
                The site was developed early 2013, and was finally completed and ready to be ported online in December 2013.

                As a group of Computing students including Brian Murphy, Ben Callaghan & Aaron Kane,
                we decided to develop a site that easily compares the latest and most popular smartphones
                within a click of a button.
                
                <p>We are always happy to test out any new smartphone that comes on the market</p>
                <p>Any requests or queries please send them to <b>queries@smartspecs.com</b></p>
            </div>
            <div id="video">
                <iframe width="560" height="315" src="//www.youtube.com/embed/vKnKOpfXmIc" frameborder="0" allowfullscreen></iframe><br/><br/>
                <iframe width="560" height="315" src="//www.youtube.com/embed/0xVkzeuZo3s" frameborder="0" allowfullscreen></iframe>
            </div>
            <div id="headtohead">
                <p>The battle for control of the top-end smartphone market between Korean contender Samsung and ruling US heavyweight Apple has become a yearly feature within the technology industry. 
                    The latest competition is between the new Apple iPhone 5S and Samsung's flagship Galaxy S4. 
                    We've put these two flagship handsets head to head to see if the older S4 can still hold its ground against the latest premium iPhone.</p>



                <p> Neither Samsung nor Apple chose to radically redesign their latest flagship smartphones. Outside of its extended Champagne and Space Grey colour options the iPhone 5S is visually identical to the iPhone 5 and features the exact same 124x59x7.6mm dimensions and 112g weight.</p>
                <img alt="Apple iPhone 5S vs Samsung galaxy S4" border="0" src="images/iphone-5s-vs-samsung-galaxy-s4 back.jpg"  class="center"   title="Apple iPhone 5S vs Samsung galaxy S4 back"  width="540" height="334" />
                <p>Despite being heavier and larger than the 112g iPhone 5S, the 130g S4 is more comfortable to hold. This is because the S4's slightly round edges make it sit more neatly in hand than the hard-edged 5S.</p>
                <p>However, when it comes to build quality we have to give it to the iPhone 5S.</p> 
                <p><b>Winner:</b> The Apple iPhone 5S</p>
            </div>    
        </div>
    </body>
</html>
