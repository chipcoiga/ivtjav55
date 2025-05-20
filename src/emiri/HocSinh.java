package emiri;

//Public / private / protected /
//class / interface / enum / record
public class HocSinh {
    private String name;
    private int age;
    private boolean isMale; //true = Nam, false = Nu
    private int math;
    private int physical;
    private int chemistry;

    public HocSinh(){}
    public HocSinh(String name,
                   int age,
                   boolean isMale,
                   int math,
                   int physical,
                   int chemistry){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }

    public HocSinh(String name,
                   int physical,
                   int chemistry){
        this.name = name;
        this.physical = physical;
        this.chemistry = chemistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 100) {
            System.out.println("Tuoi gi gia the");
        }
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setMath(int math, int b) {
        this.math = math;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

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
