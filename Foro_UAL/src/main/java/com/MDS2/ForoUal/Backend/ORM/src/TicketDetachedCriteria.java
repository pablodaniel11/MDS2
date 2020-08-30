package com.MDS2.ForoUal.Backend.ORM.src;
/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TicketDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression idticket;
	public final LongExpression moderadorId;
	public final AssociationExpression moderador;
	public final LongExpression usuario_ticketId;
	public final AssociationExpression usuario_ticket;
	public final StringExpression mensaje;
	public final StringExpression nombreUsuario;
	public final CollectionExpression recibe;
	
	public TicketDetachedCriteria() {
		super(Ticket.class, TicketCriteria.class);
		idticket = new LongExpression("idticket", this.getDetachedCriteria());
		moderadorId = new LongExpression("moderador.", this.getDetachedCriteria());
		moderador = new AssociationExpression("moderador", this.getDetachedCriteria());
		usuario_ticketId = new LongExpression("usuario_ticket.ID", this.getDetachedCriteria());
		usuario_ticket = new AssociationExpression("usuario_ticket", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		recibe = new CollectionExpression("ORM_recibe", this.getDetachedCriteria());
	}
	
	public TicketDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TicketCriteria.class);
		idticket = new LongExpression("idticket", this.getDetachedCriteria());
		moderadorId = new LongExpression("moderador.", this.getDetachedCriteria());
		moderador = new AssociationExpression("moderador", this.getDetachedCriteria());
		usuario_ticketId = new LongExpression("usuario_ticket.ID", this.getDetachedCriteria());
		usuario_ticket = new AssociationExpression("usuario_ticket", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		recibe = new CollectionExpression("ORM_recibe", this.getDetachedCriteria());
	}
	
	public ModeradorDetachedCriteria createModeradorCriteria() {
		return new ModeradorDetachedCriteria(createCriteria("moderador"));
	}
	
	public UsuarioDetachedCriteria createUsuario_ticketCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuario_ticket"));
	}
	
	public AdministradorDetachedCriteria createRecibeCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("ORM_recibe"));
	}
	
	public Ticket uniqueTicket(PersistentSession session) {
		return (Ticket) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Ticket[] listTicket(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Ticket[]) list.toArray(new Ticket[list.size()]);
	}
}

