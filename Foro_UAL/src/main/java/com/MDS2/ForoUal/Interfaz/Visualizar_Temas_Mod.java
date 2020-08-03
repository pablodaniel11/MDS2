package com.MDS2.ForoUal.Interfaz;

public class Visualizar_Temas_Mod extends Visualizar_Temas_Registrado {
	public Moderador _moderador;
	public Opciones_Temas_Moderador _opciones_Temas_Moderador;

	public Visualizar_Temas_Mod (){
		super();
		_opciones_Temas_Moderador = new Opciones_Temas_Moderador();
		panelOpcionesLayout.addComponent(_opciones_Temas_Moderador);
	}
	public void cargarTemas() {
		throw new UnsupportedOperationException();
	}
}