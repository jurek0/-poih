import  java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
 
public class Rechner {
		
 /*
 * 		Diese Methode Speichert das Eingegebene in einer Linked List, aus der
 * 		sie die Rechenmethode Calc verarbeiten kann. 
 */
	
//		Die Oberfläche Des Rechners 
// 		Oberflaeche rechnerOberflaeche = new Oberflaeche();
	
//		Die Eigentlichen Rechen-Operationen 
//		calc Calc = new calc ();

		
		LinkedList<String> Eingabe = new LinkedList<>(); 

		String Ergebnis = ""; //Das Entgültige Ergebnis 

		String [] abc;
		
		
		
		public void rechnen (String lösen){
			// Tauscht Eingaben. Vor und nach die Operatoren kommt ein Leerzeichen
			lösen = lösen.replace(",", " . ");
			lösen = lösen.replace ("\u221A"," wur ");
			lösen = lösen.replace("\u03c0", " pi ");
			lösen = lösen.replace("e", " e ");
			lösen = lösen.replace ("+"," + ");
			lösen = lösen.replace ("-"," - ");
			lösen = lösen.replace ("*"," * ");
			lösen = lösen.replace (":"," : ");
			lösen = lösen.replace ("sin("," sin( ");
			lösen = lösen.replace ("cos("," cos( ");
			lösen = lösen.replace ("tan("," tan( ");
			lösen = lösen.replace("%", " % ");
			lösen = lösen.replace("ln(", " ln( ");
			lösen = lösen.replace("log(", " log( ");
			lösen = lösen.replace("!", " fac ");
			lösen = lösen.replace("sin^-1(", " sin^-1( ");
			lösen = lösen.replace("cos^-1(", " cos^-1( ");
			lösen = lösen.replace("tan^-1(", " tan^-1( ");
			
			abc = lösen.split(" "); // Die Eingabe wird beim Leerzeichen gesplitten.
			
			//Eingegebene Elemente werden in den Array gepackt
			for (int i = 0; i < abc.length; i++) {
				Eingabe.add(abc[i]);
				
			
	     	Ergebnis = Eingabe.toString();
			Ergebnis = Ergebnis.substring(1, Ergebnis.length()-1);
			
		   Eingabe.clear();
	}
	 
			 
			 
		}
		public String getErgebnis(){
			return Ergebnis;
		}
//Main Methode:   
	    public static void main(String[] args) {
	       new Rechner ();
	       
	    }
}
