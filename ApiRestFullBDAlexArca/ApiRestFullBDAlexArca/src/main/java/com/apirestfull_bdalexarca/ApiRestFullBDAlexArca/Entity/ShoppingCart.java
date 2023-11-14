package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ShoppingCart")
@Data
@NoArgsConstructor
public class ShoppingCart {
    @Id
    @Column(name = "IdShoppingCart")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idShoppingCart;

    @Column(name = "CartDate")
    private Date cartDate;

    @Column(name = "Quantity")
    private int quantity;
}