package ml.work.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ml.work.main.dtos.PlanetaDTO;
import ml.work.main.entities.Planeta;
import ml.work.main.services.PlanetaService;

@RestController
@CrossOrigin("*")
@RequestMapping(path="/api/v1/planetas")
public class PlanetaController {

	@Autowired
	private PlanetaService planetaService;
	
	@CrossOrigin("*")
	@GetMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public List<Planeta> lista_personas(){
		return (List<Planeta>) planetaService.listar();
	}
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public PlanetaDTO create(@RequestBody PlanetaDTO body) {
		return (PlanetaDTO) planetaService.create(body);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public PlanetaDTO update(@RequestBody PlanetaDTO body, @PathVariable int id) {
		return (PlanetaDTO) planetaService.update(body, id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		planetaService.delete(id);
	}
}
