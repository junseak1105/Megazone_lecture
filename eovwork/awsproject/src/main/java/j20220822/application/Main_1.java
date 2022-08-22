package j20220822.application;

public class Main_1 {
    static String staticvalue;
    String nonstaticvalue;

    public static String getStaticvalue() {
        return staticvalue;
    }

    public static void setStaticvalue(String staticvalue) {
        Main_1.staticvalue = staticvalue;
    }

    public String getNonstaticvalue() {
        return nonstaticvalue;
    }

    public void setNonstaticvalue(String nonstaticvalue) {
        this.nonstaticvalue = nonstaticvalue;
    }

    public static void main(String[] args) {
        Main_1.setStaticvalue("김재훈");
        System.out.println(Main_1.getStaticvalue());
        Main_1 main_1 = new Main_1();
        System.out.println(main_1.getStaticvalue());
    }
}
