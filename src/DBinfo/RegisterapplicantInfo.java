package DBinfo;

//证书注册申请表信息
public class RegisterapplicantInfo {
    private int apply_id;
    private String applicant_id;
    private String applicant_name;
    private String applicant_email;
    private String applicant_phone;
    private int certificate_type;
    private String applyreason;
    private int state;

    public int getApply_id() {
        return apply_id;
    }

    public void setApply_id(int apply_id) {
        this.apply_id = apply_id;
    }

    public String getApplicant_id() {
        return applicant_id;
    }

    public void setApplicant_id(String applicant_id) {
        this.applicant_id = applicant_id;
    }

    public String getApplicant_name() {
        return applicant_name;
    }

    public void setApplicant_name(String applicant_name) {
        this.applicant_name = applicant_name;
    }

    public String getApplicant_email() {
        return applicant_email;
    }

    public void setApplicant_email(String applicant_email) {
        this.applicant_email = applicant_email;
    }

    public String getApplicant_phone() {
        return applicant_phone;
    }

    public void setApplicant_phone(String applicant_phone) {
        this.applicant_phone = applicant_phone;
    }

    public int getCertificate_type() {
        return certificate_type;
    }

    public void setCertificate_type(int certificate_type) {
        this.certificate_type = certificate_type;
    }

    public String getApplyreason() {
        return applyreason;
    }

    public void setApplyreason(String applyreason) {
        this.applyreason = applyreason;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
