package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Skriv inn et heltall"));	//Tar inn n
		int i = 1;
		
		while (n > 0) {		//Beregner n!
			i = i*n;
			n--;
		}

		showMessageDialog(null, "n! = " + i );
	}

}
