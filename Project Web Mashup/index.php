<?php
include 'core/init.php';
?>
<?php 
include 'includes/overall/header.php'; 
?>	

<!--
Trendmashing homepage
HTML Code
-->

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
   <head>
      <title>TrendMash</title>
   </head>
<!--
Stylesheets
-->
   <link rel="stylesheet" type="text/css" href="CSS/style.css">
   <link href="CSS/index.css" type="text/css" rel="stylesheet" />
   <link href="CSS/tweet.css" type="text/css" rel="stylesheet" />
   <link rel="shortcut icon" href="http://trendmashing.gopagoda.com/images/icon.ico" /> 
<!--
Google Fonts
-->
<link href='http://fonts.googleapis.com/css?family=Dosis|Lobster|Finger+Paint|Oregano|Montserrat|Roboto+Condensed:400,700' rel='stylesheet' type='text/css'>
<!--
Scripts
-->
   <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
   <script src="Javascript/jquery.min.js"></script> 
   <script src="Javascript/ajax.js"></script>
   <script src="Javascript/search_ajax.js"></script>
   <script language="javascript" type="text/javascript" src="Javascript/functions.js"></script>
   <script type="text/javascript"src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBXSdhWLHELzf3XbIZQo3SsSU9_0H_Yn98&sensor=false"></script> 
   
   <body>
      <div id="wrapper">

		 <div id="header1">
           <a href="index.php"><img src="images/trendmash.png" alt="trendmash" id="trendmash"></a>
         </div>
		<div id="search_box">
		 <center><input id="textinput" type="text" name="search_terms" autofocus="autofocus" onkeydown="if (event.keyCode == 13) 
                  document.getElementById('search_button').click()" />
               <button id="search_button" align="center">Search</button></center>
		</div>
		<div id="intro">
		<p id="intro">TrendMash is a social media mash-up that searches your inputs through Twitter and Flickr.</p>
		</div>
            <div id="results_wrapper">
               <div id="search_results"></div>
               <div id="search_results1"></div>
            </div>
         </div>
   </body>
</html>

				

