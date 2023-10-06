import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.MembBean;
import bean.MembDTO;

public class MembDAO {
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
	public MembDTO select() {
		Statement stmt = null;
		ResultSet   rs = null;
		MembDTO mdto = new MembDTO();
		String sql = "SELECT * FROM member";
		try {
			connect();
			// ステートメントを作成
			stmt = con.createStatement();
			// SQLを実行
			rs = stmt.executeQuery(sql);
			// 検索結果の処理
			while(rs.next()) {
				MembBean mb = new MembBean();
				mb.setName(rs.getString("Name"));
				mb.setBand(rs.getString("Band"));
				mb.setPart(rs.getString("Part"));
				mdto.add(mb);
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
		return mdto;
	}
	
	public int insert(String I_Name, String I_Band, String I_Part) {
		String sql = "INSERT INTO member (Name, Band, Part) VALUES ('" + I_Name + "', '" + I_Band + "', '" + I_Part + "')";
		return executeSql(sql);
	}
	public int update(String U_Name, String U_Band, String U_Part) {
		String sql = "UPDATE member SET Name = '" + U_Name + "', Band = '" + U_Band + "', Part = '" + U_Part + "' WHERE Name = '" + U_Name + "'";
		return executeSql(sql);
	}
	public int delete(String D_Name) {
		String sql = "DELETE FROM member WHERE Name = '" + D_Name + "'";
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
	
// バンドメンバー検索
	public MembDTO search(String S_Band) {
		Statement stmt = null;
		ResultSet rs = null;
		MembDTO mdto = new MembDTO();
		String sql = "SELECT * FROM member WHERE Band = '" + S_Band + "'";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MembBean mb = new MembBean();
				mb.setName(rs.getString("Name"));
				mb.setBand(rs.getString("Band"));
				mb.setPart(rs.getString("Part"));
				mdto.add(mb);
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
		return mdto;
	}
	
	public void disconnect() {
		try {
			if (con != null) con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
























