package com.MDS2.ForoUal;

import com.MDS2.ForoUal.Backend.BDs.BD_Principal;
import com.MDS2.ForoUal.Interfaz.*;
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

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("foroTheme")
public class foroUI extends UI {
	static public BD_Principal db = new BD_Principal();

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	Visualizar_Raiz__No_Reg_ ad = new Visualizar_Raiz__No_Reg_();
    	setContent(ad);
    	/*
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        layout.addComponents(name, button);
        
        setContent(layout);*/
    }

    @WebServlet(urlPatterns = "/*", name = "foroUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = foroUI.class, productionMode = false)
    public static class foroUIServlet extends VaadinServlet {
    }
}
