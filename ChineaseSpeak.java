import java.util.Scanner;

public class ChineaseSpeak {
	Scanner scan = new Scanner(System.in);	
	public static void main(String[] args) {
		ChineaseSpeak program = new ChineaseSpeak();
        program.run();

	}

	public void run() {
		String s = "rolf rollt";
		 
		System.out.println(s.replace('r','l'));	
		
	}
	
}