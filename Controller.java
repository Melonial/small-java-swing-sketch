import java.awt.event.*;
import javax.swing.*;

public class Controller implements ActionListener
{
	private BaseWindow w = new BaseWindow();
	private Module1 counter = new Module1();
	
	public Controller()
	{				
		JButton b1 = new JButton("Click!");
		b1.addActionListener(this);
		
		w.addComponent(b1);
		w.refresh();
	}
	
	//Links together a button with a chosen module (must extend Controllee class)
	public void link(JButton b, Controllee c)
	{
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(counter.getClass().getName());
		counter.getClass().getName().onButtonClick();
	}
}