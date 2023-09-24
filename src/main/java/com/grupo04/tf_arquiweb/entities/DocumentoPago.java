package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "DetallePago")
public class DocumentoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DocumentoPagoId;

    @Column(name = "DocumentoPagoFecha", nullable = false)
    private Date DocumentoPagoFecha;
    @Column(name = "DocumentoPagoMonto", nullable = false)
    private int DocumentoPagoMonto;
    @Column(name = "DocumentoPagoMoneda", nullable = false, length = 50)
    private String DocumentoPagoMoneda;
    @ManyToOne
    @JoinColumn(name = "TipoPagoId")
    private TipoPago tipoPago;
    @OneToOne
    @JoinColumn(name = "DetalleDePagoId")
    private DetalleDePago detalleDePago;

    @Column(name = "ComprobanteNombre", nullable = false)
    private int ComprobanteNombre;
    @Column(name = "ComprobanteDNI", nullable = false)
    private int ComprobanteDNI;
    @Column(name = "ComprobanteRUC", nullable = false)
    private int ComprobanteRUC;
    @Column(name = "ComprobanteRazonSocial", nullable = false)
    private int ComprobanteRazonSocial;
    @Column(name = "ComprobanteDireccion", nullable = false)
    private int ComprobanteDireccion;


    public DocumentoPago() {
    }

    public DocumentoPago(int documentoPagoId, Date documentoPagoFecha, int documentoPagoMonto, String documentoPagoMoneda, TipoPago tipoPago, DetalleDePago detalleDePago, int comprobanteNombre, int comprobanteDNI, int comprobanteRUC, int comprobanteRazonSocial, int comprobanteDireccion) {
        DocumentoPagoId = documentoPagoId;
        DocumentoPagoFecha = documentoPagoFecha;
        DocumentoPagoMonto = documentoPagoMonto;
        DocumentoPagoMoneda = documentoPagoMoneda;
        this.tipoPago = tipoPago;
        this.detalleDePago = detalleDePago;
        ComprobanteNombre = comprobanteNombre;
        ComprobanteDNI = comprobanteDNI;
        ComprobanteRUC = comprobanteRUC;
        ComprobanteRazonSocial = comprobanteRazonSocial;
        ComprobanteDireccion = comprobanteDireccion;
    }

    public int getDocumentoPagoId() {
        return DocumentoPagoId;
    }

    public void setDocumentoPagoId(int documentoPagoId) {
        DocumentoPagoId = documentoPagoId;
    }

    public Date getDocumentoPagoFecha() {
        return DocumentoPagoFecha;
    }

    public void setDocumentoPagoFecha(Date documentoPagoFecha) {
        DocumentoPagoFecha = documentoPagoFecha;
    }

    public int getDocumentoPagoMonto() {
        return DocumentoPagoMonto;
    }

    public void setDocumentoPagoMonto(int documentoPagoMonto) {
        DocumentoPagoMonto = documentoPagoMonto;
    }

    public String getDocumentoPagoMoneda() {
        return DocumentoPagoMoneda;
    }

    public void setDocumentoPagoMoneda(String documentoPagoMoneda) {
        DocumentoPagoMoneda = documentoPagoMoneda;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public DetalleDePago getDetalleDePago() {
        return detalleDePago;
    }

    public void setDetalleDePago(DetalleDePago detalleDePago) {
        this.detalleDePago = detalleDePago;
    }

    public int getComprobanteNombre() { return ComprobanteNombre; }

    public void setComprobanteNombre(int comprobanteNombre) { ComprobanteNombre = comprobanteNombre; }

    public int getComprobanteDNI() { return ComprobanteDNI; }

    public void setComprobanteDNI(int comprobanteDNI) { ComprobanteDNI = comprobanteDNI; }

    public int getComprobanteRUC() { return ComprobanteRUC; }

    public void setComprobanteRUC(int comprobanteRUC) { ComprobanteRUC = comprobanteRUC; }

    public int getComprobanteRazonSocial() { return ComprobanteRazonSocial; }

    public void setComprobanteRazonSocial(int comprobanteRazonSocial) { ComprobanteRazonSocial = comprobanteRazonSocial; }

    public int getComprobanteDireccion() { return ComprobanteDireccion; }

    public void setComprobanteDireccion(int comprobanteDireccion) { ComprobanteDireccion = comprobanteDireccion; }
}
