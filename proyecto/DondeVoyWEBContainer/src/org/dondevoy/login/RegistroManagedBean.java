package org.dondevoy.login;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.dondevoy.usuario.UsuarioServiceRemote;
import org.dondevoy.usuario.dto.UsuarioDTO;

@ManagedBean
@RequestScoped
public class RegistroManagedBean {

	@EJB
	private UsuarioServiceRemote usuarioService;

	private UsuarioDTO usuarioDTO;
	
	//Estos son los campos del formulario de registro	
	private String nombreUsuario;
	private String contraseña;
	private String correo;
	private String correoRecuperacion;

	private String redirectURL;
	
	@PostConstruct
	public void initialize(){
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext externalContext = context.getExternalContext();
		HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
		
		String correo = request.getParameter("email");
		
		
	}
}
