package com.bolsadeideas.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.model.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Alex", "Boylan"));
		this.lista.add(new Usuario(2, "Pepa", "Garcia"));
		this.lista.add(new Usuario(3, "Lalo", "Mena"));
		this.lista.add(new Usuario(4, "Luci", "Fernandez"));
		this.lista.add(new Usuario(5, "Pato", "Gonzalez"));
		this.lista.add(new Usuario(6, "Paco", "Rodriguez"));
		this.lista.add(new Usuario(7, "Juan", "Gomez"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for (Usuario u : lista) {
			if (u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		return resultado;
	}

}
