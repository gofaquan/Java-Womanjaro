package extend.exercise;

public class PC extends computer {
    private String brand;

    public PC(String CPU, int memory, int disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public String getBrandInfo() {
        return "brand:"+brand+getDetails();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
