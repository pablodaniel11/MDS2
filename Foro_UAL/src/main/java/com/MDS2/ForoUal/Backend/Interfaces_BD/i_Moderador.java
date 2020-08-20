package com.MDS2.ForoUal.Backend.Interfaces_BD;

import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.Ticket;

public interface i_Moderador {

	public void Ocultar_Mensaje(Long aId);

	public void Ocultar_Tema(Tema aTema);

	public Tema[] Cargar_Temas_Moderador(String aSeccion);

	public Mensaje[] Cargar_Mensajes_Moderador();

	public Ticket Notificar_Admin(String aNombreUsuario, String aMensaje);
}