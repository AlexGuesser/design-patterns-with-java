package tech.alexguesser.creational.builder;

import java.math.BigDecimal;

public class InvoicePhysicalPerson extends Invoice {

	@Override
	protected BigDecimal taxRate() {
		return new BigDecimal("1.07");
	}

}
