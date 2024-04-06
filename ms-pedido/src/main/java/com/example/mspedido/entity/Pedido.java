package com.example.mspedido.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Pedido {
    @Id
    @GeneratedValue
    private Integer id;
    private String pedido;
}
