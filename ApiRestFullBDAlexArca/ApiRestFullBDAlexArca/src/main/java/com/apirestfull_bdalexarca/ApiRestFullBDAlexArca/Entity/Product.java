package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
    @Table(name = "Product")
    @Data
    @NoArgsConstructor
    public class Product {
        @Id
        @Column(name = "IdProduct")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long idProduct;

        @Column(name = "IdCategory")
        private Long idCategory;

        @Column(name = "IdUsuario")
        private Long idUsuario;

        @Column(name = "NameProduct")
        private String nameProduct;

        @Column(name = "SalePrice")
        private double salePrice;

        @Column(name = "SpecificDetails")
        private String specificDetails;

        @Column(name = "Code")
        private int code;

        @Column(name = "Stock")
        private int stock;
    }

