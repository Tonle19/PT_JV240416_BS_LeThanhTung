package entity;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LaptopType implements iEntity {
    private int typeId;
    private String typeName;
    private String description;
    private boolean isDeleted;
    public LaptopType(){

    }

    public LaptopType(int typeId, String typeNam, String description, String book, boolean isDeleted) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.description = description;
        this.isDeleted = isDeleted;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeNam(String typeNam) {
        this.typeName = typeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public void input(Scanner scanner) {

    }

    @Override
    public void output() {

    }
    public void input (Scanner scanner){
        this.typeId = inputTypeId(scanner);
        this.typeName = inputTypeName(scanner);
        this.description = inputDescription(scanner);
    }
    public String inputTypeId(Scanner scanner) {
        String idRegex = "L[\\w]";
        System.out.println("Nhập vào mã laptop:");
        do {
            String typeId = scanner.nextLine();
            if (Pattern.matches(idRegex, typeId)) {
                if (LaptopType.listLaptops.stream().anyMatch(LaptopType -> LaptopType.getTypeId().equals(typeId))) {
                    System.err.println("Mã laptop đã tồn tại, vui lòng nhập lại");
                } else {
                    return typeId;
                }
            } else {
                System.err.println("Mã laptop sai định dạng, vui lòng nhập lại");
            }
        } while (true);
    }
    public String inputDescription(Scanner scanner) {
        System.out.println("Nhập vào mô tả:");
        do {
            String description = scanner.nextLine();
            if (description.trim().isEmpty()) {
                System.err.println("Mô tả không được để trống, vui lòng nhập lại");
            } else {
                return description.trim();
            }
        } while (true);
    }
    public void output() {
        System.out.printf("Mã laptop: %s - tên máy: %s - mô tả: %s \n",
                this.typeId, this.typeName, this.description,);
}
