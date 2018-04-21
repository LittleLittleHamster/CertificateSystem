package DBinfo;

public class UserkeybackupInfo {
    private String user_id;
    private int algorithm;
    private String auth_info;
    private String key_val;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(int algorithm) {
        this.algorithm = algorithm;
    }

    public String getAuth_info() {
        return auth_info;
    }

    public void setAuth_info(String auth_info) {
        this.auth_info = auth_info;
    }

    public String getKey_val() {
        return key_val;
    }

    public void setKey_val(String key_val) {
        this.key_val = key_val;
    }
}
