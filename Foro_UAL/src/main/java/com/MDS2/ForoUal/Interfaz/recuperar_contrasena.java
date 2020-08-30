package com.MDS2.ForoUal.Interfaz;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.orm.PersistentException;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;
import com.MDS2.ForoUal.Interfaz.Opciones.Recuperar_Contrasena_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class recuperar_contrasena extends Recuperar_Contrasena_Ventana{
	private Label _contrasena;
	private Button _recuperar;
	public Correo_Electronico _correo_Electronico;
	public Opciones_Perfil_Usuario _opciones_Perfil_OtroUsuario;
	
	public recuperar_contrasena() {
		cancelar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				mandarCorreo(email.getValue());
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
			}
		});
		continuar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
			}
		});
	}

	public boolean mandarCorreo(String userName) {
		Usuario u;
		try {
			u = UsuarioDAO.loadUsuarioByQuery("NombreUsuario = \""+userName+"\"", null);
		} catch (PersistentException e1) {
			e1.printStackTrace();
			return false;

		}
		HtmlEmail email = new HtmlEmail();
		email.setHostName("localhost");
		email.setSmtpPort(9090);
		email.setAuthentication("sender@test.com", "password");
		email.setSubject("Contrasenia del foro ");
		try {
			email.setFrom(u.getEmail());
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			email.setHtmlMsg("Su contrasenia es: "+ u.getContrasenia());
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}