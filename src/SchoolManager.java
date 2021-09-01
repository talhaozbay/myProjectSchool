import java.util.Scanner;

public class SchoolManager implements BaseManager {

    public static Scanner input = new Scanner(System.in);
    public static School school = new School();
    private int updateID;

    @Override
    public void add() {

        System.out.println("Okulun adını giriniz ... ");
        school.setName(input.nextLine());
        System.out.println("Okulun kodunu giriniz ...");
        school.setCode(input.nextLine());
        System.out.println("Okul aktif mi (Aktif ise 'evet' Aktif değil ise 'hayır' yazınız) ... ");
        aktifMi();
        System.out.println("eklenme işlemi tamamlandı");
        System.out.println(school.isActive());
        school.addArray();

    }

    public void aktifMi() {

        String isActive = input.nextLine();
        switch (isActive) {
            case "evet" -> {
                school.setActive(true);
                System.out.println(school.isActive());
            }
            case "hayır" -> {
                school.setActive(false);
                System.out.println(school.isActive());
            }
            default -> {
                System.out.println("hatalı bir değer girdiniz");
                System.out.println(school.isActive());
                aktifMi();
            }
        }

    }

    @Override
    public void delete() {

        try{
        int i = 1;
        for (Object datas : School.getDataSchool) {
            System.out.print("-" + i + "-   ");
            System.out.println(datas);
            i++;
        }
        System.out.println("Silmek istediğiniz okulun başındakı kodu yazınız...");
        Scanner deleteIn = new Scanner(System.in);
        i = deleteIn.nextInt() - 1;
        School.dataSchool.remove(i);
        School.getDataSchool.remove(i);
        System.out.println("Okul Silindi!");
        Main.start();
        }catch (Exception e){
            System.out.println("Hatalı bir değer girdiniz");
            Main.start();
        }

    }

    @Override
    public void update() {

        int i = 1;
        for (Object datas : School.getDataSchool) {
            System.out.print("-" + i + "-   ");
            System.out.println(datas);
            i++;
        }
        System.out.println("Güncellenecek okulun başındakı kodu yazınız...");
        Scanner updateSchoolIn = new Scanner(System.in);
        setUpdateID(updateSchoolIn.nextInt());
        System.out.println(getUpdateID());
        System.out.println("Okulun adını giriniz ... ");
        school.setName(input.nextLine());
        System.out.println("Okulun kodunu giriniz ...");
        school.setCode(input.nextLine());
        System.out.println("Okul aktif mi (Aktif ise 'evet' Aktif değil ise 'hayır' yazınız) ... ");
        aktifMi();
        System.out.println("eklenme işlemi tamamlandı");
        School.dataSchool.set(getUpdateID(), "okul adı : " + school.getName() + " | okul kodu : " + school.getCode() + " | okul aktif mi : " + school.isActive());
        School.getDataSchool.set(getUpdateID(), school.getName() + " " + school.getCode());
        System.out.println("Başarıyla güncellendi");
        Main.start();

    }

    @Override
    public void list() {
        int i = 1;
        for (Object datas : School.getDataSchool) {
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