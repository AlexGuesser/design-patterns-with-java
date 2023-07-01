package tech.alexguesser.creational.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Invoice {

    private Integer number;
    private Date date;
    private List<Product> products = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(Integer number, Date date, List<Product> products) {
        this.number = number;
        this.date = date;
        this.products = products;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    protected abstract BigDecimal taxRate();

    public BigDecimal getTotalValue() {
        BigDecimal totalValue = BigDecimal.ZERO;
        for (Product p : getProducts()) {
            totalValue = totalValue.add(p.getValue().multiply(new BigDecimal(p.getQuantity())));
        }
        return totalValue.multiply(taxRate());
    }


    @Override
    public String toString() {
        return "Invoice{" +
                "number=" + number +
                ", date=" + date +
                ", products=" + products +
                '}';
    }
}
