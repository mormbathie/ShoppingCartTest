package shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productList;
    private int productCount;
    private double totalValue;

    public ShoppingCart() {
        productList = new ArrayList<>();
        productCount = 0;
        totalValue = 0.0;
    }

    public void addProduct(Product product, int quantity) {
        productList.add(product);
        productCount += quantity;
        totalValue += product.getUnitPrice() * quantity;
    }

    public int getProductCount() {
        return productCount;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public Product getProduct(int index) {
        // Assurez-vous que l'indice est valide.
        if (index >= 0 && index < productList.size()) {
            return productList.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    // ... Autres méthodes ...
}
