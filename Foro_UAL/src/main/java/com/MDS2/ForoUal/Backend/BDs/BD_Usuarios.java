package com.MDS2.ForoUal.Backend.BDs;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Vector;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.*;

import org.orm.PersistentException;

import com.MDS2.ForoUal.Backend.ORM.src.Imagen;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;
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
		throw new UnsupportedOperationException();
	}

	public void Editar_Perfil(String aDescripcion, String aEmail, Imagen aImagen, String aNombre_completo) {
		throw new UnsupportedOperationException();
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
			foroUI.singleton.VisualizarRaiz();
			
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
		u.setDescripcion(aNombre_completo+" /// "+aDescripcion);
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