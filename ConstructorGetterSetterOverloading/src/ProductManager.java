import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public ProductManager() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added.");

    }

    public void updateProduct(int id, String newName, String newDetails, int newStock) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setDetails(newDetails);
                product.setStock(newStock);
            }
        }
        System.out.println("Product updated.");

    }

    public void updateProduct(int id, String newDetails, int newStock) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setDetails(newDetails);
                product.setStock(newStock);
            }
        }
        System.out.println("Product updated.");

    }

    public void deleteProduct(int id) {
        Product productToRemove = null;

        for (Product product : products) {
            if (product.getId() == id) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
        }
        System.out.println("Product deleted.");
    }

    public void showProducts() {
        for (Product product : products) {
            System.out.println("Product ID:" + product.getId() +
                    "\nProduct name: " + product.getName() +
                    "\nProduct details: " + product.getDetails() +
                    "\nProduct stock: " + product.getStock());
            System.out.println();
            System.out.println("*************");
            ;


        }
    }
}
