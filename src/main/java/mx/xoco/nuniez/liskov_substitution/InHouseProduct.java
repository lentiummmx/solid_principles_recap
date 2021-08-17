package mx.xoco.nuniez.liskov_substitution;

public class InHouseProduct extends Product {

    public void applyExtraDiscount() {
        discount = discount * 1.5;
    }

}
