package com.MDS2.ForoUal.Backend.BDs;

import java.time.LocalDateTime;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.SeccionDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.TemaDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

public class BD_Temas {
	public BD_Principal _bd_main_temas;
	public Vector<Tema> _unnamed_Temas_ = new Vector<Tema>();

	public Tema Crear_Tema(String aTitulo, String aSubtitulo, Usuario user, Long idSeccion) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Tema tema = null;
		Seccion seccion = null;
		String localDate = LocalDateTime.now().toString();
		java.util.Date date = java.sql.Date.valueOf(localDate);
		
		try {
			seccion = SeccionDAO.getSeccionByORMID(idSeccion);
			
			tema.setSeccion(seccion);
			tema.setFechaCreacion(date);
			tema.setNumeroMeGusta(0);
			tema.setSubtitulo(aSubtitulo);
			tema.setTitulo(aTitulo);
			tema.setNumMensjes(0);
			tema.setTipoTema(0);
			tema.setCrea_temas(user);
			TemaDAO.save(tema);
			t.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Tema[] Cambiar_Estado(Long aId)throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Tema tema = null;
		try {
			tema = TemaDAO.getTemaByORMID(aId);
			if(tema.getTipoTema() == 1) {
				tema.setTipoTema(0);
			} else {
				tema.setTipoTema(1);
			}
			TemaDAO.save(tema);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Tema[] Cargar_Temas_Administrador(Long idSeccion) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Tema [] temas = null;
		
		try {
//			seccion = SeccionDAO.getSeccionByORMID(idSeccion);
//			temas = seccion.temas.toArray();
			temas = TemaDAO.listTemaByQuery("Tema.tipoTema = 1 and Tema.tipoTema = 0 and Tema.tipoTema = 2 and Tema.seccion.IDseccion = " + idSeccion, "Tema.fechaCreacion");
			t.commit();
			return temas;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public Tema[] Cargar_Temas_No_Registrado(Long idSeccion) throws PersistentException {
		

		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Tema [] temas = null;
		
		try {
//			seccion = SeccionDAO.getSeccionByORMID(idSeccion);
//			temas = seccion.temas.toArray();
			temas = TemaDAO.listTemaByQuery("Tema.tipoTema = 0 and Tema.seccion.IDseccion = " + idSeccion, "Tema.fechaCreacion");
			t.commit();
			return temas;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public Tema[] Cargar_Temas_Registrado(Long idSeccion) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		Tema [] temas = null;
		
		try {
//			seccion = SeccionDAO.getSeccionByORMID(idSeccion);
//			temas = seccion.temas.toArray();
			temas = TemaDAO.listTemaByQuery("Tema.tipoTema = 0 and Tema.seccion.IDseccion = " + idSeccion, "Tema.fechaCreacion");
			t.commit();
			return temas;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public Tema[] Cargar_Temas_Moderador(Long idSeccion)throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		Tema [] temas = null;
		
		try {
//			seccion = SeccionDAO.getSeccionByORMID(idSeccion);
//			temas = seccion.temas.toArray();
			temas = TemaDAO.listTemaByQuery("Tema.tipoTema = 0 and Tema.tipoTema = 1 and Tema.seccion.IDseccion = " + idSeccion, "Tema.fechaCreacion");
			t.commit();
			return temas;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public void Cerrar_Tema(Long aId)throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Tema tema = null;

		try {
			tema = TemaDAO.getTemaByORMID(aId);
			TemaDAO.save(tema);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int Dar_Megusta_Tema(Long aId) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Tema tema = null;
		int numMG = -1;
		try {
			tema = TemaDAO.getTemaByORMID(aId);
			numMG = tema.getNumeroMeGusta() + 1;
			TemaDAO.save(tema);
			t.commit();
			return numMG;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return numMG;
	}

	public void Ocultar_Tema(Long aId) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Tema tema = null;
		
		try {
			tema = TemaDAO.getTemaByORMID(aId);
			
			if(tema.getTipoTema() == 1) {
				tema.setTipoTema(1);
			} else {
				tema.setTipoTema(0);
			}
			TemaDAO.save(tema);			
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Tema[] Ordenar_Temas(Tema[] aTemas, String aOrden, Long idSeccion) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Tema [] temas = null;
		
		try {
			
			if(aOrden == "Orden por fecha") {
				temas = TemaDAO.listTemaByQuery("Tema.seccion.idSeccion = " + idSeccion, "Tema.fechaCreacion");
			} else {
				temas = TemaDAO.listTemaByQuery("Tema.seccion.idSeccion = " + idSeccion, "Tema.numeroMeGusta");			
			}
			
			t.commit();
			return temas;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}