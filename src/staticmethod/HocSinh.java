package staticmethod;

import com.demo.javcore.enumerated.Gender;

public class HocSinh {
    private String name;
    private String age;
    private School school;
    private Gender gender;

    class School {
        private String schoolName;
        private String schoolCeo;
        private String schoolAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
