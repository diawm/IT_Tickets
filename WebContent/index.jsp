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

<p>
<div class="Menu">
  <table width="557" border="1" >
    <tr>
      <td width="70"><a href="addTicket"><img src="images/add-16.png"/></a></td>
      <td width="153"><a href="/IT_Tickets/">Liste Tickets</a></td>
      <td width="155"><a href="opened">tickets ouverts</a></td>
      <td width="181"><a href="closed">Tickets Ferm&eacute;s </a>
      <td width="181"><a href="modify"> Tickets modif&eacute;s</a> 
       </td>
    </tr>
</table>
</div>
<p><a href="opened"></a>
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
<td></td>
<td><a href="closeTicket?id=${id}" onclick="return confirm('etes vous sur de vouloir fermer ce ticket?')" style="display:${date_fermeture==null ? 'block' : 'none'}">Close</a></td>
</tr>
</s:iterator>
</tbody>
</table>

</div>
</body>
</html>