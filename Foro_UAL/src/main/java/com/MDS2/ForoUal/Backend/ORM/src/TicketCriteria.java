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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TicketCriteria extends AbstractORMCriteria {
	public final LongExpression idticket;
	public final LongExpression moderadorId;
	public final AssociationExpression moderador;
	public final LongExpression usuario_ticketId;
	public final AssociationExpression usuario_ticket;
	public final StringExpression mensaje;
	public final StringExpression nombreUsuario;
	public final CollectionExpression recibe;
	
	public TicketCriteria(Criteria criteria) {
		super(criteria);
		idticket = new LongExpression("idticket", this);
		moderadorId = new LongExpression("moderador.", this);
		moderador = new AssociationExpression("moderador", this);
		usuario_ticketId = new LongExpression("usuario_ticket.ID", this);
		usuario_ticket = new AssociationExpression("usuario_ticket", this);
		mensaje = new StringExpression("mensaje", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		recibe = new CollectionExpression("ORM_recibe", this);
	}
	
	public TicketCriteria(PersistentSession session) {
		this(session.createCriteria(Ticket.class));
	}
	
	public TicketCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public ModeradorCriteria createModeradorCriteria() {
		return new ModeradorCriteria(createCriteria("moderador"));
	}
	
	public UsuarioCriteria createUsuario_ticketCriteria() {
		return new UsuarioCriteria(createCriteria("usuario_ticket"));
	}
	
	public AdministradorCriteria createRecibeCriteria() {
		return new AdministradorCriteria(createCriteria("ORM_recibe"));
	}
	
	public Ticket uniqueTicket() {
		return (Ticket) super.uniqueResult();
	}
	
	public Ticket[] listTicket() {
		java.util.List list = super.list();
		return (Ticket[]) list.toArray(new Ticket[list.size()]);
	}
}

