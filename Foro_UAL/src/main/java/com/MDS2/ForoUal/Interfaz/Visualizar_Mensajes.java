package com.MDS2.ForoUal.Interfaz;

import java.util.Vector;

public class Visualizar_Mensajes extends Visualizar_Mensajes_Ventana{
	public Visualizar_Mensaje_NoRegistrado _visualizar_Mensaje_NoRegistrado;
	public Ver_Amigo _ver_Amigo;
	public Vector<Ultimos_Mensajes> _ultimos_Mensajes = new Vector<Ultimos_Mensajes>();
	public Vector<visualizar_Mensaje> _list_visualizar_Mensaje = new Vector<visualizar_Mensaje>();

	public void cargarMensajes() {
		throw new UnsupportedOperationException();
	}
}