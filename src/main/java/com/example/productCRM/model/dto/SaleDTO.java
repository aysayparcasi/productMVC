package com.example.productCRM.model.dto;

public class SaleDTO {
    private Long saleId;
    private ProductDTO productDTO;
    private CustomerDTO customerDTO;

    public Long getId() {
        return saleId;
    }

    public void setId(Long id) {
        this.saleId = id;
    }

    public ProductDTO getProduct() {
        return productDTO;
    }

    public void setProduct(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }

    public CustomerDTO getCustomer() {
        return customerDTO;
    }

    public void setCustomer(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public SaleDTO(Long id, ProductDTO productDTO, CustomerDTO customerDTO) {
        this.saleId = id;
        this.productDTO = productDTO;
        this.customerDTO = customerDTO;
    }

    @Override
    public String toString() {
        return "SaleDTO{" +
                "id=" + saleId +
                ", productDTO=" + productDTO +
                ", customerDTO=" + customerDTO +
                '}';
    }
}
