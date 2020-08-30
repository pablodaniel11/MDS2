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
import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="`Ticket`")
public class Ticket implements Serializable {
	public Ticket() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TICKET_RECIBE) {
			return ORM_recibe;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TICKET_USUARIO_TICKET) {
			this.usuario_ticket = (Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_TICKET_MODERADOR) {
			this.moderador = (Moderador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="`Idticket`", nullable=false, length=20)	
	@Id	
	@GeneratedValue(generator="TICKET_IDTICKET_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TICKET_IDTICKET_GENERATOR", strategy="native")	
	private Long idticket;
	
	@ManyToOne(targetEntity=Moderador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`ModeradorUsuarioID`", referencedColumnName="`UsuarioID`") }, foreignKey=@ForeignKey(name="FKTicket110136"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Moderador moderador;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`UsuarioID`", referencedColumnName="`ID`", nullable=false) }, foreignKey=@ForeignKey(name="FKTicket70742"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario usuario_ticket;
	
	@Column(name="`Mensaje`", nullable=true, length=255)	
	private String mensaje;
	
	@Column(name="`NombreUsuario`", nullable=true, length=255)	
	private String nombreUsuario;
	
	@ManyToMany(mappedBy="ORM_son_recibidos", targetEntity=Administrador.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_recibe = new java.util.HashSet();
	
	private void setIdticket(long value) {
		setIdticket(new Long(value));
	}
	
	private void setIdticket(Long value) {
		this.idticket = value;
	}
	
	public Long getIdticket() {
		return idticket;
	}
	
	public Long getORMID() {
		return getIdticket();
	}
	
	public void setMensaje(String value) {
		this.mensaje = value;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setUsuario_ticket(Usuario value) {
		if (usuario_ticket != null) {
			usuario_ticket.tickets_usuario.remove(this);
		}
		if (value != null) {
			value.tickets_usuario.add(this);
		}
	}
	
	public Usuario getUsuario_ticket() {
		return usuario_ticket;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario_ticket(Usuario value) {
		this.usuario_ticket = value;
	}
	
	private Usuario getORM_Usuario_ticket() {
		return usuario_ticket;
	}
	
	private void setORM_Recibe(java.util.Set value) {
		this.ORM_recibe = value;
	}
	
	private java.util.Set getORM_Recibe() {
		return ORM_recibe;
	}
	
	@Transient	
	public final AdministradorSetCollection recibe = new AdministradorSetCollection(this, _ormAdapter, ORMConstants.KEY_TICKET_RECIBE, ORMConstants.KEY_ADMINISTRADOR_SON_RECIBIDOS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setModerador(Moderador value) {
		if (moderador != null) {
			moderador.tickets_moderador.remove(this);
		}
		if (value != null) {
			value.tickets_moderador.add(this);
		}
	}
	
	public Moderador getModerador() {
		return moderador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Moderador(Moderador value) {
		this.moderador = value;
	}
	
	private Moderador getORM_Moderador() {
		return moderador;
	}
	
	public String toString() {
		return String.valueOf(getIdticket());
	}
	
}
