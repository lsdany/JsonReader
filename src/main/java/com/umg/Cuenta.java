package com.umg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cuenta {

    private Integer noCuenta;
    private BigDecimal saldo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate fechaCreacion;
    private String idUsuario;
    private String tipoCuenta;
    private String tipoMoneda;

    public Cuenta(){

    }

    public Cuenta(Integer noCuenta, BigDecimal saldo, LocalDate fechaCreacion, String idUsuario, String tipoCuenta, String tipoMoneda) {
        this.noCuenta = noCuenta;
        this.saldo = saldo;
        this.fechaCreacion = fechaCreacion;
        this.idUsuario = idUsuario;
        this.tipoCuenta = tipoCuenta;
        this.tipoMoneda = tipoMoneda;
    }

    public Integer getNoCuenta() {
        return noCuenta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "noCuenta=" + noCuenta +
                ", saldo=" + saldo +
                ", fechaCreacion=" + fechaCreacion +
                ", idUsuario='" + idUsuario + '\'' +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                ", tipoMoneda='" + tipoMoneda + '\'' +
                '}';
    }
}
