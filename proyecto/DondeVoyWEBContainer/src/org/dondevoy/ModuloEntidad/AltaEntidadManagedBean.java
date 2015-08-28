package org.dondevoy.ModuloEntidad;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.dondevoy.entidad.EntidadServiceRemote;
import org.dondevoy.entidad.dto.EntidadDTO;
import org.dondevoy.entidad.dto.SucursalDTO;

@ManagedBean
@RequestScoped
public class AltaEntidadManagedBean {

	@EJB
	private EntidadServiceRemote entidadService;

	private EntidadDTO entidadDTO;
	private SucursalDTO sucursalDTO;

	// Estos son los campos del formulario de alta entidad
	private String nombreEntidad;
	private boolean casaMatriz;
	private String codigoPostal;
	private String latitud;
	private String longitud;
	private int numeroSucursal;
	private String observaciones;
	private boolean turnero;

	private String redirectURL;

	@PostConstruct
	public void initialize() {
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext externalContext = context.getExternalContext();
		HttpServletRequest request = (HttpServletRequest) externalContext
				.getRequest();

//		String nombreEntidad = request.getParameter("nombreEntidad");
//		boolean casaMatriz = request.getParameter("nombreEntidad");
//		String codigoPostal = request.getParameter("nombreEntidad");
//		String latitud = request.getParameter("nombreEntidad");
//		String longitud = request.getParameter("nombreEntidad");
//		Integer numeroSucursal = (Integer)request.getParameter("nombreEntidad");
//		String observaciones = request.getParameter("nombreEntidad");
//		boolean turnero = request.getParameter("nombreEntidad");

	}
}