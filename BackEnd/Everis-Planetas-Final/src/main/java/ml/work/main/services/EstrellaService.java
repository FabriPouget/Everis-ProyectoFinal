package ml.work.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ml.work.main.dtos.EstrellaDTO;
import ml.work.main.entities.Estrella;
import ml.work.main.repositories.EstrellaRepository;

public class EstrellaService implements ServiceInterface<EstrellaDTO> {

	@Autowired
	private EstrellaRepository pRepo;
	
	@Transactional(readOnly = true)
	public List<Estrella> listar(){
		return (List<Estrella>) pRepo.findAll();
	}
	
	@Override
	public List<EstrellaDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstrellaDTO getOne(int id) {
		Optional<Estrella> temp = pRepo.findById(id);
		EstrellaDTO result = new EstrellaDTO();
		
		try {
			Estrella resultBD = temp.get();
			
			result.setId(resultBD.getId());
			result.setNombre(resultBD.getNombre());
			result.setDensidad(resultBD.getDensidad());
			
		}catch(Exception e){
			System.err.print(e.getMessage());
		}
		
		return result;
	}

	@Override
	public EstrellaDTO create(EstrellaDTO body) {
		Estrella temp = new Estrella();
		
		try {
			
			temp.setNombre(body.getNombre());
			temp.setDensidad(body.getDensidad());
			
			pRepo.save(temp);
			
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
		
		return body;
	}

	@Override
	public EstrellaDTO update(EstrellaDTO body, int id) {
		Optional<Estrella> temp = pRepo.findById(id);
		Estrella nuevo = new Estrella();
		
		try {
			nuevo = temp.get();
			nuevo.setNombre(body.getNombre());
			nuevo.setDensidad(body.getDensidad());
			
			pRepo.save(nuevo);
			
		}catch(Exception e){
			System.err.print(e.getMessage());
		}
		
		return body;
	}

	@Override
	public void delete(int id) {
		pRepo.deleteById(id);
	}

}
