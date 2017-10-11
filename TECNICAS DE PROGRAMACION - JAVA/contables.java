public class contables {
	private int id_empleado;
	private String nombre;
	
	public contables(String nombre,int id_empleado) {
		this.nombre=nombre;
		this.id_empleado=id_empleado;
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
}
