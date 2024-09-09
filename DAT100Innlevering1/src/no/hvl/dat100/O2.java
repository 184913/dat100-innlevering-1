package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class O2 {

	
	public static void main(String[] args) {
		
		
		double trinnskatt = 0;
		
		int bruttoinntekt = parseInt(showInputDialog("Skriv inn bruttinntekt"));
		
		if (bruttoinntekt >= 0 && bruttoinntekt <= 208050) { 			//Trinn 0
			
			showMessageDialog(null, "Ingenting å betale av trinnskatt");
		}
		
		else if (bruttoinntekt >= 208051 && bruttoinntekt <= 292850 ) { //Trinn 1
			 trinnskatt = Math.round(bruttoinntekt*0.017);
			
			showMessageDialog(null, "Trinnskatt er: " + trinnskatt);
		}	
		
		
		else if (bruttoinntekt >= 292851 && bruttoinntekt <= 670000 ) { //Trinn 2
			trinnskatt = Math.round(bruttoinntekt*0.04);
			
			showMessageDialog(null, "Trinnskatt er: " + trinnskatt);
		}
		

		else if (bruttoinntekt >= 670001 && bruttoinntekt <= 937900 ) { //Trinn 3
			trinnskatt = Math.round(bruttoinntekt*0.136);
			
			showMessageDialog(null, "Trinnskatt er: " + trinnskatt);
		}
	
		else if (bruttoinntekt >= 937901 && bruttoinntekt <= 1350000 ) { //Trinn 4
			trinnskatt = Math.round(bruttoinntekt*0.166);
		
			showMessageDialog(null, "Trinnskatt er: " + trinnskatt);	
		}
		
	else if (bruttoinntekt >= 1350001) { 							     //Trinn 5
		trinnskatt = Math.round(bruttoinntekt*0.176);
		
		showMessageDialog(null, "Trinnskatt er: " + trinnskatt);	
		
		}
		
	}

}

