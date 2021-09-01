import java.util.ArrayList;

public class School {

    public static ArrayList dataSchool = new ArrayList();
    public static ArrayList getDataSchool = new ArrayList();
    private String name;
    private int id;
    private String code;
    private boolean active;

    public void addArray() {

        dataSchool.add("okul adı : " + getName() + " | okul kodu : " + getCode() + " | okul aktif mi : " + isActive());
        getData();
        System.out.println(dataSchool);
        dataSchool.size();
        Main.start();

    }
    public void getData(){
        getDataSchool.add(getName() + " " + getCode());
    }


    //-------------------------------------------- SETTER GETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
