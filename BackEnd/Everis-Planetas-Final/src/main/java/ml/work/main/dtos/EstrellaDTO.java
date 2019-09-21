package ml.work.main.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ml.work.main.entities.Planeta;

public class EstrellaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected int id;
	
	protected String nombre;
	
	protected Long densidad;
	
	protected List<Planeta> planetas;
	
	// Constructores
		public EstrellaDTO() {
			super();
		}

		public EstrellaDTO(int id) {
			super();
			this.id = id;
		}


		public EstrellaDTO(int id, String nombre) {
			super();
			this.id = id;
			this.nombre = nombre;
		}

		public EstrellaDTO(int id, String nombre, Long densidad) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.densidad = densidad;
		}


		
		public EstrellaDTO(int id, String nombre, Long densidad, List<Planeta> planetas) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.densidad = densidad;
			this.planetas = planetas;
		}

		// Getters & Setters

		public int getId() {
			return id;
		}

		public void setId(int id) {
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


		public List<Planeta> getPlanetas() {
			return planetas;
		}


		public void setPlanetas(List<Planeta> planetas) {
			this.planetas = planetas;
		}

		
		
		
		
}
