package com.example.mspedido.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class PedidoDetalle {
    @Id
    @GeneratedValue
    private String detalle;
    private String Producto;
    private String fecha;
    private Integer cantidad;
    private double precio;
}
