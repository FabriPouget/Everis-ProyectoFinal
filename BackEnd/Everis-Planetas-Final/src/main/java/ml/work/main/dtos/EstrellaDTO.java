package ml.work.main.dtos;

import java.io.Serializable;

public class EstrellaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Long id;
	
	protected String nombre;
	
	protected Long densidad;
	
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
		
}