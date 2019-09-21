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

import ml.work.main.dtos.EstrellaDTO;
import ml.work.main.entities.Estrella;
import ml.work.main.services.EstrellaService;

@RestController
@CrossOrigin("*")
@RequestMapping(path="/api/v1/estrellas")
public class EstrellaController {

		@Autowired
		private EstrellaService estrellaService;

		@CrossOrigin("*")
		@GetMapping("/")
		@ResponseStatus(HttpStatus.OK)
		public List<Estrella> lista_personas(){
			return (List<Estrella>) estrellaService.listar();
		}
		
		@PostMapping("/")
		@ResponseStatus(HttpStatus.CREATED)
		public EstrellaDTO create(@RequestBody EstrellaDTO body) {
			return (EstrellaDTO) estrellaService.create(body);
		}
		
		@PutMapping("/{id}")
		@ResponseStatus(HttpStatus.CREATED)
		public EstrellaDTO update(@RequestBody EstrellaDTO body, @PathVariable int id) {
			return (EstrellaDTO) estrellaService.update(body, id);
		}
		
		@DeleteMapping("/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable int id) {
			estrellaService.delete(id);
		}
		
}
