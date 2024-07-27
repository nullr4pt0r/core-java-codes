package hack;

import java.util.HashSet;
import java.util.Set;
class Product {
    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", product_type='" + product_type + '\'' +
                '}';
    }

    private int product_id;
    private String name;
    private String product_type;

    public Product(int product_id, String name, String product_type) {
        this.product_id = product_id;
        this.name = name;
        this.product_type = product_type;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }
}

class ProductPrice {
    @Override
    public String toString() {
        return "ProductPrice{" +
                "product_id=" + product_id +
                ", price=" + price +
                '}';
    }

    private int product_id;
    private double price;

    public ProductPrice(int product_id, double price) {
        this.product_id = product_id;
        this.price = price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
public class Stream {

     static void streamData(Set<Product> product, Set<ProductPrice> productPrice ){
        product.stream().
                filter(product1 -> productPrice.stream().anyMatch(pp ->
                pp.getProduct_id() == product1.getProduct_id())).
                map(product1 -> {
                    ProductPrice pp = productPrice.stream().
                            filter(pprice -> pprice.getProduct_id() == product1.getProduct_id())
                            .findFirst().orElse(null);
            System.out.println("Product price -> "+ pp);
            return null;
        }).toList();
    }

    public static void main(String[] args) {
        // Create sample products
        Product productA = new Product(1, "Product A", "Type1");
        Product productB = new Product(2, "Product B", "Type2");
        Product productC = new Product(3, "Product C", "Type1");

        // Create sample product prices
        ProductPrice priceA = new ProductPrice(1, 100.0);
        ProductPrice priceB = new ProductPrice(2, 150.0);
        ProductPrice priceC = new ProductPrice(3, 120.0);

        // Create sets to hold products and product prices
        Set<Product> products = new HashSet<>();
        products.add(productA);
        products.add(productB);
        products.add(productC);

        Set<ProductPrice> productPrices = new HashSet<>();
        productPrices.add(priceA);
        productPrices.add(priceB);
        productPrices.add(priceC);

        streamData(products,productPrices);

    }

}
