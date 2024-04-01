package com.example.mscatalogo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Categoria {
    @Id
    @GeneratedValue
    private Integer id;
    private String nombre;
}
