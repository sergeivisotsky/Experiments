package ProgrammingStudy;

public class App {

	public static void main(String[] args) {
		double S, i;
		
		/*while(i <= 100) {
			S = S + (i-1)/i;
			i = i + 2;
		}*/
		
		for(S=0, i=2; i<=100; i = i+2) {
			S = S + (i-1)/i;
		}
		System.out.print("S=" + S);
	}
}