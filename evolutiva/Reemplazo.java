package evolutiva;

public interface Reemplazo<T> {
	Individuo<T> aplicar( Individuo<T> x, Individuo<T> y );
}
