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
    @JoinColumn(name = "ReservaId")
    private Reserva reserva;

    @Column(name = "ComprobanteNombre", nullable = true, length = 50)
    private String ComprobanteNombre;
    @Column(name = "ComprobanteDNI", nullable = true, length = 8)
    private String ComprobanteDNI;
    @Column(name = "ComprobanteRUC", nullable = true, length = 11)
    private String ComprobanteRUC;
    @Column(name = "ComprobanteRazonSocial", nullable = true, length = 50)
    private String ComprobanteRazonSocial;
    @Column(name = "ComprobanteDireccion", nullable = true, length = 50)
    private String ComprobanteDireccion;

    public DocumentoPago() {
    }

    public DocumentoPago(int documentoPagoId, Date documentoPagoFecha, int documentoPagoMonto, String documentoPagoMoneda, TipoPago tipoPago, Reserva reserva, String comprobanteNombre, String comprobanteDNI, String comprobanteRUC, String comprobanteRazonSocial, String comprobanteDireccion) {
        DocumentoPagoId = documentoPagoId;
        DocumentoPagoFecha = documentoPagoFecha;
        DocumentoPagoMonto = documentoPagoMonto;
        DocumentoPagoMoneda = documentoPagoMoneda;
        this.tipoPago = tipoPago;
        this.reserva = reserva;
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

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
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
