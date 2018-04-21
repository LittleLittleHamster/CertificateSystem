package DBoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnect {
    private String dbDriver = "com.mysql.jdbc.Driver";

    private String dbUrl = "jdbc:mysql://localhost:3306/ca_center?useSSL=false";
    private String dbUser = "root";
    private String dbPass = "960910";

    //与数据库建立连接
    public Connection startConn(){
        Connection conn = null;

        try{
            Class.forName(dbDriver);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        try{
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        }catch(SQLException e){
            e.printStackTrace();
        }

        return conn;
    }

    //关闭与数据库的连接
    public void closeConn(Connection conn){
        try{
            if(conn != null) {
                conn.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
