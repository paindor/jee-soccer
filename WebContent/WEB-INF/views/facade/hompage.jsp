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
<div>
	
		<h2><a  id = "btn" href="#">2.포지션종류</a></h2>
		!-- SQL_TEST_004
!-- 수원팀(ID: K02)골키퍼4
!--SELECT PLAYER_NAME
!--FROM PLAYER
!--WHERE TEAM_ID LIKE 'K02'
!--AND POSITION LIKE 'GK';
	<h2>2.팀아이디와 포지션 입력시 해당정보 출력</h2>
	<form  id = "04_button" action='${ctx}%/player.do'>
	팀아이디<input type="text"  name = "tid" /><br />
	포지션<input type="text"  name = "position" /><br />
	<input type="hidden"  name = "action" value = "search"/><br />
	<input type="hidden"  name = "page" value = "4_find_by_teamid_position" /><br />
	<input type="submit"  value = "확인" /><br />
	

	
	
	</form>
	<form  id = "btn05"action='<%=request.getContextPath()%>/player.do'>
	팀아이디 <input type="text" name = "tid" /><br />
	이름 <input type="text" name = "name" /><br />
	키 <input type="text" name = "height" /><br />
	 <input type="hidden" name = "action" value = "search" /><br />
	 <input type="hidden" name = "page"  value = "5_find_byteamid_height_name"/><br />
	 <input type="submit"  value = "확인"/>
	 
	
	</form>	
</div>
<script>
$('#btn').click(function() {
	
	alert('클릭');
	location.assign('<%=request.getContextPath()%>/player.do?action=search&page=2_showposition');
	
});

$('#04_button').submit(function() {
	alert('확인');
	
});
$('#btn05').submit(function() {
	alert("확인");
	
});
</script>
	
	
</body>
</html>