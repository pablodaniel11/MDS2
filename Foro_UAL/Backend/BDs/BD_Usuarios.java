package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.MDS2.ForoUal.Backend.ORM.src.Imagen;
import com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

import antlr.collections.List;

public class BD_Usuarios {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Usuario> _unnamed_Usuario_ = new Vector<Usuario>();

	public void Banear(String aNombre)throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Desbanear(String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List Buscar_Amigo_PorNombre(String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void Cargar_Usuario_Administrador(String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List Cargar_Usuario(String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List Cargar_Amigos(String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Mensaje[] Cargar_Ultimos_Mensajes(String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Mensaje[] Devolver_Ultimos_Mensajes(Usuario aUser, int aNummensajes)throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean Darse_Baja(String aContrasenia, String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void Editar_Perfil(String aDescripcion, String aEmail, Imagen aImagen, String aNombre_completo) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Eliminar_Amigo(String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean Iniciar_Sesion(String aNombre, String aContrasenia) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public void Insertar_Amigo(String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean Modificar_Rol(String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public void Recuperar_Contrasenia_Perfil(String aNombre)throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aRepetirContrasenia) 
			throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}