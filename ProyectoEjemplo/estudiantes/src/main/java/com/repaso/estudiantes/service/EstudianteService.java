package com.repaso.estudiantes.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.repaso.estudiantes.modelo.Estudiante;
import com.repaso.estudiantes.modelo.EstudianteDTO;
import com.repaso.estudiantes.repository.IEstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class EstudianteService implements IEstudianteService{
    @Autowired
    private IEstudianteRepository iEstudianteRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearEstudiante(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = mapper.convertValue(estudianteDTO, Estudiante.class);
        iEstudianteRepository.save(estudiante);
    }

    @Override
    public EstudianteDTO leerEstudiante(Long id) {
        Optional<Estudiante> estudiante = iEstudianteRepository.findById(id);
        EstudianteDTO estudianteDTO = null;
        if (estudiante.isPresent())
            estudianteDTO = mapper.convertValue(estudiante, EstudianteDTO.class);
        return estudianteDTO;
    }

    @Override
    public void modificarEstudiante(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = mapper.convertValue(estudianteDTO, Estudiante.class);
        iEstudianteRepository.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        iEstudianteRepository.deleteById(id);
    }

    @Override
    public Set<EstudianteDTO> getTodos() {
        List<Estudiante> estudiantes = iEstudianteRepository.findAll();
        Set<EstudianteDTO> estudianteDTO = new HashSet<>();

        for (Estudiante estudiante: estudiantes){
            estudianteDTO.add(mapper.convertValue(estudiante, EstudianteDTO.class));
        }
        return estudianteDTO;
    }
}
