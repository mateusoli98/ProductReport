package controller;

import model.Product;

public class ProductController {

    public boolean validate(Product product) {
        return product.getAmount() >= 0
                && product.getPrice() >= 0
                && !product.getName().isEmpty();
    }
}
