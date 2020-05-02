/**
 * 
 */
package com.MDS2.Foro_UAL.UserInterface;

import java.util.Iterator;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import com.MDS2.Foro_UAL.Tools.*;
import com.MDS2.Foro_UAL.MainPanel.*;
/**
 * @author Diego Cangas
 *
 */
@Theme("mytheme")
public class index extends UI{

	/**
	 * 
	 */
	public static Ventana view = Ventana.Seccion;
	public static nivelPrivilegios userPrivilegies = nivelPrivilegios.Usuario;
	
	private static final long serialVersionUID = -4901308892766115013L;

	@Override
    protected void init(VaadinRequest vaadinRequest) {
       /* final VerticalLayout herramientas = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
        	herramientas.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        herramientas.addComponents(name, button);
        
        setContent(herramientas);*/
		Render();
	}
	
	public void Test(index_ventana iv) {
		for (int i = 0; i < 5; i++)
			iv.barraHerramientasLayout.addComponent(new tool("Herramienta Usu. "+ (i+1), new DemoTool(),nivelPrivilegios.Usuario));
		for (int i = 0; i < 3; i++)
			iv.barraHerramientasLayout.addComponent(new tool("Herramienta Mod. "+ (i+1), new DemoTool(), nivelPrivilegios.Moderador));
		for (int i = 0; i < 2; i++)
			iv.barraHerramientasLayout.addComponent(new tool("Herramienta Adm. "+ (i+1), new DemoTool(), nivelPrivilegios.Administrador));
		
			
		if(view == Ventana.Raiz) {
			SetDireccion("Raiz",iv.direcciones);
			iv.localizacion_.setValue("Raiz del Foro");
			iv.panelCentralLayaut.addComponent(new Seccion("Subforo 1","este es el subforo 1", "Diego", "21/11/1998").visualizate());
			iv.panelCentralLayaut.addComponent(new Seccion("Subforo 2","este es el subforo 2", "Pablo", "21/10/1995").visualizate());
			iv.panelCentralLayaut.addComponent(new Seccion("Subforo 3","este es el subforo 3", "Profesor", "21/10/1995").visualizate());
		}
		else if(view == Ventana.Seccion) {
			SetDireccion("Raiz/Subforo1",iv.direcciones);
			iv.localizacion_.setValue("Sub Foro 1");
			iv.panelCentralLayaut.addComponent(new Tema("Tema 1","este es el tema 1", "Diego", "21/11/1998").visualizate());
			iv.panelCentralLayaut.addComponent(new Tema("Tema 2","este es el tema 2", "Pablo", "21/10/1995").visualizate());
			iv.panelCentralLayaut.addComponent(new Tema("Tema 3","este es el tema 3", "Profesor", "21/10/1995").visualizate());
		}
		else if(view == Ventana.Tema) {
			SetDireccion("Raiz/Subforo1/Tema1",iv.direcciones);
			iv.localizacion_.setValue("Tema 01");
			Mensaje m = new Mensaje("Este es un mensaje de pruebas sin recursos", "Diego", "21/11/1998",12,null);
			iv.panelCentralLayaut.addComponent(m.visualizate());
			iv.panelCentralLayaut.addComponent(new Mensaje("Este es un mensaje de pruebas sin con Respuesta", "Diego", "21/11/1998",12,m).visualizate());
			iv.panelCentralLayaut.addComponent(new Mensaje("Este es un mensaje de pruebas sin con Respuesta y Video", "Diego", "21/11/1998",12," ",m).visualizate());
			iv.panelCentralLayaut.addComponent(new Mensaje("Este es un mensaje de pruebas sin con Respuesta y 1 imagen", "Diego", "21/11/1998",12,new String[] {"https://ichef.bbci.co.uk/news/976/cpsprodpb/F403/production/_109476426_jheison3.png"},m).visualizate());
			iv.panelCentralLayaut.addComponent(new Mensaje("Este es un mensaje de pruebas sin Respuesta y 2 imagenes", "Diego", "21/11/1998",12,new String[] {"https://i.blogs.es/5efe2c/cap_001/450_1000.jpg","https://ichef.bbci.co.uk/news/976/cpsprodpb/F403/production/_109476426_jheison3.png"},null).visualizate());
			iv.panelCentralLayaut.addComponent(new Mensaje("Este es un mensaje de pruebas sin con Respuesta y 3 imagenes", "Diego", "21/11/1998",12,new String[] {"https://static2.hoy.es/www/multimedia/201903/21/media/cortadas/dolmen-keeD-U70975108526RUH-624x385@Hoy.jpg","https://ichef.bbci.co.uk/news/976/cpsprodpb/F403/production/_109476426_jheison3.png","https://i.blogs.es/5efe2c/cap_001/450_1000.jpg"},m).visualizate());
		}
		else if(view == Ventana.Perfil) {
			SetDireccion("Raiz/Perfil",iv.direcciones);
			
			iv.panelCentralLayaut.addComponent(new DatosUsuario("T3cn0 Hack3r", "Rodrigo Diaz de Vivar", "elcidcampeador@inlumine.ual.es", "Un gran guerrero y blogista apasionado al mismo tiempo","https://campoy5.files.wordpress.com/2010/04/elcid.jpg").visualizateComplete());
			
			iv.listaAmigosLayout.addComponent(new DatosUsuario("Amigo 1", "Rodrigo Diaz de Vivar", "elcidcampeador@inlumine.ual.es", "Un gran guerrero y blogista apasionado al mismo tiempo","https://campoy5.files.wordpress.com/2010/04/elcid.jpg").visualizateReduce());
			iv.listaAmigosLayout.addComponent(new DatosUsuario("Amigo 2", "Rodrigo Diaz de Vivar", "elcidcampeador@inlumine.ual.es", "Un gran guerrero y blogista apasionado al mismo tiempo","https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png").visualizateReduce());
			iv.listaAmigosLayout.addComponent(new DatosUsuario("Amigo 3", "Rodrigo Diaz de Vivar", "elcidcampeador@inlumine.ual.es", "Un gran guerrero y blogista apasionado al mismo tiempo","https://campoy5.files.wordpress.com/2010/04/elcid.jpg").visualizateReduce());
			iv.listaAmigosLayout.addComponent(new DatosUsuario("Amigo 4", "Rodrigo Diaz de Vivar", "elcidcampeador@inlumine.ual.es", "Un gran guerrero y blogista apasionado al mismo tiempo","https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png").visualizateReduce());
			iv.listaAmigosLayout.addComponent(new DatosUsuario("Amigo 5", "Rodrigo Diaz de Vivar", "elcidcampeador@inlumine.ual.es", "Un gran guerrero y blogista apasionado al mismo tiempo","https://campoy5.files.wordpress.com/2010/04/elcid.jpg").visualizateReduce());

		}

	}
	
