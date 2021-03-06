
import javax.swing.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.*;
import java.util.LinkedList;


public class Oberflaeche {   

	Rechner rechner = new Rechner ();

	
	JFrame frame;
    JPanel panel;
    JButton buttonadd,buttonmin,buttonmal,buttonget,buttonwur, buttoner, buttondel,buttonans,
    		button0,button1, button2, button3, button4, button5, button6, button7, button8, button9, 
    		buttoncom, buttonbac, buttonsin,buttoncos,buttontan,buttonlog,buttonfac,buttonpro,
    		buttonpi,buttone,buttonhoch,buttonka,buttonkz,
    		buttoninv, buttonln, buttonasin, buttonacos, buttonatan;
    
    JRadioButton grad, rad;
    ButtonGroup group;
    JTextField tf1, tf2;
    JLabel label ;

  
	
//Die Oberfläche des Taschenrechners: 

Oberflaeche (){
    
    frame = new JFrame ("Taschenrechner");
    JPanel panel = (JPanel)frame.getContentPane();
    
    //Wahlmöglichkeit zwischen Bogenmaß und Grad
    grad = new JRadioButton ("GRAD");
    grad.setSize(20,20);
    grad.setLocation(10,270 );
    grad.setSelected(true);
    grad.setMnemonic(KeyEvent.VK_G);
    if (grad.isSelected()){
    	boolean GRAD = true;
    }
    
    rad = new JRadioButton ("RAD");
    rad.setSize(20, 20);
    rad.setLocation(10, 290);
    rad.setMnemonic(KeyEvent.VK_R);
    if (rad.isSelected()){
    	boolean GRAD = false; 
    }
    
    group = new ButtonGroup ();
    group.add(grad);
    group.add(rad);
    
    
    
//    Buttons 
    
    //Zahlenblock
    
    button7 = new JButton ("7");
    button7.setBounds(10,60,45,45);
    button7.setFocusable(true);
    button7.addActionListener(new ActionListener(){
   	 public void actionPerformed (ActionEvent e){ 
   	 tf1.setText(tf1.getText().concat("7"));
   	 }
   });
    
    
    button8 = new JButton ("8");
    button8.setBounds(60,60,45,45);
    button8.addActionListener(new ActionListener(){
   	 public void actionPerformed (ActionEvent e){ 
   	 tf1.setText(tf1.getText().concat("8"));
   	 }
   });
   
    

    button9 = new JButton ("9");
    button9.setBounds(110,60,45,45);
    button9.addActionListener(new ActionListener(){
   	 public void actionPerformed (ActionEvent e){ 
   	 tf1.setText(tf1.getText().concat("9"));
   	 }
   });
    
    

    button4 = new JButton ("4");
    button4.setBounds(10,113,45,45);
    button4.addActionListener(new ActionListener(){
   	 public void actionPerformed (ActionEvent e){ 
   	 tf1.setText(tf1.getText().concat("4"));
   	 }
   });
    
    
    button5 = new JButton ("5");
    button5.setBounds(60,113,45,45);
    button5.addActionListener(new ActionListener(){
   	 public void actionPerformed (ActionEvent e){ 
   	 tf1.setText(tf1.getText().concat("5"));
   	 }
   });
    
    
    button6 = new JButton ("6");
    button6.setBounds(110,113,45,45);
    button6.addActionListener(new ActionListener(){
   	 public void actionPerformed (ActionEvent e){ 
   	 tf1.setText(tf1.getText().concat("6"));
   	 }
   });
  
    	
     
    button1 = new JButton ("1");
    button1.setBounds(10,165,45,45);
    button1.addActionListener(new ActionListener(){
   	 public void actionPerformed (ActionEvent e){ 
   	 tf1.setText(tf1.getText().concat("1"));
   	 }
   });
    
    
    button2 = new JButton ("2");
    button2.setBounds(60,165,45,45);
    button2.addActionListener(new ActionListener(){
   	 public void actionPerformed (ActionEvent e){ 
   	 tf1.setText(tf1.getText().concat("2"));
   	 }
   });
    
    
    button3 = new JButton ("3");
    button3.setBounds(110,165,45,45);
    button3.addActionListener(new ActionListener(){
   	 public void actionPerformed (ActionEvent e){ 
   	 tf1.setText(tf1.getText().concat("3"));
   	 }
   });
    
    //Komma
    
    buttoncom = new JButton (",");
    buttoncom.setBounds(10,215,45,45);
    buttoncom.addActionListener(new ActionListener(){
   	 public void actionPerformed (ActionEvent e){ 
   	 tf1.setText(tf1.getText().concat(","));
   	 }
   });
    
    
    button0 = new JButton ("0");
    button0.setBounds(60,215,45,45);
    button0.addActionListener(new ActionListener(){
   	 public void actionPerformed (ActionEvent e){ 
   	 tf1.setText(tf1.getText().concat("0"));
   	 }
   });
    
    // Ist Gleich
	

    buttoner = new JButton ("=");
    buttoner.setBounds(110,215,45,45);
    buttoner.addActionListener(new ActionListener(){ 
        public void actionPerformed(ActionEvent e){
        rechner.Ergebnis = rechner.Eingabe.toString();
        	 tf2.setText("" + rechner.getErgebnis() );
        	
       }
    });
  
//   buttoner.getRootPane().setDefaultButton(buttoner);
    
   //Operatoren Buttons
    
    //Plus
     buttonadd = new JButton ("+");
     buttonadd.setBounds(157,220,40,40);
     buttonadd.setFont(new Font ("Arials",Font.BOLD,7));
     buttonadd.setBackground(Color.red );
     buttonadd.addActionListener(new ActionListener(){
    	 public void actionPerformed (ActionEvent e){ 
    	 tf1.setText(tf1.getText().concat("+"));
    	 }
    	 
    });
     
     
     //Minus
     buttonmin = new JButton ("-"); 
     buttonmin.setBounds(157,180,40,40);
     buttonmin.setBackground(Color.red );
     buttonmin.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText().concat("-"));;
        

         }
      });
     
     //Mal
     buttonmal = new JButton ("*");
     buttonmal.setBounds(157,140,40,40);
     buttonmal.setBackground(Color.red );
     buttonmal.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText().concat("*"));;
        
    	 
         }
      });
     
     //Geteilt
     buttonget = new JButton (":");
     buttonget.setBounds(157,100,40,40);
     buttonget.setBackground(Color.red );
     buttonget.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText().concat(":"));;
     
         }
      });
     
    //Alles Löschen
     buttondel = new JButton ("C");
     buttondel.setBounds(157, 60, 40, 40);
     buttondel.setFont(new Font ("Arial",Font.BOLD,7));
     buttondel.setBackground(Color.red );
     buttondel.addActionListener(new ActionListener (){
    	 public void actionPerformed (ActionEvent e){
    
    		 tf1.setText ("");
    		 tf2.setText("");
    	 }
     });
     
    //Letztes Zeichen löschen
     buttonbac = new JButton ("\u232B");
     buttonbac.setBounds(200,60,65,40);
     buttonbac.addActionListener(new ActionListener (){
    	 public void actionPerformed (ActionEvent e){
    
    		 tf1.setText (tf1.getText().substring(0, tf1.getText().length() -1));
    		 
    	 }
     });
     
     // Ergebnis als Eingabe in tf1
     buttonans = new JButton("ANS");
	 buttonans.setBounds(265, 60, 70, 40);
	 buttonans.setFont(new Font ("Arial", Font.PLAIN, 11));
	 buttonans.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText(tf2.getText());
			}	
		});
	 
	 //Sinus
     buttonsin = new JButton ("sin");
     buttonsin.setBounds(200,100,45,40);
     buttonsin.setFont (new Font("Arial",Font.BOLD,7));
     buttonsin.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText().concat("sin("));;
         }
      });
     
     //Cosinus
     buttoncos = new JButton ("cos");
     buttoncos.setBounds(245,100,45,40);
     buttoncos.setFont (new Font("Arial",Font.BOLD,6));
     buttoncos.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText().concat("cos("));;
         }
      });
	 
	 //Tangens
     buttontan = new JButton ("tan");
     buttontan.setBounds(290,100,45,40);
     buttontan.setFont (new Font("Arial",Font.BOLD,6));
     buttontan.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText().concat("tan("));;
         }
      });
	
     //Dekadiscer Logarithmus
     buttonlog = new JButton("log");
	 buttonlog.setBounds(200, 140, 45, 40);
	 buttonlog.setFont(new Font ("Arial", Font.BOLD, 5));
	 buttonlog.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText(tf1.getText().concat("log("));
			}	
		});
	 
	//Wurzel
     buttonwur = new JButton ("\u221A");
     buttonwur.setBounds(245,140,45,40);
     buttonwur.setFont(new Font("Arial",Font.BOLD,9));
     buttonwur.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText().concat("\u221A"));;
         }
      });
     
     //Prozent
     buttonpro = new JButton ("%");
     buttonpro.setBounds(290,140,45,40);
     buttonpro.setFont(new Font("Arial",Font.BOLD,7));
     buttonpro.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText().concat("%"));;
         }
      });
	 
	 //Pi
	 buttonpi = new JButton("\u03c0");
	 buttonpi.setBounds(200, 180, 45, 40);
	 buttonpi.setFont(new Font ("Arial", Font.PLAIN, 11));
	 buttonpi.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText(tf1.getText().concat("\u03c0"));
			}	
		});
	 
	 //Fakultät 
	 buttonfac = new JButton("!");
	 buttonfac.setBounds(245, 180, 45, 40); 
	 buttonfac.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText("!"+tf1.getText());
			}	
		});
	 
	 //e
	 buttone = new JButton("e");
	 buttone.setBounds(290, 180, 45, 40);
	 buttone.setFont(new Font ("Arial", Font.PLAIN, 10));
	 buttone.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText(tf1.getText().concat("e"));
			}	
		});
	 
	
	 //Hoch
	 buttonhoch = new JButton("^");
	 buttonhoch.setBounds(200,220,45,40);
	 buttonhoch.setFont(new Font("Arial",Font.PLAIN, 10));
	 buttonhoch.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText(tf1.getText().concat("^"));
			}	
		});
	 
	//Klammer auf
	 buttonka = new JButton("(");
	 buttonka.setBounds(245, 220, 45, 40);
	 buttonka.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText(tf1.getText().concat("("));
			}	
		});
	 
	 //Klammer zu
	 buttonkz = new JButton(")");
	 buttonkz.setBounds(290, 220, 45, 40);
	 buttonkz.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText(tf1.getText().concat(")"));
			
			}	
		});
	 
