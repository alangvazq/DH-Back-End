package com.repaso.estudiantes.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.repaso.estudiantes.modelo.Materia;
import com.repaso.estudiantes.modelo.MateriaDTO;
import com.repaso.estudiantes.repository.IMateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class MateriaService implements IMateriaService{
    @Autowired
    private IMateriaRepository iMateriaRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearMateria(MateriaDTO materiaDTO) {
        Materia materia = mapper.convertValue(materiaDTO, Materia.class);
        iMateriaRepository.save(materia);
    }

    @Override
    public MateriaDTO leerMateria(Long id) {
        Optional<Materia> materia = iMateriaRepository.findById(id);
        MateriaDTO materiaDTO = null;
        if (materia.isPresent())
            materiaDTO = mapper.convertValue(materia, MateriaDTO.class);
        return materiaDTO;
    }

    @Override
    public void modificarMateria(MateriaDTO materiaDTO) {
        Materia materia = mapper.convertValue(materiaDTO, Materia.class);
        iMateriaRepository.save(materia);
    }

    @Override
    public void eliminarMateria(Long id) {
        iMateriaRepository.deleteById(id);
    }

    @Override
    public Set<MateriaDTO> getTodos() {
        List<Materia> materias = iMateriaRepository.findAll();
        Set<MateriaDTO> materiaDTO = new HashSet<>();

        for (Materia materia: materias){
            materiaDTO.add(mapper.convertValue(materia, MateriaDTO.class));
        }
        return materiaDTO;
    }
}
