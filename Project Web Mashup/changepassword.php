<?php
$url = 'back.jpg';
?>

<html lang="en">
<head>
<link href='http://fonts.googleapis.com/css?family=Dosis|Lobster|Finger+Paint|Oregano|Montserrat|Roboto+Condensed:400,700' rel='stylesheet' type='text/css'>
<style type="text/css">
body
{
background-image:url('<?php echo $url ?>');
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
echo "<link rel='stylesheet' type='text/css' href='CSS/index.css' />"; ?>
<?php
include 'core/init.php';
protect_page(); 

if (empty($_POST) === false) {
	$required_fields = array('current_password', 'password', 'password_again');
	foreach($_POST as $key=>$value) {
		if (empty($value) && in_array($key, $required_fields) === true) {
			$errors[] = 'Fields marked with an asterisk are required';
			break 1;
		}
	}
	
	if (md5($_POST['current_password']) === $user_data['password']) {
		if (trim($_POST['password']) !== trim($_POST['password_again'])) {
			$errors[] = 'Your new passwords do not match';
		}else if (strlen($_POST['password']) < 6) {
			$errors[] = 'Your password must be at least 6 characters';
		}
	}else{
		$errors[] = 'Your current password is incorrect';
	}
	
	
}
include 'includes/overall/header.php'; 
?>	

<?php
//change password error handling
if (isset($_GET['success']) && empty($_GET['success'])) { 
	echo 'Your password has been changed';
}else{
if (empty($_POST) === false && empty($errors) === true) {
	change_password($session_user_id, $_POST['password']);
	header('Location: changepassword.php?success');
}else if (empty($errors) === false) {
	echo output_errors($errors);
}
?>

<body>
<div id="changepass">
	<div id="passwordform">
	<h3 id="h3pass">Change Password</h3><form action="" method="post">
		<ul>
			<li>
				Current password*:<br>
				<input type="password" name="current_password" id="cpass">
			</li>
			<li>
				New password*:<br>
				<input type="password" name="password" id="npass">
			</li>
			<li>
				New password again*:<br>
				<input type="password" name="password_again" id="napass">
			</li>
			<li>
				<input type="submit" value="Change password" id="cpassbtn">
			</li>
		</ul>
	</form>
	</div>
</div>
</body>
</html>

			
<?php 
}
include 'includes/overall/footerr.php'; 
?>

