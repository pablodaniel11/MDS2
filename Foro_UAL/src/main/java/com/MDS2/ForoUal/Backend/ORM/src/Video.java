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
@Table(name="`Video`")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Video")
@PrimaryKeyJoinColumn(name="`Media_IDmedia`", referencedColumnName="`IDmedia`")
public class Video extends Media_ implements Serializable {
	public Video() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_VIDEO_MENSAJE_VIDEO) {
			return ORM_mensaje_video;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="video", targetEntity=Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mensaje_video = new java.util.HashSet();
	
	private void setORM_Mensaje_video(java.util.Set value) {
		this.ORM_mensaje_video = value;
	}
	
	private java.util.Set getORM_Mensaje_video() {
		return ORM_mensaje_video;
	}
	
	@Transient	
	public final MensajeSetCollection mensaje_video = new MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_VIDEO_MENSAJE_VIDEO, ORMConstants.KEY_MENSAJE_VIDEO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
