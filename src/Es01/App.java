package Es01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int arrayN[] = new int[5];
		Random casuale = new Random();

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < arrayN.length; i++) {
			arrayN[i] = casuale.nextInt(10) + 1;
		}

		int posizione;
		int valore;

		do {
			System.out.println(Arrays.toString(arrayN));
			System.out.println("Inserisci numero riferito alla posizione possibile da 1 a 5");
			posizione = input.nextInt() - 1;
			input.nextLine();
			if (posizione < 0 || posizione > 4) {
				System.out.println("posizione selezionata non valida");
				break;
			}
			System.out.println("inserisci il valore da sostituire se inserici 0 il programma di interrompe");
			valore = input.nextInt();
			if (valore < 1 || valore > 10) {
				System.out.println("Attenzione inserisci un numero da 1 a 10");
			} else {
				arrayN[posizione] = valore;
				input.nextLine();
				System.out.println(Arrays.toString(arrayN));
			}

		} while (valore != 0);
		System.out.println("Programma terminato");
		input.close();
	}

}
