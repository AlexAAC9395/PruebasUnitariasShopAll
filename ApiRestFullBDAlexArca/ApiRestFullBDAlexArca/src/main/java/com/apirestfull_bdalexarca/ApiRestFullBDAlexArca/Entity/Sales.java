package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Sales")
@Data
@NoArgsConstructor
public class Sales {
    @Id
    @Column(name = "IdSales")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSales;

    @Column(name = "IdSaleDetail")
    private Long idSaleDetail;

    @Column(name = "VoucherType")
    private String voucherType;

    @Column(name = "VoucherSeries")
    private String voucherSeries;

    @Column(name = "VoucherNumber")
    private int voucherNumber;

    @Column(name = "SaleDate")
    private Date saleDate;

    @Column(name = "Tax")
    private double tax;

    @Column(name = "SaleTotal")
    private double saleTotal;
}
