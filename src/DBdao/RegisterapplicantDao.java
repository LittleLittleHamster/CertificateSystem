package DBdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DBoperation.DBconnect;
import DBinfo.RegisterapplicantInfo;

public class RegisterapplicantDao {
    private Connection conn;
    private DBconnect dbconn;

    public RegisterapplicantDao(){
        this.dbconn = new DBconnect();
        conn = dbconn.startConn();
    }

    public void finalize(){
        dbconn.closeConn(conn);
    }



}
