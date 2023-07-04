package Es02;

import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Inserisci km percorsi");
			int km = input.nextInt();
			input.nextLine();
			System.out.println("Inserisci litri di carburante");
			int litri = input.nextInt();
			input.nextLine();
			System.out.println("Risultato " + km / litri);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
	}

}
