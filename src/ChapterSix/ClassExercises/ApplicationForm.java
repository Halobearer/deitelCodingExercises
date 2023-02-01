package ChapterSix.ClassExercises;

import ChapterSix.ClassExercises.Enums.Religion;

public class ApplicationForm {
    private int age;
    private String name;
    private int bvn;
    private String address;

    private Religion religion;

    public ApplicationForm(int age, String name, int bvn, String address, Religion religion){
        this.age = age;
        this.name = name;
        this.bvn = bvn;
        this.address = address;
        this.religion = religion;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBvn(int bvn) {
        this.bvn = bvn;
    }

    public int getBvn() {
        return bvn;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
