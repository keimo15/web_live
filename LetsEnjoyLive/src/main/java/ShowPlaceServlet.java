import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PlaceDTO;

@WebServlet("/showplace")
public class ShowPlaceServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
		
		// 入力値(Area)を取得
		req.setCharacterEncoding("utf-8");
		String S_Area = req.getParameter("Area");
		String S_Name = req.getParameter("Name");
		
		// PlaceDAOオブジェクトを生成
		PlaceDAO pdao = new PlaceDAO();
		PlaceDTO pdto;
		
		// リクエストスコープにDTOを格納
		if (S_Area != null) {
			pdto = pdao.searchArea(S_Area);
			req.setAttribute("pdtoA", pdto);
		}
		if (S_Name != null) {
			pdto = pdao.searchName(S_Name);
			req.setAttribute("pdtoN", pdto);
		}
		
		// JSPにフォワード
		RequestDispatcher rd = req.getRequestDispatcher("/place.jsp");
		rd.forward(req, res);

	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
		
		doPost(req, res);
	}
}
