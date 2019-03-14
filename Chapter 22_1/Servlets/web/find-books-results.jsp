<%@ page import = "java.util.List" %>
<%@ page import = "com.virtualpairprogrammers.domain.Book" %>
<% List<Book> allBooks = (List<Book>)request.getAttribute("allBooks"); %>

<html>

	<head>
	<title>Search results</title>
	</head>
	
	<body>
	
		<h1>Your search results:</h1>
		
		<ul>
			<% for (Book nextResult : allBooks)
			   {
			%>
			
			<li><%= nextResult.getTitle() %> </li>
			
			<%
			   }
			%>
		</ul>
	</body>

</html>