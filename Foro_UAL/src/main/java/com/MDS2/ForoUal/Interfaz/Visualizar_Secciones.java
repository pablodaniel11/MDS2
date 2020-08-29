package com.MDS2.ForoUal.Interfaz;

import java.util.Vector;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;

public class Visualizar_Secciones extends Visualizar_Secciones_Ventana{
	public Visualizar_Raiz__No_Reg_ _visualizar_Raiz_NoReg;
	public Visualizar_Secciones_Registrado _visualizar_Secciones_Registrado;
	public Vector<Ver_Seccion> _ver_Seccion = new Vector<Ver_Seccion>();

	public Visualizar_Secciones() {
		cargarSecciones();
	}
	public void cargarSecciones() {
		Seccion[] secciones = foroUI.db.Cargar_Secciones();
		
		System.out.println(secciones.length + "Seccion");
		for(Seccion s : secciones) {
			addComponent(new Ver_Seccion(s));
			System.out.println("Seccion");
		}
		
		}
	}