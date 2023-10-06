import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ReviewDTO;

@WebServlet("/reviewForm")
public class EditReviewServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		req.setCharacterEncoding("utf-8");
		
		// BandDAOオブジェクトを生成
		ReviewDAO rdao = new ReviewDAO();
		
		String S_Name = req.getParameter("E_Name");
		String S_Band = req.getParameter("E_Band");
		String S_Song = req.getParameter("E_Song");
		String S_Text = req.getParameter("E_Text");
		rdao.insert(S_Name, S_Band, S_Song, S_Text);
		
		// 全件検索
		ReviewDTO rdto = rdao.select();
		
		// リクエストスコープにDTOを格納
		req.setAttribute("rdtoALL", rdto);
		
		// JSPにフォワード
		RequestDispatcher rd = req.getRequestDispatcher("/review.jsp");
		rd.forward(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
			doPost(req, res);
	}
}