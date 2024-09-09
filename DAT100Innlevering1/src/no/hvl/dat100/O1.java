package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
		
		int karakter = parseInt(showInputDialog("Skriv inn karakter: "));
				
		if (karakter <= 100 && karakter >= 90) {
			System.out.println("A");
		}
		
		else if (karakter <= 89 && karakter >= 70) {
			System.out.println("B");
			}
		
		else if (karakter <= 79 && karakter >= 60) {
			System.out.println("C");
			}
		
		else if (karakter <= 59 && karakter >= 50) {
			System.out.println("D");
			}
		
		else if (karakter <= 49 && karakter >= 40) {
			System.out.println("E");
			}
		
		else if (karakter <= 39 && karakter >= 0) {
			System.out.println("F");
			}
		
		else if (karakter > 100 || karakter < 0) {
			i--;
			
			} 
		}

	}
	
}
