package DBdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DBoperation.DBconnect;
import DBinfo.EventlogInfo;

public class EventlogDao {
    private Connection conn;
    private DBconnect dbconn;

    public EventlogDao(){
        this.dbconn = new DBconnect();
        conn = dbconn.startConn();
    }

    public void finalize(){
        dbconn.closeConn(conn);
    }

    //插入一个新的事件
    public int insert(EventlogInfo eventlog){
        String sql = "insert into event_log(event_type, event_content) values(?, ?);";
        PreparedStatement preStmt = null;
        int res = 0;
        try{
            preStmt = conn.prepareStatement(sql);

            preStmt.setInt(1, eventlog.getEvent_type());
            preStmt.setString(2, eventlog.getEvent_content());

            res = preStmt.executeUpdate();

            preStmt.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return res;
    }

    public static void  main(String[] args){
        EventlogInfo eventlog = new EventlogInfo();
        EventlogDao eventlogdao = new EventlogDao();

        eventlog.setEvent_type(1);
        eventlog.setEvent_content("这是测试！");

        eventlogdao.insert(eventlog);
        System.out.println("插入一个事件！");
    }

}
