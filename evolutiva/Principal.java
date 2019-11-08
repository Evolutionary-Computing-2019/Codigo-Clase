package evolutiva;

public class Principal {
	 public static void local(){
		 Funcion<Double> f = new Cuadratica();
		 //Mutacion<Double> m = new Uniforme();
		 Mutacion<Double> m = new Gaussian();
		 Espacio<Double> e = new Intervalo(-10,10);
		 Reemplazo<Double> r = new AscensoColina<Double>();
		 Local<Double> ac = new Local<Double>(r, e, f, m);
		 double x = ac.aplicar(1000);
		 System.out.println("El obtenido es:"+x+" "+f.eval(x));
	 }
	 
	 public static void poblacional(){
		 Funcion<Double> f = new Cuadratica();
		 //Mutacion<Double> m = new Uniforme();
		 Mutacion<Double> m = new Gaussian();
		 Cruce<Double> c = new Lineal();
		 Espacio<Double> e = new Intervalo(-10,10);
		 ReemplazoPoblacional<Double> r = new Generacional<Double>();
		 Seleccion<Double> s = new Torneo<Double>();
		 Poblacional<Double> ac = new Poblacional<Double>(r, e, f, s, c, m);
		 double x = ac.aplicar(100, 1000);
		 System.out.println("El obtenido es:"+x+" "+f.eval(x));
	 }
	 
	 public static void main( String[] args ){
		 // local();
		 poblacional();
	 }
}
