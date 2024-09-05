package com.repaso.estudiantes.controller;

import com.repaso.estudiantes.modelo.CursadaDTO;
import com.repaso.estudiantes.service.ICursadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/cursadas")
public class CursadaController {
    @Autowired
    ICursadaService cursadaService;

    @PostMapping
    public ResponseEntity<?> crearCursada(@RequestBody CursadaDTO cursadaDTO){
        cursadaService.crearCursada(cursadaDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public CursadaDTO getCursada(@PathVariable Long id){
        return cursadaService.leerCursada(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarCursada(@RequestBody CursadaDTO cursadaDTO){
        cursadaService.modificarCursada(cursadaDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarCursada(@PathVariable Long id){
        cursadaService.eliminarCursada(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<CursadaDTO> getTodosCursadas(){
        return cursadaService.getTodos();
    }
}
