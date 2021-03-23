package dk.easv;

public class Horse implements Printable {
    private String name;
    private String bDate;

    public Horse(String name, String bDate) {
        this.name = name;
        this.bDate = bDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbDate() {
        return bDate;
    }

    public void setbDate(String bDate) {
        this.bDate = bDate;
    }

    @Override
    public void print() {
        System.out.println("Hest: " + this.name + ", " + this.bDate);
    }
}
