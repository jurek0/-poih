import  java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
 
public class Rechner {
		
//		Die Oberfläche Des Rechners 
// Oberflaeche rechnerOberflaeche = new Oberflaeche();
	
//		Die Eigentlichen Rechen-Operationen 
//		calc Calc = new calc ();

//		Umgang Mit Klammern
//		Klammern rechnerKlammern = new Klammern();
		
		LinkedList<String> Eingabe = new LinkedList<>(); 
//		Das Entgültige Ergebnis 
		String Ergebnis = "";
//		Eingabe String 
		String [] abc;
		
		boolean isGRAD;
		
		public void rechnen (boolean isGRAD, String lösen){
			lösen = lösen.replace(",", " . ");
			lösen = lösen.replace ("\u221A"," wur ");
			lösen = lösen.replace("\u03c0", " pi ");
			lösen = lösen.replace ("+"," + ");
			lösen = lösen.replace ("-"," - ");
			lösen = lösen.replace ("*"," * ");
			lösen = lösen.replace (":"," : ");
			lösen = lösen.replace ("sin("," sin( ");
			lösen = lösen.replace ("cos("," cos( ");
			lösen = lösen.replace ("tan("," tan( ");
			lösen = lösen.replace("%", " % ");
			
			abc = lösen.split(" ");
			
			//Eingegebene Elemente werden in den Array gepackt
			for (int i = 0; i < abc.length; i++) {
				Eingabe.add(abc[i]);
				
			
	     	
			Ergebnis = Ergebnis.substring(1, Ergebnis.length()-1);
			Ergebnis = Eingabe.toString();
		   Eingabe.clear();
	}
	
			 
			 
		}
		public String getErgebnis(){
			return Ergebnis;
		}
		//Main Methode:   
//	    public static void main(String[] args) {
//	       new Rechner ();
	       
//	    }
}

