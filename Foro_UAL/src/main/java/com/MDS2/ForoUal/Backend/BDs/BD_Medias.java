package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.orm.PersistentException;

import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Media_Criteria;
import com.MDS2.ForoUal.Backend.ORM.src.Media_DAO;

public class BD_Medias {
	public BD_Principal _bd_main_medias;
	public Vector<Media_DAO> _unnamed_Media_ = new Vector<Media_DAO>();

	public int Insertar_Media(String aUrl) {
		Media_ m = Media_DAO.createMedia_();
		m.setUrl(aUrl);
		try {
			Media_DAO.save(m);
			return m.getORMID();
		} catch (PersistentException e) {
			return -1;
		}
	}
	public Media_ Cargar_Media(int aMedia) {
		try {
			return(Media_DAO.loadMedia_ByORMID(aMedia));
			
		} catch (PersistentException e) {
			return null;
		}
	}
	public int getType(String m) {
		String[] formatosImagen = new String[] {".jpg", ".png",".jpeg"};
		String[] formatoVideo = new String[] {".mp4",".avi",".mov"};
		
		for(String s : formatosImagen)
			if(m.toLowerCase().contains(s)) return 0;
		for(String s : formatoVideo)
			if(m.toLowerCase().contains(s)) return 1;
		return -1;
		
	}
}