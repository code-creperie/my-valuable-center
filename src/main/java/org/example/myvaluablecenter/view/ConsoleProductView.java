package org.example.myvaluablecenter.view;

import org.example.myvaluablecenter.model.Comment;
import org.example.myvaluablecenter.model.Product;
import org.example.myvaluablecenter.showcase.ProductObserver;

import java.util.List;

public class ConsoleProductView implements ProductObserver {

    public void displayProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Comments:");
            for (Comment comment : product.getComments()) {
                System.out.println("  - " + comment.getAuthor() + ": " + comment.getText());
            }
            System.out.println("------------------------------------");
        }
    }

    @Override
    public void onProductAdded(Product product) {
        System.out.println("🔔 A new product was added: " + product.getName());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Comments:");
        for (Comment comment : product.getComments()) {
            System.out.println("  - " + comment.getAuthor() + ": " + comment.getText());
        }
        System.out.println("------------------------------------");
    }
}
