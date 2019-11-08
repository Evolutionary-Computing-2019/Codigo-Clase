package evolutiva;

public class CruceBinario implements Cruce<boolean[]>{

	@Override
	public boolean[][] aplicar(boolean[] uno, boolean[] dos) {
		boolean[][] hijos = new boolean[2][];
		hijos[0] = uno.clone();
		hijos[1] = dos.clone();
		int pc = (int)((uno.length-1)*Math.random());
		for( int i=pc; i<uno.length; i++ ){
			
		}
		return null;
	}

}
