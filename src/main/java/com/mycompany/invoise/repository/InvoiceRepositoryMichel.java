package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryMichel implements InvoiceRepositoryInterface {
    private static List<Invoice> invoices = new ArrayList<>();
    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName() );

    }
}
