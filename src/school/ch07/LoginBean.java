package school.ch07;

public class LoginBean {
    // member variables
    private String userid;
    private String passwd;

    // method
    public String getPasswd() {
        return passwd;
    }

    public String getUserid() {
        return userid;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
