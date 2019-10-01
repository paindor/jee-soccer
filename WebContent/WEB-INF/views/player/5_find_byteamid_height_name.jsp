<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<form  id = "btn05"action='<%=request.getContextPath()%>/player.do'>
	팀아이디 <input type="text" name = "tid" /><br />
	이름 <input type="text" name = "name" /><br />
	키 <input type="text" name = "height" /><br />
	 <input type="hidden" name = "action" value = "search" /><br />
	 <input type="hidden" name = "page"  value = "5_find_byteamid_height_name"/><br />
	 <input type="submit"  value = "확인"/>
	 
	
	</form>	

해당선수는 ${players.get(0).getPlayerName()}입니다

