package ourblog.servlet;
import ourblog.bean.Blog;
import ourblog.bean.User;
import ourblog.service.BlogService;

import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
public class BlogServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        request.setCharacterEncoding("utf-8");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        //todo:从前台拿到博客分类名称，然后从后台查找分类id
        String blogClassId = "1";
        int blogId = Integer.parseInt(blogClassId);
        //todo:从前台获取博客访问权限
        String blogPermission = "所有人可见";
        int createUserId = 1;
        String blogPath = "F:/IdeaProjects/ourblog/";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = df.format(new Date());
        Blog ablog = new Blog();
        ablog.setBlogTitle(title);
        ablog.setBlogClassId(blogId);
        ablog.setBlogPath(blogPath);
        ablog.setBlogPermission(blogPermission);
        ablog.setCreateUserId(createUserId);
        ablog.setCreateTime(now);
        ablog.setLastModifyTime(now);
        //User loginedUser = (User)request.getSession().getAttribute("USER");
        BlogService blogService=new BlogService();
        Blog result = blogService.writeBlog(ablog,title,content);
        if(result!=null){
            request.getRequestDispatcher("/main/msg.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("/main/err.jsp").forward(request,response);
        }
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        doPost(request,response);
    }

}