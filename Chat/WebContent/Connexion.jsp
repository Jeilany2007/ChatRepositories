<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Connexion</title>
<link type="text/css" rel="stylesheet" href="inc/style.css" />
</head>
<body>
	<div>
		<form method="get" action="ServletCNX">
			<fieldset>
				<legend>Connexion au Chat</legend>

				<label for="username">Username<span class="requis">*</span></label>
				<input type="text" id="username" name="username" value="" size="20"
					maxlength="20" /> <br /> <label for="password">Password<span
					class="requis">*</span></label> <input type="password" id="password"
					name="password" value="" size="20" maxlength="20" /> <br /> <input
					type="submit" value="Login" /> <br />
			</fieldset>
		</form>
	</div>

</body>
</html>