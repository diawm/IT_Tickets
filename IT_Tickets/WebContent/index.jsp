<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tickets</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>


<div class="center"> 

<a href="addTicket">
<img src="images/add-16.png"/>
</a>

<table border="1">
 <thead>
   <tr>
   <th>ID</th>
   <th>Panne</th>
   <th>Commentaire</th>
   </tr>
 </thead>
<tbody>
<s:iterator value="tickets">
<tr><td>${id}</td>
<td>${panne}</td>
<td>${commentaire}</td>
</tr>
</s:iterator>
</tbody>
</table>

 </div>
</body>
</html>