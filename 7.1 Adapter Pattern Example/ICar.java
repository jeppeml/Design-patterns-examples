package dk.easv;

public interface ICar {
    String getLicensePlate();

    String getMake();

    String getModel();

    String getYearMonth();

    Double getPrice();

    void setPrice(Double price);
}
