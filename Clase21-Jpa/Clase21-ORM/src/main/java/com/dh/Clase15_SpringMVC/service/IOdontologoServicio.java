package com.dh.Clase15_SpringMVC.service;

import com.dh.Clase15_SpringMVC.entity.Odontologo;

import java.util.List;
import java.util.Optional;

public interface IOdontologoServicio {
    Odontologo guardar (Odontologo odontologo);
    Odontologo buscarPorId(Long id);
    void eliminar(Long id);
    void actualizar (Odontologo odontologo);

    List<Odontologo> listarTodos();
}
