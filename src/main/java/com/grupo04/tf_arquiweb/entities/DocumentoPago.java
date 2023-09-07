package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "DetallePago")
public class DocumentoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DocumentoPagoId;
    private Date DocumentoPagoFecha;
    private int DocumentoPagoMonto;
    private String DocumentoPagoMoneda;
    @ManyToOne
    @JoinColumn(name = "TipoPagoId")
    private TipoPago tipoPago;
    @OneToOne
    @JoinColumn(name = "DetalleDePagoId")
    private DetalleDePago detalleDePago;

    public DocumentoPago() {
    }

    public DocumentoPago(int documentoPagoId, Date documentoPagoFecha, int documentoPagoMonto, String documentoPagoMoneda, TipoPago tipoPago, DetalleDePago detalleDePago) {
        DocumentoPagoId = documentoPagoId;
        DocumentoPagoFecha = documentoPagoFecha;
        DocumentoPagoMonto = documentoPagoMonto;
        DocumentoPagoMoneda = documentoPagoMoneda;
        this.tipoPago = tipoPago;
        this.detalleDePago = detalleDePago;
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
}
