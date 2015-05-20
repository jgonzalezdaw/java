package torreHanoi;

public class Tablero {
	private Torre torres[] = new Torre[3];
	private int movimientos = 0;
	private int numDiscos;
	
	/**
	 * @param numDiscos
	 */
	public Tablero(int numDiscos) {
		this.numDiscos = numDiscos;
		//creamos las torres
		for (int i=0;i<3;i++){
			torres[i] = new Torre (numDiscos);
		}
		//creamos los discos en la torre 0
		for (int i=4;i>0;i--){
			Disco d = new Disco(i);
			torres[0].introducir(d);
		}
	}
	
	public int getMovimientos(){
		return movimientos;
	}

	public boolean moverDisco(int o, int d){
		if (torres[o].getSizeUltimoDisco() < torres[d].getSizeUltimoDisco() | torres[d].getSizeUltimoDisco()==-1){
			torres[d].introducir(torres[o].sacar());
			movimientos++;
			return true;
		}
		return false;
	}
	
	public boolean comprobarFin(){
		return torres[2].getSizeUltimoDisco()==numDiscos;
	}
	
	public void imprimir(){
		for (int i=0;i<3;i++){
			torres[i].imprimir();
		}
		System.out.println("movimientos="+movimientos);
	}
}
