package DBinfo;

//管理员数据表信息
public class AdministratorInfo {
    private int admin_id;
    private String admin_name;
    private String admin_pass;
    private String admin_realname;

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_pass() {
        return admin_pass;
    }

    public void setAdmin_pass(String admin_pass) {
        this.admin_pass = admin_pass;
    }

    public String getAdmin_realname() {
        return admin_realname;
    }

    public void setAdmin_realname(String admin_realname) {
        this.admin_realname = admin_realname;
    }
}
