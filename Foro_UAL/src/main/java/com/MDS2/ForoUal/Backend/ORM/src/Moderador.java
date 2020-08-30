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
@Table(name="`Moderador`")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Moderador")
@PrimaryKeyJoinColumn(name="`UsuarioID`", referencedColumnName="`ID`")
public class Moderador extends Usuario implements Serializable {
	public Moderador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MODERADOR_TICKETS_MODERADOR) {
			return ORM_tickets_moderador;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="`IdMod`", nullable=true, length=20)	
	private Long idMod;
	
	@OneToMany(mappedBy="moderador", targetEntity=Ticket.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tickets_moderador = new java.util.HashSet();
	
	public void setIdMod(long value) {
		setIdMod(new Long(value));
	}
	
	public void setIdMod(Long value) {
		this.idMod = value;
	}
	
	public Long getIdMod() {
		return idMod;
	}
	
	private void setORM_Tickets_moderador(java.util.Set value) {
		this.ORM_tickets_moderador = value;
	}
	
	private java.util.Set getORM_Tickets_moderador() {
		return ORM_tickets_moderador;
	}
	
	@Transient	
	public final TicketSetCollection tickets_moderador = new TicketSetCollection(this, _ormAdapter, ORMConstants.KEY_MODERADOR_TICKETS_MODERADOR, ORMConstants.KEY_TICKET_MODERADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
