package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.TipoPago;


public class ComprobanteDTO {
    private int ComprobanteId;
    private TipoPago tipoPago;
    private String ComprobanteNombre;
    private String ComprobanteDNI;
    private String ComprobanteRUC;
    private String ComprobanteRazonSocial;
    private String ComprobanteDireccion;

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
