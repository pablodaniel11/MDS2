package com.MDS2.Foro_UAL.MainPanel;

public class Tema {


	public String titulo;
	public String subtitulo;
	public String creador;
	public String fechaCreación;
	
	public Tema (String titulo,String subtitulo,String creador,String fecha) {
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.creador = creador;
		this.fechaCreación = fecha;		
	}
	//Falta por implementarse
	public int numeroMensajes() {
		return -1;
	}
	public int numeroMeGusta() {
		return -1;
	}
	public String UltimaEdicion() {
		return "Pepito el 3/12/2001";
	}
	public Visualizar_Tema visualizate() {
		Visualizar_Tema v = new Visualizar_Tema();
		v.nombreTema.setValue(titulo);
		v.descripcion.setValue(subtitulo);
		v.creadorYFecha.setValue(creador +" el "+ fechaCreación);
		v.ultimaEdicionYFecha.setValue(UltimaEdicion());
		v.numeroMensajes.setValue(numeroMensajes()+"");
		v.numeroMeGusta.setValue(numeroMeGusta()+"");
		
		return v;
	}
}
