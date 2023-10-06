import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.MembDTO;

@WebServlet("/editMemb")
public class EditMembServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		String msg = "全てのメンバーの情報を表示します";
		// 入力値(btn)を取得
		req.setCharacterEncoding("utf-8");
		String btn = req.getParameter("btn");
		
		// MembDAOオブジェクトを生成
		MembDAO mdao = new MembDAO();
		
		// 押下ボタンによる分岐処理
		if (btn.equals("追加")) {
			String S_Name = req.getParameter("E_Name");
			String S_Band = req.getParameter("E_Band");
			String S_Part = req.getParameter("E_Part");
			mdao.insert(S_Name, S_Band, S_Part);
			msg = S_Name + "を追加しました";
		} else if (btn.equals("修正")) {
			String S_Name = req.getParameter("E_Name");
			String S_Band = req.getParameter("E_Band");
			String S_Part = req.getParameter("E_Part");
			mdao.update(S_Name, S_Band, S_Part);
			msg = S_Name + "を修正しました";
		} else if (btn.equals("削除")) {
			String S_Name = req.getParameter("E_Name");
			mdao.delete(S_Name);
			msg = S_Name + "を削除しました";
		}
		
		// 全件検索
		MembDTO mdto = mdao.select();
		
		// リクエストスコープにDTOとmsgを格納
		req.setAttribute("mdto", mdto);
		req.setAttribute("msg", msg);
		
		// JSPにフォワード
		RequestDispatcher rd = req.getRequestDispatcher("/edit/editmemb.jsp");
		rd.forward(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
			doPost(req, res);
	}
}