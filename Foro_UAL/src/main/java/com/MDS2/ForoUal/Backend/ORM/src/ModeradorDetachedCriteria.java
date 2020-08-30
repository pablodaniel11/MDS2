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

public class ModeradorDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ModeradorDetachedCriteria() {
		super(Moderador.class, ModeradorCriteria.class);
		ID = new LongExpression("ID", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		fotoPerfil = new IntegerExpression("fotoPerfil", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		baneado = new BooleanExpression("baneado", this.getDetachedCriteria());
		IDusuario = new LongExpression("IDusuario", this.getDetachedCriteria());
		nombreReal = new StringExpression("nombreReal", this.getDetachedCriteria());
		reportes_usuario = new CollectionExpression("ORM_reportes_usuario", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_pertenece", this.getDetachedCriteria());
		usuarios = new CollectionExpression("ORM_usuarios", this.getDetachedCriteria());
		es_creado = new CollectionExpression("ORM_es_creado", this.getDetachedCriteria());
		tickets_usuario = new CollectionExpression("ORM_tickets_usuario", this.getDetachedCriteria());
		idMod = new LongExpression("idMod", this.getDetachedCriteria());
		tickets_moderador = new CollectionExpression("ORM_tickets_moderador", this.getDetachedCriteria());
	}
	
	public ModeradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ModeradorCriteria.class);
		ID = new LongExpression("ID", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		fotoPerfil = new IntegerExpression("fotoPerfil", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		baneado = new BooleanExpression("baneado", this.getDetachedCriteria());
		IDusuario = new LongExpression("IDusuario", this.getDetachedCriteria());
		nombreReal = new StringExpression("nombreReal", this.getDetachedCriteria());
		reportes_usuario = new CollectionExpression("ORM_reportes_usuario", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_pertenece", this.getDetachedCriteria());
		usuarios = new CollectionExpression("ORM_usuarios", this.getDetachedCriteria());
		es_creado = new CollectionExpression("ORM_es_creado", this.getDetachedCriteria());
		tickets_usuario = new CollectionExpression("ORM_tickets_usuario", this.getDetachedCriteria());
		idMod = new LongExpression("idMod", this.getDetachedCriteria());
		tickets_moderador = new CollectionExpression("ORM_tickets_moderador", this.getDetachedCriteria());
	}
	
	public TicketDetachedCriteria createTickets_moderadorCriteria() {
		return new TicketDetachedCriteria(createCriteria("ORM_tickets_moderador"));
	}
	
	public ReporteDetachedCriteria createReportes_usuarioCriteria() {
		return new ReporteDetachedCriteria(createCriteria("ORM_reportes_usuario"));
	}
	
	public UsuarioDetachedCriteria createAmigo_deCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_amigo_de"));
	}
	
	public MensajeDetachedCriteria createPerteneceCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_pertenece"));
	}
	
	public UsuarioDetachedCriteria createUsuariosCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_usuarios"));
	}
	
	public TemaDetachedCriteria createEs_creadoCriteria() {
		return new TemaDetachedCriteria(createCriteria("ORM_es_creado"));
	}
	
	public TicketDetachedCriteria createTickets_usuarioCriteria() {
		return new TicketDetachedCriteria(createCriteria("ORM_tickets_usuario"));
	}
	
	public Moderador uniqueModerador(PersistentSession session) {
		return (Moderador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Moderador[] listModerador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Moderador[]) list.toArray(new Moderador[list.size()]);
	}
}

