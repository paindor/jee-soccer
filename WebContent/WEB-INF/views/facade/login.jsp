<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="${js}/app.js"></script>

<title>k리그의 모든것</title>
</head>

<body>
	<div id = "wrapper" style = "width: 100%;height:100%">
			<h1>k리그의 모든것</h1>
		<img src="${img}/images.jpg" />
		<form id = "login_form"  >
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
				<input type="hidden" name = "nextJoin"  value = "join"/>
				</td>
				
			</tr>
		
		</table>
		
		</form>
		
		
		<h3 style="width:300px;margin:0 auto"><a id = "a_join"href="#">회원가입</a> </h3>
		
	
</div>
<script>
app.init('${ctx}');


</script>	
</body>
</html>