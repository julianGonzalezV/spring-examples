package co.com.training.beans.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TShirt {
    @Value("refxxxx1")
    private String id;
    @Value("10")
    private int shirtNumber;
    @Autowired
    private ShirtBrand brand;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public ShirtBrand getBrand() {
        return brand;
    }

    public void setBrand(ShirtBrand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "id='" + id + '\'' +
                ", shirtNumber=" + shirtNumber +
                ", brand=" + brand +
                '}';
    }
}
