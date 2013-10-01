package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra", 
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void quePiedraAplastaLagarto() {
	
		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);
	
		assertEquals("Piedra no aplasta lagarto",
				Resultado.PIERDE, jugadorDos.jugarCon(jugadorUno));
	}
	
	@Test
	public void queTijeraCortaPapel() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.TIJERA);
		
		assertEquals("Tijera empata Tijera", 
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	}	
	
	@Test
	public void queLagartoEnvenenaSpock() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Lagarto empata LAGARTO", 
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void quePapelCubrePiedra() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Papel cubre Piedra", 
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}

}