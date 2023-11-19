package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "DetallePago")
public class DocumentoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int documentopagoid;

    @Column(name = "DocumentoPagoFecha", nullable = false)
    private Date documentopagofecha;
    @Column(name = "DocumentoPagoMonto", nullable = false)
    private int documentopagomonto;
    @Column(name = "DocumentoPagoMoneda", nullable = false, length = 50)
    private String documentopagomoneda;
    @ManyToOne
    @JoinColumn(name = "TipoPagoId")
    private TipoPago tipopago;
    @OneToOne
    @JoinColumn(name = "ReservaId")
    private Reserva reserva;

    @Column(name = "ComprobanteNombre", nullable = true, length = 50)
    private String comprobantenombre;
    @Column(name = "ComprobanteDNI", nullable = true, length = 8)
    private String comprobanteDNI;
    @Column(name = "ComprobanteRUC", nullable = true, length = 11)
    private String comprobanteRUC;
    @Column(name = "ComprobanteRazonSocial", nullable = true, length = 50)
    private String comprobanterazonsocial;
    @Column(name = "ComprobanteDireccion", nullable = true, length = 50)
    private String comprobantedireccion;

    public DocumentoPago() {
    }

    public DocumentoPago(int documentopagoid, Date documentopagofecha, int documentopagomonto, String documentopagomoneda, TipoPago tipopago, Reserva reserva, String comprobantenombre, String comprobanteDNI, String comprobanteRUC, String comprobanterazonsocial, String comprobantedireccion) {
        this.documentopagoid = documentopagoid;
        this.documentopagofecha = documentopagofecha;
        this.documentopagomonto = documentopagomonto;
        this.documentopagomoneda = documentopagomoneda;
        this.tipopago = tipopago;
        this.reserva = reserva;
        this.comprobantenombre = comprobantenombre;
        this.comprobanteDNI = comprobanteDNI;
        this.comprobanteRUC = comprobanteRUC;
        this.comprobanterazonsocial = comprobanterazonsocial;
        this.comprobantedireccion = comprobantedireccion;
    }

    public int getDocumentopagoid() {
        return documentopagoid;
    }

    public void setDocumentopagoid(int documentopagoid) {
        this.documentopagoid = documentopagoid;
    }

    public Date getDocumentopagofecha() {
        return documentopagofecha;
    }

    public void setDocumentopagofecha(Date documentopagofecha) {
        this.documentopagofecha = documentopagofecha;
    }

    public int getDocumentopagomonto() {
        return documentopagomonto;
    }

    public void setDocumentopagomonto(int documentopagomonto) {
        this.documentopagomonto = documentopagomonto;
    }

    public String getDocumentopagomoneda() {
        return documentopagomoneda;
    }

    public void setDocumentopagomoneda(String documentopagomoneda) {
        this.documentopagomoneda = documentopagomoneda;
    }

    public TipoPago getTipopago() {
        return tipopago;
    }

    public void setTipopago(TipoPago tipopago) {
        this.tipopago = tipopago;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getComprobantenombre() {
        return comprobantenombre;
    }

    public void setComprobantenombre(String comprobantenombre) {
        this.comprobantenombre = comprobantenombre;
    }

    public String getComprobanteDNI() {
        return comprobanteDNI;
    }

    public void setComprobanteDNI(String comprobanteDNI) {
        this.comprobanteDNI = comprobanteDNI;
    }

    public String getComprobanteRUC() {
        return comprobanteRUC;
    }

    public void setComprobanteRUC(String comprobanteRUC) {
        this.comprobanteRUC = comprobanteRUC;
    }

    public String getComprobanterazonsocial() {
        return comprobanterazonsocial;
    }

    public void setComprobanterazonsocial(String comprobanterazonsocial) {
        this.comprobanterazonsocial = comprobanterazonsocial;
    }

    public String getComprobantedireccion() {
        return comprobantedireccion;
    }

    public void setComprobantedireccion(String comprobantedireccion) {
        this.comprobantedireccion = comprobantedireccion;
    }
}
