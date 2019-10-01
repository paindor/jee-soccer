<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

!-- 답--
해당ID가 ${players.get(0).getTeamId()} 포지션${players.get(0).getPosition()} 이 일치하는선수는 ${players.get(0).getPlayerName()} 입니다


