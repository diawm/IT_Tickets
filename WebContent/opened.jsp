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

<p><a href="addTicket">
  <img src="images/add-16.png"/>
  </a> 
  <a href="/IT_Tickets/">voir tout</a>
  <a href="opened">tickets ouverts</a>
  <a href="closed">Tickets Fermes  </a>
   </p>
<table border="1">
  <thead>
    <th>ID</th>
   <th>Panne</th>
   <th>Commentaire</th>
   <th>DATE_SIGNALISATION </th>
   <th>TRAITEMENT </th>
   <th>Status</th>
   <th>Action</th>
   </tr>
 </thead>
 <tr>

<tbody>
<s:iterator value="tickets">
<tr><td>${id}</td>
<td>${panne}</td>
<td>${commentaire}</td>
<td><s:date name="date_signalisation" format="dd/MM/yyyy hh:mm:ss" /></td>
<td>${traitement} </td>
<td>${date_fermeture==null ? "en cours" : "ferme"}</td>
<td><a href="closeTicket?id=${id}" onclick="return confirm('etes vous sur de vouloir fermer ce ticket?')" style="display:${date_fermeture==null ? 'block' : 'none'}">Close</a></td>
</tr>
</s:iterator>
</tbody>
</table>

 </div>
</body>
</html>