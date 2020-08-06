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
import org.orm.*;

public class TemaSetCollection extends org.orm.util.ORMSet {
	public TemaSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public TemaSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persistent objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(Tema value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(Tema value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(Tema value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public Tema[] toArray() {
		return (Tema[]) super.toArray(new Tema[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>IDtema</li>
	 * <li>numeroMeGusta</li>
	 * <li>nombreUsuario</li>
	 * <li>tipoTema</li>
	 * <li>Titulo</li>
	 * <li>subtitulo</li>
	 * <li>fechaCreacion</li>
	 * <li>numMensjes</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public Tema[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>IDtema</li>
	 * <li>numeroMeGusta</li>
	 * <li>nombreUsuario</li>
	 * <li>tipoTema</li>
	 * <li>Titulo</li>
	 * <li>subtitulo</li>
	 * <li>fechaCreacion</li>
	 * <li>numMensjes</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public Tema[] toArray(String propertyName, boolean ascending) {
		return (Tema[]) super.toArray(new Tema[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return MDS1PersistentManager.instance();
	}
	
}

