package entity;

import java.util.Scanner;

public class Laptop implements iEntity {
    private String laptopId;
    private String laptopName;
    private String description;
    private int ram;
    private double weight;
    private String creatAt;
    private double laptopPrice;
    private int typeId;
    private boolean isDeleted;
    public Laptop(){

    }

    public Laptop(String laptopId, String laptopName, String description, int ram, double weight, String creatAt, double laptopPrice, int typeId, boolean isDeleted) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
        this.description = description;
        this.ram = ram;
        this.weight = weight;
        this.creatAt = creatAt;
        this.laptopPrice = laptopPrice;
        this.typeId = typeId;
        this.isDeleted = isDeleted;
    }

    public String getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(String laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(String creatAt) {
        this.creatAt = creatAt;
    }

    public double getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(double laptopPrice) {
        this.laptopPrice = laptopPrice;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
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
        this.laptopId = inputLaptopId(scanner);
        this.laptopName =inputLaptopName(scanner);
        this.description = inputDescription(scanner);
        this.ram = inputRam(scanner);
        this.weight = inputWeight(scanner);
        this.creatAt = inputCreatAt(scanner);
        this.laptopPrice = inputLaptopPrice(scanner);
        this.typeId = inputTypeId(scanner);
    }
}
