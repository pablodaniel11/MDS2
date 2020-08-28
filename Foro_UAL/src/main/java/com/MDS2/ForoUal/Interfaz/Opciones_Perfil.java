package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamResource.StreamSource;

public class Opciones_Perfil extends Opciones_Perfil_Ventana{
	public Usuario_Logueado _usuario_Logueado;
	public Ver_Amigos _ver_Amigos;
	public visualizar_Mensaje _unnamed_visualizar_Mensaje_;
	public Opciones_Perfil_Usuario _opciones_Perfil_OtroUsuario;
	
	public Opciones_Perfil (Usuario u) {
		panelSuperior.setContent(new panel_Superior_Registrado(true));
		panelOpciones.setContent(new Opciones_Perfil_Usuario());
		panelAmigos.setContent(new Ver_Amigos());
		
		//Carga de Datos de Perfil
		userName.setValue(u.getNombreUsuario());
		realName.setValue(u.getDescripcion().split(" /// ")[0]);
		email.setValue(u.getEmail());
		descpription.setValue(u.getDescripcion().split(" /// ")[1]);
		fotoPerfil.setSource(new ExternalResource(foroUI.db.Cargar_Media(u.getFotoPerfil()).getUrl()));
		
	}
}