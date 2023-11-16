package products;

public abstract class Products {
    private String id;
    private String uid;
    private String name;
    private int quantity;
    private double price;
    private String productDescription;
    private String softwareClassification;
    private boolean isActive;

    public Products(String id, String uid, String name, int quantity, double price,
                    String productDescription,String softwareClassification,boolean isActive) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.productDescription = productDescription;
        this.softwareClassification = softwareClassification;
        this.isActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;

    }

    public String getSoftwareClassification() {
        return softwareClassification;
    }

    public void setSoftwareClassification(String softwareClassification) {
        this.softwareClassification = softwareClassification;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
