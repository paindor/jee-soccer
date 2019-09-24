package com.soccer.web.DAOimpls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.DAOs.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constants;

import oracle.sql.ARRAY;
import sun.security.jca.GetInstance;

public class PlayerDaoImpl implements PlayerDao{

	private ResultSet result;
	private static PlayerDaoImpl instance = new PlayerDaoImpl();
	
	public static PlayerDaoImpl GetInstance() {
	
		
		return instance;
		
	}
	private PlayerDaoImpl() {}
		
	@Override
	public List<String> selectPositions() {
		List<String> pl = new ArrayList<String>();
	
		try {
			
			//Statement stm = conn.createStatement();
			String sql = "SELECT DISTINCT POSITION as pos FROM PLAYER WHERE POSITION IS NOT NULL";
			ResultSet stm = DatabaseFactory.createDatabase(Constants.VENDER).safd
			
		//	ResultSet result = DatabaseFactory.createDatabase()
				
			System.out.println(sql);
			while(result.next()) {
				pl.add(result.getString("pos"));
				
			}
			
		} catch(Exception e) {e.printStackTrace();}
		
		
		
		return pl;
	}

	@Override
	public List<PlayerBean> findPositionByTeamid(PlayerBean param) {
		List<PlayerBean> list  = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "c##oracle" , password = "oracle" ;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stm = conn.createStatement();
			PlayerBean p = new PlayerBean();
			p = param;
			System.out.println("다오" + param.getPlayerName());
			//System.out.println("다오" + p.getPlayerName());
			
			String pos = "'" + param.getPosition() +"'";
			String tid = "'" + param.getTeamId() +"'";
			list = new ArrayList<PlayerBean>();
			
			
			String query = String.format("SELECT PLAYER_NAME name " + 
					"FROM PLAYER " + 
					"WHERE TEAM_ID LIKE %s " + 
					"AND POSITION LIKE %s", tid , pos);
			
			System.out.println(query);
			ResultSet result = stm.executeQuery(query);
			
			

			while(result.next()) {
				param.setPlayerName(result.getString("name"));
				list.add(param);
			}
		
			
			
		} catch(Exception e) { e.printStackTrace();}
		
		return list;
	}

	@Override
	public List<PlayerBean> findByHeightNameTeam(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<PlayerBean>();
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "c##oracle" , password = "oracle" ;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stm = conn.createStatement();
			PlayerBean p = new PlayerBean();
			p = param;
			
			String name = "'" + param.getPlayerName() + "%" +"'";
			String tid = "'" + param.getTeamId() +"'";
			String height = param.getHeight();
			
			String query = String.format("SELECT PLAYER_NAME name , POSITION posi " + 
					"FROM PLAYER " + 
					"WHERE TEAM_ID LIKE %s " + 
					"AND HEIGHT >= %s AND PLAYER_NAME LIKE %S" , tid , height, name );
			
			System.out.println(query);
			ResultSet result = stm.executeQuery(query);
			
			

			while(result.next()) {

				p.setPlayerName(result.getString("name"));
				p.setPosition("posi");

				list.add(p);
				
				
			}
			System.out.println(list.indexOf(0));
		
			
			
		} catch(Exception e) { e.printStackTrace();}
		
		return list;
		
	}

}
