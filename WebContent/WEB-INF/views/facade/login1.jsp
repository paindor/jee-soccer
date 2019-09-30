<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:include page="../common/head.jsp"/>
<div>1</div>
	<div>
	<img id = "soccer_intro" src="${img}/images.jpg" />
		
		
	
		
	</div>
		
	
	<div>3
	</div>
	<div>4</div>
	
	<div>5
	<form id = "login_form"  >
			<div id = "login_tab" >
	
			
				<div id = "login_tab_item_1"> 
				ID <input class = "input_text" id = "username" type="text" name = "playerId" />
					</div>		
				<div id = "login_tab_item_2">
					<input id = "login_btn"  type="button" value = "login" />
				</div>
				
			
			<div id = "login_tab_item_3">
				password <input class = "input_text"  id = "password" type="text" name = "solar"/>
			</div>
				
			<div>
			<input type="hidden" name = "action" value = "login" />
				<input type="hidden" name = "page" value = "hompage" />
				<input type="hidden" name = "nextJoin"  value = "join"/>
			</div>
				
				
			</div>
			
		
		</form>
		
			</div>
	
	
	<div>6</div>
	<div>7</div>
	<div>8
		<h3 id = "join_a"><a id = "a_join" href="#">회원가입</a> </h3>
	</div>
	<div>9</div>
	
		
<<jsp:include page="../common/foot.jsp"/>
<script>
app.init('${ctx}');


</script>	
