package com.MDS2.Foro_UAL.Tools;


import com.vaadin.ui.Button;
import com.vaadin.ui.Composite;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.components.*;
import com.vaadin.ui.themes.ValoTheme;
import com.MDS2.Foro_UAL.UserInterface.index;
import com.vaadin.*;
import com.vaadin.annotations.Theme;
import com.vaadin.shared.ui.colorpicker.Color;

@SuppressWarnings("serial")
@Theme("mytheme")
public class tool extends Button {
	public ToolInterface type;
	public index.nivelPrivilegios privileges;
	public static tool toolWaiting; //Patron Singleton de una herramienta que está esperando un parametro de entrada para funcionar
	
	public tool(String name, ToolInterface t, index.nivelPrivilegios privileges) {
		if(!UserHasPrivilegies()) { this.setEnabled(false); return;}
		type = t;
		this.privileges = privileges;
		this.setCaption(name);
		if(privileges ==  index.nivelPrivilegios.Moderador) this.addStyleName("moderTool");
		
	}
	public Boolean UserHasPrivilegies() {
		if(index.userPrivilegies == index.nivelPrivilegios.Administrador) 
			return true;
		else if(index.userPrivilegies == index.nivelPrivilegios.Moderador && (privileges == index.nivelPrivilegios.Moderador || privileges == index.nivelPrivilegios.Usuario || privileges == index.nivelPrivilegios.UsuarioNoRegistrado))
			return true;
		else if (index.userPrivilegies == index.nivelPrivilegios.Usuario && (privileges == index.nivelPrivilegios.Usuario || privileges == index.nivelPrivilegios.UsuarioNoRegistrado))
			return true;
		
		
		return false;
	}
}

