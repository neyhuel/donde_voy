package org.dondevoy.aplicacion.excepciones;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.ApplicationException;

import org.dondevoy.aplicacion.excepciones.ValidationError;

@ApplicationException(rollback = true)
public class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ValidationError> errores = new ArrayList<ValidationError>();

	/**
	 * 
	 * @param componente
	 * @param message
	 */
	public BusinessException(String componente, String message) {
		errores.add(new ValidationError(componente, message));
	}

	/**
	 * 
	 * @param message
	 */
	public BusinessException(String message) {
		super(message);
	}

	/**
	 * 
	 * @param mensaje
	 * @param errores
	 */
	public BusinessException(String mensaje, List<ValidationError> errores) {
		this.errores = errores;
	}

	public List<ValidationError> getErrores() {
		return errores;
	}

	/**
	 * 
	 * @param errores
	 */
	public void setErrores(List<ValidationError> errores) {
		this.errores = errores;
	}
}