	/**
	 * Metodo encargado de renderizar la pantalla
	 */
	public void Render() {
		final index_ventana iv = new index_ventana();
		
		//Ejecuta una interfaz de pruebas
		Test(iv);
		
		
		
		//FIja el tamaño del layaut central		
		//Desactiva la barra de amigos fuera del perfil
		if(view != Ventana.Perfil) {
			iv.barraAmigos.setVisible(false);
			//iv.panelCentralLayaut.setHeight(GetLayoutHeight(iv.panelCentralLayaut),Unit.PIXELS);
		}
		else {
			iv.localizacion_.setValue("Perfil");
		}
		
		 iv.mostrarHerramientas.addClickListener(e -> {
	        	iv.barraHerramientas.setVisible(!iv.barraHerramientas.isVisible());});
		
		//Muestra el contenido
		setContent(iv);
		
	}
	int GetLayoutHeight(Layout iv) {
		
		int height = 0;
		for(Component c : iv) {
			height+=c.getHeight()+15;
		}
		return height;
	}

	
    @WebServlet(urlPatterns = "/*", name = "indexServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = index.class, productionMode = false)
    public static class indexServlet extends VaadinServlet {

		/**
		 * 
		 */
		private static final long serialVersionUID = 6047306837192931563L;
    }
    public void SetDireccion(String dir, HorizontalLayout hl) {
    	String[] s = dir.split("/");
    	for(String s2 : s) {
    		Button b = new Button("--> "+s2.trim());
    		
    		b.addStyleName(ValoTheme.BUTTON_BORDERLESS);
    		hl.addComponent(b);
    	}
    	
    }
    public static enum Ventana {Raiz, Seccion, Tema, Perfil}
    public static enum nivelPrivilegios {UsuarioNoRegistrado, Usuario, Moderador, Administrador}
}
 