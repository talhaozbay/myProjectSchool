import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherManager implements BaseManager {


    public static Scanner input = new Scanner(System.in);
    public static Teacher teacher = new Teacher();
    public School school = new School();
    private int updateID;

    @Override
    public void add() {
        int i = 1;
        for (Object datas : School.getDataSchool) {
            System.out.print("-" + i + "-" + " : ");
            i++;
            System.out.println(datas);
        }
        System.out.println("Eklemek istediğiniz okulun başındaki kodu yazınız");
        teacher.setSchoolID(input.nextInt() - 1);
        System.out.println("İsim ...");
        Scanner input = new Scanner(System.in);
        teacher.setName(input.nextLine());
        System.out.println("Soyad ...");
        teacher.setSurName(input.nextLine());
        System.out.println("Bölümüz ...");
        teacher.setDepartment(input.nextLine());
        System.out.println("Telefon numarası ...");
        teacher.setPhone(input.nextLine());
        teacher.addArray();
    }

    @Override
    public void delete() {

        try {
            int i = 1;
            for (Object datas : Teacher.getDataTeacher) {
                System.out.print("-" + i + "-   ");
                System.out.println(datas);
                i++;
            }
            System.out.println("Silmek istediğiniz öğretmenin başındakı kodu yazınız...");
            Scanner deleteIn = new Scanner(System.in);
            i = deleteIn.nextInt() - 1;
            Teacher.dataTeacher.remove(i);
            Teacher.getDataTeacher.remove(i);
            System.out.println("Öğretmen Silindi!");
            Main.start();
        }catch (Exception e){
            System.out.println("Hatalı değer girdiniz");
            Main.start();
        }

    }

    @Override
    public void update() {

        int i = 1;
        for(Object datas : Teacher.getDataTeacher){
            System.out.print("-"+ i + "-   ");
            System.out.println(datas);
            i++;
        }
        System.out.println("Güncellenecek öğretmenin başındakı kodu yazınız...");
        Scanner updateSchoolIn = new Scanner(System.in);
        setUpdateID(updateSchoolIn.nextInt());
        int x = 1;
        for (Object datas : School.getDataSchool) {
            System.out.print("-" + x + "-" + " : ");
            x++;
            System.out.println(datas);
        }
        System.out.println("Güncellemek istediğiniz okulun başındaki kodu yazınız");
        teacher.setSchoolID(input.nextInt() - 1);
        System.out.println("İsim ...");
        Scanner input = new Scanner(System.in);
        teacher.setName(input.nextLine());
        System.out.println("Soyad ...");
        teacher.setSurName(input.nextLine());
        System.out.println("Bölümüz ...");
        teacher.setDepartment(input.nextLine());
        System.out.println("Telefon numarası ...");
        teacher.setPhone(input.nextLine());
        Teacher.dataTeacher.set(getUpdateID(),teacher.getName() + " " + teacher.getSurName() + " " + teacher.getDepartment() + " bölümü " + teacher.getPhone() + " " + school.getDataSchool.get(teacher.getSchoolID()));
        Teacher.getDataTeacher.set(getUpdateID(),teacher.getName() + " " + teacher.getSurName() + " " + teacher.getDepartment()+ " bölümü" +  " | " + School.getDataSchool.get(teacher.getSchoolID()) + " | " + teacher.getPhone());
        System.out.println("Başarıyla güncellendi");
        Main.start();

    }

    @Override
    public void list() {
        int i = 1;
        for(Object datas : Teacher.getDataTeacher){
            System.out.print(i + " : ");
            System.out.println(datas);
            i++;
        }
        System.out.println("Ana menüye dönmek için bir şey yazın...");
        Scanner input2 = new Scanner(System.in);
        String any;
        any = input2.nextLine();
        Main.start();
    }

    public int getUpdateID() {
        return updateID;
    }

    public void setUpdateID(int updateID) {
        this.updateID = updateID - 1;
    }
}
