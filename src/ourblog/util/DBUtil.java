package ourblog.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 妮子 on 2017/5/7.
 */
public class DBUtil {
    public static Connection getPoolConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){}
        Connection conn=null;
        try{
            String uri="jdbc:mysql://127.0.0.1:3306/selfblog?user=root&password=1234567&useUnicode=true&characterEncoding=utf-8";
            conn= DriverManager.getConnection(uri);
            return conn;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
