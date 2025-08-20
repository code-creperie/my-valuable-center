package org.example.myvaluablecenter.controller;

import org.example.myvaluablecenter.model.Product;
import org.example.myvaluablecenter.model.Repository;
import org.example.myvaluablecenter.showcase.ProductObserver;
import org.example.myvaluablecenter.view.ConsoleProductView;
import java.util.List;

public class ProductController {
    private ConsoleProductView view;
    private Repository db;

    public ProductController(ConsoleProductView view, Repository db) {
        this.view = view;
        this.db = db;
        if (view instanceof ProductObserver) {
            db.addObserver((ProductObserver) view);
        }
    }


    public void showAvailableProducts() {
        List<Product> products = db.getProducts();
        if (!products.isEmpty()) {
            view.displayProducts(products);
        }
    }

    public void addNewProduct(Product p) {
        db.addProduct(p);
    }
}
