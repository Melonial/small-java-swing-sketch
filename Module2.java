import javax.swing.*;
import java.awt.Color;

public class Module2 extends Notifiable
{
	private JLabel resultBox;
	
	public Module2()
	{
		super();
		this.setBackground(new Color(0,0,255));
		
		resultBox = new JLabel();
		this.add(resultBox);
	}
	
	public void doAction()
	{
		
	}
	
	public void doAction(int k)
	{
		resultBox.setText( Integer.toString(k%7) );
	}
	
}