package com.home.facturas.model;
import javax.persistence.*;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "DETALLE")
public class DetalleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DETA_CANTIDAD", nullable = false)
    private Long cantidad;

    @Column(name = "DETA_PRECIOUNITARIO", nullable = false)
    private Long precioUnitario;

    @ManyToOne
    @JoinColumn(name = "FACT_ID")
    private FacturaModel facturaModel;

    @ManyToOne
    @JoinColumn(name = "PROD_ID")
    private ProductoModel productoModel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Long getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Long precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public FacturaModel getFacturaModel() {
        return facturaModel;
    }

    public void setFacturaModel(FacturaModel facturaModel) {
        this.facturaModel = facturaModel;
    }

    public ProductoModel getProductoModel() {
        return productoModel;
    }

    public void setProductoModel(ProductoModel productoModel) {
        this.productoModel = productoModel;
    }
}
