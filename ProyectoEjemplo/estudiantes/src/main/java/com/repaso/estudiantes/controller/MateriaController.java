package com.repaso.estudiantes.controller;

import com.repaso.estudiantes.modelo.MateriaDTO;
import com.repaso.estudiantes.service.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {
    @Autowired
    IMateriaService materiaService;

    @PostMapping
    public ResponseEntity<?> crearMateria(@RequestBody MateriaDTO materiaDTO){
        materiaService.crearMateria(materiaDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public MateriaDTO getMateria(@PathVariable Long id){
        return materiaService.leerMateria(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarMateria(@RequestBody MateriaDTO materiaDTO){
        materiaService.modificarMateria(materiaDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarMateria(@PathVariable Long id){
        materiaService.eliminarMateria(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<MateriaDTO> getTodosEstudiantes(){
        return materiaService.getTodos();
    }
}
