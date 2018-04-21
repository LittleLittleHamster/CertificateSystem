package DBinfo;

import java.sql.Time;
import java.sql.Timestamp;

public class CertificateInfo {
    private String subject_id;
    private String sub_pub_key;
    private int  sub_pub_algo;
    private Timestamp start_time;
    private String signature;
    private int serial_num;
    private String issuer_id;
    private Timestamp end_time;
    private int certificate_type;

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getSub_pub_key() {
        return sub_pub_key;
    }

    public void setSub_pub_key(String sub_pub_key) {
        this.sub_pub_key = sub_pub_key;
    }

    public int getSub_pub_algo() {
        return sub_pub_algo;
    }

    public void setSub_pub_algo(int sub_pub_algo) {
        this.sub_pub_algo = sub_pub_algo;
    }

    public Timestamp getStart_time() {
        return start_time;
    }

    public void setStart_time(Timestamp start_time) {
        this.start_time = start_time;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getSerial_num() {
        return serial_num;
    }

    public void setSerial_num(int serial_num) {
        this.serial_num = serial_num;
    }

    public String getIssuer_id() {
        return issuer_id;
    }

    public void setIssuer_id(String issuer_id) {
        this.issuer_id = issuer_id;
    }

    public Timestamp getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Timestamp end_time) {
        this.end_time = end_time;
    }

    public int getCertificate_type() {
        return certificate_type;
    }

    public void setCertificate_type(int certificate_type) {
        this.certificate_type = certificate_type;
    }
}
