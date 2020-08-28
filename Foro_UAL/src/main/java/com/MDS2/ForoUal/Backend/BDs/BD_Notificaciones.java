package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.atmosphere.cpr.AtmosphereFramework.DefaultAtmosphereObjectFactory;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.MDS2.ForoUal.Backend.ORM.src.Administrador;
import com.MDS2.ForoUal.Backend.ORM.src.AdministradorDAO;
import com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager;
import com.MDS2.ForoUal.Backend.ORM.src.Ticket;
import com.MDS2.ForoUal.Backend.ORM.src.TicketDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;

public class BD_Notificaciones {
	
	public BD_Principal bd_main_notificaciones;
	public Vector<Ticket> tickets = new Vector<Ticket>();
	
	public void Eliminar_Ticket(Long aId) throws PersistentException {
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		
		try {
			Ticket notificacion = TicketDAO.loadTicketByORMID(aId);
			TicketDAO.deleteAndDissociate(notificacion);
			TicketDAO.deleteAndDissociate(notificacion);
			TicketDAO.save(notificacion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
	}

	public void Notificar_Admin(String usuario, Long id, String aMensaje)  throws PersistentException{

		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			Ticket notificacion = TicketDAO.createTicket();
			Usuario user = UsuarioDAO.loadUsuarioByORMID(id);
			notificacion.setMensaje(aMensaje);
			notificacion.setNombreUsuario(usuario);
			
			TicketDAO.save(notificacion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}