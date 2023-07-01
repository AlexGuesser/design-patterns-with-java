package tech.alexguesser.creational.builder;

import java.math.BigDecimal;

public class InvoiceLegalPerson extends Invoice {
	
	protected BigDecimal taxRate() {
		return new BigDecimal("1.04");
	}

}
