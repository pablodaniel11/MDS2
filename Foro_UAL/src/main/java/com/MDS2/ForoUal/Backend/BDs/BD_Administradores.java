package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.MDS2.ForoUal.Backend.ORM.src.Administrador;
import com.MDS2.ForoUal.Backend.ORM.src.AdministradorDAO;
import com.MDS2.ForoUal.Backend.ORM.src.AdministradoresDAO;
import com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;

public class BD_Administradores {
	
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Administrador> _unnamed_Administrador_ = new Vector<Administrador>();

	public void Insertar_Administrador(Long aId) throws PersistentException{
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Usuario user = null;
		Administrador admin = null;
		
		try {
			
			user = UsuarioDAO.getUsuarioByORMID(aId);
			admin = new Administrador();
			admin.setId(aId);
			AdministradorDAO.save(admin);
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}

	}

	public void Eliminar_Administrador(Long aId) throws PersistentException{
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Administrador admin = null;
		
		try {
			admin = AdministradorDAO.loadAdministradorByQuery("id = " + String.valueOf(aId), "id");
			AdministradorDAO.delete(admin);
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}	
	}

//	public void Registrar_Moderador(String aEmail, String aNombre, String aContrasenia, String aRepetirContrasenia) 
//			throws PersistentException {
//		
//		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
//		
//		try {
//			
//			t.commit();
//
//		} catch (Exception e) {
//			t.rollback();
//		}
//	}
	
}