import java.util.Scanner;

public class StudentManager implements BaseManager {

    public static Scanner input = new Scanner(System.in);
    public static Student student = new Student();
    public static School school = new School();
    public static ClassRoom classRoom = new ClassRoom();
    private int updateID;


    @Override
    public void add() {

        /*
        int i = 1;
        for (Object datas : School.getDataSchool) {
            System.out.print("-" + i + "-" + " : ");
            i++;
            System.out.println(datas);
        }
        System.out.println("Eklemek istediğiniz okulun başındaki kodu yazınız");
        */
        student.setSchoolID(input.nextInt() - 1);
        int x = 1;
        for (Object datas : ClassRoom.getDataClassRoom) {
            System.out.print("-" + x + "-" + " : ");
            x++;
            System.out.println(datas);
        }
        System.out.println("Eklemek istediğiniz okul ve sınıfın başındaki kodu yazın");
        student.setClassID(input.nextInt() - 1);
        System.out.println("İsim ...");
        Scanner input = new Scanner(System.in);
        student.setName(input.nextLine());
        System.out.println("Soyad ...");
        student.setSurName(input.nextLine());
        System.out.println("yaş ...");
        student.setAge(input.nextInt());
        System.out.println("okul numarası ...");
        Scanner input2 = new Scanner(System.in);
        student.setNumber(input2.nextLine());
        student.addArray();

    }

    @Override
    public void delete() {

        try {
            int i = 1;
            for (Object datas : Student.getDataStudent) {
                System.out.print("-" + i + "-   ");
                System.out.println(datas);
                i++;
            }
            System.out.println("Silmek istediğiniz öğrencinin başındakı kodu yazınız...");
            Scanner deleteIn = new Scanner(System.in);
            i = deleteIn.nextInt() - 1;
            Student.dataStudent.remove(i);
            Student.getDataStudent.remove(i);
            System.out.println("Öğrenci Silindi!");
            Main.start();
        }catch (Exception e){
            System.out.println("Hatalı bir değer girdiniz");
            Main.start();
        }


    }

    @Override
    public void update() {

        int i = 1;
        for(Object datas : Student.getDataStudent){
            System.out.print("-"+ i + "-   ");
            System.out.println(datas);
            i++;
        }
        System.out.println("Güncellenecek öğrencinin başındakı kodu yazınız...");
        Scanner updateSchoolIn = new Scanner(System.in);
        setUpdateID(updateSchoolIn.nextInt());
        int x = 1;
        for (Object datas : ClassRoom.getDataClassRoom) {
            System.out.print("-" + x + "-" + " : ");
            x++;
            System.out.println(datas);
        }
        System.out.println("Eklemek istediğiniz okul ve sınıfın başındaki kodu yazın");
        student.setClassID(input.nextInt() - 1);
        System.out.println("İsim ...");
        Scanner input = new Scanner(System.in);
        student.setName(input.nextLine());
        System.out.println("Soyad ...");
        student.setSurName(input.nextLine());
        System.out.println("yaş ...");
        student.setAge(input.nextInt());
        System.out.println("okul numarası ...");
        Scanner input2 = new Scanner(System.in);
        student.setNumber(input2.nextLine());
        Student.dataStudent.set(getUpdateID(),student.getName() + " " + student.getSurName() + " yaşı : " + student.getAge() + " sınıfı : " + ClassRoom.getDataClassRoom.get(student.getClassID()) + " numarası : " + student.getNumber());
        Student.getDataStudent.set(getUpdateID(),student.getName() + " " + student.getSurName() + " | " + ClassRoom.getDataClassRoom.get(student.getClassID()));
        System.out.println("Başarıyla güncellendi");
        Main.start();

    }

    @Override
    public void list() {

        int i = 1;
        for (Object datas : Student.getDataStudent) {
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
