package com.MDS2.ForoUal.Backend.Interfaces_BD;

import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;

public interface i_Administrador {

	public void Banear(String aNombre);

	public Mensaje[] Devolver_Ultimos_Mensajes(Long aIduser, int aNummensajes);

	public boolean Modificar_Rol(String aNombre);

	public void Cambiar_Estado(Long aId);

	public void Cerrar_Tema(Long aId);

	public Tema[] Cargar_Temas_Administrador(String aNombreSeccion);

	public Seccion Crear_Seccion(String aTitulo, String aSubtitulo);

	public Seccion[] Cargar_Secciones_Administrador();

	public void Eliminar_Mensaje(Long aId);

	public Mensaje[] Cargar_Mensajes_Administrador();

	public void Desbanear(String aNombre);

	public void Cargar_Usuario_Administrador(String aNombre);
}