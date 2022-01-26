package chain_of_responsibility.tax;

import strategy.store.Budget;

import java.math.BigDecimal;

public interface TaxType {

    BigDecimal calculator(Budget budget);
}
