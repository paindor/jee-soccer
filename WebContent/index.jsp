<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>k리그의 모든것</title>
</head>

<body>
	<div id = "wrapper" style = "width: 100%;height:100%">
			<h1>k리그의 모든것</h1>
		<form id = "login_form" action='<%=request.getContextPath()%>/player.do?'>
			<table border = "1" style="width:300px;height:200px;margin:300px auto">
	
			<tr>
				<td style="width:350px">
				아이디 <input type="text" name = "playerId" /></td>
				
				<td rowspan = "2">
					<input type="submit" value = "로그인" style = "width: 100%;height:100%" />
				</td>
			
			</tr>
			<tr>
				<td>
				비밀번호 <input type="text" name = "solar" />
				<input type="hidden" name = "action" value = "login" />
				<input type="hidden" name = "page" value = "hompage" />
				</td>
				
			</tr>
		
		</table>
		
		</form>
		
		
		<h3 style="width:300px;margin:0 auto"><a id = "a_join"href="">회원가입</a> </h3>
		
	
</div>
<script>
$('#login_form').submit(function() {
	alert('로그인');
	
	
});

</script>	
</body>
</html>