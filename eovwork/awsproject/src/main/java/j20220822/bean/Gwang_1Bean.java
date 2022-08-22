package j20220822.bean;

public class Gwang_1Bean {
    public String userid;
    public String passwd;
    public String name;
    public String email;
    public String jumin1;
    public String jumin2;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJumin1() {
        return jumin1;
    }

    public void setJumin1(String jumin1) {
        this.jumin1 = jumin1;
    }

    public String getJumin2() {
        return jumin2;
    }

    public void setJumin2(String jumin2) {
        this.jumin2 = jumin2;
    }

    public Gwang_1Bean(String userid, String passwd, String name, String email, String jumin1, String jumin2) {
        this.userid = userid;
        this.passwd = passwd;
        this.name = name;
        this.email = email;
        this.jumin1 = jumin1;
        this.jumin2 = jumin2;
    }

    public Gwang_1Bean(String userid, String passwd, String name, String email) {
        this.userid = userid;
        this.passwd = passwd;
        this.name = name;
        this.email = email;
    }
}
