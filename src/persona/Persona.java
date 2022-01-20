package persona;   // Indica el paquete al cual pertenece la clase
import java.util.Scanner;

public class Persona {  // Declaración de la clase Persona
	
	
	
	// Método main
	public static void main(String [] args) {
		System.out.println("Hola mundo!");	
		// Invocación de un método cualquiera para ser ejecutado
		registro();
		System.out.println("----- PROCESANDO -----");
		imprimir();
	}
	
	// Método para invocar a DatosPersona
	public static void registro() {
		
		// datosPersona es un objeto de la clase DatosPersona
		DatosPersona datosPersona = new DatosPersona();
		// teclado: objeto de tipo Scanner para ingresar datos por teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("-------------------------------------------");
		System.out.println("Registro de nueva persona");
		System.out.println("-------------------------------------------");
		
		String nombre = "";
		System.out.println("Ingrese su nombre: ");
		nombre = teclado.nextLine();
		datosPersona.setNombre(nombre);
		
		String apellidos = "";
		System.out.println("Ingrese sus apellidos: ");
		apellidos = teclado.nextLine();
		datosPersona.setApellidos(apellidos);
		
	}
	
	public static void imprimir() {
		// datosPersona es un objeto de la clase DatosPersona
		DatosPersona datosPersona = new DatosPersona();
		
		System.out.println(datosPersona.getNombre() + " " + datosPersona.getApellidos());
	}
	
}
