package com.repaso.estudiantes.modelo;

public class Cursada {
    private Long id;
    private Estudiante estudiante;
    private Cursada cursada;
    private double nota;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Cursada getCursada() {
        return cursada;
    }

    public void setCursada(Cursada cursada) {
        this.cursada = cursada;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
