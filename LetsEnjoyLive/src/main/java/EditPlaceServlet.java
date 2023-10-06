import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PlaceDTO;

@WebServlet("/editPlace")
public class EditPlaceServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		String msg = "全ての会場の情報を表示します";
		// 入力値(btn)を取得
		req.setCharacterEncoding("utf-8");
		String btn = req.getParameter("btn");
		
		// PlaceDAOオブジェクトを生成
		PlaceDAO pdao = new PlaceDAO();
		
		// 押下ボタンによる分岐処理
		if (btn.equals("追加")) {
			String S_Name = req.getParameter("E_Name");
			String S_Area = req.getParameter("E_Area");
			int S_Capa = Integer.parseInt(req.getParameter("E_Capa"));
			String S_Stat = req.getParameter("E_Stat");
			pdao.insert(S_Name, S_Area, S_Capa, S_Stat);
			msg = S_Name + "を追加しました";
		} else if (btn.equals("修正")) {
			String S_Name = req.getParameter("E_Name");
			String S_Area = req.getParameter("E_Area");
			int S_Capa = Integer.parseInt(req.getParameter("E_Capa"));
			String S_Stat = req.getParameter("E_Stat");
			pdao.update(S_Name, S_Area, S_Capa, S_Stat);
			msg = S_Name + "を修正しました";
		} else if (btn.equals("削除")) {
			String S_Name = req.getParameter("E_Name");
			pdao.delete(S_Name);
			msg = S_Name + "を削除しました";
		}
		
		// 全件検索
		PlaceDTO pdto = pdao.select();
		
		// リクエストスコープにDTOとmsgを格納
		req.setAttribute("pdto", pdto);
		req.setAttribute("msg", msg);
		
		// JSPにフォワード
		RequestDispatcher rd = req.getRequestDispatcher("/edit/editplace.jsp");
		rd.forward(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
			doPost(req, res);
	}
}