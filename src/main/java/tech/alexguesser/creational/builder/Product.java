package tech.alexguesser.creational.builder;

import java.math.BigDecimal;

public class Product {

    private String name;
    private Integer quantity;
    private BigDecimal value;

    public Product() {

    }

    public Product(String name, Integer quantity, BigDecimal value) {
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", value=" + value +
                '}';
    }
}
