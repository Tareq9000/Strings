
import java.util.Scanner;

public class Caeser {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Caeser program = new Caeser();
		program.run();

	}

	public void run() {

		String s = "";

		int i = 0;

		char[] abc = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };

		System.out.println("CÄSER VERSCHLÜSSELUNG");
		System.out.println("---------------------");

		System.out.println("Geben Sie Ihr Wort ein > ");
		s = scan.nextLine();

		s = s.toLowerCase();

		for (; i < s.length(); i++) {

			if ((byte) s.charAt(i) <= 118) {
				System.out.print((char) (s.charAt(i) + 4));
			} else {
				System.out.print((char) (s.charAt(i) - 22));
			}

		}

	}

}
