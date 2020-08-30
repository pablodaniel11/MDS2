package com.MDS2.ForoUal.Backend.ORM.src;
import java.sql.Date;

/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
import org.orm.*;
import com.MDS2.ForoUal.Backend.BDs.PasswordUtils;

public class CreateMDS1Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		try {
			
			Usuario usuario = UsuarioDAO.createUsuario();
			/*usuario.setFotoPerfil(1);
			usuario.setNombreUsuario("Administrador");
			usuario.setEmail("Administrador");
			usuario.setContrasenia(PasswordUtils.generateSecurePassword("Administrador", "EqdmPh53c9x33EygXpTpcoJvc4VXLK"));
			usuario.setNombreReal("Administrador");
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_creado, usuarios, pertenece, amigo_de, reportes, baneado, marcado
			UsuarioDAO.save(usuario);*/
			Media_ media_ = Media_DAO.createMedia_();
			media_.setUrl("https://thumbs.dreamstime.com/b/inicio-de-sesi%C3%B3n-administrador-en-el-icono-del-port%C3%A1til-vector-stock-166205404.jpg");
			// Initialize the properties of the persistent object here
			Media_DAO.save(media_);
			
			Administrador administradores = AdministradorDAO.createAdministrador();
			administradores.setFotoPerfil(3);
			administradores.setNombreUsuario("Administrador");
			administradores.setEmail("Administrador");
			administradores.setContrasenia(PasswordUtils.generateSecurePassword("Administrador", "EqdmPh53c9x33EygXpTpcoJvc4VXLK"));
			administradores.setNombreReal("Administrador");
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_creada, son_recibidos
			AdministradorDAO.save(administradores);
			
			Seccion s = SeccionDAO.createSeccion();
			s.setCrea(administradores);
			s.setFechaCreacion(new Date(20200202));
			s.setTitulo("Prueba");
			s.setSubtitulo("Prueba2");
			s.setIDseccion(1);
			SeccionDAO.save(s);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS1Data createMDS1Data = new CreateMDS1Data();
			try {
				createMDS1Data.createTestData();
			}
			finally {
				MDS1PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
