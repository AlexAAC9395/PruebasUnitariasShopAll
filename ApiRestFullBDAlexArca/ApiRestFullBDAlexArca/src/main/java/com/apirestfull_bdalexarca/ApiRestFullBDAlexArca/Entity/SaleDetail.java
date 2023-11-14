package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "SaleDetail")
@Data
@NoArgsConstructor
public class SaleDetail {
    @Id
    @Column(name = "IdSaleDetail")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSaleDetail;

    @Column(name = "QuantityProduct")
    private int quantityProduct;

    @Column(name = "SalePrice")
    private double salePrice;

    @Column(name = "Discount")
    private double discount;
}
