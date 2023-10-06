import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BandDTO;

@WebServlet("/editBand")
public class EditBandServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{

		String msg = "全てのバンドの情報を表示します";
		req.setCharacterEncoding("utf-8");
		String btn = req.getParameter("btn");

		// BandDAOオブジェクトを生成
		BandDAO bdao = new BandDAO();

		// 押下ボタンによる分岐処理
		if (btn.equals("追加")) {
			String S_Band = req.getParameter("E_Band");
			int S_Debut = Integer.parseInt(req.getParameter("E_Debut"));
			String S_Song = req.getParameter("E_Song");
			bdao.insert(S_Band, S_Debut, S_Song);
			msg = S_Band + "を追加しました";
		} else if (btn.equals("修正")) {
			String S_Band = req.getParameter("E_Band");
			int S_Debut = Integer.parseInt(req.getParameter("E_Debut"));
			String S_Song = req.getParameter("E_Song");
			bdao.update(S_Band, S_Debut, S_Song);
			msg = S_Band + "を修正しました";
		} else if (btn.equals("削除")) {
			String S_Band = req.getParameter("E_Band");
			bdao.delete(S_Band);
			msg = S_Band + "を削除しました";
		}

		// 全件検索
		BandDTO bdto = bdao.select();

		// リクエストスコープにDTOとmsgを格納
		req.setAttribute("bdto", bdto);
		req.setAttribute("msg", msg);

		// JSPにフォワード
		RequestDispatcher rd = req.getRequestDispatcher("/edit/editband.jsp");
		rd.forward(req, res);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
			doPost(req, res);
	}
}