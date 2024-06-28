package vn.edu.likelion.bai2;

public class ShoppingApp {
    public static void main(String[] args) {
        Product product1 = new Product(111, "Paper", 12000);
        Product product2 = new Product(112, "Sugar", 100);
        Product product3 = new Product(113, "Milk", 19300);

        Cart cart = new Cart();
        cart.addToCart(product1);
        cart.addToCart(product2);
        cart.addToCart(product3);

        cart.showInfo();

        cart.totalPrice();
    }
}
