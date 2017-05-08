package ourblog.service;

import ourblog.bean.User;
import ourblog.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 妮子 on 2017/5/7.
 */
public class UserService {
    public User doLogin(String userName, String password) throws SQLException {
        User result=null;
        Connection conn= DBUtil.getPoolConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="";
        sql="SELECT * FROM userinf WHERE userName=? AND password=PASSWORD(?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,userName);
            ps.setString(2,password);
            rs= ps.executeQuery();
            System.out.print(sql);
            if(rs.next()){
                result=new User();
                result.setUserName(rs.getString("userName"));
                result.setPassword(rs.getString("password"));
            }
            return result;
        }finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }
    public int doReg(String userName,String telephone, String password,String repassword) throws SQLException{
        if(checkInputData(telephone,password,repassword)!=0){
            return checkInputData(telephone,password,repassword);
        }
        if(checkTelephone(telephone)){
            return 3;
        }
        if(checkUserName(userName)){
            return 4;
        }
        addAuser(userName,telephone,password);
        return 5;
    }

    private void addAuser(String userName, String telephone, String password)throws SQLException {
        String sql="";
        sql="INSERT INTO userinf(userName,telephone,password) VALUES (?,?,PASSWORD(?))";
        Connection conn=DBUtil.getPoolConnection();
        PreparedStatement ps =null;
        ResultSet rs=null;
        try{
            ps=conn.prepareStatement(sql);
            ps.setString(1,userName);
            ps.setString(2,telephone);
            ps.setString(3,password);
            rs = ps.executeQuery();
            int count=0;
            if(rs.next()){
                count=rs.getInt(1);
            }
        }finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }

    private boolean checkUserName(String userName) throws SQLException{
        String sql="";
        sql="SELECT COUNT(*) FROM userinf WHERE userName=?";
        Connection conn=DBUtil.getPoolConnection();
        PreparedStatement ps =null;
        ResultSet rs=null;
        try{
            ps=conn.prepareStatement(sql);
            ps.setString(1,userName);
            rs = ps.executeQuery();
            int count=0;
            if(rs.next()){
                count=rs.getInt(1);
            }
            return count>0;
        }finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }

    public int checkInputData(String telephone,String password,String repassword){
        if(telephone.length() != 11){
            return 1;
        }
        if(!password.equals(repassword)){
            return 2;
        }
        return 0;
    }
    public boolean checkTelephone(String telephone) throws SQLException {
        String sql="";
        sql="SELECT COUNT(*) FROM userinf WHERE telephone=?";
        Connection conn=DBUtil.getPoolConnection();
        PreparedStatement ps =null;
        ResultSet rs=null;
        try{
            ps=conn.prepareStatement(sql);
            ps.setString(1,telephone);
            rs = ps.executeQuery();
            int count=0;
            if(rs.next()){
                count=rs.getInt(1);
            }
            return count>0;
        }finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }

}
