package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Buys")
@Data
@NoArgsConstructor
public class Buys {
    @Id
    @Column(name = "IdBuys")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBuys;

    @Column(name = "IdPay")
    private Long idPay;

    @Column(name = "PurchaseDate")
    private Date purchaseDate;

    @Column(name = "TotalPurchase")
    private double totalPurchase;
}