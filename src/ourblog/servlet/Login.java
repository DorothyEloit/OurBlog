package ourblog.servlet;
import ourblog.bean.User;
import ourblog.service.UserService;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Login extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		UserService userService=new UserService();
		try {
			User result = userService.doLogin(username, password);
			if(result!=null){
				request.getSession().setAttribute("USER",user);
				request.getRequestDispatcher("/").forward(request,response);
			}else{
				request.getRequestDispatcher("/main/err.jsp").forward(request,response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		doPost(request,response);
	}

}