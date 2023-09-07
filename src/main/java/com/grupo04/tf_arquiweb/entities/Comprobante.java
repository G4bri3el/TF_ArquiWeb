package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Comprobante")
public class Comprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ComprobanteId;

    @OneToOne
    @JoinColumn(name = "TipoPagoId")
    private TipoPago tipoPago;
    @Column(name = "ComprobanteNombre",length = 50,nullable = false)
    private String ComprobanteNombre;

    @Column(name = "ComprobanteDNI",length = 8,nullable = false)
    private String ComprobanteDNI;

    @Column(name = "ComprobanteRUC",length = 11,nullable = false)
    private String ComprobanteRUC;

    @Column(name = "ComprobanteRazonSocial",length = 50,nullable = false)
    private String ComprobanteRazonSocial;

    @Column(name = "ComprobanteDireccion",length = 50,nullable = false)
    private String ComprobanteDireccion;

    public Comprobante() {
    }
    public Comprobante(int comprobanteId, TipoPago tipoPago, String comprobanteNombre, String comprobanteDNI, String comprobanteRUC, String comprobanteRazonSocial, String comprobanteDireccion) {
        ComprobanteId = comprobanteId;
        this.tipoPago = tipoPago;
        ComprobanteNombre = comprobanteNombre;
        ComprobanteDNI = comprobanteDNI;
        ComprobanteRUC = comprobanteRUC;
        ComprobanteRazonSocial = comprobanteRazonSocial;
        ComprobanteDireccion = comprobanteDireccion;
    }

    public int getComprobanteId() {
        return ComprobanteId;
    }

    public void setComprobanteId(int comprobanteId) {
        ComprobanteId = comprobanteId;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getComprobanteNombre() {
        return ComprobanteNombre;
    }

    public void setComprobanteNombre(String comprobanteNombre) {
        ComprobanteNombre = comprobanteNombre;
    }

    public String getComprobanteDNI() {
        return ComprobanteDNI;
    }

    public void setComprobanteDNI(String comprobanteDNI) {
        ComprobanteDNI = comprobanteDNI;
    }

    public String getComprobanteRUC() {
        return ComprobanteRUC;
    }

    public void setComprobanteRUC(String comprobanteRUC) {
        ComprobanteRUC = comprobanteRUC;
    }

    public String getComprobanteRazonSocial() {
        return ComprobanteRazonSocial;
    }

    public void setComprobanteRazonSocial(String comprobanteRazonSocial) {
        ComprobanteRazonSocial = comprobanteRazonSocial;
    }

    public String getComprobanteDireccion() {
        return ComprobanteDireccion;
    }

    public void setComprobanteDireccion(String comprobanteDireccion) {
        ComprobanteDireccion = comprobanteDireccion;
    }
}
