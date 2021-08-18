package mx.xoco.nuniez.dependency_inversion.factory;

import mx.xoco.nuniez.dependency_inversion.intfc.impl.SQLProductRepository;
import mx.xoco.nuniez.dependency_inversion.intfc.IProductRepository;

public class ProductFactory {
    public static IProductRepository create() {
        return new SQLProductRepository();
    }
}
