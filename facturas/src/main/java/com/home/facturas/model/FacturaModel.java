package com.home.facturas.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "FACTURA")
public class FacturaModel implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "FACT_NUMEROFACTURA", nullable = false, length = 60)
    private Integer numero;

    @Column(name = "FACT_FECHA", nullable = false)
    private Date fecha;

    @Column(name = "FACT_TIPODEPAGO", nullable = false, length = 60)
    private String pago;

    @Column(name = "FACT_DOCUMENTOCLIENTE", nullable = false, length = 12)
    private Integer documento;

    @Column(name = "FACT_NOMBRECLIENTE", nullable = false, length = 150)
    private String nombre;

    @Column(name = "FACT_SUBTOTAL", nullable = false, length = 150)
    private Integer subtotal;

    @Column(name = "FACT_DESCUENTO", nullable = false, length = 150)
    private Integer descuento;

    @Column(name = "FACT_IVA", nullable = false, length = 150)
    private Integer iva;

    @Column(name = "FACT_TOTALDESCUENTO", nullable = false, length = 150)
    private Integer totalDescuento;

    @Column(name = "FACT_TOTALIMPUESTO", nullable = false, length = 150)
    private Integer totalImpuesto;

    @Column(name = "FACT_TOTAL", nullable = false, length = 150)
    private Integer total;

    public FacturaModel() {
    }

    public FacturaModel(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
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

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public Integer getIva() {
        return iva;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }

    public Integer getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(Integer totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public Integer getTotalImpuesto() {
        return totalImpuesto;
    }

    public void setTotalImpuesto(Integer totalImpuesto) {
        this.totalImpuesto = totalImpuesto;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


}
