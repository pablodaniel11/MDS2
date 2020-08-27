package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO;

public class BD_Mensajes {
	public BD_Principal _bd_main_mensajes;
	public Vector<MensajeDAO> _unnamed_Mensaje_ = new Vector<MensajeDAO>();

	public Mensaje[] Cargar_Mensajes_NoRegistrado() {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Mensajes_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Mensajes_Moderador() {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Mensajes_Administrador() {
		throw new UnsupportedOperationException();
	}

	public Mensaje Crear_Mensaje(String aTexto, Media_ aMedia) {
		throw new UnsupportedOperationException();
	}

	public void Dar_Megusta_Mensaje(Long aId) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Mensaje(Long aId) {
		throw new UnsupportedOperationException();
	}

	public void Ocultar_Mensaje(Long aId) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden) {
		throw new UnsupportedOperationException();
	}
}