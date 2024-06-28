package vn.edu.likelion.bai2;

public class Product {
    private int productId;
    private String productName;
    private double price;
    static final String storeName = "ABC Store";

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", store name=" + storeName + '\'' +
                '}';
    }
}
