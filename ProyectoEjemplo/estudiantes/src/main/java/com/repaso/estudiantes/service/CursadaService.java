package com.repaso.estudiantes.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.repaso.estudiantes.modelo.Cursada;
import com.repaso.estudiantes.modelo.CursadaDTO;
import com.repaso.estudiantes.repository.ICursadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CursadaService implements ICursadaService{
    @Autowired
    private ICursadaRepository iCursadaRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearCursada(CursadaDTO cursadaDTO) {
        Cursada cursada = mapper.convertValue(cursadaDTO, Cursada.class);
        iCursadaRepository.save(cursada);
    }

    @Override
    public CursadaDTO leerCursada(Long id) {
        Optional<Cursada> cursada = iCursadaRepository.findById(id);
        CursadaDTO cursadaDTO = null;
        if (cursada.isPresent())
            cursadaDTO = mapper.convertValue(cursada, CursadaDTO.class);
        return cursadaDTO;
    }

    @Override
    public void modificarCursada(CursadaDTO cursadaDTO) {
        Cursada cursada = mapper.convertValue(cursadaDTO, Cursada.class);
        iCursadaRepository.save(cursada);
    }

    @Override
    public void eliminarCursada(Long id) {
        iCursadaRepository.deleteById(id);
    }

    @Override
    public Set<CursadaDTO> getTodos() {
        List<Cursada> cursadas = iCursadaRepository.findAll();
        Set<CursadaDTO> cursadaDTO = new HashSet<>();

        for (Cursada cursada: cursadas){
            cursadaDTO.add(mapper.convertValue(cursada, CursadaDTO.class));
        }
        return cursadaDTO;
    }
}
