package com.MDS2.ForoUal.Interfaz;

public class Visualizar_Mensajes_Registrado extends Visualizar_Mensajes_Registrado_Ventana{
	public Usuario_Logueado _usuario_Logueado;
	public Opciones_Mensajes _opciones_Mensajes;
	public Visualizar_Mensajes _visualizar_Mensajes;

	public Visualizar_Mensajes_Registrado () {
		panel_Superior_Registrado ps = new panel_Superior_Registrado(false);
		panelSuperior.setContent(ps);
		_visualizar_Mensajes = new Visualizar_Mensajes();
		listaMensajes.setContent(_visualizar_Mensajes);
		_opciones_Mensajes = new Opciones_Mensajes();
		panelOpcionesLayout.addComponent(_opciones_Mensajes);
	}
	
	public void cargarMensajes() {
		throw new UnsupportedOperationException();
	}
}