//	 Extra Buttons:
	 
	 buttonln = new JButton ("ln");
	 buttonln.setBounds(200, 140, 45, 40);
	 buttonln.setFont(new Font("Arial",Font.BOLD,7));
	 buttonln.setVisible(false);
	 buttonln.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText(tf1.getText().concat("ln("));
			
			}	
		});
	 
	 buttonasin = new JButton ("sin^-1");
	 buttonasin.setBounds(200,100,45,40);
	 buttonasin.setFont(new Font("Arial",Font.BOLD,5));
	 buttonasin.setVisible(false);
	 buttonasin.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText(tf1.getText().concat("sin^-1("));
			
			}	
		});
	 
	 
	 buttonacos = new JButton ("cos^-1");
	 buttonacos.setBounds(245,100,45,40);
	 buttonacos.setFont(new Font("Arial",Font.BOLD,5));
	 buttonacos.setVisible(false);
	 buttonacos.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText(tf1.getText().concat("cos^-1("));
			
			}	
		});
	 
	 
	 buttonatan = new JButton ("tan^-1");
	 buttonatan.setBounds(290,100,45,40);
	 buttonatan.setFont(new Font("Arial",Font.BOLD,5));
	 buttonatan.setVisible(false);
	 buttonatan.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			tf1.setText(tf1.getText().concat("tan^-1("));
			
			}	
		});
	 
	 
	 
	 buttoninv = new JButton ("INV");
	 buttoninv.setBounds(200, 270, 135, 35);
	 buttoninv.setBackground(Color.yellow);
	 buttoninv.addActionListener(new ActionListener (){
		 public void actionPerformed (ActionEvent e){
		if (buttonln.isVisible()){
			buttonatan.setVisible(true);
			buttonasin.setVisible(false);
			buttonacos.setVisible(false);
			buttonln.setVisible(false);
			buttonlog.setVisible(true);
		    buttonlog.setEnabled(true);
			buttonsin.setEnabled(true);
		    buttoncos.setEnabled(true);
			buttontan.setEnabled(true);
			buttonwur.setEnabled(true);
			buttonpro.setEnabled(true);
			buttonpi.setEnabled(true);
			buttonfac.setEnabled(true);
			buttonhoch.setEnabled(true);
			buttone.setEnabled(true);
			buttonkz.setEnabled(true);
			buttonka.setEnabled (true);
			buttonasin.setEnabled(false);
			buttonln.setEnabled(false);
			buttonacos.setEnabled(false);
			buttonatan.setEnabled(false);
		 }
		else{buttonln.setVisible(true);
			 buttonln.setEnabled(true);
			 buttonatan.setEnabled(true);
			 buttonatan.setVisible(true);
			 buttonacos.setVisible(true);
			 buttonacos.setEnabled(true);
			 buttonasin.setVisible(true);
			 buttonasin.setEnabled(true);
			 buttonlog.setVisible(false);
			 buttonlog.setEnabled(false);
			 buttonsin.setEnabled(false);
			 buttonsin.setVisible(false);
			 buttoncos.setEnabled(false);
			 buttoncos.setVisible(false);
			 buttontan.setEnabled(false);
			 buttontan.setVisible(false);
			 buttonwur.setEnabled(false);
			 buttonpro.setEnabled(false);
			 buttonpi.setEnabled(false);
			 buttonfac.setEnabled(false);
			 buttonhoch.setEnabled(false);
			 buttone.setEnabled(false);
			 buttonkz.setEnabled(false);
			 buttonka.setEnabled (false);
			
		}
		 }
	 });
	 

