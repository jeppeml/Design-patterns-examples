package dk.easv;


import java.io.Serializable;

/*
1. License plate

2. Make

3. Model

4. Year/month

5. Price
 */
public class Car implements ICar, Printable {
    private String licensePlate;
    private String make;
    private String model;
    private String yearMonth;
    private Double price;
    private CarType carType;

    public Car() {
    }

    public Car(String licensePlate, String make, String model, String yearMonth, Double price, CarType carType) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.yearMonth = yearMonth;
        this.price = price;
        this.carType = carType;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(this.make + ", " + this.model + ", " +
                this.yearMonth + ": " + this.price);
    }

}
