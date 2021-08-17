package mx.xoco.nuniez.open_closed;

public class InsurancePremiumDiscountCalculator {

    public int calculatePremiumDiscountPercent(ICustomerProfile customer) {
        if (customer.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }

}
