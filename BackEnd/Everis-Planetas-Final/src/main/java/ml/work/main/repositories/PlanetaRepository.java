package ml.work.main.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ml.work.main.entities.Planeta;

@Repository
public interface PlanetaRepository extends JpaRepository <Planeta, Integer> {

	Optional<Planeta> findByNombre(String pNombre);
	boolean existsByNombre(String pNombre); 
	
}
