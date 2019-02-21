
import java.util.Scanner;

public class Morsezeichen {
	Scanner scan = new Scanner(System.in);	
	public static void main(String[] args) {
		Morsezeichen program = new Morsezeichen();
        program.run();

	}

	public void run() {
		
		
		String s = "SOS";
		String[][] abc = {{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"},
						{".- ","-... ","-.-. ","-.. ",". ","..-. ","--. ",".... ",".. ",".--- ","-.- ",".-.. ","-- ","-. ","--- ",".--. ","--.- ",".-. ","... ","- ","..- ","...- ",".-- ","-..- ","-.-- ","--.. "}};           
	
		s = s.toLowerCase();
		
		for (int i = 0; i < 26; i++) {
		s = s.replace(abc[0][i], abc[1][i]);
		}
		
		System.out.println(s);	
		
	}
	
}