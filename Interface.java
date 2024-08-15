import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Interface implements ActionListener
{
	private BaseWindow w = new BaseWindow();
	private Module1 counter = new Module1();
	private Map<JButton, Controllable> dict = new HashMap<>();
	
	public Interface()
	{				
		JButton b1 = new JButton("Click!");
		Module1 m1 = new Module1();
		Module2 m2 = new Module2();
		link(b1,m1);
		m1.addNotifiable(m2);
		
		b1.addActionListener(this);
		
		w.addComponent(b1);
		w.addComponent(m1);
		w.addComponent(m2);
		w.refresh();
	}
	
	//Links together a button with a chosen module (must extend Controllee class)
	public void link(JButton b, Controllable c)
	{
		dict.put(b,c);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(dict.get(e.getSource()) == null) {System.out.println("ERROR: Button not assigned"); System.exit(0);};	//Leave me alone, I wrote this pretty late >.>
		dict.get(e.getSource()).onButtonClick();
	}
}