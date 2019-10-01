var app = (()=>{
	return{
		init : (ctx)=>{
			playerService.login(ctx);
			
			createPlayer.join(ctx);
			playerService.moveJoin(ctx);
		
		
		
			
			
			
		}
	};
})();

var player = (()=>{
	var _playerId, playerName, _teamId, _ePlayerName, _nickname,
	_joinYYYY, _position , _backNo, _nation, _birthDate, _solar, _height, _weight;
	var setPlayerId = (playerId)=>{this._playerId = playerId;}
	var setSolar = (solar)=>{this._solar = solar;}	
	var getPlayerId = ()=>{return this._playerId;}
	var getSolar = ()=>{return this._solar;}
	return {
		setPlayerId: setPlayerId,
		setSolar : setSolar,
		getPlayerId : getPlayerId,
		getSolar : getSolar
	};
	
	
})();
var playerService = (()=>{
	return {
		login: (ctx)=>{
			$('#login_btn').click(()=>{
				if($('#username').val()==='' || $('#password').val()=== ''){
					alert('input error');
				}else{}
				
				
				$('#login_form').attr('action' , ctx+'/player.do');
				$('#login_form').submit();
			});
			
		
			
		},
		moveJoin : (ctx)=>{
			$('#a_join').click(()=>{
				alert('shit');
				location.assign(ctx+'/player.do?action=move&page=join');
				
			});
			
		}
		
		
	};
})();
var createPlayer = (()=>{
	return {
		join: (ctx)=>{
			$('#go_join').click(()=>{
				alert('push');
				$('#join_form').attr('action', ctx+'/player.do');
				$('#join_form').submit();
				
				
			});
			
		}
	}
	
})();