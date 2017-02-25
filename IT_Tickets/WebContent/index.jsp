<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Incidents</title>
<style type="text/css">

div.inline {
 border : 1px solid red;
 width : 20%;
 display : inline-block;
 margin-left : 30px;
 text-align : center;
}

div.center {
 width : 60%;
 padding-left : 20px;
 margin-top : 30px;
 margin-left : auto;
 margin-right : auto;
}

</style>
</head>
<body>

<div class="center">
	<div class="inline"> div 1 </div>
	<div class="inline"> div 2 </div>
</div>
<div class="center"> 

<table border="1">
 <thead>
   <tr>
   <th>ID</th>
   <th>Panne</th>
   </tr>
 </thead>
<tbody>
<s:iterator value="tickets">
<tr><td>${id}</td>
<td>${panne}</td>
</tr>
</s:iterator>
</tbody>
</table>

 </div>
</body>
</html>