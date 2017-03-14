<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Incidents</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>


<div class="center"> 

<a href="nouveau">
<img src="images/add-16.png"/>
</a>

<table border="1">
 <thead>
   <tr>
   <th>ID</th>
   <th>Panne</th>
   <th>Commentaire</th>
   <th>HEURE_SIGNALISATION </th>
   <th>TRAITEMENT </th>
   <th>HEURE_FERMETURE</th>
   <th>ID_IT_STAFF</th>
   <th>ID_ADD_IT_STAFF</th>
   <th>STATUS</th>
   
   </tr>
 </thead>
<tbody>
<s:iterator value="tickets">
<tr><td>${id}</td>
<td>${panne}</td>
<td>${commentaire}</td>
<td>${HEURE_SIGNALISATION }</td>
<td>${TRAITEMENT } </td>
<td>${ HEURE_FERMETURE}</td>
<td>${ID_IT_STAFF }</td>
<td>${ID_ADD_IT_STAFF}</td>
<td>${STATUS}</td>
</tr>
</s:iterator>
</tbody>
</table>

 </div>
</body>
</html>