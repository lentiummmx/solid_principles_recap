package mx.xoco.nuniez.open_closed;

import java.util.Random;

public class HealthInsuranceCustomerProfile {
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
