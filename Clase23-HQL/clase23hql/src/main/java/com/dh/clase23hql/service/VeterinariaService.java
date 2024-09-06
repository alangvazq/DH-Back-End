package com.dh.clase23hql.service;

import com.dh.clase23hql.entity.Mascota;
import com.dh.clase23hql.entity.Veterinaria;
import com.dh.clase23hql.repository.IMascotaRepository;
import com.dh.clase23hql.repository.IVeterianriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinariaService {

    @Autowired
    IVeterianriaRepository veterianriaRepository;

    @Autowired
    IMascotaRepository mascotaRepository;

    public Veterinaria crearVeterinaria(String nombre, int costo){
        Veterinaria veterinaria = new Veterinaria("Vet", 100);
        return veterianriaRepository.save(veterinaria);
    }

    public Mascota agregarMascota(Long veterinariaId, String nombre, String tipo) {
        Veterinaria veterinaria = veterianriaRepository.findById(veterinariaId).orElseThrow();
        Mascota mascota = new Mascota(nombre, tipo);
        veterinaria.agregarMascota(mascota);
        return mascotaRepository.save(mascota);
    }

    public List<Mascota> obtenerMascotasDeVeterinaria(Long veterinariaId){
        return mascotaRepository.findByVeterinariaId(veterinariaId);
    }

    public List<Mascota> obtenerPerros(){
        return mascotaRepository.findByTipo("perro");
    }
}
