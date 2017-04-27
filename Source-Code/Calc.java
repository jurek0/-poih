package Source-Code;
import Source-Code.Oberflaeche;
import java.util.LinkedList;




public class calc {

	 Oberflaeche rechenOberflaeche = new Oberflaeche ();
	
	
	public LinkedList<String> getRechner(LinkedList<String> Eingabe
			) {
		boolean GRAD;

		for (int a = 0; a < Eingabe.size(); a++) {

//			Fall 1: Zwei Eingaben, Mal/Geteilt Operatoren
			if (Eingabe.get(a).equals(" * ") 
				|| Eingabe.get(a).equals(" : ")
				|| Eingabe.get(a).equals(" ^ ")
				|| Eingabe.get(a).equals(" % ")) {

				double abc1 = 0; // Eingabe vor dem	Rechenoperator
				double abc2 = 0; // Eingabe nach dem Rechenoperator
				double Ausgabe = 0; // Ergebnis

				// Ausgabe falls pi oder e eingegeben wurde für Eingabe 1
				if (Eingabe.get(a - 1).equals(" pi ")) {
					abc1 = Math.PI;
				} else if (Eingabe.get(a - 1).equals(" e ")) {
					abc1 = Math.E;
				} else {
					abc1 = Double.parseDouble(Eingabe.get(a - 1));
				}
                // """ für Eingabe 2
				if (Eingabe.get(a + 1).equals(" pi ")) {
					abc2 = Math.PI;
				} else if (Eingabe.get(a + 1).equals(" e ")) {
					abc2 = Math.E;
				} else {
					abc2 = Double.parseDouble(Eingabe.get(a + 1));
				}

				// Mal rechnen
				if (Eingabe.get(a).equals(" * ")) {
					Ausgabe = abc1 * abc2;
				}

				// Geteilt rechnen, mit divide by zero exception
				
				if (Eingabe.get(a).equals(" : ") && abc2 != 0) {
					Ausgabe = abc1 / abc2;
				}
				else if (Eingabe.get(a).equals(" : ") && abc2 == 0){System.out.println("Error: "
						+ "Durch 0 Teilen nicht möglich!");}
				// Hoch rechnen
				
				if (Eingabe.get(a).equals(" ^ ")) {
					Ausgabe = Math.pow(abc1, abc2);
				}

				// ... % von einer Zahl rechnen
				if (Eingabe.get(a).equals("%")) {
					Ausgabe = (abc2 / 100) * abc1;
				}

				Eingabe.set(a, Double.toString(Ausgabe));
				Eingabe.remove(a + 1);
				Eingabe.remove(a - 1);
				return Eingabe;
			}

//			Fall 2 : Nur eine Eingabe, z.B ln von 2
			if (Eingabe.get(a).equals(" ln( ")
				|| Eingabe.get(a).equals(" log( ")
				|| Eingabe.get(a).equals(" wur ")					
				|| Eingabe.get(a).equals(" sin( ")
				|| Eingabe.get(a).equals(" cos( ")
				|| Eingabe.get(a).equals(" asin( ")
				|| Eingabe.get(a).equals(" acos( ")
				|| Eingabe.get(a).equals(" tan( ")
				|| Eingabe.get(a).equals(" atan( ")
				|| Eingabe.get(a).equals(" fac ")) {
				
				double abc2 = 0;
				double Ausgabe = 0;

				if (Eingabe.get(a + 1).equals(" pi ")) {
					abc2 = Math.PI;
				} else if (Eingabe.get(a + 1).equals(" e ")) {
					abc2 = Math.E;
				} else {
					abc2 = Double.parseDouble(Eingabe.get(a + 1));
				}

				// Naürlicher Logarithmus
				
				if (Eingabe.get(a).equals(" ln( ")) {
					Ausgabe = Math.log(abc2);
				}

				// Dekadischer Logarithmus
				
				if (Eingabe.get(a).equals(" log( ")) {
					Ausgabe = Math.log10(abc2);
				}

				// Wurzel
				
				if (Eingabe.get(a).equals("wur")) {
					Ausgabe = Math.sqrt(abc2);
				}

				// Sinus
				
				if (Eingabe.get(a).equals("sin(")) {
					Ausgabe = Math.sin(abc2);
					if (GRAD=true){Math.toDegrees(Ausgabe);
					}
					else {Math.toRadians(Ausgabe);}
								}

				// Cosinus
				
				if (Eingabe.get(a).equals(" cos( ")) {
					Ausgabe = Math.cos(abc2);
					if (GRAD=true){Math.toDegrees(Ausgabe);
					}
					else {Math.toRadians(Ausgabe);}
				}

				// Tangens
				
				if (Eingabe.get(a).equals(" tan( ")) {
					Ausgabe = Math.tan(abc2);
					if (GRAD=true){Math.toDegrees(Ausgabe);
					}
					else {Math.toRadians(Ausgabe);}
				}
				
				//Fakultät
				if (Eingabe.get(a).equals(" fac ")){
					int i;
					for (i=1;i<abc2;i++){
						Ausgabe = Ausgabe*i;
					}
					
				}
				
				//Arcsinus
				if (Eingabe.get(a).equals(" asin ")){
					Ausgabe = Math.asin(abc2);
					Math.toDegrees(Ausgabe);
				}
				
				//Arctangens
				if (Eingabe.get(a).equals(" atan ")){
					Ausgabe = Math.atan(abc2);
					Math.toDegrees(Ausgabe);
				}
				
				//Arccosinus
				if (Eingabe.get(a).equals(" acos ")){
					Ausgabe = Math.acos(abc2);
					Math.toDegrees(Ausgabe);
				}
				
				return Eingabe;
			}

//			 Fall 3: Zwei Eingaben und verschiedene Operatoren, wie 3+4*3
			if ((Eingabe.get(a).equals(" + ") 
				|| Eingabe.get(a).equals(" - "))
				&& !((Eingabe.contains(" * ") 
				|| Eingabe.contains(" : ")
				|| Eingabe.contains(" ^ ") 
				|| Eingabe.contains(" % ")
				|| Eingabe.contains(" wur ")
				|| Eingabe.contains(" ln( ") 
				|| Eingabe.contains(" log( ")
				))){
				
				double abc1 = 0;
				double abc2 = 0;
				double Ausgabe = 0;

				if (Eingabe.get(a - 1).equals(" pi ")) {
					abc1 = Math.PI;
				} else if (Eingabe.get(a - 1).equals("e")) {
					abc1 = Math.E;
				} else {
					abc1 = Double.parseDouble(Eingabe.get(a - 1));
				}

				if (Eingabe.get(a + 1).equals("pi")) {
					abc2 = Math.PI;
				} else if (Eingabe.get(a + 1).equals("e")) {
					abc2 = Math.E;
				} else {
					abc2 = Double.parseDouble(Eingabe.get(a + 1));
				}

				// Plus rechnen
				if (Eingabe.get(a).equals("+")) {
					Ausgabe = abc1 + abc2;
				}

				// Minus rechnen
				if (Eingabe.get(a).equals(" - ")) {
					Ausgabe = abc1 - abc2;

				}

				Eingabe.set(a, Double.toString(Ausgabe));
				Eingabe.remove(a + 1);
				Eingabe.remove(a - 1);
				return Eingabe;

			}
		}

		return Eingabe;
	}

	public static void main(String[] args) {
		new calc();
	}
}
