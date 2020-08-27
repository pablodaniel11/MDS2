package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import com.MDS2.ForoUal.Backend.ORM.src.Ticket;
import com.MDS2.ForoUal.Backend.ORM.src.TicketDAO;

public class BD_Notificaciones {
	public BD_Principal _bd_main_notificaciones;
	public Vector<TicketDAO> _unnamed_Ticket_ = new Vector<TicketDAO>();

	public void Eliminar_Ticket(Long aId) {
		throw new UnsupportedOperationException();
	}

	public Ticket Notificar_Admin(String aNombreUsuario, String aMensaje) {
		throw new UnsupportedOperationException();
	}
}