<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page = "../common/head.jsp"/>

<div></div> <div>플레이어메인</div> <div></div>
<div></div> 


<div>
 <c:choose>
 	<c:when test="${page eq '2_showposition'}">
 		<jsp:include page="2_showposition.jsp"/>
 		
 		
 	</c:when>
 	<c:when test="${page eq 'main'}">
 		<jsp:include page="2_showposition_q.jsp"/>
 		
 		
 		
 	
 	</c:when>
 </c:choose>

</div> 


<div></div>
<div></div> <div></div> <div></div>



<jsp:include page = "../common/foot.jsp"/>