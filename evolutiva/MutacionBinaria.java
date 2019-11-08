package evolutiva;

public class MutacionBinaria implements Mutacion<boolean[]>{
	@Override
	public boolean[] aplicar(boolean[] obj) {
		double p = 1.0/obj.length;
		boolean[] c = obj.clone();
		for( int i=0; i<obj.length; i++)
			if( Math.random() < p ) c[i] = !c[i];
		return c;
	}
}