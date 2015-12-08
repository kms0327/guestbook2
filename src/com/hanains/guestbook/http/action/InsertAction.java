package com.hanains.guestbook.http.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.http.action.Action;
import com.hanains.guestbook.vo.*;
import com.hanains.guestbook.dao.*;


public class InsertAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("pass");
		String message = request.getParameter("content");
		
		GuestBookVo vo = new GuestBookVo();
		vo.setName(name);
		vo.setPassword(password);
		vo.setMessage(message);
		
		GuestBookDao dao = new GuestBookDao();
		dao.insert(vo);
		
		response.sendRedirect("/guestbook2/gs");
	}
}
