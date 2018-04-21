package DBinfo;

public class UserkeyInfo {
    private String user_id;
    private int key_type;
    private int algorithm;
    private String key_val;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getKey_type() {
        return key_type;
    }

    public void setKey_type(int key_type) {
        this.key_type = key_type;
    }

    public int getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(int algorithm) {
        this.algorithm = algorithm;
    }

    public String getKey_val() {
        return key_val;
    }

    public void setKey_val(String key_val) {
        this.key_val = key_val;
    }
}
