import tax.TaxType;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, TaxType taxType ) {

        switch (taxType) {
            case ISS:
                return budget.getValue().multiply(new BigDecimal("0.01"));
            case ICMS:
                return budget.getValue().multiply(new BigDecimal("0.06"));
            default:
                return BigDecimal.ZERO;
        }
    }
}
