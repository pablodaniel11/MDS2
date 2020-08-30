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

public class AdministradorCriteria extends AbstractORMCriteria {
	public final LongExpression ID;
	public final StringExpression email;
	public final StringExpression nombreUsuario;
	public final IntegerExpression fotoPerfil;
	public final StringExpression descripcion;
	public final StringExpression contrasenia;
	public final BooleanExpression marcado;
	public final BooleanExpression baneado;
	public final LongExpression IDusuario;
	public final StringExpression nombreReal;
	public final CollectionExpression reportes_usuario;
	public final CollectionExpression amigo_de;
	public final CollectionExpression pertenece;
	public final CollectionExpression usuarios;
	public final CollectionExpression es_creado;
	public final CollectionExpression tickets_usuario;
	public final LongExpression idMod;
	public final CollectionExpression tickets_moderador;
	public final LongExpression idAdmin;
	public final CollectionExpression son_recibidos;
	public final CollectionExpression es_creada;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		ID = new LongExpression("ID", this);
		email = new StringExpression("email", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		fotoPerfil = new IntegerExpression("fotoPerfil", this);
		descripcion = new StringExpression("descripcion", this);
		contrasenia = new StringExpression("contrasenia", this);
		marcado = new BooleanExpression("marcado", this);
		baneado = new BooleanExpression("baneado", this);
		IDusuario = new LongExpression("IDusuario", this);
		nombreReal = new StringExpression("nombreReal", this);
		reportes_usuario = new CollectionExpression("ORM_reportes_usuario", this);
		amigo_de = new CollectionExpression("ORM_amigo_de", this);
		pertenece = new CollectionExpression("ORM_pertenece", this);
		usuarios = new CollectionExpression("ORM_usuarios", this);
		es_creado = new CollectionExpression("ORM_es_creado", this);
		tickets_usuario = new CollectionExpression("ORM_tickets_usuario", this);
		idMod = new LongExpression("idMod", this);
		tickets_moderador = new CollectionExpression("ORM_tickets_moderador", this);
		idAdmin = new LongExpression("idAdmin", this);
		son_recibidos = new CollectionExpression("ORM_son_recibidos", this);
		es_creada = new CollectionExpression("ORM_es_creada", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public TicketCriteria createSon_recibidosCriteria() {
		return new TicketCriteria(createCriteria("ORM_son_recibidos"));
	}
	
	public SeccionCriteria createEs_creadaCriteria() {
		return new SeccionCriteria(createCriteria("ORM_es_creada"));
	}
	
	public TicketCriteria createTickets_moderadorCriteria() {
		return new TicketCriteria(createCriteria("ORM_tickets_moderador"));
	}
	
	public ReporteCriteria createReportes_usuarioCriteria() {
		return new ReporteCriteria(createCriteria("ORM_reportes_usuario"));
	}
	
	public UsuarioCriteria createAmigo_deCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_amigo_de"));
	}
	
	public MensajeCriteria createPerteneceCriteria() {
		return new MensajeCriteria(createCriteria("ORM_pertenece"));
	}
	
	public UsuarioCriteria createUsuariosCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_usuarios"));
	}
	
	public TemaCriteria createEs_creadoCriteria() {
		return new TemaCriteria(createCriteria("ORM_es_creado"));
	}
	
	public TicketCriteria createTickets_usuarioCriteria() {
		return new TicketCriteria(createCriteria("ORM_tickets_usuario"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

