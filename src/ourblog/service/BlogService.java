package ourblog.service;

import ourblog.bean.Blog;
import ourblog.util.DBUtil;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Maria on 2017/5/20.
 */
public class BlogService {
    public Blog writeBlog(Blog ablog,String title,String content){
        Blog result = null;
        Connection conn= DBUtil.getPoolConnection();
        PreparedStatement ps=null;
        String sql="";
        sql="INSERT INTO bloginf(createUserId,blogTitle,blogPath,blogClassId,blogPermission,createTime,lastModifyTime)" +
                "VALUES(?,?,?,?,?,?,?)";
        try {
            ps=conn.prepareStatement(sql);
            ps.setInt(1,ablog.getCreateUserId());
            ps.setString(2,ablog.getBlogTitle());
            ps.setString(3,ablog.getBlogPath());
            ps.setInt(4,ablog.getBlogClassId());
            ps.setString(5,ablog.getBlogPermission());
            ps.setString(6,ablog.getCreateTime());
            ps.setString(7,ablog.getLastModifyTime());
            ps.execute();
            uploadBlog(ablog.getBlogPath(),title,content);
            return ablog;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if (ps != null) {
                    ps.close();
                }
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
        }}
        return result;
    }

    private void uploadBlog(String blogPath, String title,String content) {
        try {
            //Calendar calendar = Calendar.getInstance();
            //String fullPath = blogPath +calendar.SECOND + calendar.HOUR + calendar.MINUTE +".txt";
            Date date = new Date();
            String fullPath = blogPath + date.getTime() + ".txt";
            File file = new File(fullPath);
            if(!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            PrintStream ps = new PrintStream(new FileOutputStream(file));
            ps.println(title);
            ps.print(content);
            // 往文件里写入字符串
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
