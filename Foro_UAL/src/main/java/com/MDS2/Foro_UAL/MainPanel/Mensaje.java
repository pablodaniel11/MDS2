package com.MDS2.Foro_UAL.MainPanel;

import com.vaadin.server.ExternalResource;

public class Mensaje {



	public String mensaje;
	public String creador;
	public String fechaCreación;
	public String[] fotoStrings = new String[0];
	public String videoString = "";
	public int meGusta = 0;
	public Mensaje respuestaA;
	
	public Mensaje (String mensaje, String creador,String fecha, int meGusta, String[] Fotos, Mensaje respuestaA) {
		this.mensaje = mensaje;
		this.creador = creador;
		this.fechaCreación = fecha;
		this.meGusta = meGusta;
		
		this.fotoStrings = new String[Math.min(Fotos.length, 3)];
		for(int i = 0; i < Math.min(Fotos.length, 3); i++)
			this.fotoStrings[i] = Fotos[i];
		
		this.respuestaA = respuestaA;
		
	}
	public Mensaje (String mensaje, String creador,String fecha, int meGusta, String Video, Mensaje respuestaA) {
		this.mensaje = mensaje;
		this.creador = creador;
		this.fechaCreación = fecha;
		this.meGusta = meGusta;
		this.videoString = Video;
		
		this.respuestaA = respuestaA;
	}
	public Mensaje (String mensaje, String creador,String fecha, int meGusta, Mensaje respuestaA) {
		this.mensaje = mensaje;
		this.creador = creador;
		this.fechaCreación = fecha;
		this.meGusta = meGusta;
		
		this.respuestaA = respuestaA;
	}
	
	

	public Visualizar_Mensaje visualizate() {
		Visualizar_Mensaje v = new Visualizar_Mensaje();
		v.mensaje.setValue(mensaje);
		v.creadorYFecha.setValue(creador +" el "+ fechaCreación);
		v.numeroMeGusta.setValue(meGusta+"");
		
		v.video.setVisible(videoString != "");
		v.imagen1.setVisible(fotoStrings.length>0);
		v.imagen2.setVisible(fotoStrings.length>1);
		v.imagen3.setVisible(fotoStrings.length>2);
		v.respuestaA.setVisible(respuestaA!=null);
		
		if(respuestaA!=null)
		v.respuestaA.setCaption(respuestaA.mensaje);
		
		///
		//Falta implementar el cargar los recursos de las fotos y el video (Convertir String en Resource)
		if(fotoStrings.length>0)v.imagen1.setSource(new ExternalResource(fotoStrings[0]));
		if(fotoStrings.length>1)v.imagen2.setSource(new ExternalResource(fotoStrings[1]));
		if(fotoStrings.length>2)v.imagen3.setSource(new ExternalResource(fotoStrings[2]));
		
		return v;
	}
}
