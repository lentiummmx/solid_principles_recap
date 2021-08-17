package mx.xoco.nuniez.open_closed.intfc.impl;

import mx.xoco.nuniez.open_closed.intfc.ICustomerProfile;

import java.util.Random;

public class HomeInsuranceCustomerProfile implements ICustomerProfile {
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
