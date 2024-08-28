package com.Clase21.usuarios.service.impl;

import com.Clase21.usuarios.entity.Usuario;
import com.Clase21.usuarios.repository.IUsuarioRepository;
import com.Clase21.usuarios.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    @Override
    public Usuario guardar(Usuario usuario) {
        return iUsuarioRepository.save(usuario);
    }

    @Override
    public Usuario buscarPorId(Long id) {
        Optional<Usuario> usuarioBuscado = iUsuarioRepository.findById(id);
        return usuarioBuscado.orElse(null);
    }
}
