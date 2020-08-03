package com.MDS2.ForoUal.Interfaz;

public class Visualizar_Temas_Administrador extends Visualizar_Temas_Mod {
	public Administrador _administrador;
	public Opciones_Temas_Administrador _opciones_Temas_Administrador;

	public Visualizar_Temas_Administrador (){
		super();
		_opciones_Temas_Administrador = new Opciones_Temas_Administrador();
		panelOpcionesLayout.addComponent(_opciones_Temas_Administrador);
	}
	public void cargarTemas() {
		throw new UnsupportedOperationException();
	}
}