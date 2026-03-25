package com.estebanruano.kinalapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.text.DecimalFormat;
import java.util.Date;

@Entity
@Table(name = "venta")
public class Ventas {
    @Id
    @Column(name = "codigo_venta")
    private String CODIGOVenta;
    @Column(name = "fecha_venta")
    private Date FechaVenta;
    @Column
    private Double Total;
    @Column
    private int estado;

}
