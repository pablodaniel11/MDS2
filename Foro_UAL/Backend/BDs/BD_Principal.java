package com.MDS2.ForoUal.Backend.BDs;

import javax.print.attribute.standard.Media;

import com.MDS2.ForoUal.Backend.Interfaces_BD.i_Usuario_No_Registrado;
import com.MDS2.ForoUal.Backend.ORM.src.Imagen;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Reporte;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.Ticket;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

import antlr.collections.List;

public class BD_Principal {
	
	private BD_Medias _medias = new BD_Medias();
	private BD_Reportes _reportes = new  BD_Reportes();
	private BD_Usuarios _usuarios = new BD_Usuarios();
	private BD_Mensajes _mensajes = new BD_Mensajes();
	private BD_Temas _temas = new BD_Temas();
	private BD_Secciones _seccioness = new BD_Secciones();
	private BD_Notificaciones _tickets = new BD_Notificaciones();
	
	public BD_Usuarios bd_usuarios = new BD_Usuarios(); 
	public BD_Medias bd_medias = new BD_Medias();
	public BD_Reportes bd_reportes = new BD_Reportes();
	public BD_Mensajes bd_mensajes= new BD_Mensajes();
	public BD_Temas bd_temas= new BD_Temas();
	public BD_Secciones bd_secciones= new BD_Secciones();
	public BD_Notificaciones bd_notificaciones= new BD_Notificaciones();
	public BD_Administradores bd_administrador= new BD_Administradores();
	public BD_Moderadores bd_moderadores= new BD_Moderadores();

	public void Banear(String aNombre) {
		
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List Cargar_Usuario(String aNombre) {
		
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public List Cargar_Usuarios_Busqueda() {

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List Cargar_Amigos(String aNombre) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Mensaje[] Cargar_Ultimos_Mensajes(String aNombre) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aRepetirContrasenia) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

	public Mensaje[] Devolver_Ultimos_Mensajes(Long aIduser, int aNummensajes) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public boolean Darse_Baja(String aContrasenia, String aNombre) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

	public void Editar_Perfil(String aDescripcion, String aEmail, Imagen aImagen, String aNombre_completo) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean Modificar_Rol(String aNombre) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

	public void Insertar_Media(String aUrl) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Reporte Crear_Reporte(int aIdMensaje, String aMensaje) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public void Eliminar_Reporte(int aIdReporte) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Mensaje Crear_Mensaje(String aTexto, Media aMedia) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Mensaje[] Cargar_Mensajes() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public void Ocultar_Mensaje(Long aId) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Tema Crear_Tema(String aTitulo, String aSubtitulo) {
		throw new UnsupportedOperationException();
	}

	public void Cambiar_Estado(Long aId) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Cerrar_Tema(Long aId) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public void Ocultar_Tema(Tema aTema) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Seccion Crear_Seccion(String aTitulo, String aSubtitulo) {
		throw new UnsupportedOperationException();
	}

	public void Recuperar_Contrasenia_Perfil(String aNombre) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Dar_Megusta_Mensaje(Long aId) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Dar_Megusta_Tema(Long aId) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean Iniciar_Sesion(String aNombre, String aContrasenia) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

	public Seccion[] Cargar_Secciones_Administrador() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Seccion[] Cargar_Secciones_Registrado() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Seccion[] Cargar_Secciones_No_Registrado() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Tema[] Cargar_Temas_No_Registrado(String aSeccion) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Tema[] Cargar_Temas_Registrado(String aSeccion) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Tema[] Cargar_Temas_Administrador(String aNombreSeccion) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Tema[] Cargar_Temas_Moderador(String aSeccion) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Mensaje[] Cargar_Mensajes_NoRegistrado() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Mensaje[] Cargar_Mensajes_Registrado() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Mensaje[] Cargar_Mensajes_Moderador() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Mensaje[] Cargar_Mensajes_Administrador() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public void Eliminar_Mensaje(Long aId) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Desbanear(String aNombre) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List Buscar_Amigo_PorNombre(String aNombre) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public Usuario Cargar_Usuario_Administrador(String aNombre) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public void Eliminar_Amigo(String aNombre) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Insertar_Amigo(String aNombre) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Eliminar_Ticket(Long aId) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Ticket Notificar_Admin(String aNombreUsuario, String aMensaje) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}