import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.PlaceBean;
import bean.PlaceDTO;

public class PlaceDAO {
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
	public PlaceDTO select() {
		Statement stmt = null;
		ResultSet   rs = null;
		PlaceDTO pdto = new PlaceDTO();
		String sql = "SELECT * FROM place";
		try {
			connect();
			// ステートメントを作成
			stmt = con.createStatement();
			// SQLを実行
			rs = stmt.executeQuery(sql);
			// 検索結果の処理
			while(rs.next()) {
				PlaceBean pb = new PlaceBean();
				pb.setName(rs.getString("Name"));
				pb.setArea(rs.getString("Area"));
				pb.setCapa(rs.getInt("Capa"));
				pb.setStat(rs.getString("Stat"));
				pdto.add(pb);
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
		return pdto;
	}
	
	public int insert(String I_Name, String I_Area, int I_Capa, String I_Stat) {
		String sql = "INSERT INTO place (Name, Area, Capa, Stat) VALUES ('" + I_Name + "', '" + I_Area + "', " + I_Capa + ", '" + I_Stat + "')";
		return executeSql(sql);
	}
	public int update(String U_Name, String U_Area, int U_Capa, String U_Stat) {
		String sql = "UPDATE place SET Name = '" + U_Name + "', Area = '" + U_Area + "', Capa = " + U_Capa + ", Stat = '" + U_Stat + "' WHERE Name = '" + U_Name + "'";
		return executeSql(sql);
	}
	public int delete(String D_Name) {
		String sql = "DELETE FROM place WHERE Name = '" + D_Name + "'";
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
	
// 都道府県検索
	public PlaceDTO searchArea(String S_Area) {
		Statement stmt = null;
		ResultSet rs = null;
		PlaceDTO pdto = new PlaceDTO();
		String sql = "SELECT * FROM place WHERE Area = '" + S_Area + "'";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				PlaceBean pb = new PlaceBean();
				pb.setName(rs.getString("Name"));
				pb.setArea(rs.getString("Area"));
				pb.setCapa(rs.getInt("Capa"));
				pb.setStat(rs.getString("Stat"));
				pdto.add(pb);
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
		return pdto;
	}
	
// 会場検索
		public PlaceDTO searchName(String S_Name) {
			Statement stmt = null;
			ResultSet rs = null;
			PlaceDTO pdto = new PlaceDTO();
			String sql = "SELECT * FROM place WHERE Name = '" + S_Name + "'";
			try {
				connect();
				stmt = con.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					PlaceBean pb = new PlaceBean();
					pb.setName(rs.getString("Name"));
					pb.setArea(rs.getString("Area"));
					pb.setCapa(rs.getInt("Capa"));
					pb.setStat(rs.getString("Stat"));
					pdto.add(pb);
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
			return pdto;
		}
	
	public void disconnect() {
		try {
			if (con != null) con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
























