package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "Customer")
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @Column(name = "IdCustomer")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCustomer;

    @Column(name = "IdBuys")
    private Long idBuys;

    @Column(name = "IdShoppingCart")
    private Long idShoppingCart;

    @Column(name = "Review")
    private String review;

    @Column(name = "ReceptionAddress")
    private String receptionAddress;
}
