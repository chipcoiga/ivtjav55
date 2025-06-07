package ListHS;

public class HocSinh {
    String MHS;
    String Name;
    String Age;

    public HocSinh(String MLH, String Name, String Age, String MHS) {
        this.Age = Age;
        this.MHS = MHS;
        this.MLH = MLH;
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getMHS() {
        return MHS;
    }

    public void setMHS(String MHS) {
        this.MHS = MHS;
    }

    public String getMLH() {
        return MLH;
    }

    public void setMLH(String MLH) {
        this.MLH = MLH;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    String MLH;
}
