package chain_of_responsibility.tax;

import strategy.store.Budget;

import java.math.BigDecimal;

public class ICMS implements chain.TaxType {

    public BigDecimal calculator(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
