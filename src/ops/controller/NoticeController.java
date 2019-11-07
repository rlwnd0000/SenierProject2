package ops.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Action;
import common.ActionForward;
import ops.Notice.Action.NoticeDeleteAction;
import ops.Notice.Action.NoticeDetailAction;
import ops.Notice.Action.NoticeListAction;
import ops.Notice.Action.NoticeModifyAction;
import ops.Notice.Action.NoticeModifyProAction;
import ops.Notice.Action.NoticeWriteAction;
import ops.Question.Action.QuestionDeleteAction;
import ops.Question.Action.QuestionDetailAction;
import ops.Question.Action.QuestionListAction;
import ops.Question.Action.QuestionModifyAction;
import ops.Question.Action.QuestionModifyProAction;
import ops.Question.Action.QuestionWriteAction;
import ops.announcement.Action.AnnouncementDeleteAction;
import ops.announcement.Action.AnnouncementDetailAction;
import ops.announcement.Action.AnnouncementListAction;
import ops.announcement.Action.AnnouncementModifyAction;
import ops.announcement.Action.AnnouncementModifyProAction;
import ops.announcement.Action.AnnouncementWriteAction;
import ops.board.Action.BoardDeleteAction;
import ops.board.Action.BoardDetailAction;
import ops.board.Action.BoardListAction;
import ops.board.Action.BoardModifyAction;
import ops.board.Action.BoardModifyProAction;
import ops.board.Action.BoardReplyAction;
import ops.board.Action.BoardWriteAction;

/**
 * Servlet implementation class NoticeController
 */
@WebServlet("*.no")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		Action action = null;
		ActionForward forward = null;
		
		if(command.equals("/noticeWriteForm.no")) {
				forward = new ActionForward("./NoticeWrite.jsp",true);	
		}
		else if(command.equals("/noticeWrite.no")) {
			action = new NoticeWriteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/noticeList.no")) {
			action = new NoticeListAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/noticeDetail.no")) {
			action = new NoticeDetailAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/noticeModifyForm.no")) {
			action = new NoticeModifyAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/noticeModifyPro.no")) {
			action = new NoticeModifyProAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/noticeDelete.no")) {
			action = new NoticeDeleteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/announcementWriteForm.no")) {
			forward = new ActionForward("./announcementWrite.jsp",true);
		}
		else if(command.equals("/announcementWrite.no")) {
			action = new AnnouncementWriteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/announcementList.no")) {
			action = new AnnouncementListAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/announcementDetail.no")) {
			action = new AnnouncementDetailAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/announcementModify.no")) {
			action = new AnnouncementModifyAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/announcementModifyPro.no")) {
			action = new AnnouncementModifyProAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/announcementDelete.no")) {
			action = new AnnouncementDeleteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionWriteForm.no")) {
			forward = new ActionForward("./questionWrite.jsp",true);
		}
		else if(command.equals("/questionWrite.no")) {
			action = new QuestionWriteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionList.no")) {
			action = new QuestionListAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionDetail.no")) {
			action = new QuestionDetailAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionModify.no")) {
			action = new QuestionModifyAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionModifyPro.no")) {
			action = new QuestionModifyProAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionDelete.no")) {
			action = new QuestionDeleteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardWriteForm.no")) {
			forward = new ActionForward("./boardWrite.jsp",true);
		}
		else if(command.equals("/boardWrite.no")) {
			action = new BoardWriteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardList.no")) {
			action = new BoardListAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardDetail.no")) {
			action = new BoardDetailAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardModify.no")) {
			action = new BoardModifyAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardModifyPro.no")) {
			action = new BoardModifyProAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardDelete.no")) {
			action = new BoardDeleteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardReply.no")) {
			action = new BoardReplyAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else {	
		}
		
		if(forward!=null) {
			if(forward.isRedirect()) { 
				response.sendRedirect(forward.getPath());
			} else { 
				RequestDispatcher dp = request.getRequestDispatcher(forward.getPath());
				dp.forward(request, response);
			}
		}
	}

}
