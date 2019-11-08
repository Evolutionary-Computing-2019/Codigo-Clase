package evolutiva;

public class Cuadratica implements Funcion<Double>{
	@Override
	public double eval(Double x) {
		return x*x+x;
	}
}