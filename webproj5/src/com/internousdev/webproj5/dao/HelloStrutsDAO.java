package com.internousdev.webproj5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj5.dto.HelloStrutsDTO;
import com.internousdev.webproj5.util.DBConnector;


public class HelloStrutsDAO {


	// HelloStrutsDTO�v�f���C���X�^���X������HelloStrutsDTO�̏��Ԃ�ێ�����
	List<HelloStrutsDTO> helloStrutsDTOList = new ArrayList<HelloStrutsDTO>();



		/*ListHelloStrutsDTO ������ė�������List�����ď��̏��Ԃ�ێ�
		 * DBConnector��db�փC���X�^���X���i�f�[�^�x�[�X�Ɛڑ����邽�߂Ɂj
		 * db.Connection�i�R�l�N�V�����j���擾����SQL�������s
		 */
	public List<HelloStrutsDTO> select() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		//users�����������Ă���
		String sql = "select * from users";


		/*�@sql����Ƃ��Ă���users�̏��������Ƀf�[�^�x�[�X�ڑ���sql�������s
		 *�� PreparedStatement�͂��łɃR���p�C�����s���Ă��邽�ߏ���������
		 *�܂�PreparedStatement���g�p������SQL�������s����Ɗo����
		 *���s���ʂ��i�[����ResultSet rs�I�u�W�F�N�g�ɕԂ�
		 */
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();


		/*�@���s����rs�@���̍s�֐i��ŌJ��Ԃ�
		 * ���s����user_id user_name password���Ƃ��Ă��ăZ�b�g����
		 * helloStrutsDTOList��dto�ɃZ�b�g��������ǉ�
		 */
			while(rs.next()) {
				HelloStrutsDTO dto=new HelloStrutsDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setResult("MySQL �Ɛڑ��ł��܂��B");
				helloStrutsDTOList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		/*�������I������\��������
		 * user_id user_name password�̏����Ƃ��Ă���Ȃ������ꍇ
		 * �G���[������A�\��
		 */
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return helloStrutsDTOList;

	}

}