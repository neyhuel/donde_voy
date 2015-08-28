package org.dondevoy.usuario;

import javax.ejb.Remote;

import org.dondevoy.aplicacion.excepciones.BusinessException;
import org.dondevoy.usuario.dto.UsuarioDTO;

@Remote
public interface UsuarioServiceRemote {

	public void registrarUsuario (UsuarioDTO usuarioDTO) throws BusinessException;
//	Registra un usuario en el sistema
	
	public UsuarioDTO buscarUsuario (UsuarioDTO usuarioDTO) throws BusinessException;
//	Buscar un usuario con determinado correo electrónico
	
}