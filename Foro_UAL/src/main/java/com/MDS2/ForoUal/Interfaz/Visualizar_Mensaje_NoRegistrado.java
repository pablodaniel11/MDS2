package com.MDS2.ForoUal.Interfaz;

public class Visualizar_Mensaje_NoRegistrado extends Visualizar_Mensajes_NoRegistrado_Ventana{
	public Usuario_no_Logueado _usuario_no_Logueado;
	public Visualizar_Mensajes _visualizar_Mensajes;
	
	public Visualizar_Mensaje_NoRegistrado() {
		Panel_Superior ps = new Panel_Superior(this);
		panelSuperior.setContent(ps);
		_visualizar_Mensajes = new Visualizar_Mensajes();
		listaMensajes.setContent(_visualizar_Mensajes);
	}
	public void cargarMensajes() {
		throw new UnsupportedOperationException();
	}
}