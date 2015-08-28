package org.dondevoy.usuario.dto;

import org.dondevoy.usuario.entities.Usuario;

public class UsuarioDTOFabrica {

	public static UsuarioDTO crearUsuarioDTO(Usuario usuario){
		UsuarioDTO dto = null;
		
		if (usuario != null){
			dto = new UsuarioDTO();
			dto.setContrase�a(usuario.getContrase�a());
			dto.setCorreo(usuario.getCorreo());
			dto.setCorreoRecuperacion(usuario.getCorreoRecuperacion());
			dto.setNombreUsuario(usuario.getNombreUsuario());
			dto.setNotificacionActivada(usuario.getNotificacionActivada());
		}
		return dto;
	}
	
	public static Usuario crearUsuario(UsuarioDTO usuarioDTO){
		Usuario usuario = null;
		
		if (usuarioDTO != null){
			usuario = new Usuario();
			usuario.setContrase�a(usuarioDTO.getContrase�a());
			usuario.setCorreo(usuarioDTO.getCorreo());
			usuario.setCorreoRecuperacion(usuarioDTO.getCorreoRecuperacion());
			usuario.setNombreUsuario(usuarioDTO.getNombreUsuario());
			usuario.setNotificacionActivada(usuarioDTO.getNotificacionActivada());
		}
		return usuario;
	}
}
