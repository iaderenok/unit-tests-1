package seminars.first.Shop;

import seminars.first.Shop.Products.Fruits;
import seminars.first.Shop.Products.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    public static ArrayList<Product> allProducts = new ArrayList<>();
    {
        allProducts.add(new Apple(100));
        allProducts.add(new Banana(150));
        allProducts.add(new Lemon(50));
        allProducts.add(new Orange(125));

    }
//    private List<Product> products;

    // Геттеры, сеттеры:
//    public List<Product> getProducts() {
//        return products;
//    }

//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        int max_cost = 0;
        List<Integer> cost = new ArrayList<>();
        for (int i = 0; i < allProducts.size(); i++) {
            cost.add(i);
        }
        for (int i = 0; i < cost.size(); i++) {
            if(cost.get(i) >cost.get(i+1)){
                //cost.get(i) == max_cost;
                //cost.get(i+1) = cost.get(i);
            }else{
                max_cost = cost.get(i+1);
            }
        }


        return null;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        return null;
    }

}