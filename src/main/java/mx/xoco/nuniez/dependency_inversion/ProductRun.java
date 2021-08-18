package mx.xoco.nuniez.dependency_inversion;

import mx.xoco.nuniez.dependency_inversion.factory.ProductFactory;
import mx.xoco.nuniez.dependency_inversion.intfc.IProductRepository;

public class ProductRun {
    public static void main(String[] args) {
        IProductRepository productRepository = ProductFactory.create();

        ProductCatalog productCatalog = new ProductCatalog(productRepository);
        productCatalog.listAllProducts();
    }
}
