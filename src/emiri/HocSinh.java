package emiri;

public class HocSinh {
    public String name;
    public int age;
    public boolean isMale; //true = Nam, false = Nu
    public int math;
    public int physical;
    public int chemistry;

    public int tinhDiemTrungBinh() {
        return (math + physical + chemistry)/3;
    }

    public static int demoStaticMethod() {
        return 10;
    }

    public static void main(String[] args) {
        HocSinh hocSinh1 = new HocSinh();
        hocSinh1.chemistry = 5;
        hocSinh1.math = 10;
        hocSinh1.physical = 2;
        hocSinh1.name = "LHLoc";
        hocSinh1.age = 20;
        hocSinh1.isMale = true;

        int diemTrungBinh = hocSinh1.tinhDiemTrungBinh();
        System.out.println(diemTrungBinh);

        HocSinh hocSinh2 = new HocSinh();
        hocSinh2.chemistry = 10;
        hocSinh2.math = 10;
        hocSinh2.physical = 10;
        hocSinh2.name = "Huu Hau";
        hocSinh2.age = 34;
        hocSinh2.isMale = true;

        CodeJav125 codeJav125 = new CodeJav125();
    }
}

//Java, C#, C++, Javascript: Typescript OOP
// Class vs Object
