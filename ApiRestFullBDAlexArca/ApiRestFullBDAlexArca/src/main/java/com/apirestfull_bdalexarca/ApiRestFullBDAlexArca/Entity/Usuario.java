package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "Usuario")
@Data
@NoArgsConstructor
public class Usuario {
    @Id
    @Column(name = "IdUsuario")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuario;

    @Column(name = "IdRole")
    private Long idRole;

    @Column(name = "IdCustomer")
    private Long idCustomer;

    @Column(name = "IdSeller")
    private Long idSeller;

    @Column(name = "Name")
    private String name;

    @Column(name = "DocumentType")
    private String documentType;

    @Column(name = "DocumentNumber")
    private int documentNumber;

    @Column(name = "Address")
    private String address;

    @Column(name = "Phone")
    private int phone;

    @Column(name = "Mail")
    private String mail;

    @Column(name = "Usuario")
    private String usuario;

    @Column(name = "Password")
    private String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "IdUsuario")
    private List<Product> ShopList;

    public void setId(Long usuarioId) {
    }
}
