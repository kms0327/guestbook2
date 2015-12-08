package com.hanains.guestbook.http.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.http.HttpUtil;
import com.hanains.http.action.Action;

public class DeleteAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpUtil.forwading(request, response, "/WEB-INF/views/deleteform.jsp");
	}

}
