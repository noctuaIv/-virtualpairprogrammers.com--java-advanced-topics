<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="todaysDate" value="<%= new java.util.Date() %>"/>

<h1>JR <span>Hartley</span> <small>booksellers since 1923</small></h1>

<fmt:formatDate value="${todaysDate}" type="both"/>

<div id="links">
	<ul>
		<li><a href='all-books.html'>All Books</a></li>
		<li><a href='<c:url value="viewCart.html"/>'>Your Shopping Cart</a></li>
		<li><a href='tc.jsp'>Terms and Conditions</a></li>
		<li><a href='add-new-book.jsp'>Add a New Book</a></li>
	</ul>
</div>