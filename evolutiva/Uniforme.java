package evolutiva;

public class Uniforme implements Mutacion<Double>{
	protected double min=0.0;
	protected double length=1.0;

	public Uniforme(){}
	
	public Uniforme( double min, double max ){
		this.min = min;
		this.length = max-min;
	}
	
	@Override
	public Double aplicar(Double obj) {
		return min+length*Math.random();
	}
}
