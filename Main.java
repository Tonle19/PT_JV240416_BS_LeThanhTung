package run;


import entity.Laptop;
import entity.LaptopType;

import java.util.*;

public class Main {
    public static List<LaptopType> listCategories = new ArrayList<LaptopType>();
    public static List<Laptop> listLaptops = new ArrayList<>();
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("******************LAPTOP-MANAGEMENT******************");
        System.out.println("1. Quản lý loại laptop");
        System.out.println("2. Quản lý laptop");
        System.out.println("3. Thoát");
        System.out.print("Lựa chọn của bạn:");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                Main.displayMenuLaptop(scanner);
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
            default:
                System.err.println("Vui lòng chọn từ 1-3");
        }
    } while(true);
    }
}
public static void displayMenuLaptop(Scanner scanner) {
    boolean isExit = true;
    do {
        System.out.println("************QUẢN LÝ THỂ LOẠI*************");
        System.out.println("1. Hiển thị danh sách các loại laptop");
        System.out.println("2. Thêm mới loại laptop");
        System.out.println("3. Cập nhật thông tin loại laptop");
        System.out.println("4. Xóa loại Laptop ");
        System.out.println("5. Thoát");
        System.out.println("Lựa chọn của bạn:");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                Main.displayCategoriesLaptop(scanner);
                break;
            case 2:
                Main.addNewLaptop(scanner);
                break;
            case 3:
                Main.updateLaptopType();
                break;
            case 4:
                Main.deleteLaptopType(scanner);
                break;
            case 5:
                System.exit(0);
            default:
                System.err.println("Vui lòng chọn từ 1-6");
        }
    } while (isExit);
}
    public static void displayCategoriesLaptop() {
    listCategories.stream().sorted(Comparator.comparing(LaptopType::getTypeName)).forEach(LaptopType::output);}

    public static void addNewLaptop(Scanner scanner){
    LaptopType lapNew = new LaptopType();
    lapNew.input(scanner);
    Main.listCategories.add(lapNew);
}
    public static void updateLaptopType(Scanner scanner){
    System.out.println("nhập vào mã thể loại cập nhật: ");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        int indexUpdate = getIndexById(idUpdate);
        if(indexUpdate>=0){
            boolean isExist = true;
            do {
                System.out.println("1. Cập nhật tên laptop");
                System.out.println("2. Cập nhật trạng thái laptop");
                System.out.println("3. Thoát");
                System.out.print("Lựa chọn của bạn:");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        listCategories.get(indexUpdate).set(scanner.nextline());
                        break;
                    case 2:
                        listCategories.get(indexUpdate).set(Boolean.parseBoolean(scanner.nextline()));
                    case 3:
                        isExist = false;
                        break;
                    default:
                        System.err.println("vui lòng nhập lại từ 1-3");

                }
            }while (isExist);
        }else {
            System.err.println("mã laptop không tồn tại");
        }
    }
    public static void deleteLaptopType(Scanner scanner){
    System.out.println("nhập thể loại cần xóa:");
    int idDelete = Interger.parseInt(scanner.nextline);
    int indexDelete = getIndexById(idDelete);
    if(indexDelete>=0){
        boolean isExist = listBooks.stream().anyMatch(laptop -> laptop.getLaptopId() == idDelete);
        if (isExist){
            System.err.println("thể loại laptop không chứa laptop , không thể xóa được");

        }else {
            listCategories.remove(indexDelete);
        }
    }else {
        System.err.println("Mã laptop xóa không tồn tại");
    }
    }


