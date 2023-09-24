package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Reserva;
import com.grupo04.tf_arquiweb.entities.TipoPago;
import jakarta.persistence.Column;


import java.sql.Date;

public class DocumentoPagoDTO {
    private int DocumentoPagoId;
    private Date DocumentoPagoFecha;
    private int DocumentoPagoMonto;
    private String DocumentoPagoMoneda;
    private TipoPago tipoPago;
    private Reserva reserva;

    private String ComprobanteNombre;
    private String ComprobanteDNI;
    private String ComprobanteRUC;
    private String ComprobanteRazonSocial;
    private String ComprobanteDireccion;

    private int ComprobanteNombre;
    private int ComprobanteDNI;
    private int ComprobanteRUC;
    private int ComprobanteRazonSocial;
    private int ComprobanteDireccion;





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

    public int getComprobanteNombre() { return ComprobanteNombre;}

    public void setComprobanteNombre(int comprobanteNombre) { ComprobanteNombre = comprobanteNombre;}

    public int getComprobanteDNI() { return ComprobanteDNI; }

    public void setComprobanteDNI(int comprobanteDNI) { ComprobanteDNI = comprobanteDNI; }

    public int getComprobanteRUC() { return ComprobanteRUC; }

    public void setComprobanteRUC(int comprobanteRUC) { ComprobanteRUC = comprobanteRUC; }

    public int getComprobanteRazonSocial() { return ComprobanteRazonSocial; }

    public void setComprobanteRazonSocial(int comprobanteRazonSocial) { ComprobanteRazonSocial = comprobanteRazonSocial; }

    public int getComprobanteDireccion() { return ComprobanteDireccion; }

    public void setComprobanteDireccion(int comprobanteDireccion) { ComprobanteDireccion = comprobanteDireccion; }
}
