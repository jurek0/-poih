package abc.Fenster.Fenster;
import Source-Code.Calc;
import Source-Code.Rechner;
import Source-Code.Oberflaeche;

import javax.swing.*;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;

public class Fenster{
  Rechner rechner = new Rechner();
  Oberflaeche rechnerOberflaeche = new Oberflaeche();
  calc Calc = new calc();
  
 public void start (){
   Fenster fenster = new Fenster();
   fenster.setVisible (true);
 }
  
}
