package desafioproject.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafioproject.model.entity.Telefono;

public interface TelefonoRepo extends JpaRepository<Telefono, Long>{
	
}
