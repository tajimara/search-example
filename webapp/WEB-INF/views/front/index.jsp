<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<body>
<table>
	<c:forEach items="${itemList}" var="item">
	<tr>
		<td>${item.itemId}</td>
		<td>${item.itemName}</td>
		<td>${item.price}원</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>