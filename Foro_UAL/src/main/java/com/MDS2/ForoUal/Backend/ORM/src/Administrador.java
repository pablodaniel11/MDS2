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
@SuppressWarnings("serial")
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="`Administrador`")
public class Administrador implements Serializable {
	/**
	 * 
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	public Administrador() {
	}
	
	public String toString() {
		return super.toString();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