//Textfields     
     tf1= new JTextField ();
     tf1.setBounds(10,10,146,40);
     tf1.setFocusable(true);
     frame.getContentPane().add(tf1);
     
  
     tf2 = new JTextField ();
     tf2.setBounds(209,10,116,40);
     tf2.setEditable(false);
     frame.getContentPane().add(tf2); 
     
//Labels     
     JLabel label = new JLabel ("=");
     label.setBounds (173,10,40,40);
     JLabel grd= new JLabel ("GRAD");
     grd.setBounds(30, 260, 60, 40);
     JLabel rd = new JLabel ("RAD");
     rd.setBounds(30,280,60,40);
     frame.getContentPane().add(label);
     frame.getContentPane().add(grd);
     frame.getContentPane().add(rd);
    
//Zum Panel hinzufügen:
     panel.add(grad);
     panel.add(rad);
     panel.add(buttonadd);
     panel.add(buttonmin);
     panel.add(buttoner);
     panel.add(buttondel);
     panel.add(buttonmal);
     panel.add (buttonget);
     panel.add(buttonwur);
     panel.add(buttonans);
     panel.add(button1);
     panel.add(button2);
     panel.add(button3);
     panel.add(button4);
     panel.add (button5);
     panel.add(button6);
     panel.add(button7);
     panel.add(button8);
     panel.add(button9);
     panel.add(button0);
     panel.add (buttoncom);
     panel.add(buttonbac);
     panel.add(buttonsin);
     panel.add(buttoncos);
     panel.add(buttontan);
     panel.add (buttonlog);
     panel.add(buttonfac);
     panel.add(buttonpro);
     panel.add(buttonpi);
     panel.add(buttone);
     panel.add (buttonhoch);
     panel.add(buttonka);
     panel.add(buttonkz);
     panel.add (buttoninv);
     panel.add (buttonln);
     panel.add(buttonasin);
     panel.add(buttonacos);
     panel.add(buttonatan);
     
//Layout des Frames:     
     frame.setLayout(null);
     frame.setSize(345,330);
     frame.setResizable(false);
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
     
    }


public static void main(String [] args){
	new Oberflaeche ();}


        }
