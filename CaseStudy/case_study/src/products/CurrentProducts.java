package products;

public class CurrentProducts extends Products{
    private static Products currentProducts;
    private CurrentProducts(String id, String uid, String name, int quantity, double price,
                            String productDescription, String softwareClassification,boolean isActive) {
        super(id, uid, name, quantity, price, productDescription, softwareClassification,isActive);
    }
   public static void setCurrentProduct(Products product){
        currentProducts = product;
   }
   public static Products getCurrentProducts (){
        return currentProducts;
   }
}
