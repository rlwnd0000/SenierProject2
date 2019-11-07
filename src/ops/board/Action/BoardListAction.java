package ops.board.Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Action;
import common.ActionForward;
import ops.board.Beans.Board;

public class BoardListAction implements Action{
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ActionForward forward = null;
		BoardListService bls = new BoardListService();
   		ArrayList<Board> boardList = bls.getBoardList();
   		request.setAttribute("boardList", boardList);
   		forward = new ActionForward("./boardList.jsp",false);
   		return forward;
	}

}
