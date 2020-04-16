package com.MDS2.Foro_UAL.MainPanel;

import com.vaadin.server.ExternalResource;

public class DatosUsuario {

	public String nombreUsuario;
	public String nombreReal;
	public String email;
	public String foto;
	public String descripcion;
	
	public DatosUsuario (String nombreUsuario,String nombreReal,String email,String descripcion, String foto) {
		this.nombreReal = nombreReal;
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.foto = foto;
		this.descripcion = descripcion;
	}
	//Se conecta a la base de datos y devuelve los ultimso mensajes
	public Mensaje[] ultimosMensajes() {
		return new Mensaje[] {new Mensaje("Mensaje de pruebas 1", nombreUsuario, "1/2/2003", 0, null), new Mensaje("Mensaje de pruebas 2", nombreUsuario, "1/2/2003", 0, null),new Mensaje("Mensaje de pruebas 3", nombreUsuario, "1/2/2003", 0,new String[] {"https://static2.hoy.es/www/multimedia/201903/21/media/cortadas/dolmen-keeD-U70975108526RUH-624x385@Hoy.jpg"},null)};
	}

	public Visualizar_Perfil visualizateComplete() {
		Visualizar_Perfil v = new Visualizar_Perfil();
		v.nombreUsuario.setValue(nombreUsuario);
		v.nombreReal.setValue(nombreReal);
		v.email.setValue(email);
		v.descripcion.setValue(descripcion);
		v.fotoPerfil.setSource(new ExternalResource(foto));
		
		for (Mensaje s : ultimosMensajes()) {
			v.ultimosMensajes.addComponent(s.visualizate());
		}
		
		return v;
	}
	public Ver_Amigo visualizateReduce() {
		Ver_Amigo v = new Ver_Amigo();
		v.name.setValue(nombreUsuario);
		v.photo.setSource(new ExternalResource(foto));
		return v;
	}
}
