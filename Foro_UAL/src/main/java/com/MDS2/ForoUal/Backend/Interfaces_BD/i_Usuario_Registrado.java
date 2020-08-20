package com.MDS2.ForoUal.Backend.Interfaces_BD;

import javax.print.attribute.standard.Media;

import com.MDS2.ForoUal.Backend.ORM.src.Imagen;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Reporte;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;

import antlr.collections.List;

public interface i_Usuario_Registrado {

	public List Cargar_Usuarios_Busqueda();

	public boolean Darse_Baja(String aContrasenia, String aNombre);

	public void Editar_Perfil(String aDescripcion, String aEmail, Imagen aImagen, String aNombre_completo);

	public void Insertar_Media(String aUrl);

	public Reporte Crear_Reporte(int aIdMensaje, String aMensaje);

	public Mensaje Crear_Mensaje(String aTexto, Media aMedia);

	public Tema Crear_Tema(String aTitulo, String aSubtitulo);

	public void Recuperar_Contrasenia_Perfil(String aNombre);

	public void Dar_Megusta_Tema(Long aId);

	public void Dar_Megusta_Mensaje(Long aId);

	public Seccion[] Cargar_Secciones_Registrado();

	public Tema[] Cargar_Temas_Registrado(String aSeccion);

	public Mensaje[] Cargar_Mensajes_Registrado();

	public List Buscar_Amigo_PorNombre(String aNombre);

	public void Eliminar_Amigo(String aNombre);

	public void Insertar_Amigo(String aNombre);
}