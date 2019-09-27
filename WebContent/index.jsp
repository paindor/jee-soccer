<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    
<img src="<%=request.getContextPath()%>/resources/img/loading2.gif"  />
<script>
  location.assign('<%=request.getContextPath()%>/facade.do')
</script>