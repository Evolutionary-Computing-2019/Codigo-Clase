package evolutiva;

public class AscensoColina<T> implements Reemplazo<T>{

	@Override
	public Individuo<T> aplicar(Individuo<T> x, Individuo<T> y) {
		if( y.f() <= x.f() ) return y; else return x;
	}
}