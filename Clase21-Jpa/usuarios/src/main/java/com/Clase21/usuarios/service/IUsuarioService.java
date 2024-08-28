package com.Clase21.usuarios.service;

import com.Clase21.usuarios.entity.Usuario;

public interface IUsuarioService {
    Usuario guardar(Usuario usuario);
    Usuario buscarPorId(Long id);
}
