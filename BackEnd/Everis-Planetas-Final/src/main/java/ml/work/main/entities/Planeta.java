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

@Entity(name = "api_Planeta")
public class Planeta {
	
	//Atributos - Campos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Planeta")
	protected Long id;
	
	@Column(name = "nombre_Planeta")
	protected String nombre;
	
	@Column(name = "superficie_Planeta")
	protected int superficie;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_estrella")
	protected Estrella estrella;
	
	// Constructores
	
	public Planeta() {
		super();
	}

	public Planeta(Long id) {
		super();
		this.id = id;
	}

	public Planeta(String nombre, int superficie) {
		super();
		this.nombre = nombre;
		this.superficie = superficie;
	}
	
	public Planeta(Long id, String nombre, int superficie) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.superficie = superficie;
	}
	


	public Planeta(Long id, String nombre, int superficie, Estrella estrella) {
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

	public Estrella getEstrella() {
		return estrella;
	}

	public void setEstrella(Estrella estrella) {
		this.estrella = estrella;
	}

	


	
}
