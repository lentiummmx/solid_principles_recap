package mx.xoco.nuniez.open_closed;

import java.util.Random;

public class VehicleInsuranceCustomerProfile implements ICustomerProfile {
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
