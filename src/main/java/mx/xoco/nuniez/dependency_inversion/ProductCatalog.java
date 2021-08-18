package mx.xoco.nuniez.dependency_inversion;

public class ProductCatalog {

    public void listAllProducts() {
        SQLProductRepository sqlProductRepository = new SQLProductRepository();
        sqlProductRepository.getAllProductNames();
        // List all products here
    }

}
