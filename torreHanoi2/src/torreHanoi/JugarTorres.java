package torreHanoi;

public class JugarTorres {

	public static void main(String[] args) {
		Tablero tablero=new Tablero(4);
		tablero.imprimir();
		tablero.moverDisco(0, 1);
		tablero.imprimir();
		tablero.moverDisco(0, 2);
		tablero.moverDisco(1, 2);
		tablero.moverDisco(0, 1);
		tablero.imprimir();

	}
}
