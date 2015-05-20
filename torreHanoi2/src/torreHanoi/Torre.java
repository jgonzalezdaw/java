package torreHanoi;

public class Torre {
	private Disco discos[];
	private int ocupacion = 0;
	
	/**
	 * @param nDiscos
	 */
	
	public Torre(int nDiscos) {
		discos = new Disco[nDiscos];
	}

	public void introducir(Disco d){
		discos[ocupacion]=d;
		ocupacion++;
	}
	
	public Disco sacar(){
		ocupacion--;
		Disco d =discos[ocupacion];
		return d;
	}
	
	public int getSizeUltimoDisco(){
		return (ocupacion==0)?-1:discos[ocupacion-1].getTamaño();
	}
	
	public void imprimir(){
		String torre ="(";
		for (int i = 0; i < ocupacion; i++) {
			torre+= discos[i].getTamaño();
		}
		torre+=")";
		System.out.println(torre);
	}
}
