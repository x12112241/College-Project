<?php
echo "<link rel='stylesheet' type='text/css' href='CSS/index.css' />"; 
?>
<html lang="en">
<head>
<link href='http://fonts.googleapis.com/css?family=Dosis|Lobster|Finger+Paint|Oregano|Montserrat|Roboto+Condensed:400,700' rel='stylesheet' type='text/css'>
<script language="javascript" type="text/javascript" src="Javascript/function2.js"></script>
<style type="text/css">
body
{
background-image:url('http://trendmashing.gopagoda.com/images/image.jpg');
}

#search_box
{
display:none;
}

</style> 
</head>

<body>
</body>
</html>

<?php
include 'core/init.php';
protect_page();
include 'includes/overall/header.php';

//settings form error handling

if (empty($_POST) === false) {
	$required_fields = array('first_name', 'email');
	foreach($_POST as $key=>$value) {
		if (empty($value) && in_array($key, $required_fields) === true) {
			$errors[] = 'Fields marked with an asterisk are required';
			break 1;
		}
	}
	if (empty($errors) === true) {
		if (filter_var($_POST['email'], FILTER_VALIDATE_EMAIL) === false) {
			$errors[] = 'A valid email address is required';
		}else if (email_exists($_POST['email']) === true && $user_data['email'] !== $_POST['email']) {
			$errors[] = 'Sorry, the email \'' . $_POST['email'] . '\' is already in use.' ;
		}
	}
}
?>
<div id="settings">

<?php

//Successfull update of form

if (isset($_GET['success']) === true && empty($_GET['success']) === true) {
	echo 'Your details have been updated';
}else{
	if (empty($_POST) === false && empty($errors) === true) {
		$update_data = array(
			'first_name' 	=> $_POST['first_name'],
			'last_name' 	=> $_POST['last_name'],
			'email' 		=> $_POST['email'],
		);
		
		update_user($update_data);
		header('Location: settings.php?success');
		exit();
		
		
	}else if (empty($errors) === false) {
		echo output_errors($errors);
	}
	?>
	<div id="settingsform">
	<h3 id="h3settings">Settings</h3>
	<form action="" method="post">
		<ul>
			<li>
				First Name*:<br/>
				<input type="text" name="first_name" id="fname" value="<?php echo $user_data['first_name']; ?>">
			</li>
			<li>
				Last Name:<br>
				<input type="text" name="last_name" id="lname" value="<?php echo $user_data['last_name']; ?>">
			</li>
			<li>
				Email*:<br>
				<input type="text" name="email" id="email" value="<?php echo $user_data['email']; ?>">
			</li>
			<li>
				<input type="submit" value="Update" id="updatebtn">
			</li>
		</ul>
	</form>
	</div>
</div>
<?php
}
include 'includes/overall/footerr.php'; 
?>