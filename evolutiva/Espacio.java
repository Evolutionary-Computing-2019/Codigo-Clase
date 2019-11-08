package evolutiva;

public interface Espacio<T> {
	T obtener();
	T reparar( T x );
}
