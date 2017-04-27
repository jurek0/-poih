import java.util.LinkedList;




public class calc {

	 Oberflaeche rechenOberflaeche = new Oberflaeche ();
		 Rechner rechner = new Rechner ();

	
	
		 public LinkedList<String> getRechner (LinkedList<String> Eingabe, String Winkel)
		 {

			 for (int a = 0; a < Eingabe.size(); a++) {
				 
				
				if (Eingabe.get(a).equals("*") || Eingabe.get(a).equals(":")  || 
					Eingabe.get(a).equals("^") || Eingabe.get(a).equals("%") ) {
					
					double abc1 = 0;
					double abc2 = 0;
					double Ausgabe = 0;
					
					//Ausgabe falls pi oder e eingegeben wurde
					if (Eingabe.get(a-1).equals(" pi ")) {
						abc1 = Math.PI;
					} else if (Eingabe.get(a-1).equals(" e ")) {
						abc1 = Math.E;
					} else {
						abc1 = Double.parseDouble(Eingabe.get(a-1));
					}
					
					if (Eingabe.get(a+1).equals(" pi ")) {
						abc2 = Math.PI;
					} else if (Eingabe.get(a+1).equals(" e ")) {
						abc2 = Math.E;
					} else {
						abc2 = Double.parseDouble(Eingabe.get(a+1));
					}

					//Mal
					if (Eingabe.get(a).equals(" * ")) {
						Ausgabe = abc1 * abc2;
					}

					
					//Geteilt
				
					if (Eingabe.get(a).equals(" : ") && abc2 != 0){
						Ausgabe = abc1 / abc2;
					} 
					
					
					
					//Hoch
					if (Eingabe.get(a).equals(" ^ ")) {
						Ausgabe = Math.pow(abc1, abc2);
					}
					
					//%
					if (Eingabe.get(a).equals("%")) {
						Ausgabe = (abc2/100)*abc1;
					}
					
					Eingabe.set(a, Double.toString(Ausgabe));
					Eingabe.remove(a+1);
					Eingabe.remove(a-1);
					return Eingabe;
					} 
				
				//DOT-DUAL-PART-SUBCALCULATION (OPERATOR NUMBER)
				if (Eingabe.get(a).equals("ln(") || Eingabe.get(a).equals("log(") || 
					Eingabe.get(a).equals("wur") || Eingabe.get(a).equals("sin(") ||
					Eingabe.get(a).equals("cos(") || Eingabe.get(a).equals("tan(")) {
					double abc2 = 0;
					double Ausgabe = 0;
					
					if (Eingabe.get(a+1).equals("pi")) {
						abc2 = Math.PI;
					} else if (Eingabe.get(a+1).equals("e")) {
						abc2 = Math.E;
					} else {
						abc2 = Double.parseDouble(Eingabe.get(a+1));
					}
					
					//Naürlicher Logarithmus
					if (Eingabe.get(a).equals("ln(")) {
						Ausgabe = Math.log(abc2);
					}
					
					//Dekadischer Logarithmus
					if (Eingabe.get(a).equals("log(")) {
						Ausgabe = Math.log10(abc2);
					}
					
					//Wurzel
					if (Eingabe.get(a).equals("wur")) {
						Ausgabe = Math.sqrt(abc2);
					}
				
					
					//Sinus
					if (Eingabe.get(a).equals("sin(")) {
						Ausgabe = Math.sin(abc2);
						if (Winkel.equals("grad")) {
//						Ausgabe = helper.getDegreeFromRadial(tempOUT);
						}
					}
					
					//Cosinus
					if (Eingabe.get(a).equals(" cos( ")) {
						Ausgabe = Math.cos(abc2);
						if (Winkel.equals("grad")) {
//							tempOUT = helper.getDegreeFromRadial(tempOUT);
						}
					}
					
					//Tangens
					if (Eingabe.get(a).equals(" tan( ")) {
						Ausgabe = Math.tan(abc2);
						if (Winkel.equals("grad")) {
//							tempOUT = helper.getDegreeFromRadial(tempOUT);
						}
					}
						return Eingabe;
					}
				
				//LINE-TRI-PART-SUBCALCULATION (NUMBER OPERATOR NUMBER)
				if ((Eingabe.get(a).equals("+") ||Eingabe.get(a).equals("-")) 
					&& !((Eingabe.contains("*") ||Eingabe.contains(":") || 
					Eingabe.contains("^")
					|| Eingabe.contains("%") || Eingabe.contains("wur") || 
					Eingabe.contains("ln") || Eingabe.contains("log")))) {
					double abc1 = 0;
					double abc2 = 0;
					double Ausgabe = 0;
					
					
					if (Eingabe.get(a-1).equals("pi")) {
						abc1 = Math.PI;
					} else if (Eingabe.get(a-1).equals("e")) {
						abc1 = Math.E;
					} else {
						abc1 = Double.parseDouble(Eingabe.get(a-1));
					}
					
				
					if (Eingabe.get(a+1).equals("pi")) {
						abc2 = Math.PI;
					} else if (Eingabe.get(a+1).equals("e")) {
						abc2 = Math.E;
					} else {
						abc2 = Double.parseDouble(Eingabe.get(a+1));
					}
					
					//Plus
					if (Eingabe.get(a).equals("+")){
					Ausgabe = abc1 + abc2;
					}
					
					//Minus
					if (Eingabe.get(a).equals(" - ")){
						Ausgabe = abc1 - abc2;
						
					}
				
					
					Eingabe.set(a, Double.toString(Ausgabe));
					Eingabe.remove(a+1);
					Eingabe.remove(a-1);
					return Eingabe;
					
					
					} 
				 }
							
		
			return Eingabe;
				}
				
		    public static void main(String[] args) {
			       new calc ();}
}


	


