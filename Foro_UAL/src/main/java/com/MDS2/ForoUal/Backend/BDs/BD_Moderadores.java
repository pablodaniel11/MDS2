package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.MDS2.ForoUal.Backend.ORM.src.Administrador;
import com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager;
import com.MDS2.ForoUal.Backend.ORM.src.Moderador;
import com.MDS2.ForoUal.Backend.ORM.src.ModeradorDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;

public class BD_Moderadores {
	public BD_Principal _bd_main_moderadores;
	public Vector<Moderador> _unnamed_Moderador_ = new Vector<Moderador>();

	public void Insertar_Moderador(Long aId) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Moderador mod = null;
		Usuario user = null;

		try {
			user = UsuarioDAO.getUsuarioByORMID(aId);
			mod = new Moderador();
			mod.setIDusuario(aId);
			ModeradorDAO.save(mod);
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void Eliminar_Moderador(Long aId) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Moderador mod = null;
		
		try {
			
			mod = ModeradorDAO.getModeradorByORMID(aId);
			ModeradorDAO.save(mod);
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}
	}
}