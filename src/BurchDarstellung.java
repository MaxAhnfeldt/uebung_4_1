
public class BurchDarstellung {

	public static void main(String[] args) {

		int zaehler1 = 1;
		int nenner1 = 1;
		double loesung1 = 1;
		while (loesung1 >= 0.01) {
			bruchDarstellen(zaehler1, nenner1);
			loesung1 = zaehler1 / nenner1;
			nenner1 = nenner1 + zaehler1;

		

		}
	}

	public static void bruchDarstellen(int a, int b) {
		double loesung;
		double c = a;
		double d = b;

		loesung = c / d;

		System.out.println(a);
		if (c <= 9 && d <= 9 && c >= 0 && d >= 0)
			System.out.println("- = " + loesung);
		else if (c <= 99 && d <= 99 && c >= -9 && d >= -9)
			System.out.println("-- = " + loesung);
		else
			System.out.println("--- = " + loesung);
		System.out.println(b);

	}

}