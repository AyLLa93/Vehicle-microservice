package Model;

public class Vozilo {

    private int id;
    private String brand;
    private String name;
    private String type;
    private int producedYear;
    private String transmission;
    private String color;
    private boolean available;

    public Vozilo() {}

    public Vozilo(int id, String brand, String name, String type, int producedYear, String transmission, String color, boolean available) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.producedYear = producedYear;
        this.transmission = transmission;
        this.color = color;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProducedYear() {
        return producedYear;
    }

    public void setProducedYear(int producedYear) {
        this.producedYear = producedYear;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
