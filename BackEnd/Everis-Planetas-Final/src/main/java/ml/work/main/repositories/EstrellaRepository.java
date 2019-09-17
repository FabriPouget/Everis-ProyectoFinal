package ml.work.main.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ml.work.main.entities.Estrella;

@Repository
public interface EstrellaRepository extends JpaRepository<Estrella, Integer> {

	Optional<Estrella> findByNombre(String eNombre);
	boolean existsByNombre(String eNombre); 
}
