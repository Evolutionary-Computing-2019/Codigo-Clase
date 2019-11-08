package evolutiva;

public class Local<T> {
	protected Funcion<T> f;
	protected Mutacion<T> m;
	protected Espacio<T> e;
	protected Reemplazo<T> r;
	
	public Local(Reemplazo<T> r, Espacio<T> e, Funcion<T> f, Mutacion<T> m ){
		this.r = r;
		this.e = e;
		this.f = f;
		this.m = m;
	}
	
	public T aplicar( int ITERS ){
		T x = e.obtener();
		double vx = f.eval(x);
		Individuo<T> ind = new Individuo<T>(x, vx);
		System.out.println("0 "+x+":"+vx);
		for( int i=1; i<=ITERS; i++){
			T y = e.reparar(m.aplicar(x));
			double vy = f.eval(y);
			Individuo<T> ind2 = new Individuo<T>(y, vy);
			ind  = r.aplicar(ind, ind2);
			System.out.println(i+" "+ind.x()+":"+ind.f());
		}
		return x;
	}
}
