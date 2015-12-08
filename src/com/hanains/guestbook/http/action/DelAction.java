package com.hanains.guestbook.http.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.http.action.Action;
import com.hanains.guestbook.dao.*;
import com.hanains.guestbook.vo.*;

public class DelAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String no = request.getParameter("no");
		String pass = request.getParameter("password");
		
		GuestBookVo vo = new GuestBookVo();
		vo.setNo(Long.parseLong(no));
		vo.setPassword(pass);
		
		GuestBookDao dao = new GuestBookDao();

		dao.Delete(vo);
		
		response.sendRedirect("/guestbook2/gs");
	}
}
