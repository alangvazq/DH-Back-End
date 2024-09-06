package com.dh.clase23hql.controller;

import com.dh.clase23hql.entity.Mascota;
import com.dh.clase23hql.entity.Veterinaria;
import com.dh.clase23hql.service.VeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veterinarias")
public class VeterinariaController {
    @Autowired
    private VeterinariaService veterinariaService;


    @PostMapping
    public Veterinaria crearVeterinaria(@RequestParam String nombre, @RequestParam int costo) {
        return veterinariaService.crearVeterinaria(nombre, costo);
    }

    @PostMapping("/{id}/mascotas")
    public Mascota agregarMascota(@PathVariable Long id, @RequestParam String nombre, @RequestParam String tipo) {
        return veterinariaService.agregarMascota(id, nombre, tipo);
    }

    @GetMapping("/{id}/mascotas")
    public List<Mascota> obtenerMascotasDeVeterinaria(@PathVariable Long id) {
        return veterinariaService.obtenerMascotasDeVeterinaria(id);
    }

    @GetMapping("/mascotas/perros")
    public List<Mascota> obtenerPerros() {
        return veterinariaService.obtenerPerros();
    }
}
