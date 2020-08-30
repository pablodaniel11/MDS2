package com.MDS2.ForoUal.Backend.BDs;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Vector;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.*;

import org.orm.PersistentException;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

import antlr.collections.List;

public class BD_Usuarios {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<UsuarioDAO> _unnamed_Usuario_ = new Vector<UsuarioDAO>();

	public void Banear(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Desbanear(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public List Buscar_Amigo_PorNombre(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Cargar_Usuario_Administrador(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Usuario(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Amigos(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Ultimos_Mensajes(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Devolver_Ultimos_Mensajes(Usuario aUser, int aNummensajes) {
		throw new UnsupportedOperationException();
	}

	public boolean Darse_Baja(String aContrasenia, String aNombre) {
		try {
			UsuarioDAO.deleteAndDissociate(foroUI.user);
			return true;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public void Editar_Perfil(String aDescripcion, String aEmail, Media_ fotoPerfil, String aNombre_completo) {
		try {
			Media_DAO.save(fotoPerfil);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		foroUI.user.setDescripcion(aDescripcion);
		foroUI.user.setEmail(aEmail);
		foroUI.user.setNombreReal(aNombre_completo);
		
		try {
			UsuarioDAO.save(foroUI.user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Eliminar_Amigo(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public boolean Iniciar_Sesion(String aNombre, String aContrasenia) {
		
		String key = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
		aContrasenia = PasswordUtils.generateSecurePassword(aContrasenia, key);

		try {
			Usuario u = UsuarioDAO.loadUsuarioByQuery(String.format("Email = '%s' AND Contrasenia = '%s'",aNombre,aContrasenia), "Email");
			foroUI.user = u;
			
			//Privilegios
			try {
			Moderador mod = ModeradorDAO.getModeradorByORMID(u.getID());
			if(mod != null) foroUI.privilegios = foroUI.Privilegios.moderador;
			}
			catch (Exception e)
			{
				
			}
			
			try {
			Administrador ad = AdministradorDAO.getAdministradorByORMID(u.getID());
			if(ad != null) foroUI.privilegios = foroUI.Privilegios.administrador;
			}
			catch (Exception e)
			{
				
			}
			
			//Visualizar
			foroUI.singleton.VisualizarRaiz();
			
			System.out.println("Login as: " + foroUI.privilegios);
			return u != null;
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public void Insertar_Amigo(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public boolean Modificar_Rol(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Recuperar_Contrasenia_Perfil(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aNombre_completo, int aFoto_perfil, String aDescripcion) {
		
		String key = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
		aContrasenia = PasswordUtils.generateSecurePassword(aContrasenia, key);
		
		Usuario u = UsuarioDAO.createUsuario();
		u.setEmail(aEmail);
		u.setNombreUsuario(aNombre);
		u.setContrasenia(aContrasenia);
		u.setDescripcion(aDescripcion);
		u.setNombreReal(aNombre_completo);
		u.setFotoPerfil(aFoto_perfil);
		try {
			UsuarioDAO.save(u);
			return true;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}