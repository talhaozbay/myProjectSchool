import java.util.Scanner;

public class ClassRoomManager implements BaseManager {

    public static Scanner input = new Scanner(System.in);
    public static ClassRoom classRoom = new ClassRoom();
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
        classRoom.setSchoolID(input.nextInt() - 1);
        System.out.println("Sınıfın seviyesini giriniz ... ");
        classRoom.setLevel(input.nextInt());
        System.out.println("Sınıfın şubesini giriniz ...");
        Scanner input = new Scanner(System.in);
        classRoom.setCode(input.nextLine());
        System.out.println("Sınıf aktif mi (Aktif ise 'evet' Aktif değil ise 'hayır' yazınız) ... ");
        aktifMi();
        System.out.println("eklenme işlemi tamamlandı");
        System.out.println(classRoom.isActive());
        classRoom.addArray();
    }

    @Override
    public void delete() {

        try{
        int i = 1;
        for (Object datas : ClassRoom.getDataClassRoom) {
            System.out.print("-" + i + "-   ");
            System.out.println(datas);
            i++;
        }
        System.out.println("Silmek istediğiniz sınıfın başındakı kodu yazınız...");
        Scanner deleteIn = new Scanner(System.in);
        i = deleteIn.nextInt() - 1;
        ClassRoom.dataClassRoom.remove(i);
        ClassRoom.getDataClassRoom.remove(i);
        System.out.println("Sınıf Silindi!");
        Main.start();
        }catch (Exception e){
            System.out.println("Hatalı bir değer girdiniz");
            Main.start();
        }

    }

    @Override
    public void update() {

        int i = 1;
        for(Object datas : ClassRoom.getDataClassRoom){
            System.out.print("-"+ i + "-   ");
            System.out.println(datas);
            i++;
        }
        System.out.println("Güncellemek istediğiniz sınıfın başındaki kodu yazınız");
        Scanner updateSchoolIn = new Scanner(System.in);
        setUpdateID(updateSchoolIn.nextInt());
        int x = 1;
        for (Object datas : School.getDataSchool) {
            System.out.print("-" + x + "-" + " : ");
            x++;
            System.out.println(datas);
        }
        System.out.println("Eklemek istediğiniz okulun başındaki kodu yazınız");
        classRoom.setSchoolID(input.nextInt() - 1);
        System.out.println("Sınıfın seviyesini giriniz ... ");
        classRoom.setLevel(input.nextInt());
        System.out.println("Sınıfın şubesini giriniz ...");
        Scanner input = new Scanner(System.in);
        classRoom.setCode(input.nextLine());
        System.out.println("Sınıf aktif mi (Aktif ise 'evet' Aktif değil ise 'hayır' yazınız) ... ");
        aktifMi();
        System.out.println("eklenme işlemi tamamlandı");
        ClassRoom.dataClassRoom.set(getUpdateID(),"Sınıf : " + classRoom.getLevel() + classRoom.getCode() + " | Sınıf aktif mi : " + classRoom.isActive() + " | Bağlı olduğu okul : " + School.getDataSchool.get(classRoom.getSchoolID()));
        ClassRoom.getDataClassRoom.set(getUpdateID(),classRoom.getLevel() + classRoom.getCode() + " | " + School.getDataSchool.get(classRoom.getSchoolID()));
        System.out.println("Başarıyla güncellendi");
        Main.start();

    }

    @Override
    public void list() {

        int i = 1;
        for (Object datas : ClassRoom.getDataClassRoom) {
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

    public void aktifMi() {

        Scanner input = new Scanner(System.in);
        String isActive = input.nextLine();
        switch (isActive) {
            case "evet" -> {
                classRoom.setActive(true);
                System.out.println(classRoom.isActive());
            }
            case "hayır" -> {
                classRoom.setActive(false);
                System.out.println(classRoom.isActive());
            }
            default -> {
                System.out.println("hatalı bir değer girdiniz");
                System.out.println(classRoom.isActive());
                aktifMi();
            }
        }

    }

    public int getUpdateID() {
        return updateID;
    }

    public void setUpdateID(int updateID) {
        this.updateID = updateID - 1;
    }
}
