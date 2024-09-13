package Constructor;
public class Product {
    private String name;
    private double price;
    private String category;


    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    
    public String toString() {
        return "Product: " + name + ", Category: " + category + ", Price: ₹" + price;
    }
}

class Flipkart {
    private String userName;
    private Product product1;
    private Product product2;

    public Flipkart(String userName) {
        this.userName = userName;
        this.product1 = null;
        this.product2 = null;
    }

    public void addToCart(Product product) {
        if (product1 == null) {
            product1 = product;
            System.out.println(product.getName() + " added to cart.");
        } else if (product2 == null) {
            product2 = product;
            System.out.println(product.getName() + " added to cart.");
        } else {
            System.out.println("Cart is full. Remove a product before adding another.");
        }
    }

    public void viewCart() {
        System.out.println("Cart for " + userName + ":");
        if (product1 == null && product2 == null) {
            System.out.println("Your cart is empty.");
        } else {
            if (product1 != null) {
                System.out.println(product1);
            }
            if (product2 != null) {
                System.out.println(product2);
            }
        }
    }

    public void removeFromCart(String productName) {
        if (product1 != null && product1.getName().equals(productName)) {
            System.out.println(product1.getName() + " removed from cart.");
            product1 = null;
        } else if (product2 != null && product2.getName().equals(productName)) {
            System.out.println(product2.getName() + " removed from cart.");
            product2 = null;
        } else {
            System.out.println("Product not found in the cart.");
        }
    }

    public static void main(String[] args) {
        Flipkart userFlipkart = new Flipkart("John Doe");
        Product product1 = new Product("iPhone 14", 79999.99, "Electronics");
        Product product2 = new Product("Nike Shoes", 4999.99, "Footwear");
        userFlipkart.addToCart(product1);
        userFlipkart.addToCart(product2);
        userFlipkart.viewCart();
        userFlipkart.removeFromCart("Nike Shoes");
        userFlipkart.viewCart();
    }
}

