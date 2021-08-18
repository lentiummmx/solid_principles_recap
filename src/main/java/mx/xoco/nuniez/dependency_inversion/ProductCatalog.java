package mx.xoco.nuniez.dependency_inversion;

import mx.xoco.nuniez.dependency_inversion.factory.ProductFactory;
import mx.xoco.nuniez.dependency_inversion.intfc.IProductRepository;

public class ProductCatalog {

    public void listAllProducts() {
        IProductRepository sqlProductRepository = ProductFactory.create();
        sqlProductRepository.getAllProductNames();
        // List all products here
    }

}
