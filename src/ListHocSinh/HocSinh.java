package ListHocSinh;

public class HocSinh {
    String MHS;
    String name;
    String MLH;

    public HocSinh(String MHS, String name, String MLH) {
        this.MHS = MHS;
        this.name = name;
        this.MLH = MLH;
    }

    public String getMHS() {
        return MHS;
    }

    public void setMHS(String MHS) {
        this.MHS = MHS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMLH() {
        return MLH;
    }

    public void setMLH(String MLH) {
        this.MLH = MLH;
    }
}