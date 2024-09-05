package com.repaso.estudiantes.service;

import com.repaso.estudiantes.modelo.CursadaDTO;
import com.repaso.estudiantes.modelo.EstudianteDTO;

import java.util.Set;

public interface ICursadaService {
    void crearCursada(CursadaDTO cursadaDTO);
    CursadaDTO leerCursada(Long id);
    void modificarCursada(CursadaDTO cursadaDTO);
    void eliminarCursada(Long id);
    Set<CursadaDTO> getTodos();
}
