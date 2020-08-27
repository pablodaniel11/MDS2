package com.MDS2.ForoUal.Interfaz;

import org.orm.PersistentException;

import com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;
import com.MDS2.ForoUal.Interfaz.Opciones.Registrase_Ventana;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Registrarse extends Registrase_Ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2795991294979556391L;
	public Panel_Superior _panel_Superior;

	public String Validar_datos_Registras(String aUsuario, String aEmail, String aNombreCompleto, String aContrasena, String aDescripcion) {
		if(aUsuario == "" || aEmail == "" || aContrasena == "" || aDescripcion == "")
			return "Todos los datos son obligatorios";
		if(aUsuario.length() < 5 || aUsuario.length() > 15)
			return "El nombre ha de tener entre 5 y 15 caracteres";
		 for (Usuario u : UsuarioDAO.listUsuarioByCriteria(null)) {
			 if(u.getNombreUsuario() == aUsuario)
				 return "El nombre de usuario ya existe";
			 else if(u.getEmail() == aEmail)
				 return "El correo ya eiste";
		 }
			 
		
		//if(NombreUsuario no existe ya) return "El nombre de usuario ya existe";
		//if(email no existe ya) return "El correo ya eiste";
		
		return "";		
	}
	public Registrarse() {
		
		cancelar.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 2411752154015008999L;

			@Override
			public void buttonClick(ClickEvent event) {
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				
			}
		});
		continuar.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 4865963736755932057L;

			@Override
			public void buttonClick(ClickEvent event) {
				String s = Validar_datos_Registras(userName.getValue(),email.getValue(),nombreCompleto.getValue(),password.getValue(),description.getValue());
				if(s=="")
				{
					Usuario u = UsuarioDAO.createUsuario();
					u.setNombreUsuario(userName.getValue().trim());
					u.setEmail(email.getValue().trim());
					u.setDescripcion(nombreCompleto.getValue()+" </n> "+description.getValue().trim());
					u.setContrasenia(password.getValue());
					u.setIDusuario(1);
					u.setBaneado(false);
					u.setEmail(photo.getValue());
					u.setMarcado(false);
				/*	try {
						UsuarioDAO.save(u);
						UI c = UI.getCurrent();
						Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
						c.removeWindow(w);
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						error.setVisible(true);
						error.setValue("Error BD001: " + e.getMessage());
						
						
						
					}*/
				}
				else {
					error.setVisible(true);
					error.setValue(s);
				}
				
			}
		});
	}
}