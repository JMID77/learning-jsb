package jmid.learn.collections;

import java.util.HashMap;
import java.util.Map;

public class Collections {

    public void evalMapProductWithPrice() {
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

        for (Map.Entry<String, Double> entry : productWithPrice.entrySet()) {
            if (entry.getValue() > 10.0) {
                System.out.println("Product: " + entry.getKey() + ", Price: " + entry.getValue());
            }
        }
    }
}
