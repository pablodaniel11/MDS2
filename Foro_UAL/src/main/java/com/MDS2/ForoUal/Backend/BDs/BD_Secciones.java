package com.MDS2.ForoUal.Backend.BDs;

import java.sql.Time;
import java.time.Instant;
import java.util.Vector;

import org.orm.PersistentException;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Administradores;
import com.MDS2.ForoUal.Backend.ORM.src.AdministradoresDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.SeccionDAO;

public class BD_Secciones {
	public BD_Principal _bd_main_secciones;
	public Vector<SeccionDAO> _unnamed_Secciones_ = new Vector<SeccionDAO>();

	public Seccion Crear_Seccion(String aTitulo, String aSubtitulo) {
		Seccion s = SeccionDAO.createSeccion();
		s.setTitulo(aTitulo);
		s.setSubtitulo(aSubtitulo);
		s.setFechaCreacion(Time.from(Instant.now()));
		Administradores a = null;
		try {
			a = AdministradoresDAO.getAdministradoresByORMID(1);
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			s.setCrea(a);
		
		
		try {
			SeccionDAO.save(s);
			return s;
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Seccion[] Cargar_Secciones() {
		try {
			return SeccionDAO.listSeccionByQuery("1=1", "ID");
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			return new Seccion[] {};
		}
	}
}