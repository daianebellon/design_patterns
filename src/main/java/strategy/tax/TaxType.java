package strategy.tax;

import chain_of_responsibility.store.Budget;

import java.math.BigDecimal;

public interface TaxType {

    BigDecimal calculator(Budget budget);
}
