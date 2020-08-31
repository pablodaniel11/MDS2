package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Label;


public class Ver_OtroPerfil extends Ver_OtroPerfil_Ventana{
	private Label _imagenUsuario;
	private Label _correo;
	private Label _nombre;
	private Label _nombreCompleto;
	private Label _descripcion;
	public Usuario_no_Logueado _unnamed_Usuario_no_Logueado_;
	public Usuario_Logueado _unnamed_Usuario_Logueado_;
	public Ver_Amigos _unnamed_Ver_Amigos_;
	public Ultimos_Mensajes _unnamed_Ultimos_Mensajes_;
	
	public static int messageLimit = 7;

	public Ver_OtroPerfil (Usuario u) {
		panelSuperior.setContent(new panel_Superior_Registrado(true));
		panelOpciones.setVisible(false);	
		cargarPerfil(u);
	}
	public void cargarPerfil(Usuario u) {
		userName.setValue(u.getNombreUsuario());
		realName.setValue(u.getNombreReal());
		email.setValue(u.getEmail());
		descpription.setValue(u.getDescripcion());
		Media_ m = foroUI.db.Cargar_Media(u.getFotoPerfil());
		if(m != null)
			fotoPerfil.setSource(new ExternalResource(m.getUrl()));
		
		ultimosMensajes.setContent(new Visualizar_Mensajes(u));
		
	}
}