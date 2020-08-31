package com.MDS2.ForoUal.Backend.Interfaces_BD;

import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

import antlr.collections.List;

public interface i_Usuario_No_Registrado {

	public boolean Iniciar_Sesion(String aNombre, String aContrasenia);

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aNombre_completo, String aFoto_perfil, String aDescripcion);

	public List Cargar_Usuario(String aNombre);

	public List Cargar_Usuarios_Busqueda();

	public Usuario[] Cargar_Amigos(String aNombre);

	public Mensaje[] Cargar_Ultimos_Mensajes(String aNombre);

	public Seccion[] Cargar_Secciones();

	public Tema[] Cargar_Temas_No_Registrado(String aSeccion);

	public Mensaje[] Cargar_Mensajes_NoRegistrado();

	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden);
}