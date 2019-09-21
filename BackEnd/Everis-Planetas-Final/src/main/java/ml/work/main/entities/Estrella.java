package ml.work.main.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "api_Estrella")
public class Estrella {

	// Atributos - Campos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Estrella")
	protected int id;
	
	@Column(name = "nombre_Estrella")
	protected String nombre;
	
	@Column(name = "densidad_Estrella")
	protected Long densidad;
	
	@OneToMany(mappedBy = "estrella", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonBackReference
	protected List<Planeta> planetas;
	
	// Constructores
	
	public Estrella() {
		super();
	}
	
	

	public Estrella(int id) {
		super();
		this.id = id;
	}



	public Estrella(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}



	public Estrella(int id, String nombre, Long densidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.densidad = densidad;
	}
	
	

	public Estrella(int id, String nombre, Long densidad, List<Planeta> planetas) {
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
