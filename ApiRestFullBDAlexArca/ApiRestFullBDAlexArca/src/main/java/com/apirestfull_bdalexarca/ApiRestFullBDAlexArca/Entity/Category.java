package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Category")
@Data
@NoArgsConstructor
public class Category {
    @Id
    @Column(name = "IdCategory")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategory;

    @Column(name = "IdProduct")
    private Long idProduct;

    @Column(name = "Category")
    private String category;

    @Column(name = "Description")
    private String description;

    @Column(name = "StatusProduct")
    private String statusProduct;

}
