<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<body>
회원가입
<div>1

</div>
<div>2</div>
<div>3</div>
<div>4</div>
<div>5
	<form id = "join_form">
	
			<div id= "join_input" > <br/>
			id<input type="text"  name = "playerId" /><br/>
			name<input type="text"  name = "playerName" /><br/>
			nick<input type="text"  name = "nickname" /><br/>
			back_no<input type="text"  name = "backNo" /><br/>
			password<input type="text"  name = "solar" /><br/>
			joinY<input type="text"  name = "joinYYYY" /><br/>
			position<input type="text"  name = "position" /><br/>
			nation<input type="text"  name = "nation" /><br/>
			birthday<input type="text"  name = "birthDate" /><br/>
			height<input type="text"  name = "height" /><br/>
			weight<input type="text"  name = "weight" /><br/>
			eName<input type="text"  name = "ePlayerName" /><br/>
			<input type="hidden" name = "action" value = "create" />
			<input type="hidden" name = "page" value = "login" />
			<input type="button" id = "go_join" value = "confirm"/>
			</div>
		
		</form>
	</div>
	
<div>
</div> 
<div>6</div>
<div>7</div>
<div>8</div>
<div>9</div>
<h3> <a id = "goback"  href="#"> 뒤로가기</a></h3>

<script>
app.init('${ctx}');

</script>

