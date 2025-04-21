package jmid.learn.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jmid.learn.Evaluation;

public class EvalCollections extends Evaluation {
    public EvalCollections() {
        setActive(false);
    }

    @Override
    public void execute() {
        System.out.println("\n>>>> Collections");
        evalMapProductWithPriceHashMap();
        evalMapProductWithPriceArrayListObjectProduct();
    }

    public void evalMapProductWithPriceHashMap() {
        System.out.println("\n>>>> evalMapProductWithPriceHashMap");
        Map<String, Double> productWithPrice = new HashMap<>();

        productWithPrice.put("Product_1", 15.25);
        productWithPrice.put("Product_2", 20.50);
        productWithPrice.put("Product_3", 30.00);
        productWithPrice.put("Product_4", 12.75);
        productWithPrice.put("Product_5", 8.99);
        productWithPrice.put("Product_6", 5.50);
        productWithPrice.put("Product_7", 18.00);
        productWithPrice.put("Product_8", 22.30);
        productWithPrice.put("Product_9", 10.0);
        productWithPrice.put("Product_10", 9.99);
        
        // Mon code
        for (Map.Entry<String, Double> entry : productWithPrice.entrySet()) {
            if (entry.getValue() > 10.0) {
                System.out.println("Product: " + entry.getKey() + ", Price: " + entry.getValue());
            }
        }
    }

    public void evalMapProductWithPriceArrayListObjectProduct() {
        System.out.println("\n>>>> evalMapProductWithPriceArrayListObjectProduct");
        List<Produit> produits = new ArrayList<>();

        produits.add(new Produit("Clavier", 25.0));
        produits.add(new Produit("Stylo", 2.5));
        produits.add(new Produit("Écran", 120.0));

        produits.stream()
            .filter(p -> p.getPrix() > 10)
            .forEach(System.out::println);
    }
}
