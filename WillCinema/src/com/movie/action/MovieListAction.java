package com.movie.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.action.Action;
import com.action.ActionForward;
import com.admin.movie.db.AdminMovieDAO;
import com.admin.movie.db.AdminMovieDAOImpl;
import com.admin.movie.db.AdminMovieDTO;
import com.movie.db.MovieDAOImpl;
import com.movie.db.MovieDTO;
import com.service.QnA.db.QnADAOImpl;
import com.service.QnA.db.QnADTO;

public class MovieListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		AdminMovieDAO amdao  = new AdminMovieDAOImpl();
		MovieDAOImpl mvdaoImpl  = new MovieDAOImpl();
		
		int count = amdao.getBoardCount();
		
		System.out.println("count : " + count);
		
		int pageSize = 10;
		
		System.out.println("pageNum - 1 : " + request.getParameter("pageNum"));
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		
		List<AdminMovieDTO> boardList = null;
		
		// 현 페이지가 몇페이지 인지를 가져오기
		String pageNum = request.getParameter("pageNum");
				
		if (pageNum == null) {
			pageNum = "1"; // pageNum의 값이 없을경우 무조건 1페이지
		}
		
		System.out.println("pageNum - 2 : "+pageNum);
		
		if( count != 0 ){ 
			  boardList = mvdaoImpl.getBoardList();
		}
		
		request.setAttribute("count", count);
		request.setAttribute("boardList", boardList);
		request.setAttribute("pageNum", pageNum);
		
		System.out.println("");
		
		
		ActionForward forward = new ActionForward();
		forward.setPath("./movie/movieList.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}
