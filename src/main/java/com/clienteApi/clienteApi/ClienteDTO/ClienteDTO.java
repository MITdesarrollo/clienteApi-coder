package com.clienteApi.clienteApi.ClienteDTO;

import java.util.Objects;

public class ClienteDTO {
    private long id;
    private String apellido;
    private String nombre;
    private int años;


    public ClienteDTO() {
    }

    public ClienteDTO(long id, String apellido, String nombre, int años) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.años = años;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteDTO that = (ClienteDTO) o;
        return id == that.id && años == that.años && Objects.equals(apellido, that.apellido) && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apellido, nombre, años);
    }

    @Override
    public String toString() {
        return "ClienteDTO{" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", años=" + años +
                '}';
    }
}
