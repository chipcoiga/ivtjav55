package staticmethod;

public class Main {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh();
        hocSinh.actionNormal("Name normal");
        HocSinh.actionStatic("Name static");

        HocSinh hocSinh2 = new HocSinh();
        hocSinh2.actionNormal("Name normal 2");
        hocSinh2.actionStatic("Name static 2");

        System.out.println(hocSinh.getNameNormal());
        System.out.println(hocSinh.getNameStatic());
        System.out.println(hocSinh2.getNameNormal());
        System.out.println(hocSinh2.getNameStatic());
    }
}
