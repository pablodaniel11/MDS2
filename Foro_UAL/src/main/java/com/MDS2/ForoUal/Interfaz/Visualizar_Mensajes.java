package com.MDS2.ForoUal.Interfaz;

import java.util.Vector;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;

public class Visualizar_Mensajes extends Visualizar_Mensajes_Ventana{
	public Visualizar_Mensaje_NoRegistrado _visualizar_Mensaje_NoRegistrado;
	public Ver_Amigo _ver_Amigo;
	public Vector<Ultimos_Mensajes> _ultimos_Mensajes = new Vector<Ultimos_Mensajes>();
	public Vector<visualizar_Mensaje> _list_visualizar_Mensaje = new Vector<visualizar_Mensaje>();
	public static int action = 0;
	public static Tema tema;
	
	public Visualizar_Mensajes (Tema t) {
		tema = t;
		action = 0;
		cargarMensajes(t);
	}
	public void cargarMensajes(Tema t) {
		Mensaje[] m = foroUI.db.Cargar_Mensajes(t);
		
		for(Mensaje m2 : m) {
			if(foroUI.user == null || (foroUI.user != null && foroUI.privilegios == foroUI.Privilegios.usuario))
				if(m2.getTexto().contains("<Ocultado>") || m2.getTexto().contains("<Borrado>")) continue;
			if((foroUI.user != null && foroUI.privilegios == foroUI.Privilegios.usuario) && m2.getTexto().contains("<borrado>")) continue;
			addComponent(new visualizar_Mensaje(m2));
		}
	}
}