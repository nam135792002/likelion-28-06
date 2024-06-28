package vn.edu.likelion.bai2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> listProduct;

    public Cart(){
        this.listProduct = new ArrayList<>();
    }

    public void addToCart(Product product){
        this.listProduct.add(product);
        System.out.println("Add a product " + product.getProductName() + " successfully");
    }

    public void showInfo(){
        for (Product product : listProduct){
            System.out.println(product.toString());
        }
    }

    public void totalPrice(){
        double total = 0;
        for (Product product : listProduct){
            total += product.getPrice();
        }
        System.out.println("Total price of your cart: " + total);
    }
}
