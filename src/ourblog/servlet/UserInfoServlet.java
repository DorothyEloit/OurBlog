package ourblog.servlet;

import ourblog.bean.User;
import ourblog.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Dorothy on 2017/5/21.
 */
public class UserInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        UserService userService=new UserService();
        try {
            User result = userService.getUserInfo();
            if(result != null) {
                request.getSession().setAttribute("MASTER",result);
                request.getRequestDispatcher("/main/userInf.jsp").forward(request,response);
            } else {
                request.getRequestDispatcher("/main/err.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
