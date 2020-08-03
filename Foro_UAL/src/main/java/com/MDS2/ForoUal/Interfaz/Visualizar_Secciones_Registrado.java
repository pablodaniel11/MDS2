package com.MDS2.ForoUal.Interfaz;

public class Visualizar_Secciones_Registrado extends Visualizar_Secciones_Registrado_Ventana{
	public panel_Superior_Registrado _panel_Superior_Registrado;
	public Usuario_Logueado _usuario_Logueado;
	public Visualizar_Secciones _visualizar_Secciones;

	public void cargarSecciones() {
		throw new UnsupportedOperationException();
	}
	public Visualizar_Secciones_Registrado() {
		panel_Superior_Registrado ps = new panel_Superior_Registrado();
		panelSuperior.setContent(ps);
		_visualizar_Secciones = new Visualizar_Secciones();
		listaSubForos.setContent(_visualizar_Secciones);
		panelOpciones.setVisible(false);
	}
}