package ws.ws.ws.ws;

import java.io.Serializable;

public static class Product implements Serializable {
    private long id;
    private String name;
    private String reference;
    private float price;
    private Productcontroller.Category category;

    public Product(){

    }

    public Product(String name, String reference, float price, Productcontroller.Category category) {
        this.name = name;
        this.reference = reference;
        this.price = price;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Productcontroller.Category getCategory() {
        return category;
    }

    public void setCategory(Productcontroller.Category category) {
        this.category = category;
    }
}
}
