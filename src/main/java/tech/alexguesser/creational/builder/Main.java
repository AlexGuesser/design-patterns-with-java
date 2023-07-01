package tech.alexguesser.creational.builder;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Invoice invoice = new InvoiceBuilder().ofPhysicalPerson()
                .withNumber(1)
                .withDate("20/05/2016")
                .withProduct("Detergente", 5, new BigDecimal("1.5"))
                .withProduct("Biscoito Guffs", 2, 1.5)
                .build();
        System.out.println(invoice.getTotalValue());
    }

}
