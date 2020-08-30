package com.MDS2.ForoUal.Backend.BDs;

import java.sql.Time;
import java.time.Instant;
import java.util.Vector;

import org.orm.PersistentException;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.TemaDAO;
import com.MDS2.ForoUal.Interfaz.Visualizar_Temas_Registrado;

public class BD_Temas {
	public BD_Principal _bd_main_temas;
	public Vector<TemaDAO> _unnamed_Temas_ = new Vector<TemaDAO>();

	public Tema Crear_Tema(String aTitulo, String aSubtitulo) {
		Tema t = TemaDAO.createTema();
		t.setTitulo(aTitulo);
		t.setSubtitulo(aSubtitulo);
		t.setCrea_tema(foroUI.user);
		t.setContiene(Visualizar_Temas_Registrado.sec);
		t.setFechaCreacion(Time.from(Instant.now()));
		t.setNumeroMeGusta(0);
		t.setTipoTema(0);
		t.setNombreUsuario(foroUI.user.getNombreUsuario());
		try {
			TemaDAO.save(t);
			return t;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void Cambiar_Estado(Tema t, Long aId) {
		t.setTipoTema(aId.intValue());
		try {
			TemaDAO.save(t);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Tema[] Cargar_Temas_Administrador(String aSeccion) {
		try {
			return TemaDAO.listTemaByQuery(String.format("SeccionID = %s AND TipoTema = 3",Integer.parseInt(aSeccion)),null);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new Tema[] {};
	}

	public Tema[] Cargar_Temas_No_Registrado(String aSeccion) {
		try {
			return TemaDAO.listTemaByQuery(String.format("SeccionID = %s AND TipoTema = 0",Integer.parseInt(aSeccion)),null);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new Tema[] {};
	}

	public Tema[] Cargar_Temas_Registrado(String aSeccion) {
		try {
			return TemaDAO.listTemaByQuery(String.format("SeccionID = %s AND TipoTema = 1",Integer.parseInt(aSeccion)),null);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new Tema[] {};
	}

	public Tema[] Cargar_Temas_Moderador(String aSeccion) {
		try {
			return TemaDAO.listTemaByQuery(String.format("SeccionID = %s AND TipoTema = 2",Integer.parseInt(aSeccion)),null);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new Tema[] {};
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