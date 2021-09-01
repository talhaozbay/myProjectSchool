import java.util.ArrayList;

public class Teacher {

    public static ArrayList dataTeacher = new ArrayList();
    public static School school = new School();
    public static ArrayList getDataTeacher = new ArrayList();

    private int schoolID;
    private String name;
    private String surName;
    private String department;
    private String phone;

    public void addArray() {

        dataTeacher.add(getName() + " " + getSurName() + " " + getDepartment() + " bölümü " + getPhone() + " " + school.getDataSchool.get(getSchoolID()));
        getData();
        System.out.println(dataTeacher);
        System.out.println(dataTeacher.size());
        Main.start();

    }
    public void getData(){
        getDataTeacher.add(getName() + " " + getSurName() + " " + getDepartment()+ " bölümü" +  " | " + School.getDataSchool.get(getSchoolID()) + " | " + getPhone());
    }

    //----------------------------------------------------- SETTER GETTERS
    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
