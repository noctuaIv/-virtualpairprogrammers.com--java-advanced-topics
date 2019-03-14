<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
		<h1>Which Author's Books?</h1>
		
		<c:out value="${message}"/>
		
		<form method="GET" ACTION="FindBooksByAuthor.html">
			<p>Required Author:<input type="TEXT" NAME="AUTHOR"/></p>
			<p><input type="SUBMIT" value="Find"/></p>
		</form>
		
	</body>
</html>