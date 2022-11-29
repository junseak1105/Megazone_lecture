package Sort.j20220819;

public class CoupangBean {
    public String id, pwd, name, phone;

    public CoupangBean() {
    }

    public CoupangBean(String id, String pwd, String name, String phone) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}