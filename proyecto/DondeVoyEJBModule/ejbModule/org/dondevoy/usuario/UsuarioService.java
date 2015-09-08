package org.dondevoy.usuario;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.dondevoy.aplicacion.excepciones.BusinessException;
import org.dondevoy.usuario.dto.UsuarioDTO;
import org.dondevoy.usuario.entities.Usuario;

@Stateless
@LocalBean
public class UsuarioService implements UsuarioServiceRemote {

	public void registrarUsuario (UsuarioDTO usuarioDTO) throws BusinessException {
		try {
//			Usuario usuarioexistente = consulta base de datos con el mail del usuario;
//			if (el usuario existe){
//				throw new BusinessException("El usuario ya se encuentra registrado.")
//			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Usuario usuario = new Usuario(usuarioDTO.getContraseña(), usuarioDTO.getCorreo(), usuarioDTO.getCorreoRecuperacion(), usuarioDTO.getNombreUsuario(), true);
	}

	@Override
	public UsuarioDTO buscarUsuario(String correo) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
}
