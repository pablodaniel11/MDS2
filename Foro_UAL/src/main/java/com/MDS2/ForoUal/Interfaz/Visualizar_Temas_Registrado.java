package com.MDS2.ForoUal.Interfaz;

public class Visualizar_Temas_Registrado extends Visualizar_Temas_Registrado_Ventana{
	public Usuario_Logueado _usuario_Logueado;
	public panel_Superior_Registrado _panel_Superior_Registrado;
	public Ver_Temas _visualizar_Temas;
	public Opciones_Temas _opciones_Temas;

	public Visualizar_Temas_Registrado () {
		panel_Superior_Registrado ps = new panel_Superior_Registrado(false);
		panelSuperior.setContent(ps);
		_visualizar_Temas = new Ver_Temas();
		listaTemas.setContent(_visualizar_Temas);
		_opciones_Temas = new Opciones_Temas();
		panelOpcionesLayout.addComponent(_opciones_Temas);
	}
	public void cargarTemas() {
		throw new UnsupportedOperationException();
	}
}