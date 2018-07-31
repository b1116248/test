package com.internousdev.webproj5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj5.dto.LoginDTO;
import com.internousdev.webproj5.util.DBConnector;


public class LoginDAO {
	public String username;
	public String password;


	public List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	public List<LoginDTO> select(String username,String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();


		//usersからuser_name=? and password=?を条件に抽出した情報をsqlに代入する
		//?の中が未定
		String sql = "select * from users where user_name=? and password=?";
		try {

			//SQLの変換準備状態にする
			PreparedStatement ps = con.prepareStatement(sql);

			//？に入力値を代入する　1つ目の？でusername 2つ目の?でpasswordをセットする
			ps.setString(1, username);
			ps.setString(2, password);

			//実際に実行する
			ResultSet rs = ps.executeQuery();


			//次の行がなくなるまで繰り返す
			//user_name とpasswordからとってきた情報をdtoにセットする
			while (rs.next()) {
				LoginDTO dto=new LoginDTO();
				dto.setUsername(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				loginDTOList.add(dto);
			}

			
			//もしsizeが0以下ならばLoginDTOをdto
			//何もない場合は該当なし
			if(loginDTOList.size()<=0){
				LoginDTO dto=new LoginDTO();
				dto.setUsername("該当なし");
				dto.setPassword("該当なし");
				loginDTOList.add(dto);
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loginDTOList;
	}
}
