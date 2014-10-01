<link href="CSS/index.css" type="text/css" rel="stylesheet" />
<link href="CSS/style.css" type="text/css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Dosis|Lobster|Finger+Paint|Oregano|Montserrat|Roboto+Condensed:400,700' rel='stylesheet' type='text/css'>
<script language="javascript" type="text/javascript" src="Javascript/functions.js"></script>
<style type="text/css">
#intro
{
display:none;
}

</style> 
<div id="loggedin">
	<h3 id="userli">Hello, <?php echo $user_data['username']; ?>!</h3>
		<div id="logoutlink">
		<ul>
			<li><a href="logout.php" id="logoutlink">Log out</a><li>
		</ul>
		</div>
		<div id="loggedinlinks">
		<ul>
			<li><a href="changepassword.php" id="loggedinlinks">Change password</a></li>
			<li><a href="settings.php" id="loggedinlinks">Settings</a></li>
			<li><a href="index.php" id="loggedinlinks">Home</a></li>
		</ul>
		</div>
</div>



