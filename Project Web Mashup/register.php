
<?php 
echo "<link rel='stylesheet' type='text/css' href='CSS/index.css' />"; 
include 'core/init.php';
logged_in_redirect();

//register error handling
if (empty($_POST) === false) {
	$required_fields = array('username', 'password', 'password_again', 'first_name', 'email');
	foreach($_POST as $key=>$value) {
		if (empty($value) && in_array($key, $required_fields) === true) {
			$errors[] = 'Fields marked with an asterisk are required';
			break 1;
		}
	}
	
	if (empty($errors) === true) {
		if (user_exists($_POST['username']) === true) {
			$errors[] = 'Sorry, the username \'' . $_POST['username'] . '\' is already taken.' ;
		}
		if (preg_match("/\\s/", $_POST['username']) == true) {
			$errors[] = 'Your username must not contain any spaces.' ;
		}
		if (strlen($_POST['password']) < 6) {
			$errors[] = 'Your password must be at least 6 characters';
		}
		if ($_POST['password'] !== $_POST['password_again']) {
			$errors[] = 'Your passwords do not match';
		}
		if (filter_var($_POST['email'], FILTER_VALIDATE_EMAIL) === false) {
			$errors[] = 'A valid email address is required.';
		}
		if (email_exists($_POST['email']) === true) {
			$errors[] = 'Sorry, the email \'' . $_POST['email'] . '\' is already in use.' ;
		}
	}
}

?>
<html lang="en">
<head>
<style type="text/css">
body
{
background-image:url('http://trendmashing.gopagoda.com/images/image.jpg');
}
</style>
 <script src="Javascript/functions.js"></script> 
</head>

<body>
</body>
</html>
</div>
<div id="register">
<h1>Register</h1>

<?php
//register error handling
if (isset($_GET['success']) && empty($_GET['success'])) {
	header('Refresh:5; URL:index.php');
}else{
	if (empty($_POST) === false && empty($errors) === true) {
		$register_data = array(
		'username' 		=> $_POST['username'],
		'password' 		=> $_POST['password'],
		'first_name' 	=> $_POST['first_name'],
		'last_name' 	=> $_POST['last_name'],
		'email' 		=> $_POST['email'],
		'email_code'	=> md5($_POST['username'] + microtime())
		);
		
		register_user($register_data);
		//the plan was to display an alert box on successful register then redirect to index.php
		echo '<script language="javascript">';
		echo 'alert("You have registered successfully, You can now log in and search a trend")';
		echo '</script>';
		header('Location: index.php');
		
		exit();
		
	}else if (empty($errors) === false){
		echo output_errors($errors);
	}

?>
<!--
register form
-->
	<div id="registerform">
	<form action="" method="post">	
		<ul>
			<li>
				Username*:<br>
				<input type="text" name="username" id="runame">
			</li>
			<li>
				Password*:<br>
				<input type="password" name="password" id="rpass">
			</li>
			<li>
				Repeat Password*:<br>
				<input type="password" name="password_again" id="rpassagain">
			</li>
			<li>
				First name*:<br>
				<input type="text" name="first_name" id="fname"">
			</li>
			<li>
				Last name:<br>
				<input type="text" name="last_name" id="lname">
			</li>
			<li>
				Email*:<br>
				<input type="text" name="email" id="email">
			</li>
			<li>
				<input type="submit" value="Register" id="rregisterbtn">
			</li>
		</ul>
	</form>
	</div>
</div>
<?php
}
include 'includes/overall/footerr.php'; 
?>