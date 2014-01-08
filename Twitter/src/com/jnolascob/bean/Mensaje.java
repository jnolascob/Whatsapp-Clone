package com.jnolascob.bean;

public class Mensaje {
	private String contenido; 
	private String detalle;
	private int imagen;
	public Mensaje() {

	}

	public Mensaje(String contenido, String detalle, int imagen){
		this.contenido = contenido;
		this.detalle = detalle;
		this.imagen = imagen;
	}





	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getImagen() {
		return imagen;
	}

	public void setImagen(int imagen) {
		this.imagen = imagen;
	}


}
