package data;

import com.opencsv.CSVWriter;
import common.ProductsFilepath;
import products.Products;

import java.io.FileWriter;
import java.util.List;

public class ProductsWriterData {
    public void writerProductsToCSVFile(List<Products> productsList) {
        {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(ProductsFilepath.filePath)))
            {
                for(Products products : productsList){
                    String[] record = {products.getId(),products.getUid(),products.getName(),
                            String.valueOf(products.getQuantity()), String.valueOf(products.getPrice()),
                            products.getProductDescription(),products.getSoftwareClassification(), String.valueOf(products.isActive())};
                            csvWriter.writeNext(record);
                }
            } catch (Exception e) {

            }
        }
    }
}
