package tech.alexguesser.creational.builder;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InvoiceBuilderValid {

    private final Invoice invoice;
    SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");

    public InvoiceBuilderValid(Invoice invoice) {
        this.invoice = invoice;
    }

    public InvoiceBuilderValid withNumber(Integer number) {
        this.invoice.setNumber(number);
        return this;
    }

    public InvoiceBuilderValid withDate(String date) {
        try {
            this.invoice.setDate(dateFormatter.parse(date));
        } catch (ParseException e) {
            System.out.println("Date with invalid format informed");
        }
        return this;
    }

    public InvoiceBuilderValid withProduct(String name, Integer quantity, BigDecimal value) {
        this.invoice.getProducts().add(new Product(name, quantity, value));
        return this;
    }

    public InvoiceBuilderValid withProduct(String nome, Integer quantity, String value) {
        return withProduct(nome, quantity, new BigDecimal(value));
    }

    public InvoiceBuilderValid withProduct(String nome, Integer quantity, Double value) {
        return withProduct(nome, quantity, String.valueOf(value));
    }

    public Invoice build() {
        return this.invoice;
    }

}
