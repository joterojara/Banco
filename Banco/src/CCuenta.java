
/**

 * 
 * @author Jesus Otero Jara
 *
 */

public class CCuenta {
	/**
	 * @params
	 * saldo es el saldo de la cuenta
	 * limiteCajero es el limite de cobro o retiro de dinero en formato fisico
	 * limiteOnline es el limite de cobro o traspaso de dinero en formato online
	 * fechaApertura es el dia mes y año en el que se inicio esta cuenta
	 * tarjetas es el numero de cada una de las tarjetas del cliente, si es un 0 es que no existe esa tarjeta
	 * 
	 */
	private int saldo;
	private int limiteCajero;
	private int limiteOnline;
	private String fechaApertura;
	private int[] tarjetas = new int [5];
	
	
	
	
	//constructor
	public CCuenta(int saldo, int limiteCajero, int limiteOnline, String fechaApertura, int[] tarjetas) {
		super();
		this.saldo = saldo;
		this.limiteCajero = limiteCajero;
		this.limiteOnline = limiteOnline;
		this.fechaApertura = fechaApertura;
		this.tarjetas = tarjetas;
	}
	
	//getters y setters
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getLimiteCajero() {
		return limiteCajero;
	}
	public void setLimiteCajero(int limiteCajero) {
		this.limiteCajero = limiteCajero;
	}
	public int getLimiteOnline() {
		return limiteOnline;
	}
	public void setLimiteOnline(int limiteOnline) {
		this.limiteOnline = limiteOnline;
	}
	public String getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public int[] getTarjetas() {
		return tarjetas;
	}
	public void setTarjetas(int[] tarjetas) {
		this.tarjetas = tarjetas;
	}
	

	
	/**
	 * 
	 * @param cobro es el dinero a retirar
	 * el metodo es un control de limites para que el cliente no los sobrepase
	 * al hacer un movimiento de su dinero
	 * si no hay problema alguno, el dinero se le restará de se saldo actual
	 */
	public void pagoOnline(int cobro) {
		
		if(getLimiteOnline() < cobro) {
			System.out.println("no se permite superar el limite ");
		}else if (cobro > getSaldo()) {
			System.out.println("excediendo saldo actual, no se realizará la compra o retirar dinero");
		}else {
			setSaldo(getSaldo()-cobro);
		}
		
	}
	/**
	 * 
	 * @param cobro es el dinero a retirar
	 * el metodo es un control de limites para que el cliente no los sobrepase
	 * al hacer un movimiento de su dinero
	 * si no hay problema alguno, el dinero se le restará de se saldo actual
	 */
public void pagoEfectivo(int cobro) {
		
		if(getLimiteCajero() < cobro) {
			System.out.println("no se permite superar el limite ");
		}else if (cobro > getSaldo()) {
			System.out.println("excediendo saldo actual, no se realizará la compra o retirar el dinero");
		}else {
			setSaldo(getSaldo()-cobro);
		}
		
	}
	
	
}
	
	