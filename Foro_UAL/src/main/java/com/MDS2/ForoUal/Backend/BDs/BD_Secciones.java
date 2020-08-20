package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import com.MDS2.ForoUal.Backend.ORM.src.Seccion;

public class BD_Secciones {
	public BD_Principal _bd_main_secciones;
	public Vector<Seccion> _unnamed_Secciones_ = new Vector<Seccion>();

	public Seccion Crear_Seccion(String aTitulo, String aSubtitulo) {
		throw new UnsupportedOperationException();
	}

	public Seccion[] Cargar_Secciones_Administrador() {
		throw new UnsupportedOperationException();
	}

	public Seccion[] Cargar_Secciones_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Seccion[] Cargar_Secciones_No_Registrado() {
		throw new UnsupportedOperationException();
	}
}