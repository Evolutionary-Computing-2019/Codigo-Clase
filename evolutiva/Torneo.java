package evolutiva;

public class Torneo<T> implements Seleccion<T> {
	protected Individuo<T> uno(Individuo<T>[] x){
		Individuo<T> y = x[(int)(x.length*Math.random())];
		for( int i=1; i<=3; i++ ){
			Individuo<T> z = x[(int)(x.length*Math.random())];
			if( z.f() < y.f() ) y = z;
		}
		return y;
	}
	@Override
	public Individuo<T>[] obtener(Individuo<T>[] x, int n) {
		@SuppressWarnings("unchecked")
		Individuo<T>[] s = new Individuo[n];
		for( int i=0; i<n; i++ ) s[i] = uno(x);
		return s;
	}
}
