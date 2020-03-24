/**
 * 
 */
package com.MDS2.Foro_UAL.UserInterface;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.MDS2.Foro_UAL.Tools.*;
/**
 * @author Diego Cangas
 *
 */
@Theme("mytheme")
public class index extends UI{

	/**
	 * 
	 */
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
		final index_ventana iv = new index_ventana();
		for (int i = 0; i < 10; i++)
		iv.barraHerramientasLayout.addComponent(new tool("Herramienta "+ i, new DemoTool(), privileges.Administrador));
		setContent(iv);
    }

    @WebServlet(urlPatterns = "/*", name = "indexServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = index.class, productionMode = false)
    public static class indexServlet extends VaadinServlet {

		/**
		 * 
		 */
		private static final long serialVersionUID = 6047306837192931563L;
    }
    public static enum view {Raiz, Seccion, Tema, Perfil}
    public static enum privileges {UsuarioNoRegistrado, Usuario, Moderador, Administrador}
}
