var app = (()=>{
	return{
		init : (ctx)=>{
			$('#login_form').submit(()=>{
				action=ctx%'/player.do';
				alert('제발');
				
			});
			$('#a_join').click(()=>{
				alert('이런');
				location.assign(ctx+'/player.do?action=move&page=join');
				
			});
			
		}
	};
})();