package ml.work.main.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EstrellaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Long id;
	
	protected String nombre;
	
	protected Long densidad;
	
	protected List<PlanetaDTO> planetas = new ArrayList<>();
	
	// Constructores
		public EstrellaDTO() {
			super();
		}

		public EstrellaDTO(Long id) {
			super();
			this.id = id;
		}


		public EstrellaDTO(Long id, String nombre) {
			super();
			this.id = id;
			this.nombre = nombre;
		}

		public EstrellaDTO(Long id, String nombre, Long densidad) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.densidad = densidad;
		}


		
		public EstrellaDTO(Long id, String nombre, Long densidad, List<PlanetaDTO> planetas) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.densidad = densidad;
			this.planetas = planetas;
		}

		// Getters & Setters

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Long getDensidad() {
			return densidad;
		}

		public void setDensidad(Long densidad) {
			this.densidad = densidad;
		}


		public List<PlanetaDTO> getPlanetas() {
			return planetas;
		}


		public void setPlanetas(List<PlanetaDTO> planetas) {
			this.planetas = planetas;
		}

		
		
		
		
}
