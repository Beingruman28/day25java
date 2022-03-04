package day25java;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleApplet extends Applet
{
   Button b,b1,b2;
   TextField t,t1;
   public void init()
   {
	   add(b = new Button("Click"));
	   add(t = new TextField(15));
	   add(b1 = new Button("Clear"));
	   add(t1 = new TextField(15));
	   add(b2 = new Button("Submit"));
	   b.addActionListener(new A());
	   b2.addActionListener(new A());
	   b1.addActionListener(new ActionListener()
			   {
	   public void actionPerformed(ActionEvent e)
	   {
		   t.setText("          ");
		   
	   }
	   {
		   t1.setText("         ");
	   }
	   });
	   }
   class A implements ActionListener { 
	   public void actionPerformed(ActionEvent e)
	   {
		   t.setText("Hello java"); 
		   t1.setText("welcome");
	   }
   }
 }

