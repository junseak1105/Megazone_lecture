package console.common.bean;

public class BaseBean {

    public String numindex;
    public String userid;
    public String birthday;
    public String email;
    public String jumin1;
    public String jumin2;
    public String phone;
    public String address;



    public String getNumindex() {
        return numindex;
    }

    public void setNumindex(String numindex) {
        this.numindex = numindex;
    }

    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }



    public BaseBean(String numindex, String userid, String birthday, String email, String jumin1, String jumin2, String phone, String address) {

        this.numindex = numindex;
        this.userid= userid;
        this.birthday= birthday;
        this.email= email;
        this.jumin1= jumin1;
        this.jumin2= jumin2;
        this.phone= phone;
        this.address = address;


    }

    public BaseBean() {
        // TODO Auto-generated constructor stub
    }


}