package data;

import products.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductsDataList {
    private static ProductsDataList instance;
    private final List<Products> productsList;
    private ProductsReaderData productsReaderData;

    private ProductsDataList(){
        productsList = new ArrayList<>();
    }

    public static synchronized ProductsDataList getInstance(){
        if(instance == null){
            instance = new ProductsDataList();
        }
        return instance;
    }
    public void addProduct(Products product){
        productsList.add(product);
    }
    public List<Products> getProductsList(){
        return productsList;
    }

    @Override
    public String toString() {
        return "ProductsDataList{" +
                "productsList=" + productsList +
                ", productsReaderData=" + productsReaderData +
                '}';
    }
}
