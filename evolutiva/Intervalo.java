package evolutiva;

public class Intervalo implements Espacio<Double>{
	protected Uniforme g;

	protected double min=0.0;
	protected double max=1.0;

	public Intervalo(){ g = new Uniforme(); }
	
	public Intervalo( double min, double max ){
		this.min = min;
		this.max = max;
		this.g = new Uniforme(min, max);
	}
	
	@Override
	public Double obtener() {
		return g.aplicar(0.0);
	}

	@Override
	public Double reparar(Double x) {
		if( x < min ) return min;
		if( x > max ) return max;
		return x;
	}
}
