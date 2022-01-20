package persona;

public class DatosPersona {
	
	// Atributos de la clase
	String nombre, apellidos;
	
	// Método constructor vacío
	public DatosPersona() {}

	// Método constructor parametrizado
	public DatosPersona(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	// Métodos getter: Sirven para obtener información del objeto
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	// Métodos setter: Sirven para ingresar información al objeto
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	
	// Método toString: Muestra los datos indicados en una cadena (String)
	@Override
	public String toString() {
		return "DatosPersona [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	
}
