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
//공고, 1:1게시판, 공지사항, Q&A 컨트롤러
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
		
		if(command.equals("/noticeWriteForm.no")) { //공고작성폼
				forward = new ActionForward("./NoticeWrite.jsp",true);	
		}
		else if(command.equals("/noticeWrite.no")) { //공고작성
			action = new NoticeWriteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/noticeList.no")) { //공고리스트
			action = new NoticeListAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/noticeDetail.no")) { //공고조회
			action = new NoticeDetailAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/noticeModifyForm.no")) { //공고수정폼
			action = new NoticeModifyAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/noticeModifyPro.no")) { //공고수정
			action = new NoticeModifyProAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/noticeDelete.no")) { //공고삭제
			action = new NoticeDeleteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/announcementWriteForm.no")) { //공지사항폼
			forward = new ActionForward("./announcementWrite.jsp",true);
		}
		else if(command.equals("/announcementWrite.no")) { //공지사항작성
			action = new AnnouncementWriteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/announcementList.no")) { //공지사항 리스트
			action = new AnnouncementListAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/announcementDetail.no")) { //공지사항 조회
			action = new AnnouncementDetailAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/announcementModify.no")) { //공지사항수정폼
			action = new AnnouncementModifyAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/announcementModifyPro.no")) { //공지사항수정
			action = new AnnouncementModifyProAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/announcementDelete.no")) { //공지사항삭제
			action = new AnnouncementDeleteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionWriteForm.no")) { //Q&A작성폼
			forward = new ActionForward("./questionWrite.jsp",true);
		}
		else if(command.equals("/questionWrite.no")) { //Q&A작성
			action = new QuestionWriteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionList.no")) { //Q&A 리스트
			action = new QuestionListAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionDetail.no")) { //Q&A 조회
			action = new QuestionDetailAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionModify.no")) { //Q&A수정폼
			action = new QuestionModifyAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionModifyPro.no")) { //Q&A수정
			action = new QuestionModifyProAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/questionDelete.no")) { //Q&A삭제
			action = new QuestionDeleteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardWriteForm.no")) { //1:1게시판 작성폼
			forward = new ActionForward("./boardWrite.jsp",true);
		}
		else if(command.equals("/boardWrite.no")) { //1:1게시판 작성
			action = new BoardWriteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardList.no")) { //1:1게시판 리스트
			action = new BoardListAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardDetail.no")) { //1:1게시판 조회
			action = new BoardDetailAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardModify.no")) { //1:1게시판 수정폼
			action = new BoardModifyAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardModifyPro.no")) { //1:1게시판수정
			action = new BoardModifyProAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardDelete.no")) { //1:1게시판 삭제
			action = new BoardDeleteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		else if(command.equals("/boardReply.no")) { //1:1게시판 답글달기
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
