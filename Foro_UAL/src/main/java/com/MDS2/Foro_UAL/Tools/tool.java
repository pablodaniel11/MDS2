package com.MDS2.Foro_UAL.Tools;


import com.vaadin.ui.Button;
import com.vaadin.ui.Composite;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.components.*;
import com.MDS2.Foro_UAL.UserInterface.index;
import com.vaadin.*;
import com.vaadin.shared.ui.colorpicker.Color;

@SuppressWarnings("serial")
public class tool extends Button {
	public ToolInterface type;
	public index.privileges privileges;
	
	public tool(String name, ToolInterface t, index.privileges privileges) {
		type = t;
		this.privileges = privileges;
		this.setCaption(name);
	}
}

