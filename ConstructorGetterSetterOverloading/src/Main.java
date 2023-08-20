public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Milkshake", "White", 12);
        Product product2 = new Product(2, "Milkshake", "Chocolate", 16);
        Product product3 = new Product(3, "Milkshake", "Caramel", 24);

        ProductManager productManager = new ProductManager();

        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);

        productManager.showProducts();
        productManager.deleteProduct(3);
        productManager.showProducts();
        productManager.updateProduct(1, "Magnum", "Chocolate", 20);
        productManager.showProducts();


    }
}