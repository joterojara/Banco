import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * 
 * @author Jesus Otero Jara
 *
 */
class CCuentaTest {

	@Test
	void test() {
		/**
		 * @params
		 * tarjetas es el numero de las tarjetas del cliente
		 * cuentatest, cuenta creada para un uso de ensayos de metodos y testeo
		 */
		int[] tarjetas = new int[5];
		CCuenta cuentatest = new CCuenta(1000,120,40,"5-5-5",tarjetas);
		//comprobamos como el cobro se produce ya que no supera el limite ni el saldo
		cuentatest.pagoEfectivo(100);
		assertEquals(cuentatest.getSaldo(),900);
		//supera el limite de pago, por lo tanto no lo permite
		cuentatest.pagoEfectivo(200);
		assertFalse(cuentatest.getSaldo()==700);
		//supera el limite de pago y de saldo, por lo tanto no le permite el cobro
		cuentatest.pagoEfectivo(1100);
		assertFalse(cuentatest.getSaldo()==-400);
		
		
		//comprobamos como el cobro se produce ya que no supera el limite ni el saldo
		cuentatest.pagoOnline(20);
		assertEquals(cuentatest.getSaldo(),880);
		//supera el limite de pago, por lo tanto no lo permite
		cuentatest.pagoOnline(41);
		assertFalse(cuentatest.getSaldo()==700);
		//supera el limite de pago y de saldo, por lo tanto no le permite el cobro
		cuentatest.pagoOnline(900);
		assertFalse(cuentatest.getSaldo()==-400);
	}

}
