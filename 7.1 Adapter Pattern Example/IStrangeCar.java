package dk.easv;

import java.time.LocalDateTime;

public interface IStrangeCar {
    String getLicense();// return license plate number
    void setLicense(String licensePlate);

    String getCountry(); // returns country of origin
    void setCountry(String country);

    LocalDateTime getFactoryDate(); // the LocalDateTime of production date
    void setFactoryDate(LocalDateTime time);

    float getPriceInDKK(); //returns price in danish kroners
    void setPriceInDKK(float price);
}
