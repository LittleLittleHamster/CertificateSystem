package DBdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DBoperation.DBconnect;
import DBinfo.AdministratorInfo;

public class AdministratorDao {
    private Connection conn;
    private DBconnect dbconn;

    public AdministratorDao(){
        this.dbconn = new DBconnect();
        conn = dbconn.startConn();
    }

    public void finalize(){
        dbconn.closeConn(conn);
    }

    //插入一个新的管理员
    public int insert(AdministratorInfo admininfo){
        String sql = "insert into administrator(admin_name, admin_pass, admin_realname) values(?, ?, ?);";
        PreparedStatement preStmt = null;
        int res = 0;
        try {
            preStmt = conn.prepareStatement(sql);

            preStmt.setString(1, admininfo.getAdmin_name());
            preStmt.setString(2, admininfo.getAdmin_pass());
            preStmt.setString(3, admininfo.getAdmin_realname());

            res = preStmt.executeUpdate();

            preStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    //删除某个管理员（根据名字删除）
    public int delete(String admin_name){
        String sql = "delete from administrator where admin_name = ?;";
        PreparedStatement preStmt = null;
        int res = 0;
        try {
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, admin_name);
            res = preStmt.executeUpdate();

            preStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    //验证用户名和密码
    public boolean verify(String admin_name, String admin_pass){
        String sql = "select * from administrator where admin_name = ? and admin_pass = ?;";
        PreparedStatement preStmt = null;
        ResultSet res;
        boolean ret = false;
        try {
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, admin_name);
            preStmt.setString(2, admin_pass);
            res = preStmt.executeQuery();

            res.last();
            if(res.getRow() != 0)
            {
                ret = true;
            }else{
                ret = false;
            }

            res.close();
            preStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ret;
    }

    //检查用户是否已经存在
    public boolean user_exist(String admin_name){
        String sql = "select * from administrator where admin_name = ?;";
        PreparedStatement preStmt = null;
        ResultSet res;
        boolean ret = false;
        try {
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, admin_name);
            res = preStmt.executeQuery();
            res.last();
            if(res.getRow() != 0)
            {
                ret = true;
            }else{
                ret = false;
            }

            res.close();
            preStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ret;
    }

    //修改密码
    public boolean update_password(String admin_name, String old_pass, String new_pass){
        String sql = "update administrator set admin_pass = ? where admin_name = ? and admin_pass = ?;";
        PreparedStatement preStmt = null;
        int res = 0;
        try {
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, new_pass);
            preStmt.setString(2, admin_name);
            preStmt.setString(3, old_pass);
            res = preStmt.executeUpdate();

            preStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(res != 0)
        {
            return true;
        }else{
            return false;
        }
    }



    //测试
    public static void main(String[] args){
        //插入一个新的管理员
        AdministratorInfo new_admin = new AdministratorInfo();
        AdministratorDao admin_dao = new AdministratorDao();

        //设置用户信息
        new_admin.setAdmin_name("admin");
        new_admin.setAdmin_pass("admin");
        new_admin.setAdmin_realname("管理员");

        //判断用户是否存在，插入新管理员
        if(admin_dao.user_exist(new_admin.getAdmin_name())){
            System.out.println("用户已经存在！");
        }
        else{
            admin_dao.insert(new_admin);
        }

        //验证用户名和密码
        if(admin_dao.verify("admin", "123")){
            System.out.println("用户名：admin，密码：123，通过验证！");
        }
        else{
            System.out.println("用户名：admin，密码：123，未通过验证！");
        }

        if(admin_dao.verify("admin", "admin")){
            System.out.println("用户名：admin，密码：admin，通过验证！");
        }
        else{
            System.out.println("用户名：admin，密码：admin，未通过验证！");
        }

        //更新密码
        if(admin_dao.update_password("admin", "adminad", "adminadmin")){
            System.out.println("原密码错误，修改成功！");
        }
        else{
            System.out.println("原密码错误，修改失败！");
        }

        if(admin_dao.update_password("admin", "admin", "adminadmin")){
            System.out.println("原密码正确，修改成功！");
        }
        else{
            System.out.println("原密码正确，修改失败！");
        }

        admin_dao.delete("admin");

    }

}
