import java.util.ArrayList;

public class ClassRoom {

    public static ArrayList dataClassRoom = new ArrayList();
    public static ArrayList getDataClassRoom = new ArrayList();

    private int schoolID;
    private int id;
    private int level;
    private String code;
    private boolean active;

    public void addArray(){
        dataClassRoom.add("Sınıf : " + getLevel() + getCode() + " | Sınıf aktif mi : " + isActive() + " | Bağlı olduğu okul : " + School.getDataSchool.get(schoolID));
        getData();
        System.out.println(dataClassRoom);
        System.out.println(dataClassRoom.size());
        Main.start();
    }
    public void getData(){
        getDataClassRoom.add(getLevel() + getCode() + " | " + School.getDataSchool.get(schoolID));
    }

//------------------------------------------------------ SETTER GETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }
}
