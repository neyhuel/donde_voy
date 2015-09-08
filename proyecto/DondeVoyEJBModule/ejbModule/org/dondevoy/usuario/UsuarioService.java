package org.dondevoy.usuario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.dondevoy.aplicacion.excepciones.BusinessException;
import org.dondevoy.usuario.dto.UsuarioDTO;
import org.dondevoy.usuario.dto.UsuarioDTOFabrica;
import org.dondevoy.usuario.entities.EstadoUsuario;
import org.dondevoy.usuario.entities.Usuario;

public class UsuarioService implements UsuarioServiceRemote {

	@PersistenceContext
	private EntityManager manager;
	public void registrarUsuario (UsuarioDTO usuarioDTO) throws BusinessException {
		try {
			Usuario usuarioexistente = manager.find(Usuario.class, usuarioDTO.getCorreo());
			if (usuarioexistente != null){
				throw new BusinessException("El usuario ya se encuentra registrado.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Usuario usuario = UsuarioDTOFabrica.crearUsuario(usuarioDTO);
		manager.persist(usuario);
	}

	@Override
	public UsuarioDTO buscarUsuario(UsuarioDTO usuarioDTO) throws BusinessException {
		// TODO Auto-generated method stub
		Usuario usuariobuscado = null;
		try {
			usuariobuscado = manager.find(Usuario.class, usuarioDTO.getCorreo());
			if (usuariobuscado == null){
				throw new BusinessException("El usuario no existe.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		UsuarioDTO usuariobuscadodto = UsuarioDTOFabrica.crearUsuarioDTO(usuariobuscado);
		return usuariobuscadodto;
	}
	
	public void eliminarUsuario (UsuarioDTO usuarioDTO) throws BusinessException {
		Usuario usuarioAEliminar = null;
		try {
			usuarioAEliminar = manager.find(Usuario.class, usuarioDTO.getCorreo());
			if (usuarioAEliminar == null){
				throw new BusinessException("El usuario no existe.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		manager.remove(usuarioAEliminar);
	}
	
	public void modificarUsuario (UsuarioDTO usuarioDTO) throws BusinessException {
		Usuario usuarioAModificar = null;
		try {
			usuarioAModificar = manager.find(Usuario.class, usuarioDTO.getCorreo());
			if ( usuarioAModificar == null){
				throw new BusinessException("El usuario no existe.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		usuarioAModificar.setContraseña(usuarioDTO.getContraseña());
		usuarioAModificar.setCorreo(usuarioDTO.getCorreo());
		usuarioAModificar.setCorreoRecuperacion(usuarioDTO.getCorreoRecuperacion());
		usuarioAModificar.setNombreUsuario(usuarioDTO.getNombreUsuario());
		usuarioAModificar.setNotificacionActivada(usuarioDTO.getNotificacionActivada());
		manager.refresh(usuarioAModificar);
	}	
	
	public void cambiarEstadoUsuario (UsuarioDTO usuarioDTO) throws BusinessException {
		Usuario usuarioAModificar = null;
		try {
			usuarioAModificar = manager.find(Usuario.class, usuarioDTO.getCorreo());
			if (usuarioAModificar == null){
				throw new BusinessException("El usuario no existe.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<EstadoUsuario> lista = usuarioAModificar.getListEstadoUsuario();
		EstadoUsuario estadoMasNuevo = lista.get(0);
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getFechaCambio().after(estadoMasNuevo.getFechaCambio())){
				estadoMasNuevo = lista.get(i);
			}
		}
		if(estadoMasNuevo.getUsuarioEstado().getNombreUsuarioEstado() == "Activo"){
			estadoMasNuevo.getUsuarioEstado().setNombreUsuarioEstado("Inactivo");
		} else {
			estadoMasNuevo.getUsuarioEstado().setNombreUsuarioEstado("Activo");
		}
		manager.refresh(estadoMasNuevo);
	}
	
}