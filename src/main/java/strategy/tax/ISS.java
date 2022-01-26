package strategy.tax;

import strategy.store.Budget;

import java.math.BigDecimal;

public class ISS implements TaxType{

    public BigDecimal calculator(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
}
