<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="text/javascript" src="../js/jquery-3.2.0.min.js"></script>
	<script type="text/javascript" src="../js/bootstrap.min.js"></script>
	<script type="text/javascript" src="../js/team.js"></script>
	<link type="text/css" rel="stylesheet" href="../css/bootstrap.min.css"></link>
</head>	

<body>

	<table class="table">
		<tr><th>NAME</th><th>CITY</th><th>OPERATE</th></tr>
		<c:forEach items="${teams}" var="t">  
		<tr>
    		<td>${t.name}</td>  
    		<td>${t.city}</td>
    		<td>
    			<button class="btn btn-default" onclick="editTeam(this)" data="${t.id}">edit</button>
    			<button class="btn btn-default" onclick="deleteTeam(this)" data="${t.id}">delete</button>
    			<!-- <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> -->
    		</td>
		</tr>  
		</c:forEach>  
	</table>

</body>
</html>
