package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Interfaz.Opciones.Cambiar_Estado_Tema_Ventana;
import com.vaadin.event.MouseEvents;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Cambiar_Estado_Tema extends Cambiar_Estado_Tema_Ventana{
	private Button _cambiarEstado;
	private Button _selectTema;
	public Opciones_Temas_Administrador _opciones_Temas_Administrador;

	public Cambiar_Estado_Tema(Tema t) {
		cambiarEstado(t);
	}
	
	public void cambiarEstado(Tema t) {
		
		if(t.getTipoTema() == 0)
			publicoPanel.setPrimaryStyleName("well");
		else if(t.getTipoTema() == 1)
			privadoPanel.setPrimaryStyleName("well");
		else if(t.getTipoTema() == 2)
			ocultoPanel.setPrimaryStyleName("well");
		else if(t.getTipoTema() == 3)
			borradoPanel.setPrimaryStyleName("well");
		
		
		publico.addClickListener((event) -> {

				foroUI.db.Cambiar_Estado(t,(long)0);	
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				
					publicoPanel.setPrimaryStyleName("well");
					privadoPanel.setPrimaryStyleName("");
					ocultoPanel.setPrimaryStyleName("");
					borradoPanel.setPrimaryStyleName("");
				
				
		});
		privado.addClickListener((event) -> {

			foroUI.db.Cambiar_Estado(t,(long)1);	
			UI c = UI.getCurrent();
			Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
			c.removeWindow(w);
			
			publicoPanel.setPrimaryStyleName("");
			privadoPanel.setPrimaryStyleName("well");
			ocultoPanel.setPrimaryStyleName("");
			borradoPanel.setPrimaryStyleName("");
	});
		oculto.addClickListener((event) -> {

			foroUI.db.Cambiar_Estado(t,(long)2);	
			UI c = UI.getCurrent();
			Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
			c.removeWindow(w);
			
			publicoPanel.setPrimaryStyleName("");
			privadoPanel.setPrimaryStyleName("");
			ocultoPanel.setPrimaryStyleName("well");
			borradoPanel.setPrimaryStyleName("");
	});
		borrado.addClickListener((event) -> {

			foroUI.db.Cambiar_Estado(t,(long)3);	
			UI c = UI.getCurrent();
			Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
			c.removeWindow(w);
			
			publicoPanel.setPrimaryStyleName("");
			privadoPanel.setPrimaryStyleName("");
			ocultoPanel.setPrimaryStyleName("");
			borradoPanel.setPrimaryStyleName("well");
	});
	}
}