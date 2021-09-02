import java.util.Scanner;

public class Main {

    static School school = new School();
    static ClassRoom classRoom = new ClassRoom();
    static Teacher teacher = new Teacher();
    static Student student = new Student();
    static StudentManager studentManager = new StudentManager();
    static TeacherManager teacherManager = new TeacherManager();
    static BaseManager schoolManager = new SchoolManager();
    static BaseManager classRoomManager = new ClassRoomManager();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Main.start();
    }
    public static void start() {

        System.out.println("******HOŞGELDİNİZ******");
        System.out.println(" 1 --> Ekle");
        System.out.println(" 2 --> Listele");
        System.out.println(" 3 --> Güncelle");
        System.out.println(" 4 --> Sil");
        int value = input.nextInt();
        switch (value) {
            case 1 -> {
                System.out.println("Ne eklemek istersiniz ?");
                System.out.println("------------------------");
                System.out.println(" 1 --> Okul ekle");
                if (School.dataSchool.size() != 0) {
                    System.out.println(" 2 --> Sınıf ekle");
                    System.out.println(" 3 --> Öğretmen ekle");
                    if (ClassRoom.dataClassRoom.size() != 0) {
                        System.out.println(" 4 --> Öğrenci ekle");
                    }

                }
                int chose = input.nextInt();
                switch (chose) {
                    case 1 -> {
                        schoolManager.add();
                    }
                    case 2 -> {
                        if (School.dataSchool.size() != 0) {
                            classRoomManager.add();
                        } else {
                            System.out.println("Hatalı değer girdiniz");
                            start();
                        }

                    }
                    case 3 -> {
                        if (School.dataSchool.size() != 0) {
                            teacherManager.add();
                        } else {
                            System.out.println("Hatalı değer girdiniz");
                            start();
                        }
                    }
                    case 4 -> {
                        if (School.dataSchool.size() != 0 && ClassRoom.dataClassRoom.size() != 0) {
                            studentManager.add();
                        } else {
                            System.out.println("Hatalı bir değer girdiniz");
                            start();
                        }
                    }
                    default -> {
                        System.out.println("Hatalı bir değer girdiniz!");
                        start();
                    }
                }
            }
            case 2 -> {
                if(School.dataSchool.size() != 0) {
                    System.out.println(" 1 --> Okulları lisetele");
                    if(ClassRoom.dataClassRoom.size() !=0){
                        System.out.println(" 2 --> Sınıfları listele");
                    }
                    if(Teacher.dataTeacher.size() != 0){
                        System.out.println(" 3 --> Öğretmenleri listele");
                    }
                    if(Student.dataStudent.size() != 0){
                        System.out.println(" 4 --> Öğrencileri listele");
                    }
                    int chose2 = input.nextInt();
                    switch (chose2) {
                        case 1 -> {
                            schoolManager.list();
                        }
                        case 2 -> {
                            if(ClassRoom.dataClassRoom.size() !=0){
                                classRoomManager.list();
                            }
                            else {
                                System.out.println("Hatalı bir değer girdiniz");
                                Main.start();
                            }
                        }
                        case 3 -> {
                            if(Teacher.dataTeacher.size() != 0){
                                teacherManager.list();
                            }
                            else {
                                System.out.println("Hatalı bir değer girdiniz");
                                Main.start();
                            }
                        }
                        case 4 -> {
                            if(Student.dataStudent.size() != 0){
                                studentManager.list();
                            }
                            else {
                                System.out.println("Hatalı bir değer girdiniz");
                                Main.start();
                            }
                        }
                        default -> {
                            System.out.println("Hatalı bir değer girdiniz!");
                            start();
                        }
                    }
                }else{
                    System.out.println("Listelenecek kayıt bulunamadı.");
                    System.out.println("Geçmek için herhangi bir şey yazın");
                    Scanner anything = new Scanner(System.in);
                    String any;
                    any = anything.nextLine();
                    Main.start();
                }
            }
            case 3 -> {
                if(School.dataSchool.size() != 0) {
                    System.out.println(" 1 --> Okul güncelle");
                    if(ClassRoom.dataClassRoom.size() !=0){
                        System.out.println(" 2 --> Sınıf güncelle");
                    }
                    if(Teacher.dataTeacher.size() != 0){
                        System.out.println(" 3 --> Öğretmen güncelle");
                    }
                    if(Student.dataStudent.size() != 0){
                        System.out.println(" 4 --> Öğrenci güncelle");
                    }
                    int chose2 = input.nextInt();
                    switch (chose2) {
                        case 1 -> {
                            schoolManager.update();
                        }
                        case 2 -> {
                            if(ClassRoom.dataClassRoom.size() !=0){
                                classRoomManager.update();
                            }
                            else {
                                System.out.println("Hatalı bir değer girdiniz");
                                Main.start();
                            }
                        }
                        case 3 -> {
                            if(Teacher.dataTeacher.size() != 0){
                                teacherManager.update();
                            }
                            else {
                                System.out.println("Hatalı bir değer girdiniz");
                                Main.start();
                            }
                        }
                        case 4 -> {
                            if(Student.dataStudent.size() != 0){
                                studentManager.update();
                            }
                            else {
                                System.out.println("Hatalı bir değer girdiniz");
                                Main.start();
                            }
                        }
                        default -> {
                            System.out.println("Hatalı bir değer girdiniz!");
                            Main.start();
                        }
                    }
                }else{
                    System.out.println("Güncellenecek kayıt bulunamadı.");
                    System.out.println("Geçmek için herhangi bir şey yazın");
                    Scanner anything = new Scanner(System.in);
                    String any;
                    any = anything.nextLine();
                    Main.start();
                }
            }
            case 4 -> {
                if(School.dataSchool.size() != 0) {
                    System.out.println(" 1 --> Okul Sil");
                    if(ClassRoom.dataClassRoom.size() !=0){
                        System.out.println(" 2 --> Sınıf Sil");
                    }
                    if(Teacher.dataTeacher.size() != 0){
                        System.out.println(" 3 --> Öğretmen Sil");
                    }
                    if(Student.dataStudent.size() != 0){
                        System.out.println(" 4 --> Öğrenci Sil");
                    }
                    int chose2 = input.nextInt();
                    switch (chose2) {
                        case 1 -> {
                            schoolManager.delete();
                        }
                        case 2 -> {
                            if(ClassRoom.dataClassRoom.size() !=0){
                                classRoomManager.delete();
                            }
                            else {
                                System.out.println("Hatalı bir değer girdiniz");
                                Main.start();
                            }
                        }
                        case 3 -> {
                            if(Teacher.dataTeacher.size() != 0){
                                teacherManager.delete();
                            }
                            else {
                                System.out.println("Hatalı bir değer girdiniz");
                                Main.start();
                            }
                        }
                        case 4 -> {
                            if(Student.dataStudent.size() != 0){
                                studentManager.delete();
                            }
                            else {
                                System.out.println("Hatalı bir değer girdiniz");
                                Main.start();
                            }
                        }
                        default -> {
                            System.out.println("Hatalı bir değer girdiniz!");
                            Main.start();
                        }
                    }
                }else{
                    System.out.println("silinecek kayıt bulunamadı.");
                    System.out.println("Geçmek için herhangi bir şey yazın");
                    Scanner anything = new Scanner(System.in);
                    String any;
                    any = anything.nextLine();
                    Main.start();
                }
            }
            default -> {
                System.out.println("Hatalı bir sayı girdiniz!");
                start();
            }
        }
    }
}
