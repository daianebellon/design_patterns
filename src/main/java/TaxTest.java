import tax.TaxType;

import java.math.BigDecimal;

public class TaxTest {

    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator calculator = new TaxCalculator();

        System.out.println(calculator.calculate(budget, TaxType.ICMS));

    }
}
