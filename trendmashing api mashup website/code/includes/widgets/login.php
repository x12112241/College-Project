<?php
echo "<link rel='stylesheet' type='text/css' href='CSS/index.css' />";  
?>
<div id="login">
	
		<form action="login.php" method="post">
			<table>
				<tr><td id="username_password">Username:</td><td><input type="text" name="username" id="uname"></td>
					<td id="username_password">Password:</td><td><input type="password" name="password" id="pass"></td>
					<td><input type="submit" value="Log in" id="loginbtn"></td>
					<td><a href="register.php"><input type="button" value="Register" id="registerbtn"></a></td>
				</tr>
			</table>
		</form>

</div>