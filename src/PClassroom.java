import java.util.ArrayList;

public class PClassroom {

    private int schoolID;
    private int id;
    private int level;
    private String code;
    private boolean active;

    public PClassroom() {
    }
    public PClassroom(int schoolID, int id, int level, String code, boolean active) {
        this.schoolID = schoolID;
        this.id = id;
        this.level = level;
        this.code = code;
        this.active = active;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

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
}
