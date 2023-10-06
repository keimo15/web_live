import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.ReviewBean;
import bean.ReviewDTO;

public class ReviewDAO {
	private final String URL  = "jdbc:mysql://localhost:3306/web_live?characterEncoding=UTF-8";
	private final String USER = "root";
	private final String PASS = "pass";
	private Connection con = null;
	
// DBに接続
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PASS);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
// 全件検索
	public ReviewDTO select() {
		Statement stmt = null;
		ResultSet   rs = null;
		ReviewDTO rdto = new ReviewDTO();
		String sql = "SELECT * FROM review";
		try {
			connect();
			// ステートメントを作成
			stmt = con.createStatement();
			// SQLを実行
			rs = stmt.executeQuery(sql);
			// 検索結果の処理
			while(rs.next()) {
				ReviewBean rb = new ReviewBean();
				rb.setName(rs.getString("Name"));
				rb.setBand(rs.getString("Band"));
				rb.setSong(rs.getString("Song"));
				rb.setText(rs.getString("Text"));
				rdto.add(rb);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if   (rs != null)   rs.close();
				if (stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		disconnect();
		return rdto;
	}
	
	public int insert(String I_Name, String I_Band, String I_Song, String I_Text) {
		String sql = "INSERT INTO review (Name, Band, Song, Text) VALUES ('" + I_Name + "', '" + I_Band + "', '" + I_Song + "', '" + I_Text + "')";
		return executeSql(sql);
	}
	
// SQL実行
	public int executeSql(String sql) {
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			connect();
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if   (rs != null) rs.close();
				if (stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		disconnect();
		return result;
	}
	
// バンド検索
	public ReviewDTO search(String S_Band) {
		Statement stmt = null;
		ResultSet rs = null;
		ReviewDTO rdto = new ReviewDTO();
		String sql = "SELECT * FROM review WHERE Band LIKE '%" + S_Band + "%'";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				ReviewBean rb = new ReviewBean();
				rb.setName(rs.getString("Name"));
				rb.setBand(rs.getString("Band"));
				rb.setSong(rs.getString("Song"));
				rb.setText(rs.getString("Text"));
				rdto.add(rb);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		disconnect();
		return rdto;
	}
	
	public void disconnect() {
		try {
			if (con != null) con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
























