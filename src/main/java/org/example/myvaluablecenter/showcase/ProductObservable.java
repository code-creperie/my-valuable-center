package org.example.myvaluablecenter.showcase;

import org.example.myvaluablecenter.model.Product;

public interface ProductObservable {
    void addObserver(ProductObserver observer);
    void removeObserver(ProductObserver observer);
    void notifyObservers(Product product);
}
