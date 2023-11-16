package data;

import com.opencsv.CSVReader;
import common.ProductsFilepath;
import products.Products;
import products.ProductsFactory;

import java.io.FileReader;
import java.util.List;

public class ProductsReaderData {
    ProductsDataList productsList = ProductsDataList.getInstance();

    public List<Products> readDataFromFile() {
        try (CSVReader csvReader = new CSVReader(new FileReader(ProductsFilepath.filePath))) {
            List<String[]> rows = csvReader.readAll();
            for (String[] row : rows) {
                if(row != null){
                    Products product = ProductsFactory.createProduct(row[0],row[1],row[2],
                            Integer.parseInt(row[3]),Double.parseDouble(row[4]),row[5],row[6], Boolean.parseBoolean(row[7]));
                    productsList.addProduct(product);
                }
            }
        } catch (Exception e) {

        }
        return productsList.getProductsList();
    }
}
