package mx.xoco.nuniez.open_closed;

import java.util.Random;

public class HealthInsuranceCustomerProfile implements ICustomerProfile {
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
