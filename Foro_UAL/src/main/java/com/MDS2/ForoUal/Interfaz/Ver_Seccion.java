package com.MDS2.ForoUal.Interfaz;

import java.awt.event.MouseEvent;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.vaadin.event.LayoutEvents.LayoutClickListener;
import com.vaadin.event.MouseEvents;
import com.vaadin.ui.Label;

public class Ver_Seccion extends Ver_Seccion_Ventana {
	private Label _titulo;
	private Label _subtitulo;
	private Label _numMensajes;
	private Label _creador;
	private Label _fecha;
	public Visualizar_Secciones _visualizar_Secciones;
	
	public Ver_Seccion (Seccion s) {
		nombreSuboforo.setValue(s.getTitulo());
		descripcion.setValue(s.getSubtitulo());
		creadorYFecha.setValue(String.format("Creado por %s el %s",s.getCrea().getNombreUsuario(),s.getFechaCreacion()));
		numeroMensajes.setValue(s.getNumMensajes()+"");
		addLayoutClickListener((event) -> {foroUI.singleton.VisualizarSeccion(s);});
	}
}