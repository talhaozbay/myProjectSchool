import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    public Scanner input = new Scanner(System.in);
    public static ArrayList dataStudent = new ArrayList();
    public static ArrayList getDataStudent = new ArrayList();
    public School school = new School();
    public ClassRoom classRoom = new ClassRoom();

    private String name;
    private String surName;
    private int age;
    private String number;
    private int classID;
    private int schoolID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public void addArray(){

        dataStudent.add(getName() + " " + getSurName() + " yaşı : " + getAge() + " sınıfı : " + ClassRoom.getDataClassRoom.get(getClassID()) + " numarası : " + getNumber());
        getData();
        System.out.println(dataStudent);
        System.out.println(dataStudent.size());
        Main.start();

    }
    public void getData(){
        getDataStudent.add(getName() + " " + getSurName() + " | " + ClassRoom.getDataClassRoom.get(getClassID()));
    }

}
