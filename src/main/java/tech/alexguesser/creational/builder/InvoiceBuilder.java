package tech.alexguesser.creational.builder;

public class InvoiceBuilder {
	
    public InvoiceBuilderValid ofPhysicalPerson() {
        Invoice instance = new InvoicePhysicalPerson();
        return new InvoiceBuilderValid(instance);
    }
    
    public InvoiceBuilderValid ofLegalPerson() {
        Invoice instance = new InvoiceLegalPerson();
        return new InvoiceBuilderValid(instance);
    }

}
