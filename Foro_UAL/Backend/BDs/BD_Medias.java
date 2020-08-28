package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import javax.print.attribute.standard.Media;

import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.PersistentTransaction;

import com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager;
import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Media_DAO;

public class BD_Medias {
	public BD_Principal _bd_main_medias;
	public Vector<Media_> _unnamed_Media_ = new Vector<Media_>();

	public void Insertar_Media(String aUrl) throws PersistentException {
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Media_ m = null;
		
		try {
			m = new Media_();
			m.setUrl(aUrl);
			Media_DAO.save(m);
			t.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
}