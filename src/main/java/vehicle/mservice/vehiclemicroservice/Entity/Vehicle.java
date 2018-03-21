package vehicle.mservice.vehiclemicroservice.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue
    private long ID;
    private String brand;
    private String name;
    private String type;
    private int productionYear;
    private String transmission;
    private String color;
    private int locationID;
    private boolean available;

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
