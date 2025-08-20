package org.example.myvaluablecenter.model;

import org.example.myvaluablecenter.showcase.ProductObservable;
import org.example.myvaluablecenter.showcase.ProductObserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository implements ProductObservable {
    private List<Product> products;
    private List<ProductObserver> observers;

    public Repository() {
        products = new ArrayList<>();
        observers = new ArrayList<>();
        initializeSampleData();
    }

    private void initializeSampleData() {
        Product singletonMug = new Product(1, "Singleton Mug", "A mug that ensures you never have more than one sip at a time.", 15.99,
                new ArrayList<>(Arrays.asList(
                        new Comment(1, "Keeps my coffee consumption under control!", "JavaJuggler"),
                        new Comment(2, "I tried to pour more coffee, but it refused!", "CodeCaffeinator")
                )));

        Product factoryTea = new Product(2, "Factory Method Tea", "Tea bags that instantiate different flavors randomly.", 9.99,
                new ArrayList<>(Arrays.asList(
                        new Comment(3, "Every cup is a surprise!", "TeaFactoryMaster"),
                        new Comment(4, "Got peppermint when I wanted chamomile... interesting concept!", "FlavorFluctuator")
                )));

        Product observerNotebook = new Product(3, "Observer Notebook", "Updates itself whenever you write in another notebook.", 25.49,
                new ArrayList<>(Arrays.asList(
                        new Comment(5, "Now my notes sync without Wi-Fi!", "SyncScribe"),
                        new Comment(6, "Unfortunately, it also copies my mistakes.", "BugCatcher")
                )));

        Product decoratorShoes = new Product(4, "Decorator Shoes", "Shoes that dynamically attach accessories for different occasions.", 79.99,
                new ArrayList<>(Arrays.asList(
                        new Comment(7, "Went from sneakers to formal shoes in seconds!", "AccessoRiser"),
                        new Comment(8, "I added too many accessories, now they look ridiculous.", "FashionOverload")
                )));

        Product proxyMirror = new Product(5, "Proxy Mirror", "Only shows your reflection when authorized.", 49.99,
                new ArrayList<>(Arrays.asList(
                        new Comment(9, "Finally, a mirror that respects my privacy!", "ReflectionRebel"),
                        new Comment(10, "It locked me out of my own reflection...", "PrivacyPunisher")
                )));

        products.add(singletonMug);
        products.add(factoryTea);
        products.add(observerNotebook);
        products.add(decoratorShoes);
        products.add(proxyMirror);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
        notifyObservers(product);
    }

    @Override
    public void addObserver(ProductObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ProductObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Product product) {
        for (ProductObserver observer : observers) {
            observer.onProductAdded(product);
        }
    }
}

