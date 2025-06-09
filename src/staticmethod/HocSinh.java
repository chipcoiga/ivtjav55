package staticmethod;

public class HocSinh {
    private static String nameStatic;
    private String nameNormal;

    public void actionNormal(String name) {
        nameNormal = name;
    }

    public static void actionStatic(String name) {
        nameStatic = name;
    }

    public String getNameNormal() {
        return this.nameNormal;
    }

    public String getNameStatic() {
        return nameStatic;
    }
}