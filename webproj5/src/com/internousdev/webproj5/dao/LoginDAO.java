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


		//users����user_name=? and password=?�������ɒ��o��������sql�ɑ������
		//?�̒�������
		String sql = "select * from users where user_name=? and password=?";
		try {

			//SQL�̕ϊ�������Ԃɂ���
			PreparedStatement ps = con.prepareStatement(sql);

			//�H�ɓ��͒l��������@1�ڂ́H��username 2�ڂ�?��password���Z�b�g����
			ps.setString(1, username);
			ps.setString(2, password);

			//���ۂɎ��s����
			ResultSet rs = ps.executeQuery();


			//���̍s���Ȃ��Ȃ�܂ŌJ��Ԃ�
			//user_name ��password����Ƃ��Ă�������dto�ɃZ�b�g����
			while (rs.next()) {
				LoginDTO dto=new LoginDTO();
				dto.setUsername(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				loginDTOList.add(dto);
			}

			
			//����size��0�ȉ��Ȃ��LoginDTO��dto
			//�����Ȃ��ꍇ�͊Y���Ȃ�
			if(loginDTOList.size()<=0){
				LoginDTO dto=new LoginDTO();
				dto.setUsername("�Y���Ȃ�");
				dto.setPassword("�Y���Ȃ�");
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