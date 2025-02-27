package com.itesm.domain;

public class Persona {
    private String nombre;
    private String uuid;
    private String email;

    public Persona(String nombre, String uuid, String email) {
        this.nombre = nombre;
        this.uuid = uuid;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
