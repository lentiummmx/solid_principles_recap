package mx.xoco.nuniez.dependency_inversion.intfc.impl;

import mx.xoco.nuniez.dependency_inversion.intfc.IProductRepository;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository implements IProductRepository {

    public List<String> getAllProductNames() {
        return Arrays.asList("soap", "toothpaste");
    }

}
