package com.repaso.estudiantes.service;

import com.repaso.estudiantes.modelo.EstudianteDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EstudianteServiceTest {

    @Autowired
    private IEstudianteService estudianteService;

    @Test
    public void testCrearEstudiante(){
        EstudianteDTO estudianteDTO = new EstudianteDTO();
        estudianteDTO.setNombre("Juan");
        estudianteDTO.setApellido("Perez");
        estudianteService.crearEstudiante(estudianteDTO);

        EstudianteDTO estudianteDTO1 = estudianteService.leerEstudiante(1L);

        assertTrue(estudianteDTO1 != null);
    }
}