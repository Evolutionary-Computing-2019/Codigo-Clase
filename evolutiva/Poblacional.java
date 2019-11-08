package evolutiva;

public class Poblacional<T> {
	protected Funcion<T> f;
	protected Mutacion<T> m;
	protected Cruce<T> c;
	protected Espacio<T> e;
	protected ReemplazoPoblacional<T> r;
	protected Seleccion<T> s;
	
	public Poblacional(ReemplazoPoblacional<T> r, Espacio<T> e, Funcion<T> f, Seleccion<T> s, Cruce<T> c, Mutacion<T> m ){
		this.r = r;
		this.e = e;
		this.f = f;
		this.s = s;
		this.c = c;
		this.m = m;
	}
	
	public Individuo<T>[] iniciarPoblacion( int n ){
		@SuppressWarnings("unchecked")
		Individuo<T>[] p = new Individuo[n];
		for( int i=0; i<n; i++ ){
			T x = e.obtener();
			double vx = f.eval(x);
			p[i] = new Individuo<T>(x, vx);
		}
		return p;
	}
	
	protected Individuo<T> mejor( Individuo<T>[] p){
		Individuo<T>  mejor = p[0];
		for( int i=1; i<p.length; i++)
			if( mejor.f() > p[i].f() ) mejor = p[i];
		return mejor;
	}

	public void estadisticas( int k, Individuo<T> mejor){
		System.out.println(k+" "+mejor.x()+":"+mejor.f());
	}
	
	public T aplicar( int n, int ITERS ){
		n = (n>>1) << 1;
		Individuo<T>[] p = iniciarPoblacion(n);
		Individuo<T> mejor = mejor(p);
		estadisticas(0, mejor);
		for( int i=1; i<=ITERS; i++){

			Individuo<T>[] padres = s.obtener(p, n);
			@SuppressWarnings("unchecked")
			Individuo<T>[] hijos = new Individuo[n];
			
			for( int k=0; k<n; k+=2){
				T[] creados = c.aplicar(padres[k].x(), padres[k+1].x());
				creados[0] = m.aplicar(creados[0]);
				creados[1] = m.aplicar(creados[1]);
				hijos[k] = new Individuo<T>( creados[0], f.eval(creados[0]));
				hijos[k+1] = new Individuo<T>( creados[1], f.eval(creados[1]));
			}
			
			p = r.aplicar(p, hijos);
			
			mejor = mejor(p);
			estadisticas(i, mejor);
		}
		return mejor.x();
	}
}
