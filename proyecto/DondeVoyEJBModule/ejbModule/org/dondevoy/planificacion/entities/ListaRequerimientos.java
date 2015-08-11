package org.dondevoy.planificacion.entities;

import java.util.Date;

public class ListaRequerimientos {

	private Date fechaVigencia;
	
	private DocumentoRequerido documentoRequerido;

	public Date getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public DocumentoRequerido getDocumentoRequerido() {
		return documentoRequerido;
	}

	public void setDocumentoRequerido(DocumentoRequerido documentoRequerido) {
		this.documentoRequerido = documentoRequerido;
	}
	
	
}
