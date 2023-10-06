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

@WebServlet("/showlive")
public class ShowLiveServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
		
		// 入力値(Area)を取得
		req.setCharacterEncoding("utf-8");
		String S_Band  = req.getParameter("Band");
		String S_Place = req.getParameter("Place");
		java.sql.Date S_Date;
		
		// PlaceDAOオブジェクトを生成
		LiveDAO ldao = new LiveDAO();
		LiveDTO ldto;
		
		// リクエストスコープにDTOを格納
		if (S_Band != null) {
			ldto = ldao.searchBand(S_Band);
			req.setAttribute("ldtoB", ldto);
		}
		if (S_Place != null) {
			ldto = ldao.searchPlace(S_Place);
			req.setAttribute("ldtoP", ldto);
		}
		if(req.getParameter("Date") != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			try {
				String inDate = req.getParameter("Date");
				java.util.Date utilDate = dateFormat.parse(inDate);
				S_Date = new java.sql.Date(utilDate.getTime());
				ldto = ldao.searchDate(S_Date);
				req.setAttribute("ldtoD", ldto);
			} catch(ParseException e) {
				e.printStackTrace();
			}
		}
		
		// JSPにフォワード
		RequestDispatcher rd = req.getRequestDispatcher("/live.jsp");
		rd.forward(req, res);

	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
		
		doPost(req, res);
	}
}
