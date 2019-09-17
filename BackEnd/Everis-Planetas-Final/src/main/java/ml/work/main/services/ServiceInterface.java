package ml.work.main.services;

import java.util.List;

public interface ServiceInterface <T>{
	
	//Leer (READ)
	
	public List<T> getAll();
	
	public T getOne(int id);
	
	//Crear (CREATE)
	public T create(T body);
	
	//Modificar (UPDATE)
	public T update(T body, int id);
	
	//Eliminar(DELETE)
	public void delete(int id);
	
}
