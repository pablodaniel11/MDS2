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
@Table(name="`Media_`")
public class Media_ implements Serializable {
	public Media_() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MEDIA__MENSAJE_MEDIA) {
			this.mensaje_media = (Mensaje) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="`IDmedia`", nullable=false, length=20)	
	@Id	
	@GeneratedValue(generator="MEDIA__IDMEDIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MEDIA__IDMEDIA_GENERATOR", strategy="native")	
	private Long IDmedia;
	
	@ManyToOne(targetEntity=Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`MensajeID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKMedia_293025"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Mensaje mensaje_media;
	
	@Column(name="`Url`", nullable=false, length=255)	
	private String url;
	
	private void setIDmedia(long value) {
		setIDmedia(new Long(value));
	}
	
	private void setIDmedia(Long value) {
		this.IDmedia = value;
	}
	
	public Long getIDmedia() {
		return IDmedia;
	}
	
	public Long getORMID() {
		return getIDmedia();
	}
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setMensaje_media(Mensaje value) {
		if (mensaje_media != null) {
			mensaje_media.media_mensaje.remove(this);
		}
		if (value != null) {
			value.media_mensaje.add(this);
		}
	}
	
	public Mensaje getMensaje_media() {
		return mensaje_media;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Mensaje_media(Mensaje value) {
		this.mensaje_media = value;
	}
	
	private Mensaje getORM_Mensaje_media() {
		return mensaje_media;
	}
	
	public String toString() {
		return String.valueOf(getIDmedia());
	}
	
}
