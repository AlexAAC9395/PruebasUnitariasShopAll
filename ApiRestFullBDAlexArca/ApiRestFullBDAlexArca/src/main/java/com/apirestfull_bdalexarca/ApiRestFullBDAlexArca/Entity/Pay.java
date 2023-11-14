package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Pay")
@Data
@NoArgsConstructor
public class Pay {
    @Id
    @Column(name = "IdPay")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPay;

    @Column(name = "PurchaseTotal")
    private double purchaseTotal;

    @Column(name = "PaymentType")
    private String paymentType;

    @Column(name = "PaymentDate")
    private Date paymentDate;

    @Column(name = "CardNumber")
    private int cardNumber;
}
