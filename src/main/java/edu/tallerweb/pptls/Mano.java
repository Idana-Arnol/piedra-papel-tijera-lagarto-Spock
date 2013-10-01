package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private Resultado[][] resultadoJuego = new Resultado[5][5];
	private Forma forma;
	
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma = forma;
		
		resultadoJuego[Forma.LAGARTO.getValor()][Forma.PAPEL.getValor()] = Resultado.GANA;
		resultadoJuego[Forma.LAGARTO.getValor()][Forma.SPOCK.getValor()] = Resultado.GANA;
		resultadoJuego[Forma.PAPEL.getValor()][Forma.PIEDRA.getValor()] = Resultado.GANA;
		resultadoJuego[Forma.PAPEL.getValor()][Forma.SPOCK.getValor()] = Resultado.GANA;
		resultadoJuego[Forma.PIEDRA.getValor()][Forma.TIJERA.getValor()] = Resultado.GANA;
		resultadoJuego[Forma.PIEDRA.getValor()][Forma.LAGARTO.getValor()] = Resultado.GANA;
		resultadoJuego[Forma.SPOCK.getValor()][Forma.PIEDRA.getValor()] = Resultado.GANA;
		resultadoJuego[Forma.SPOCK.getValor()][Forma.TIJERA.getValor()] = Resultado.GANA;
		resultadoJuego[Forma.TIJERA.getValor()][Forma.LAGARTO.getValor()] = Resultado.GANA;
		resultadoJuego[Forma.TIJERA.getValor()][Forma.SPOCK.getValor()] = Resultado.GANA;
		resultadoJuego[Forma.TIJERA.getValor()][Forma.PAPEL.getValor()] = Resultado.GANA;
		resultadoJuego[Forma.LAGARTO.getValor()][Forma.LAGARTO.getValor()] = Resultado.EMPATA;
		resultadoJuego[Forma.SPOCK.getValor()][Forma.SPOCK.getValor()] = Resultado.EMPATA;
		resultadoJuego[Forma.PIEDRA.getValor()][Forma.PIEDRA.getValor()] = Resultado.EMPATA;
		resultadoJuego[Forma.PAPEL.getValor()][Forma.PAPEL.getValor()] = Resultado.EMPATA;
		resultadoJuego[Forma.TIJERA.getValor()][Forma.TIJERA.getValor()] = Resultado.EMPATA;
		resultadoJuego[Forma.LAGARTO.getValor()][Forma.PIEDRA.getValor()] = Resultado.PIERDE;
		resultadoJuego[Forma.LAGARTO.getValor()][Forma.TIJERA.getValor()] = Resultado.PIERDE;
		resultadoJuego[Forma.PAPEL.getValor()][Forma.TIJERA.getValor()] = Resultado.PIERDE;
		resultadoJuego[Forma.PAPEL.getValor()][Forma.LAGARTO.getValor()] = Resultado.PIERDE;
		resultadoJuego[Forma.PIEDRA.getValor()][Forma.PAPEL.getValor()] = Resultado.PIERDE;
		resultadoJuego[Forma.PIEDRA.getValor()][Forma.SPOCK.getValor()] = Resultado.PIERDE;
		resultadoJuego[Forma.SPOCK.getValor()][Forma.LAGARTO.getValor()] = Resultado.PIERDE;
		resultadoJuego[Forma.SPOCK.getValor()][Forma.PAPEL.getValor()] = Resultado.PIERDE;
		resultadoJuego[Forma.TIJERA.getValor()][Forma.PIEDRA.getValor()] = Resultado.PIERDE;
		resultadoJuego[Forma.TIJERA.getValor()][Forma.SPOCK.getValor()] = Resultado.PIERDE;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		return resultadoJuego[this.forma.getValor()][otra.forma.getValor()];
	}

}
