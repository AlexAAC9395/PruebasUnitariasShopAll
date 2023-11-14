package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "Roles")
@Data
@NoArgsConstructor
public class Role {
    @Id
    @Column(name = "IdRole")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRole;

    @Column(name = "RoleType")
    private String roleType;

    @Column(name = "RoleStatus")
    private String roleStatus;
}
