package com.MDS2.ForoUal.Interfaz;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Opciones_Secciones extends Opciones_Secciones_Ventana {
	//public Visualizar_Secciones_Administrador _visualizar_Secciones_Administrador;
	Opciones_Secciones(){
		crearSeccion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				Window pv = new Window("", new Crear_Seccion());
				pv.center();
				UI.getCurrent().addWindow(pv);
				
			}
		});
	}
}