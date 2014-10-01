

<?php

//When logout link is clicked redirect the user to index.php

session_start();
session_destroy();
header('Location: index.php');

?>

