package ml.work.main.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ml.work.main.entities.Estrella;

public class PlanetaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected int id;
	
	protected String nombre;
	
	protected int superficie;
	
	protected Estrella estrella; 
	
	// Constructores
	
	public PlanetaDTO() {
		super();
	}

	public PlanetaDTO(int id) {
		super();
		this.id = id;
	}

	public PlanetaDTO(String nombre, int superficie) {
		super();
		this.nombre = nombre;
		this.superficie = superficie;
	}
	
	public PlanetaDTO(int id, String nombre, int superficie) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.superficie = superficie;
	}

	public PlanetaDTO(int id, String nombre, int superficie, Estrella estrella) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.superficie = superficie;
		this.estrella = estrella;
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

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public Estrella getEstrella() {
		return estrella;
	}

	public void setEstrella(Estrella estrella) {
		this.estrella = estrella;
	}
	
	
}
