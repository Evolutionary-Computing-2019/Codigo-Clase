package evolutiva;

public class Permutar {
	public static int[] aplicar( int n ){
		int[] a = new int[n];
		for( int i=0; i<n; i++ ) a[i] = i;
		for( int k=0; k<2*n; k++ ){
			int i = (int)(n*Math.random());
			int j = (int)(n*Math.random());
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		return a;
	}
}