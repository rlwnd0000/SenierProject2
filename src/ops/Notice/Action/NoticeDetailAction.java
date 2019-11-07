package ops.Notice.Action;

import static common.ConUtilDAO.close;
import static common.ConUtilDAO.getConnection;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Action;
import common.ActionForward;
import ops.Notice.Beans.Notice;


public class NoticeDetailAction implements Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int n_no = Integer.parseInt(request.getParameter("n_no"));
			
		Notice detail = null;
		Connection con = getConnection();
		NoticeData nd = NoticeData.getInstance();
		nd.setConnection(con);
		detail = nd.selectNoticeDetail(n_no);
		close(con);
		
		request.setAttribute("detail", detail);
		ActionForward forward = new ActionForward("noticeDetail.jsp",false);
		return forward;
}
}
