package ourblog.servlet;

import ourblog.bean.User;
import ourblog.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by 妮子 on 2017/5/7.
 */
public class register extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException {
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String telephone = request.getParameter("telephone");
        String password=request.getParameter("password");
        String repassword=request.getParameter("repassword");
        UserService userService=new UserService();
        try {
            int result = userService.doReg(username, telephone,password,repassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        doPost(request,response);
    }
}
