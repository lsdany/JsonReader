package com.umg;

import java.util.Arrays;

public class Usuario {

    private String id;
    private String nombre;
    private String apellido;
    private Integer telefono;
    private String direccion;
    private Cuenta[] cuenta;

    public Usuario(){

    }

    public Usuario(String id, String nombre, String apellido, Integer telefono, String direccion, Cuenta[] cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuenta = cuenta;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public Cuenta[] getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", cuenta=" + Arrays.toString(cuenta) +
                '}';
    }
}
