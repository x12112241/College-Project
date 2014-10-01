<?php
//connects the website to pagodabox
//connects using provided database credentials on pagodabox
//connects to the specified database table
$connect_error ='Sorry, were  experiencing connection problems.';
mysql_connect('tunnel.pagodabox.com','claudine','yKdz23kP', 3306) or die($connect_error);
mysql_select_db('login_admin') or die($connect_error);
?>