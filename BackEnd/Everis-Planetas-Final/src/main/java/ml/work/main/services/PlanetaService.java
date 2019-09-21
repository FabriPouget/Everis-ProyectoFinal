package ml.work.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import ml.work.main.dtos.PlanetaDTO;
import ml.work.main.entities.Planeta;
import ml.work.main.repositories.PlanetaRepository;

@Service
public class PlanetaService implements ServiceInterface<PlanetaDTO>{

	@Autowired
	private PlanetaRepository pRepo;
	
	@Transactional(readOnly = true)
	public List<Planeta> listar(){
		return (List<Planeta>) pRepo.findAll();
	}
	
	@Override
	public List<PlanetaDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanetaDTO getOne(int id) {
		Optional<Planeta> temp = pRepo.findById(id);
		PlanetaDTO result = new PlanetaDTO();
		
		try {
			Planeta resultBD = temp.get();
			
			result.setId(resultBD.getId());
			result.setNombre(resultBD.getNombre());
			result.setSuperficie(resultBD.getSuperficie());
			result.setEstrella(resultBD.getEstrella());
			
		}catch(Exception e){
			System.err.print(e.getMessage());
		}
		
		return result;
	}

	@Override
	public PlanetaDTO create(PlanetaDTO body) {	
		try {
			Planeta temp = new Planeta();
			
			temp.setNombre(body.getNombre());
			temp.setSuperficie(body.getSuperficie());
			temp.setEstrella(body.getEstrella());
			
			pRepo.save(temp);
			
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
		
		return body;
	}

	@Override
	public PlanetaDTO update(PlanetaDTO body, int id) {
		Optional<Planeta> temp = pRepo.findById(id);
		Planeta nuevo = new Planeta();
		
		try {
			nuevo = temp.get();
			nuevo.setNombre(body.getNombre());
			nuevo.setSuperficie(body.getSuperficie());
			nuevo.setEstrella(body.getEstrella());
			
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
