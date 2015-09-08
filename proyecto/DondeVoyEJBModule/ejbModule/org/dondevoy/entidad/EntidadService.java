package org.dondevoy.entidad;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.dondevoy.aplicacion.excepciones.BusinessException;
import org.dondevoy.entidad.dto.EntidadDTO;
import org.dondevoy.entidad.dto.EntidadDTOFabrica;
import org.dondevoy.entidad.dto.SucursalDTO;
import org.dondevoy.entidad.dto.TipoEntidadDTO;
import org.dondevoy.entidad.entities.Entidad;
import org.dondevoy.entidad.entities.EntidadEstado;
import org.dondevoy.entidad.entities.EstadoEntidad;
import org.dondevoy.entidad.entities.EstadoSucursal;
import org.dondevoy.entidad.entities.Sucursal;
import org.dondevoy.entidad.entities.SucursalEstado;

@Stateless
@LocalBean
public class EntidadService implements EntidadServiceRemote {

	@PersistenceContext(unitName ="DondeVoyEJBModule")
	private EntityManager manager;
	
	public void registrarEntidad(EntidadDTO entidadDTO, SucursalDTO sucursalDTO, TipoEntidadDTO tipoEntidadDTO)
			throws BusinessException {
		try {
			Entidad entidadExistente = manager.find(Entidad.class, entidadDTO.getNombreEntidad());
			if (entidadExistente != null){
			//	throw new BusinessException("La entidad ingresada ya se encuentra registrada");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//Si la entidad no existe
		//Creo EstadoSucursal
		EstadoSucursal estadoSucursal = new EstadoSucursal(new Date(),SucursalEstado.ACTIVA);
		
		//Creo Sucursal
		Sucursal sucursal = new Sucursal(true, sucursalDTO.getCodigoPostal(),
				sucursalDTO.getLatitud(), sucursalDTO.getLongitud(),
				sucursalDTO.getNumeroSucursal(),
				sucursalDTO.getObservaciones(), sucursalDTO.isTurnero(),estadoSucursal);
		
		//Creo EstadoEntidad
		EstadoEntidad estadoEntidad = new EstadoEntidad(new Date(), EntidadEstado.ACTIVA);
		
		//Creo Entidad
		//Entidad entidad = new Entidad(EntidadDTO.getNombreEntidad(), sucursal, estadoEntidad); 
		
	}
	
	public EntidadDTO buscarEntidad(EntidadDTO entidadDTO) throws BusinessException {
		Entidad entidad = manager.find(Entidad.class, entidadDTO.getNombreEntidad());
		return EntidadDTOFabrica.crearEntidadDTO(entidad);
	}
	
	public void EliminarEntidad(EntidadDTO entidadDTO){
		Entidad entidadABorrar = manager.find(Entidad.class, entidadDTO.getNombreEntidad());
		if (entidadABorrar == null){
			//throw new BusinessException("La entidad no existe");
		}
		manager.remove(entidadABorrar);
	}
	
	public void cambiarEstadoEntidad(EntidadDTO entidadDTO){
		Entidad entidadAModificar = manager.find(Entidad.class, entidadDTO.getNombreEntidad());
		if (entidadAModificar == null){
			//throw new BusinessException("La entidad no existe");
		}
		//Obtengo la instancia mas actual de EstadoEntidad
		List<EstadoEntidad> lista = entidadAModificar.getListEstadoEntidad();
		EstadoEntidad estadoMasNuevo =  lista.get(0);
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).getFechaCambio().after(estadoMasNuevo.getFechaCambio())){
				estadoMasNuevo = lista.get(i);		
			}
		}
		if(estadoMasNuevo.getEntidadEstado().getNombreEstado() == "Activo")
			estadoMasNuevo.getEntidadEstado().setNombreEstado("Inactivo"); 
		else
			estadoMasNuevo.getEntidadEstado().setNombreEstado("Activo"); 
		manager.refresh(estadoMasNuevo);
	}	
	public void modificarEntidad(EntidadDTO entidadDTO){
		Entidad entidadAModificar = manager.find(Entidad.class, entidadDTO.getNombreEntidad());
		manager.refresh(entidadAModificar);
	}
}
