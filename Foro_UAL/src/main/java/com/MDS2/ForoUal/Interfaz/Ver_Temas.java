package com.MDS2.ForoUal.Interfaz;

import java.util.Vector;

import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component.Event;


public class Ver_Temas extends Ver_Temas_Ventanas{
	private Event _ordenar_temas_frecuencia;
	private Event _ordenar_temas_megusta;
	private Event _ordenar_temas_alp;
	//public Vector<Visualizar_Temas_No_Reg> _visualizar_Temas_No_Reg = new Vector<Visualizar_Temas_No_Reg>();
	//public Vector<Visualizar_Temas_Registrado> _visualizar_Temas = new Vector<Visualizar_Temas_Registrado>();
	public Vector<Ver_Tema> _visualizar_Tema = new Vector<Ver_Tema>();

	public Ver_Temas() {
		ordenarFecha.addClickListener((ClickListener) _ordenar_temas_frecuencia);
		ordenarLikes.addClickListener((ClickListener) _ordenar_temas_megusta);
		ordenarAlf.addClickListener((ClickListener) _ordenar_temas_alp);
	}
	public void Ordenar_temas_frecuencia() {
		throw new UnsupportedOperationException();
	}

	public void Ordenar_temas_megusta() {
		throw new UnsupportedOperationException();
	}
	public void Ordenar_temas_alp() {
		throw new UnsupportedOperationException();
	}

	public void cargarTemas() {
		throw new UnsupportedOperationException();
	}
}