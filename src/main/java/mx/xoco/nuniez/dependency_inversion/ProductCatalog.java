package mx.xoco.nuniez.dependency_inversion;

import mx.xoco.nuniez.dependency_inversion.intfc.IProductRepository;

public class ProductCatalog {

    private IProductRepository productRepository;

    public ProductCatalog(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void listAllProducts() {
        productRepository.getAllProductNames();
        // List all products here
    }

}
