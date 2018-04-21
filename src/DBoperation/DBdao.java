package DBoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class DBdao {
    //插入操作
    public int insert(String sql, Connection conn){
        int succ = 0;
        PreparedStatement preStmt;
        try {
            preStmt = conn.prepareStatement(sql);
            succ=preStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return succ;
    }
}
