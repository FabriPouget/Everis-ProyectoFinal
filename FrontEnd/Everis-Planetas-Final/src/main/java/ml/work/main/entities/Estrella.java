package ml.work.main.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "api_Estrella")
public class Estrella {

	// Atributos - Campos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Estrella")
	protected Long id;
	
	@Column(name = "nombre_Estrella")
	protected String nombre;
	
	@Column(name = "densidad_Estrella")
	protected Long densidad;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_Planeta")
	protected Planeta planeta;
	
	// Constructores
	
	public Estrella() {
		super();
	}
	
	

	public Estrella(Long id) {
		super();
		this.id = id;
	}



	public Estrella(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}



	public Estrella(Long id, String nombre, Long densidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.densidad = densidad;
	}



	public Estrella(Long id, String nombre, Long densidad, Planeta planeta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.densidad = densidad;
		this.planeta = planeta;
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

	public Planeta getPlaneta() {
		return planeta;
	}

	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}
	
}
