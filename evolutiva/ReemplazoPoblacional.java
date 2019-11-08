package evolutiva;

public interface ReemplazoPoblacional<T> {
	Individuo<T>[] aplicar( Individuo<T>[] x, Individuo<T>[] y );
}