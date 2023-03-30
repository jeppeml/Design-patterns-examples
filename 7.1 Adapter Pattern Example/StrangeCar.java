package dk.easv;

import java.time.LocalDateTime;

public class StrangeCar implements IStrangeCar {
    private String licensePlate;
    private String country;
    private LocalDateTime time;
    private float price;

    public StrangeCar(String licensePlate, String country, LocalDateTime time, float price) {
        this.licensePlate = licensePlate;
        this.country = country;
        this.time = time;
        this.price = price;
    }

    @Override
    public String getLicense() {
        return licensePlate;
    }

    @Override
    public void setLicense(String licensePlate) {
    this.licensePlate = licensePlate;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
this.country = country;
    }

    @Override
    public LocalDateTime getFactoryDate() {
        return time;
    }

    @Override
    public void setFactoryDate(LocalDateTime time) {
this.time = time;
    }

    @Override
    public float getPriceInDKK() {
        return price;
    }

    @Override
    public void setPriceInDKK(float price) {
this.price=price;
    }
}
