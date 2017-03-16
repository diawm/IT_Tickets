<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="center"> 

<form action="saveTicket">

<fieldset>

<legend>Information Ticket</legend>
<label>Type Panne</label>
<input name="ticket.panne"/>
<br>
<label>Commentaire</label>
<textarea cols="25" rows="7" name="ticket.commentaire"> </textarea>
<br>
<input type="submit" value="envoyer"/>

</fieldset>


</form>

</div>
</body>
</html>