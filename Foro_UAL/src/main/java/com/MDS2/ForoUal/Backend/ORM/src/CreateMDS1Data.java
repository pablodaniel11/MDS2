package com.MDS2.ForoUal.Backend.ORM.src;

/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
import org.orm.*;
public class CreateMDS1Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		try {

			Usuario usuario = UsuarioDAO.createUsuario();
			usuario.setNombreUsuario("Administrador");
			usuario.setEmail("Administrador");
			usuario.setContrasenia("K/9U+4TkxY8XxvNOV2Jb6jIE82JO22dNX4eGcXr4arY=");
			usuario.setDescripcion("Administrador /// Administrador del sistema");
			usuario.setFotoPerfil(1);
			UsuarioDAO.save(usuario);
			Media_ media_ = Media_DAO.createMedia_();
			media_.setUrl("https://ih1.redbubble.net/image.508671606.9093/st,small,507x507-pad,600x600,f8f8f8.jpg");
			// Initialize the properties of the persistent object here
			Media_DAO.save(media_);
			Administradores administradores = AdministradoresDAO.createAdministradores();
			administradores.setIDusuario(0);
			AdministradoresDAO.save(administradores);
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
