package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private long id;

    @Column
    @NotBlank(message = "El titulo de la tarea no puede estar en blanco")
    private String title;

    @Column
    private String description;

    @Column
    @Min(value=0,message = "El valor minimo deber ser 0")
    @Max(value=100,message = "El valor maximo es 100")
    private int grade;

    //@Column
    //@UniqueElements(message = "Ya se encuentra un email identico en sistema")
    //private String email;
}
