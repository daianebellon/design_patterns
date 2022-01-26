package strategy;

import chain_of_responsibility.store.Budget;
import strategy.store.TaxCalculator;
import strategy.tax.ISS;

import java.math.BigDecimal;

public class TaxTest {

    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator calculator = new TaxCalculator();

        System.out.println(calculator.calculate(budget, new ISS()));

    }
}
