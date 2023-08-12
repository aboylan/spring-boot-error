package com.bolsadeideas.springboot.error.app.services;

import java.util.List;

import com.bolsadeideas.springboot.error.app.model.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();

	public Usuario obtenerPorId(Integer id);

}
