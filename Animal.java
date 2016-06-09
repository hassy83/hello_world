package Programacion;

public class Animal {

	private String nombre;
	private String tipo;

	public Animal(String nombre, String tipo){
		this.nombre=nombre;
		this.tipo=tipo;
	}
	
	  public void set_nombre(String nombre)
	   {
	       this.nombre=nombre;
	   }
	   public String get_nombre()
	   {
	       return nombre;
	   }

	   public void set_tipo(String tipo)
	   {
	       this.tipo=tipo;
	   }
	   public String get_tipo()
	   {
	       return tipo;
	   }
	   
	   public String toString()
	   {
	     return "Nombre: "+get_nombre()+" ,  Tipo: " +get_tipo(); 
	   }
	   
	  public int compareTo(Contacto c){
		  return this.nombre.compareTo(c.get_nombre());
	  }
	 
}
	  
