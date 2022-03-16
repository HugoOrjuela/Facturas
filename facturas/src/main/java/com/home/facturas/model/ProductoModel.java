package com.home.facturas.model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTO")
public class ProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "PROD_PRODUCTO", nullable = true, length = 50)
    private String producto;

    public ProductoModel() {
    }

    public ProductoModel(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public ProductoModel(String producto) {
        this.producto = producto;
    }


}