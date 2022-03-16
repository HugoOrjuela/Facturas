package com.home.facturas.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "FACTURA")
public class FacturaModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FACT_NUMEROFACTURA", nullable = false)
    private Long numero;

    @Column(name = "FACT_FECHA", nullable = false)
    private Date fecha;

    @Column(name = "FACT_TIPODEPAGO", nullable = false, length = 60)
    private String pago;

    @Column(name = "FACT_DOCUMENTOCLIENTE", nullable = false)
    private Long documento;

    @Column(name = "FACT_NOMBRECLIENTE", nullable = false, length = 150)
    private String nombre;

    @Column(name = "FACT_SUBTOTAL", nullable = false)
    private Double subtotal;

    @Column(name = "FACT_DESCUENTO", nullable = false)
    private Long descuento;

    @Column(name = "FACT_IVA", nullable = false)
    private Long iva;

    @Column(name = "FACT_TOTALDESCUENTO", nullable = false)
    private Double totalDescuento;

    @Column(name = "FACT_TOTALIMPUESTO", nullable = false)
    private Double totalImpuesto;

    @Column(name = "FACT_TOTAL", nullable = false)
    private Double total;

    public FacturaModel() {
    }

    public FacturaModel(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Long getDescuento() {
        return descuento;
    }

    public void setDescuento(Long descuento) {
        this.descuento = descuento;
    }

    public Long getIva() {
        return iva;
    }

    public void setIva(Long iva) {
        this.iva = iva;
    }

    public Double getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(Double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public Double getTotalImpuesto() {
        return totalImpuesto;
    }

    public void setTotalImpuesto(Double totalImpuesto) {
        this.totalImpuesto = totalImpuesto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
