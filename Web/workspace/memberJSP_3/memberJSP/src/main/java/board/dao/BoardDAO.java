package board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import board.bean.BoardDTO;

public class BoardDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataSource ds;
	
//	private String driver = "oracle.jdbc.driver.OracleDriver";
//	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private String username = "c##java";
//	private String password = "oracle";
	
	
	private static BoardDAO  boardDAO = new BoardDAO();
	
	public static BoardDAO getInstance(){
		return boardDAO;
	}
	
	public BoardDAO() {
//		try {
//			Class.forName(driver);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		Context context;
		try {
			context = new InitialContext();
			System.out.println("1111");
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
	public boolean isUpdated(BoardDTO boardDTO) {
		String sql = "INSERT INTO BOARD VALUES(SEQ_BOARD.NEXTVAL, 0, 0, 0, 0, 0,SEQ_BOARD.NEXTVAL , ?, ?, ?, ?, ?,  SYSDATE)";
//		getConnection();
		boolean isUpdated = false;
		try {
			conn = ds.getConnection(); 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardDTO.getId());
			pstmt.setString(2, boardDTO.getName());
			pstmt.setString(3, boardDTO.getEmail());
			pstmt.setString(4, boardDTO.getSubject());
			pstmt.setString(5, boardDTO.getContent());
			isUpdated = (pstmt.executeUpdate()>0); // 개수 리턴
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if( pstmt != null ) pstmt.close();
				if( conn != null ) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isUpdated;
	}
	public boolean boardWrite(Map<String, String> map) {
		boolean isWrite = false;
		String sql = """
				INSERT INTO BOARD(seq,id,name,email,subject,content,ref)
				VALUES(SEQ_BOARD.NEXTVAL, ?, ?, ?, ?, ?,SEQ_BOARD.NEXTVAL)
				""";
//		getConnection();
		try {
			conn = ds.getConnection(); 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, map.get("id"));
			pstmt.setString(2, map.get("name"));
			pstmt.setString(3, map.get("email"));
			pstmt.setString(4, map.get("subject"));
			pstmt.setString(5, map.get("content"));
			isWrite = (pstmt.executeUpdate() > 0);//실행 개수 리턴
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return isWrite;
	}
	public List<BoardDTO> boardList(){
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		String sql = "select * from board";
//		getConnection();
		try {
			conn = ds.getConnection(); 
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //실행 - ResultSet 리턴
			while(rs.next()) {
				BoardDTO boardDTO = new BoardDTO();
				boardDTO.setSeq(rs.getInt("seq"));
				boardDTO.setId(rs.getString("id"));
				boardDTO.setName(rs.getString("name"));
				boardDTO.setEmail(rs.getString("email"));
				boardDTO.setSubject(rs.getString("subject"));
				boardDTO.setContent(rs.getString("content"));
				boardDTO.setLev(rs.getInt("lev"));
				boardDTO.setStep(rs.getInt("step"));
				boardDTO.setPseq(rs.getInt("pseq"));
				boardDTO.setReply(rs.getInt("reply"));
				boardDTO.setHit(rs.getInt("hit"));
				boardDTO.setLogtime(rs.getDate("logtime"));
				
				list.add(boardDTO);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			list = null;
			
		}finally {
			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<BoardDTO> boardList(int startNum, int endNum){
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		String sql = """
				select * from(
				select rownum rn, tt.* from (
				select * from board order by ref desc, step asc) tt )
				where rn >= ? and rn <= ?
				""";
//		getConnection();
		try {
			conn = ds.getConnection(); 
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startNum);
			pstmt.setInt(2, endNum);
			
			rs = pstmt.executeQuery(); //실행 - ResultSet 리턴
			while(rs.next()) {
				BoardDTO boardDTO = new BoardDTO();
				boardDTO.setSeq(rs.getInt("seq"));
				boardDTO.setId(rs.getString("id"));
				boardDTO.setName(rs.getString("name"));
				boardDTO.setEmail(rs.getString("email"));
				boardDTO.setSubject(rs.getString("subject"));
				boardDTO.setContent(rs.getString("content"));
				boardDTO.setLev(rs.getInt("lev"));
				boardDTO.setStep(rs.getInt("step"));
				boardDTO.setPseq(rs.getInt("pseq"));
				boardDTO.setReply(rs.getInt("reply"));
				boardDTO.setHit(rs.getInt("hit"));
				boardDTO.setLogtime(rs.getDate("logtime"));
				list.add(boardDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			list = null;
		}finally {
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
	public int getTotalA(){
		int totalA = 0 ;
		String sql = """
				select count(*) tot from board
				""";
//		getConnection();
		try {
			conn = ds.getConnection(); 
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			totalA = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return totalA;
	}
}

