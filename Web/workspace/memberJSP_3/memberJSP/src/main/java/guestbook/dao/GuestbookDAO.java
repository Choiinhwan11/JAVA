package guestbook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import guestbook.bean.GuestbookDTO;



public class GuestbookDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataSource ds;
	
//	private String driver = "oracle.jdbc.driver.OracleDriver";
//	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private String username = "c##java";
//	private String password = "oracle";s
	
	private static GuestbookDAO  guestbookDAO = new GuestbookDAO();
	
	public static GuestbookDAO getInstance(){
		return guestbookDAO;
	}
	
	public GuestbookDAO() {
//		try {
//			Class.forName(driver);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		Context context;
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
//	public void getConnection() {
//		try {
//			conn = DriverManager.getConnection(url,username,password);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	public boolean isWrite(GuestbookDTO guestbookDTO) {
		boolean isWrite = false;
		String sql = "INSERT INTO GUESTBOOK VALUES(seq_guestbook.NEXTVAL,?, ?, ?, ?, ?, SYSDATE)";
//		getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, guestbookDTO.getName());
			pstmt.setString(2, guestbookDTO.getEmail());
			pstmt.setString(3, guestbookDTO.getHomepage());
			pstmt.setString(4, guestbookDTO.getSubject());
			pstmt.setString(5, guestbookDTO.getContent());
			isWrite = (pstmt.executeUpdate() > 0);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isWrite;
	}
	public List<GuestbookDTO> guestbookList(int startIndex, int endIndex){
		List<GuestbookDTO> list = new ArrayList<>();
		String sql = """
				select seq, name, email, homepage, subject, content, logtime from (
				select rownum rs, tt.* from(
				select * from guestbook order by seq desc)tt)
				where rs between ? and ?
				""";
//		getConnection();
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startIndex);
			pstmt.setInt(2, endIndex);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				GuestbookDTO guestbookDTO = new GuestbookDTO();
				guestbookDTO.setSeq(rs.getInt("seq"));
				guestbookDTO.setName(rs.getString("name"));
				guestbookDTO.setEmail(rs.getString("email"));
				guestbookDTO.setHomepage(rs.getString("homepage"));
				guestbookDTO.setSubject(rs.getString("subject"));
				guestbookDTO.setContent(rs.getString("content"));
				guestbookDTO.setLogtime(rs.getDate("logtime"));
				list.add(guestbookDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			list= null;
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public int totalA() {
		int totalA = 0;
		String sql = """
				select count(*) tot from guestbook
				""";
//		getConnection();
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			totalA = rs.getInt("tot");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return totalA;
	}
}
