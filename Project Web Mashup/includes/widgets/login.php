<?php
echo "<link rel='stylesheet' type='text/css' href='CSS/index.css' />";  
echo "<link rel='stylesheet' type='text/css' href='CSS/login.css' />";
?>
<!--
Login form on index.php 
-->

<div id="login">
	<div id="loginform">
		<form action="login.php" method="post">
			<table>
				<tr><td id="username_password"><input type="text" name="username" id="uname" placeholder="Username"></td></tr>
				<tr><td id="username_password"><input type="password" name="password" id="pass" placeholder="Password"></td></tr>
				<tr><td><input type="submit" value="Log in" id="loginbtn">
					<a href="register.php"><input type="button" value="Register" id="registerbtn"></a></td></tr>
				</tr>
			</table>
		</form>
	</div>
</div>