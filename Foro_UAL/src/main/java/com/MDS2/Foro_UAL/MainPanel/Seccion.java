package com.MDS2.Foro_UAL.MainPanel;

/**
 * 
 * @author Diego Cangas
 * Estructura de datos que almacena los datos que se van a mostrar de lso mensajes
 */
public class Seccion {

	public String titulo;
	public String subtitulo;
	public String creador;
	public String fechaCreación;
	
	public Seccion (String titulo,String subtitulo,String creador,String fecha) {
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.creador = creador;
		this.fechaCreación = fecha;		
	}
	//Falta por implementarse
	public int numeroMensajes() {
		return -1;
	}
	public Visualizar_Sección visualizate() {
		Visualizar_Sección v = new Visualizar_Sección();
		v.nombreSuboforo.setValue(titulo);
		v.descripcion.setValue(subtitulo);
		v.creadorYFecha.setValue(creador +" el "+ fechaCreación);
		v.numeroMensajes.setValue(numeroMensajes()+"");
		return v;
	}
}


