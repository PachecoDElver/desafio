package desafioproject.model.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import desafioproject.model.entity.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, UUID>{
	Usuario findByCorreo(String correo);
}
