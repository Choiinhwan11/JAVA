package member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.bean.MemberDTO;

public class MemberDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String username = "hr";
    private String password = "hr";

    private static MemberDAO memberDAO = new MemberDAO();
    public static MemberDAO getInstance() {
        return memberDAO;
    }


    public MemberDAO() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getConnection() {
        try {
            conn = DriverManager.getConnection(url,username,password);
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isExistId(String id) {
        boolean exist = false;
        String sql = "select*from member where id=?";

        getConnection();
        try {
            pstmt = conn.prepareStatement(sql);//생성
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();//실행 - ResultSet 리턴

            if(rs.next())exist = true; //레코드가 존재 - 사용 불가능
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(rs != null)rs.close();
                if(pstmt != null)pstmt.close();
                if(conn != null)conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return exist;

    }
    public int write(MemberDTO memberDTO) {
    	int su = 0;
        String sql = "insert into member values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
        getConnection();
        try {
            pstmt = conn.prepareStatement(sql);//생성
            pstmt.setString(1, memberDTO.getName());
            pstmt.setString(2, memberDTO.getId());
            pstmt.setString(3, memberDTO.getPwd());
            pstmt.setString(4, memberDTO.getGender());
            pstmt.setString(5, memberDTO.getEmail1());
            pstmt.setString(6, memberDTO.getEmail2());
            pstmt.setString(7, memberDTO.getTel1());
            pstmt.setString(8, memberDTO.getTel2());
            pstmt.setString(9, memberDTO.getTel3());
            pstmt.setString(10, memberDTO.getZipcode());
            pstmt.setString(11, memberDTO.getAddr1());
            pstmt.setString(12, memberDTO.getAddr2());
            
            su = pstmt.executeUpdate();//실행 - ResultSet 리턴

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return su;
    }
    public int login(String id, String pwd) {
        int loginNum = 0;
        String sql = "select*from member where id=?";
        getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            if(pstmt.executeQuery().next()) loginNum = 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(rs != null)rs.close();
                if(pstmt != null)pstmt.close();
                if(conn != null)conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        sql = "select*from member where id=? and pwd=?";
        getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, pwd);
            if(pstmt.executeQuery().next()) {
            	loginNum = 2;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if(rs != null)rs.close();
                if(pstmt != null)pstmt.close();
                if(conn != null)conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return loginNum;
    }
    public MemberDTO select(String id, String password) {
    	MemberDTO memberDTO = new MemberDTO();
    	 String sql = "select*from member where id=? and PWD=?";
    	 getConnection();
    	 try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
	         pstmt.setString(2, password);
	         rs = pstmt.executeQuery();
	         while(rs.next()) {
	        	
	    		memberDTO.setName(rs.getString("name"));
	    		memberDTO.setId(rs.getString("id"));
	    		memberDTO.setPwd(rs.getString("pwd"));
	    		memberDTO.setGender(rs.getString("gender"));
	    		memberDTO.setEmail1(rs.getString("email1"));
	    		memberDTO.setEmail2(rs.getString("email2"));
	    		memberDTO.setTel1(rs.getString("tel1"));
	    		memberDTO.setTel2(rs.getString("tel2"));
	    		memberDTO.setTel3(rs.getString("tel3"));
	    		memberDTO.setZipcode(rs.getString("zipcode"));
	    		memberDTO.setAddr1(rs.getString("addr1"));
	    		memberDTO.setAddr2(rs.getString("addr2"));
	         }
		} catch (SQLException e) {
			e.printStackTrace();
		}
         return memberDTO;
    }
    public boolean isUpdate(String id, String pwd, MemberDTO newMemberDTO) {
    	boolean isUpdate = false;
    	String sql = "UPDATE MEMBER SET NAME=?, ID=?, PWD=?, GENDER=?, EMAIL1=?, EMAIL2=?, "
                + "TEL1=?, TEL2=?, TEL3=?, ZIPCODE=?, ADDR1=?, ADDR2=? "
                + "WHERE ID=? AND PWD=?";
        getConnection();
        try {
            pstmt = conn.prepareStatement(sql);//생성
            pstmt.setString(1, newMemberDTO.getName());
            pstmt.setString(2, newMemberDTO.getId());
            pstmt.setString(3, newMemberDTO.getPwd());
            pstmt.setString(4, newMemberDTO.getGender());
            pstmt.setString(5, newMemberDTO.getEmail1());
            pstmt.setString(6, newMemberDTO.getEmail2());
            pstmt.setString(7, newMemberDTO.getTel1());
            pstmt.setString(8, newMemberDTO.getTel2());
            pstmt.setString(9, newMemberDTO.getTel3());
            pstmt.setString(10,newMemberDTO.getZipcode());
            pstmt.setString(11,newMemberDTO.getAddr1());
            pstmt.setString(12,newMemberDTO.getAddr2());
            pstmt.setString(13,id);
            pstmt.setString(14,pwd);
            isUpdate = (pstmt.executeUpdate() > 0);//실행 - ResultSet 리턴
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(rs != null)rs.close();
                if(pstmt != null)pstmt.close();
                if(conn != null)conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isUpdate;
    }
}