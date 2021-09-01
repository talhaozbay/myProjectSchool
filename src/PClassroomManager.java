/*import java.util.ArrayList;
import java.util.List;

public class PClassroomManager implements BaseManager {

    public List<PClassroom> classroomList = new ArrayList<>();
    public List<School> schoolList = new ArrayList<>();
    //PClassroom classroom = new PClassroom();
    @Override
    public void list() {
        classroomList.forEach(classroom -> {
            System.out.println(classroom.getLevel()+ " - " + classroom.getCode());
            getSchoolName(classroom.getSchoolID());
        });
    }

    @Override
    public void add() {
        PClassroom classroom = new PClassroom();

        int schoolID;
        classroom.setId(classroomList.size());
        System.out.println("Sınıfın seviyesini giriniz ... ");
        classroom.setLevel(input.nextLine());
        System.out.println("Sınıfın kodunu giriniz ...");
        classroom.setCode(input.nextLine());
        System.out.println("Sınıf aktif mi (Aktif ise 'evet' Aktif değil ise 'hayır' yazınız) ... ");
        isActive();
        System.out.println("eklenme işlemi tamamlandı");
        System.out.println(isActive());
        classroomList.add(classroom);
    }
    public boolean isActive() {

        String isActive = input.nextLine();
        switch (isActive) {
            case "evet" -> {
               return true;
            }
            case "hayır" -> {
               return false;
            }
            default -> {
                System.out.println("hatalı bir değer girdiniz");
                isActive();
            }
        }

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    private void getSchoolName(int id){
        System.out.println(schoolList.stream().filter(school -> school.getId() == id));
    }
}
*/