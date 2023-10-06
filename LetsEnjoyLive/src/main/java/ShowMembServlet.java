import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.MembDTO;

@WebServlet("/showmemb")
public class ShowMembServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
		
		// 入力値(band)を取得
		req.setCharacterEncoding("utf-8");
		String S_Band = req.getParameter("Band");
		
		// MembDAOオブジェクトを生成
		MembDAO mdao = new MembDAO();
		MembDTO mdto = mdao.search(S_Band);
		
		// リクエストスコープにDTOを格納
		req.setAttribute("mdto", mdto);
		
		// JSPにフォワード
		RequestDispatcher rd = req.getRequestDispatcher("/band.jsp");
		rd.forward(req, res);

	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
		
		doPost(req, res);
	}
}
