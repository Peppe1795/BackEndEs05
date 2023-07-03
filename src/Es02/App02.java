package Es02;

import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Inserisci km percorsi");
			double km = input.nextDouble();
			input.nextLine();
			System.out.println("Inserisci litri di carburante");
			double litri = input.nextDouble();
			input.nextLine();
			if (litri <= 0) {
				System.out.println("Attenzione inserisci numero maggiore di 0");
			} else {
				System.out.println("Risultato " + km / litri);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
	}

}
