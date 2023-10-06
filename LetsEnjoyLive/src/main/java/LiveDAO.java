import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.LiveBean;
import bean.LiveDTO;

public class LiveDAO {
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
	public LiveDTO select() {
		Statement stmt = null;
		ResultSet   rs = null;
		LiveDTO ldto = new LiveDTO();
		String sql = "SELECT * FROM live";
		try {
			connect();
			// ステートメントを作成
			stmt = con.createStatement();
			// SQLを実行
			rs = stmt.executeQuery(sql);
			// 検索結果の処理
			while(rs.next()) {
				LiveBean lb = new LiveBean();
				lb.setName (rs.getString("Name"));
				lb.setBand (rs.getString("Band"));
				lb.setPlace(rs.getString("Place"));
				lb.setDate (rs.getDate("Date"));
				ldto.add(lb);
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
		return ldto;
	}
	
	public int insert(String I_Name, String I_Band, String I_Place, java.sql.Date I_Date) {
		String sql = "INSERT INTO live (Name, Band, Place, Date) VALUES ('" + I_Name + "', '" + I_Band + "', '" + I_Place + "', '" + I_Date + "')";
		return executeSql(sql);
	}
	public int update(String U_Name, String U_Band, String U_Place, java.sql.Date U_Date) {
		String sql = "UPDATE live SET Name = '" + U_Name + "', Band = '" + U_Band + "', Place = '" + U_Place + "', Date = '" + U_Date + "' WHERE Name = '" + U_Name + "'";
		return executeSql(sql);
	}
	public int delete(String D_Name) {
		String sql = "DELETE FROM live WHERE Name = '" + D_Name + "'";
		return executeSql(sql);
	}
	
// SQL実行
	public int executeSql(String sql) {
		Statement stmt = null;
		ResultSet   rs = null;
		int result = 0;
		try {
			connect();
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
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
		return result;
	}
	
// 日付から検索
	public LiveDTO searchDate(java.sql.Date S_Date) {
		Statement stmt = null;
		ResultSet rs = null;
		LiveDTO ldto = new LiveDTO();
		String sql = "SELECT * FROM live WHERE Date = '" + S_Date + "'";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				LiveBean lb = new LiveBean();
				lb.setName (rs.getString("Name"));
				lb.setBand (rs.getString("Band"));
				lb.setPlace(rs.getString("Place"));
				lb.setDate (rs.getDate("Date"));
				ldto.add(lb);
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
		return ldto;
	}
	
// バンドから検索
	public LiveDTO searchBand(String S_Band) {
		Statement stmt = null;
		ResultSet rs = null;
		LiveDTO ldto = new LiveDTO();
		String sql = "SELECT * FROM live WHERE Band = '" + S_Band + "'";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				LiveBean lb = new LiveBean();
				lb.setName (rs.getString("Name"));
				lb.setBand (rs.getString("Band"));
				lb.setPlace(rs.getString("Place"));
				lb.setDate (rs.getDate("Date"));
				ldto.add(lb);
			}
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
		return ldto;
	}

//　会場から検索
	public LiveDTO searchPlace(String S_Place) {
		Statement stmt = null;
		ResultSet rs = null;
		LiveDTO ldto = new LiveDTO();
		String sql = "SELECT * FROM live WHERE Place = '" + S_Place + "'";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				LiveBean lb = new LiveBean();
				lb.setName (rs.getString("Name"));
				lb.setBand (rs.getString("Band"));
				lb.setPlace(rs.getString("Place"));
				lb.setDate (rs.getDate("Date"));
				ldto.add(lb);
			}
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
		return ldto;
	}
		
	public void disconnect() {
		try {
			if (con != null) con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
























