package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Reporte;
import com.MDS2.ForoUal.Backend.ORM.src.ReporteDAO;

public class BD_Reportes {
	public BD_Principal _bd_main_reportes;
	public Vector<Reporte> _unnamed_Reporte_ = new Vector<Reporte>();

	public Reporte Crear_Reporte(Long aIdMensaje, String aMensaje) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Mensaje mensaje = null;
		Reporte reporte = null;
		try {
			
			mensaje = MensajeDAO.getMensajeByORMID(aIdMensaje);
			reporte = new Reporte();
			reporte.setMotivo(aMensaje);
			reporte.setEs_reportado(mensaje);
			reporte.setUsuario(mensaje.getEnvia());
			ReporteDAO.save(reporte);
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}
		return null;		
	}

	public void Eliminar_Reporte(int aIdReporte) throws PersistentException {
		
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		Reporte reporte = null;

		try {
			reporte = ReporteDAO.getReporteByORMID(aIdReporte);
			ReporteDAO.delete(reporte);
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}
	}
}