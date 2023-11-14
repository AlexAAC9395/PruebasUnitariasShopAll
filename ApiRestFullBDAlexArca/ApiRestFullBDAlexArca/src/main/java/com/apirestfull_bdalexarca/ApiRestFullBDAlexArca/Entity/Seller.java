package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "Seller")
@Data
@NoArgsConstructor
public class Seller {
    @Id
    @Column(name = "IdSeller")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSeller;

    @Column(name = "IdSales")
    private Long idSales;

    @Column(name = "PersonType")
    private String personType;

    @Column(name = "SellerProfile")
    private String sellerProfile;

    @Column(name = "Notification")
    private String notification;

    @Column(name = "ShippingAddress")
    private String shippingAddress;
}
