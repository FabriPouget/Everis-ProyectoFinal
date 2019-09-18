package ml.work.main.dtos;

import java.io.Serializable;

public class PlanetaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Long id;
	
	protected String nombre;
	
	protected int superficie;
	
	protected EstrellaDTO estrella;
	
	// Constructores
	
	public PlanetaDTO() {
		super();
	}

	public PlanetaDTO(Long id) {
		super();
		this.id = id;
	}

	public PlanetaDTO(String nombre, int superficie) {
		super();
		this.nombre = nombre;
		this.superficie = superficie;
	}
	
	public PlanetaDTO(Long id, String nombre, int superficie) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.superficie = superficie;
	}

	public PlanetaDTO(Long id, String nombre, int superficie, EstrellaDTO estrella) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.superficie = superficie;
		this.estrella = estrella;
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

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public EstrellaDTO getEstrella() {
		return estrella;
	}

	public void setEstrella(EstrellaDTO estrella) {
		this.estrella = estrella;
	}
	
	
}
