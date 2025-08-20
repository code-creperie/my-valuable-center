package org.example.myvaluablecenter.main;

import org.example.myvaluablecenter.controller.ProductController;
import org.example.myvaluablecenter.model.Comment;
import org.example.myvaluablecenter.model.Product;
import org.example.myvaluablecenter.model.Repository;
import org.example.myvaluablecenter.view.ConsoleProductView;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ConsoleProductView viewConsole = new ConsoleProductView();
        Repository db = new Repository();
        ProductController controller = new ProductController(viewConsole, db);
        controller.showAvailableProducts();
        Product strategyLamp = new Product(6, "Strategy Lamp", "A lamp that changes brightness based on your mood.", 39.99,
                new ArrayList<>(Arrays.asList(
                        new Comment(11, "Finally, my room adapts to my emotions!", "MoodMaster"),
                        new Comment(12, "I swear it dimmed when I started debugging...", "BugHunter"))));
        controller.addNewProduct(strategyLamp);

    }
}
