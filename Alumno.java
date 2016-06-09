package Programacion;

import java.util.HashMap;

public class Alumno extends Persona {

	HashMap<String, Integer> notas;
	
	public Alumno(String dni, String nombre, String direccion) {
		super(dni, nombre, direccion);
		// TODO Auto-generated constructor stub
		this.notas=new HashMap<String,Integer>();
	}
	
	public HashMap<String,Integer>getNotas(){
		return notas;
	}

	public void setNotas(HashMap<String, Integer> notas) {
		this.notas = notas;
	}	
	
	public Integer anadirAsignatura(String asignatura, Integer valorNotas){
		return notas.put(asignatura,  valorNotas);
	}
	
	public Integer eliminarAsignatura(String asignatura){
		return notas.remove(asignatura);
	}
	
	public boolean existeAsignatura(String asignatura){
		return notas.containsKey(asignatura);
	}
	
	public Integer getValorNotas(String asignatura){
		return notas.get(asignatura);
	}
	
	public int numeroNotas(){
		return notas.size(); 
	}
	
	public void borrarNotas(){
		notas.clear();
	}
	
	public String mostrarNotas(){
		return notas.toString();
	}
	
	public float notaMedia(){
		Integer sumanotas=0;
		for(String nota:notas.keySet())
			sumanotas+=notas.get(nota);
		return (float)sumanotas/notas.size();
		/**con iterator
		sumanotas=0;
		Iterator<String>it=notas.keySet().iterator();
		while(it.hashNext())
			sumanotas+=notas.get(it.next());
		return (float)sumanotas/notas.size();
		*/
	}

}
