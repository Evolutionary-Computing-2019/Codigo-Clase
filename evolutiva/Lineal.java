package evolutiva;

public class Lineal implements Cruce<Double>{

	@Override
	public Double[] aplicar(Double uno, Double dos) {
		Double[] hijos = new Double[2];
		double alpha = Math.random();
		hijos[0] = alpha*uno + (1.0-alpha)*dos;
		hijos[1] = alpha*dos + (1.0-alpha)*uno;
		return hijos;
	}

}
