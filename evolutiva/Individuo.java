package evolutiva;

public class Individuo<T> {
	T x;
	double f;
	
	public Individuo( T x, double f ){
		this.x = x;
		this.f = f;
	}
	
	public T x(){ return x; }
	
	public double f(){ return f; }
}