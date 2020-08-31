package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.orm.PersistentException;

import com.MDS2.ForoUal.Backend.ORM.src.Ticket;
import com.MDS2.ForoUal.Backend.ORM.src.TicketDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;

public class BD_Notificaciones {
	public BD_Principal _bd_main_notificaciones;
	public Vector<TicketDAO> _unnamed_Ticket_ = new Vector<TicketDAO>();

	public void Eliminar_Ticket(Long aId) {
		throw new UnsupportedOperationException();
	}

	public Ticket Notificar_Admin(String aNombreUsuario, String aMensaje) {
		try {
			Usuario u = UsuarioDAO.loadUsuarioByQuery(String.format("NombreUsuario = '%s'",aNombreUsuario), null);
			u.setMarcado(true);
			UsuarioDAO.save(u);
			
			Ticket t = TicketDAO.createTicket();
			t.setMensaje(aMensaje);
			TicketDAO.save(t);
			return t;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}