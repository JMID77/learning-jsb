package jmid.learn.collections.exo;

import java.util.HashMap;
import java.util.Map;

public class ExoStock {
    private Map<String, Integer> stock = new HashMap<>();

    public ExoStock() {
        stock.put("P1", 10);
        stock.put("P2", 5);
    }  

    public void executeExo() {
        System.out.println("\n>>>> ExoStock.executeExo()");
        System.out.println("Initial stock: " + stock);
        
        // Ajout de produits
        addProduct("P3", 20);
        System.out.println("After adding P3: " + stock);
        
        // Suppression de produits
        reduceStock("P1", 5);
        reduceStock("P1", 5);
        reduceStock("P1", 5);
        reduceStock("P2", 3);
        reduceStock("P2", 1);
        reduceStock("P2", 2);
        reduceStock("P3", 15);
        reduceStock("P3", 10);
        
        showOutOfStock();
    }

    public void addProduct(String product, int quantity) {
        int stockInitial = stock.getOrDefault(product, 0);

        stockInitial += quantity;
        stock.put(product, stockInitial);
        
        // // Simplifier
        // stock.put(product, stock.getOrDefault(product, 0) + quantity);
        // // Autre variante
        // stock.compute(produit, (k, v) -> (v == null ? quantiteAjoutee : v + quantiteAjoutee)); // pour ajouter
    }

    public void reduceStock(String product, int quantity) {
        int stockInitial;

        if (stock.containsKey(product) && stock.get(product) >= quantity) {
            stockInitial = stock.get(product);
            stockInitial -= quantity;
            stock.put(product, stockInitial);
        } else {
            System.out.println("Stock insufisant");
        }

        // // Simplifier
        // stock.put(produit, Math.max(stock.getOrDefault(produit, 0) - quantiteRetiree, 0));  // [Math.max(..., 0)] évite d’avoir une quantité négative.
        // // Variante
        // stock.compute(produit, (k, v) -> (v == null || v <= quantiteRetiree) ? 0 : v - quantiteRetiree); // pour retirer
    }

    private void showOutOfStock() {
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            if (entry.getValue() <= 0) {
                System.out.println(entry.getKey()+" (Stock=OutOfStock)");
            } else {
                System.out.println(entry.getKey()+" => "+entry.getValue()+" (Stock=OK)");
            }
        }
    }
}
