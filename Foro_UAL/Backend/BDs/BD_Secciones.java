package com.MDS2.ForoUal.Backend.BDs;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.SeccionDAO;

public class BD_Secciones {
	public BD_Principal _bd_main_secciones;
	public Vector<Seccion> _unnamed_Secciones_ = new Vector<Seccion>();

	public Seccion Crear_Seccion(String aTitulo, String aSubtitulo) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Seccion seccion = null;
		
		String localDate = LocalDateTime.now().toString();
		java.util.Date date = java.sql.Date.valueOf(localDate);
		
		try {

			seccion = new Seccion();
			seccion.setSubtitulo(aSubtitulo);
			seccion.setTitulo(aTitulo);
			seccion.setFechaCreacion(date);
			SeccionDAO.save(seccion);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Seccion[] Cargar_Secciones() throws PersistentException{
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Seccion [] secciones = null;
		
		try {
			secciones = SeccionDAO.listSeccionByQuery("", "fechaCreacion");
			t.commit();
			return secciones;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}