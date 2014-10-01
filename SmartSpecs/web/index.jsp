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
    </head>
    <body>
        <div id="wrapper">
            <nav>
                <ul id="menu">
                    <xsl:for-each select="catalog/lk">
                        <li>
                        <xsl:element name="a">
                            <xsl:attribute name="href">
                                <xsl:value-of select="link"/>
                            </xsl:attribute>
                            <xsl:value-of select="val"/>
                        </xsl:element>
                        </li>                         
                    </xsl:for-each>                    
                </ul>
            </nav>
            <form action="HomeServlet">
                <div id="heading"><h3>Welcome to Smart Specs</h3></div>
                <div id="enterbutton"> <input type="Submit" value ="Enter" id="enter"></div>
                <div id="login"> <a  id="loginlink" href="ProtectedServlet">Developer Login</a></div>
            </form>
            <hr id="hrhome"/>
            
            <hr id="hrhome"/>
            <iframe id="videoindex" width="560" height="315" src="//www.youtube.com/embed/ylP4DDwXZb8" frameborder="0" allowfullscreen></iframe>
              
            <h2>Samsung Galaxy S4</h2>

<p><img src="http://www.imore.com/sites/imore.com/files/styles/large/public/field/image/2013/10/samsung_galaxy_s4_hero.jpg?itok=fmTDvbrt" width="80%" height="520" alt="" class="image-large aligncenter" /></p>

<p>The Samsung Galaxy S4 is the current king of standard-sized Android handsets. And that 5-inches is standard sized now tells you a lot about the state of Android handsets these days! Like the iPhone 5s, the Galaxy S4 has been accused of being more tock than tick - an iterative improvement over last year's monstrously successful Galaxy S3. But what an iteration! Better in almost every way that matters, in addition to the larger, sharper screen, it brings improved performance, a 13-megapixel camera, and the latest version of Samsung's Android presentation layer, TouchWiz.</p>

<p>Here's Android Central's <a href="http://www.androidcentral.com/samsung-galaxy-s4-review">Samsung Galaxy S4 review</a> by Alex Dobie:</p>

<h3>Galaxy S4: The good</h3>

<h4>The Galaxy S4 is a speedy all-rounder which manages to deliver great performance and a big, bright screen in an ergonomic package. Widespread availability, tons of features and a fairly recent version of Android work in the S4’s favor, as does its impressive 13-megapixel camera.</h4>

<h3>Galaxy S4: The bad</h3>

<p>The TouchWiz UI remains a clumsy construction, and still lacks any kind of overarching design language. The bewildering array of settings and features and poor UX design will confuse some users. The occasional performance hiccups are disappointing to see, and the plastic chassis feels cheap.</p>

<h3>Galaxy S4: The bottom line</h3>

<p>If you’re looking for an Android phone that performs well across the board, ticks every feature box you could possibly imagine and is available on just about every carrier on the planet, the Galaxy S4 is an easy recommendation. But this time around it’s clear Samsung has merely stacked incremental updates -- mostly features and internal hardware -- upon its earlier flagship, rather than addressing that device’s issues and rethinking what a smartphone should be in 2013. For some folks, that’s fine. For others, more exciting products await elsewhere.</p>

<h2>iPhone 5s</h2>

<p><img src="http://www.imore.com/sites/imore.com/files/styles/large/public/field/image/2013/09/iphone_5s_apple_store_hero_0.jpg?itok=6s-R_Ypv" width="1240" height="930" alt="" class="image-large aligncenter" /></p>

<p>Like the Galaxy S4, the iPhone 5s takes last year's smash hit to an incrementally new level. It has the first 64-bit mobile processor, the <a href="http://www.imore.com/apple-a7">Apple A7</a>, the <a href="http://www.imore.com/apple-m7">Apple M7</a> motion coprocessor, a much improved 8-megapixel <a href="http://www.imore.com/isight">iSight</a> camera, increased LTE support, and the <a href="http://www.imore.com/touch-id">Touch ID</a> fingerprint identity sensor. It has the same 4-inch screen, but it also has the newly redesigned <a href="http://www.imore.com/ios-7-review">iOS 7</a>.</p>

<p>Here's iMore's <a href="http://localhost:8080/SmartSpecs/PhoneSpecsServlet?name=iPhone%205S">iPhone 5s review</a> by your's truly:</p>

<h3>iPhone 5s: The good</h3>

<p>The iPhone 5s is twice as fast as last year's already fast model. The improvements to the camera, including new 120fps slow motion video, are considerable. Built on top of a physics and particle engine, iOS 7 is not only a welcome redesign for Apple, but for the industry. Likewise, Touch ID works so well you'll immediately want it on everything.</p>

<h3>iPhone 5s: The bad</h3>

<p>Aside from the processors, camera, and Touch ID, not much has changed, unless you count new space gray and gold colors. It's still a 4-inch screen, which some people might find small, and while iOS 7 is beautiful in many ways, it's unfinished in some, and without the customization available to Android.</p>

<h3>iPhone 5s: The bottom line</h3>

<p>Apple call's the iPhone 5s their most forward-thinking iPhone ever, and on that they deliver. From iOS 7 to Touch ID to 64-bit, it's next-year's technology in your hand today. It's going to be on most carriers, in most countries in the world, and with the usual, unmatched app, accessory, and media support. Ultimately, it's the best iPhone ever. Again. If that's not what you want, Apple has nothing different to offer you. If it is, get it now.</p>

<h2>So which one should you get?</h2>

<p>Neither Samsung nor Apple fundamentally changed the game this year. Each simply got better at playing their existing strategies. And that's okay. But it means the decision remains essentially the same.</p>

<ul><li><p>If a bigger screen and the ability to customize is more important to you than running iOS and all the high quality apps and accessories that come with it, or if you simply don't like Apple, go with the Galaxy S4.</p></li>
<li><p>If access to the iOS App Store, iTunes, and Apple Stores is more important to you than the power and flexibility that comes with Android, or you simply don't like Samsung, go with the iPhone 5s.</p></li>
</ul><p>That's boiling it down to ridiculously absurd levels, but that's what buying decisions are all about. If you're still not sure, here are full reviews for both phones, and the best forums in the world to ask questions and get answers. Once you've decided, leave a comment below telling me why you went the way you did!</p>

<ul><li><a href="http://www.androidcentral.com/samsung-galaxy-s4-review">Samsung Galaxy S4 review</a></li>
<li><p><a href="http://forums.androidcentral.com/samsung-galaxy-s4/">Samsung Galaxy S4 forum</a></p></li>
<li><p><a href="http://www.imore.com/iphone-5s-review">iPhone 5s review</a></p></li>
<li><a href="http://forums.imore.com/iphone-5s/">iPhone 5s forum</a></li>
</ul><h2>Still undecided?</h2>


            </body>
            </html>
