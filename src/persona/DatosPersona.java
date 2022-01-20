package persona;

public class DatosPersona {
	
	// Atributos de la clase
	String nombre, apellidos;
	
	// M�todo constructor vac�o
	public DatosPersona() {}

	// M�todo constructor parametrizado
	public DatosPersona(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	// M�todos getter: Sirven para obtener informaci�n del objeto
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	// M�todos setter: Sirven para ingresar informaci�n al objeto
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	
	// M�todo toString: Muestra los datos indicados en una cadena (String)
	@Override
	public String toString() {
		return "DatosPersona [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	
}
