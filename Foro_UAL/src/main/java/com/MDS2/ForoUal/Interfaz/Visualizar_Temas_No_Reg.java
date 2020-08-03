package com.MDS2.ForoUal.Interfaz;

public class Visualizar_Temas_No_Reg extends VIsualizar_temas_No_Reg_Ventana{
	public Usuario_no_Logueado _usuario_no_Logueado;
	public Ver_Temas _visualizar_Temas;

	public void cargarTemas() {
		throw new UnsupportedOperationException();
	}
	public Visualizar_Temas_No_Reg() {
		Panel_Superior ps = new Panel_Superior();
		panelSuperior.setContent(ps);
		_visualizar_Temas = new Ver_Temas();
		listaTemas.setContent(_visualizar_Temas);
	}
}