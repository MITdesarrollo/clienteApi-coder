package com.clienteApi.clienteApi.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "DNI")
    private long dni;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "FECHANACIMIENTO")
    private Date fechanacimiento;

    public Cliente(String nombre, String apellido, int años) {
    }

    public Cliente(long id, String nombre, long dni, String apellido, Date fechanacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id && Objects.equals(nombre, cliente.nombre) && Objects.equals(dni, cliente.dni) && Objects.equals(apellido, cliente.apellido) && Objects.equals(fechanacimiento, cliente.fechanacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, dni, apellido, fechanacimiento);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechanacimiento=" + fechanacimiento +
                '}';
    }
}