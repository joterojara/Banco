
/**
 * 
 * @author JesusOteroJara
 *
 */

public class CCliente extends CCuenta{
	/**
	 * @params
	 * nombre es el nombre del cliente
	 * apellidos son los apellidos del cliente
	 * direccion es la direccion del cliente
	 * nif es el documento nacional de identidad del cliente
	 * telefono es el numero de telefono del cliente
	 * edad es la edad del cliente
	 * cuentas es el numero de cuentas del cliente y el numero de cada una de ellas
	 */
	private String nombre;
	private String apellidos;
	private String direccion;
	private String nif;
	private int telefono;
	private int edad;
	private CCuenta[] cuentas = new CCuenta[10];
	
	
	//Constructor
	public CCliente(int saldo, int limiteCajero, int limiteOnline, String fechaApertura, int[] tarjetas, String nombre,
			String apellidos, String direccion, String nif, int telefono, int edad, CCuenta[] cuentas) {
		super(saldo, limiteCajero, limiteOnline, fechaApertura, tarjetas);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.nif = nif;
		this.telefono = telefono;
		this.edad = edad;
		this.cuentas = cuentas;
	}

	//setters y getters de los parametros
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public CCuenta[] getCuentas() {
		return cuentas;
	}
	public void setCuentas(CCuenta[] cuentas) {
		this.cuentas = cuentas;
	}
}
