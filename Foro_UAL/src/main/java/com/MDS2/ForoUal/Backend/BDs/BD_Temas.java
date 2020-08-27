package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.TemaDAO;

public class BD_Temas {
	public BD_Principal _bd_main_temas;
	public Vector<TemaDAO> _unnamed_Temas_ = new Vector<TemaDAO>();

	public Tema Crear_Tema(String aTitulo, String aSubtitulo) {
		throw new UnsupportedOperationException();
	}

	public Tema[] Cambiar_Estado(Long aId) {
		throw new UnsupportedOperationException();
	}

	public Tema[] Cargar_Temas_Administrador(String aSeccion) {
		throw new UnsupportedOperationException();
	}

	public Tema[] Cargar_Temas_No_Registrado(String aSeccion) {
		throw new UnsupportedOperationException();
	}

	public Tema[] Cargar_Temas_Registrado(String aSeccion) {
		throw new UnsupportedOperationException();
	}

	public Tema[] Cargar_Temas_Moderador(String aSeccion) {
		throw new UnsupportedOperationException();
	}

	public void Cerrar_Tema(Long aId) {
		throw new UnsupportedOperationException();
	}

	public int Dar_Megusta_Tema(Long aId) {
		throw new UnsupportedOperationException();
	}

	public void Ocultar_Tema(Long aId) {
		throw new UnsupportedOperationException();
	}

	public Tema[] Ordenar_Temas(Tema[] aTemas, String aOrden) {
		throw new UnsupportedOperationException();
	}
}