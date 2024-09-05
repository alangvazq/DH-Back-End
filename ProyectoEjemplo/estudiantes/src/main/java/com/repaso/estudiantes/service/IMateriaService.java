package com.repaso.estudiantes.service;

import com.repaso.estudiantes.modelo.EstudianteDTO;
import com.repaso.estudiantes.modelo.Materia;
import com.repaso.estudiantes.modelo.MateriaDTO;

import java.util.Set;

public interface IMateriaService {

    void crearMateria(MateriaDTO materiaDTO);
    MateriaDTO leerMateria(Long id);
    void modificarMateria(MateriaDTO materiaDTO);
    void eliminarMateria(Long id);
    Set<MateriaDTO> getTodos();
}
