<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/head.jsp"/>
<div></div>
<div class = "container">
<div></div> <div><h1> member</h1></div> <div></div>
<div></div> 
<div class = "content">


 <c:choose>
	<c:when test="${page eq 'login1'}">
		<jsp:include page = "login1.jsp"/>
	</c:when>
	<c:when test="${page eq 'join'}">
		<jsp:include page = "join.jsp"/>
	</c:when>
	<c:when test="${page eq 'home'}">
		<jsp:include page = "join.jsp"/>
	</c:when>
</c:choose> 
<%-- <jsp:include page="login1.jsp"/>
--<jsp:include page="join.jsp"/>--%>
</div> <div></div>
<div></div> <div></div> <div></div>

</div>	
<jsp:include page="../common/foot.jsp"/>
	