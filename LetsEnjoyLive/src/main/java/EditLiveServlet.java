import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LiveDTO;

@WebServlet("/editLive")
public class EditLiveServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		String msg = "全ての会場の情報を表示します";
		// 入力値(btn)を取得
		req.setCharacterEncoding("utf-8");
		String btn = req.getParameter("btn");
		
		// LiveDAOオブジェクトを生成
		LiveDAO ldao = new LiveDAO();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		// 押下ボタンによる分岐処理
		if (btn.equals("追加")) {
			String S_Name  = req.getParameter("E_Name");
			String S_Band  = req.getParameter("E_Band");
			String S_Place = req.getParameter("E_Place");
			java.sql.Date S_Date = null;
			try {
				String inDate = req.getParameter("E_Date");
				java.util.Date utilDate = dateFormat.parse(inDate);
				S_Date = new java.sql.Date(utilDate.getTime());
			} catch(ParseException e) {
				e.printStackTrace();
			}
			if (S_Date != null) {
				ldao.insert(S_Name, S_Band, S_Place, S_Date);
				msg = S_Name + S_Band + S_Place + S_Date +"を追加しました";
			}
		} else if (btn.equals("修正")) {
			String S_Name  = req.getParameter("E_Name");
			String S_Band  = req.getParameter("E_Band");
			String S_Place = req.getParameter("E_Place");
			java.sql.Date S_Date = null;
			try {
				String inDate = req.getParameter("E_Date");
				java.util.Date utilDate = dateFormat.parse(inDate);
				S_Date = new java.sql.Date(utilDate.getTime());
			} catch(ParseException e) {
				e.printStackTrace();
			}
			if(S_Date != null) {
				ldao.update(S_Name, S_Band, S_Place, S_Date);
				msg = S_Name + "を修正しました";
			}
		} else if (btn.equals("削除")) {
			String S_Name = req.getParameter("E_Name");
			ldao.delete(S_Name);
			msg = S_Name + "を削除しました";
		}
		
		// 全件検索
		LiveDTO ldto = ldao.select();
		
		// リクエストスコープにDTOとmsgを格納
		req.setAttribute("ldto", ldto);
		req.setAttribute("msg", msg);
		
		// JSPにフォワード
		RequestDispatcher rd = req.getRequestDispatcher("/edit/editlive.jsp");
		rd.forward(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
			doPost(req, res);
	}
}