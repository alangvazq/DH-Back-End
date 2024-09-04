package com.repaso.estudiantes.modelo;

import java.util.Set;

public class Materia {
    private Long id;
    private String nombre;
    private Set<Cursada> cursadas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
