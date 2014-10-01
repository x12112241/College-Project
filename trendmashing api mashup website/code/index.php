
<?php
include 'core/init.php';
?>
<?php 
include 'includes/overall/header.php'; 
?>	


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
   <head>
      <title>TrendMash</title>
   </head>
   <link rel="stylesheet" type="text/css" href="CSS/style.css">
   <link href='http://fonts.googleapis.com/css?family=Oregano' rel='stylesheet' type='text/css'>
   <link href='http://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
   <link href='http://fonts.googleapis.com/css?family=Dosis:400,500' rel='stylesheet' type='text/css'>
   <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
   <link href="CSS/index.css" type="text/css" rel="stylesheet" />
   <link href="CSS/tweet.css" type="text/css" rel="stylesheet" />
   <link href='http://fonts.googleapis.com/css?family=Finger+Paint' rel='stylesheet' type='text/css'>
   <link href='http://fonts.googleapis.com/css?family=Roboto:900' rel='stylesheet' type='text/css'>
   <script src="Javascript/jquery.min.js"></script> 
   <script src="Javascript/ajax.js"></script> 
    <script language="javascript" type="text/javascript" src="Javascript/functions.js"></script>
    <script type="text/javascript"src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBXSdhWLHELzf3XbIZQo3SsSU9_0H_Yn98&sensor=false"></script> 
 
   
   <body>
      <div id="wrapper">
		<p id="loginslide">Login</p>
		<div id="facebook">
		<iframe src="//www.facebook.com/plugins/like.php?href=https%3A%2F%2Fwww.facebook.com%2Fpages%2FTrendMash%2F530567673719857&amp;
		width&amp;layout=standard&amp;action=like&amp;show_faces=true&amp;share=true&amp;height=80" scrolling="no" frameborder="0" 
		style="border:none; overflow:hidden; height:80px;" allowTransparency="true"></iframe></div>
         <div id="header">
           <img src="images/trendmash.png" alt="trendmash" id="trendmash">
         </div>
		
         <div id="content">
            <!--<p id="title" align="center">Search a trend</p>-->
            <div id="icons" align="center"> 
               <!--<a href="https://twitter.com/"><img src="images/twitter.png" alt="twitter" height="40px" id="twitter1" target="_blank"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
               <a href="https://flickr.com"><img src="images/flickr.png" alt="flckr" height="40px" id="flickr" target="_blank"></a>-->
            </div>
            <div id="search_box" align="center">
               <input id="textinput" type="text" name="search_terms" autofocus="autofocus" onkeydown="if (event.keyCode == 13) 
                  document.getElementById('search_button').click()" />
               <button id="search_button" align="center">Search</button>
               <div id="top">
               </div>
            </div>
            <div id="results_wrapper">
               <div id="search_results"></div>
               <div id="search_results1"></div>
            </div>
         </div>
      </div>
      </div>
      </div>
   </body>
</html>

				
<?php 
include 'includes/overall/footerr.php'; 
?>
