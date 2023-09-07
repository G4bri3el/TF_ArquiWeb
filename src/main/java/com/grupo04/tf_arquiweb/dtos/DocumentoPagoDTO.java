package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.DetalleDePago;
import com.grupo04.tf_arquiweb.entities.TipoPago;

import java.sql.Date;

public class DocumentoPagoDTO {
    private int DocumentoPagoId;
    private Date DocumentoPagoFecha;
    private int DocumentoPagoMonto;
    private String DocumentoPagoMoneda;
    private TipoPago tipoPago;
    private DetalleDePago detalleDePago;

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
}
