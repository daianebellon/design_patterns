package strategy.store;

import chain_of_responsibility.store.Budget;
import strategy.tax.TaxType;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, TaxType taxType ) {
        return taxType.calculator(budget);
    }
}
