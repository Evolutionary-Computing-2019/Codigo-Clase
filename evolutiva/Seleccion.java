package evolutiva;

public interface Seleccion<T> {
	Individuo<T>[] obtener( Individuo<T>[] x, int n );
}
