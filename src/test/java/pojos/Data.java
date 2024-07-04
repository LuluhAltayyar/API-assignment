package pojos;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    private int year;
    private double price;
    private String cpuModel;
    private String hardDiskSize;

    public Data() {
    }

    public Data(int year, double price, String cpuModel, String hardDiskSize) {
        this.year = year;
        this.price = price;
        this.cpuModel = cpuModel;
        this.hardDiskSize = hardDiskSize;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    @JsonProperty("CPU model")
    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }
    @JsonProperty("Hard disk size")
    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    @Override
    public String toString() {
        return "Data{" +
                "year=" + year +
                ", price=" + price +
                ", cpuModel='" + cpuModel + '\'' +
                ", hardDiskSize='" + hardDiskSize + '\'' +
                '}';
    }
}
