package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager;
import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.TemaDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;

public class BD_Mensajes {
	public BD_Principal _bd_main_mensajes;
	public Vector<Mensaje> _unnamed_Mensaje_ = new Vector<Mensaje>();

	public Mensaje[] Cargar_Mensajes_NoRegistrado(Long idTema) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Mensaje [] mensajes = null;
		
		try {
			mensajes = MensajeDAO.listMensajeByQuery("marcado = false", "");
			t.commit();
			return mensajes;
		} catch (Exception e) {
			t.rollback();
		}
		return null;		
		
	}

	public Mensaje[] Cargar_Mensajes_Registrado(Long idTema) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Mensaje [] mensajes = null;
		
		try {
			mensajes = MensajeDAO.listMensajeByQuery("marcado = false", "");
			t.commit();
			return mensajes;
		} catch (Exception e) {
			t.rollback();
		}
		return null;	
	}

	public Mensaje[] Cargar_Mensajes_Moderador(Long idTema) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Mensaje [] mensajes = null;
		
		try {
			mensajes = MensajeDAO.listMensajeByQuery("marcado = false", "");
			t.commit();
			return mensajes;
		} catch (Exception e) {
			t.rollback();
		}
		return null;	
	}

	public Mensaje[] Cargar_Mensajes_Administrador(Long idTema) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Mensaje [] mensajes = null;
		
		try {
			mensajes = MensajeDAO.listMensajeByQuery("marcado = true and marcado = false", "");
			t.commit();
			return mensajes;
		} catch (Exception e) {
			t.rollback();
		}
		return null;	
	}

	public Mensaje Crear_Mensaje(String aTexto, Media_ aMedia, Long idTema, Long idUsuario) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		
		Mensaje mensaje = null;
		Usuario user = null;
		Tema tema = null;
		
		try {
			
			user = UsuarioDAO.getUsuarioByORMID(idUsuario);
			tema = TemaDAO.getTemaByORMID(idTema);
			mensaje = new Mensaje();
			mensaje.setNumeroMeGusta(0);
			mensaje.setMarcado(false);
			mensaje.setTexto(aTexto);
			mensaje.setMensaje_(tema);
			mensaje.setNombreUsuario(user.getNombreUsuario());
			mensaje.setEnvia(user);
			
			if(aMedia != null){
				
			}
			MensajeDAO.save(mensaje);
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}
		return null;		
	}

	public void Dar_Megusta_Mensaje(Long aId) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Mensaje m = null;
		
		try {
			m = MensajeDAO.getMensajeByORMID(aId);
			m.setNumeroMeGusta(m.getNumeroMeGusta() + 1);
			MensajeDAO.save(m);
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void Eliminar_Mensaje(Long aId) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Mensaje mensaje = null;
		
		try {
			mensaje = MensajeDAO.getMensajeByORMID(aId);
			MensajeDAO.delete(mensaje);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void Ocultar_Mensaje(Long aId) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Mensaje mensaje = null;  
		
		try {
			MensajeDAO.getMensajeByORMID(aId).setMarcado(true);
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Mensaje [] mensajes = null;

		try {
			mensajes = MensajeDAO.listMensajeByQuery("" , "fechaCreacion");
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}
		return null;		
	}
}