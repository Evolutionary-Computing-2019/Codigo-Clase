package evolutiva;

public class Generacional<T> implements ReemplazoPoblacional<T> {

	@Override
	public Individuo<T>[] aplicar(Individuo<T>[] x, Individuo<T>[] y) {
		return y;
	}

}
