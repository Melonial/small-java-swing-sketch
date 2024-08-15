import javax.swing.*;
import java.awt.Color;

public class Module1 extends Controllable
{
	private JLabel counterBox;
	private int currentVal;
	
	public Module1()
	{
		super();
		this.setBackground(new Color(255,0,0));
		
		currentVal = 0;
		counterBox = new JLabel("bich");
		this.add(counterBox);
		update();
	}
	
	public void increment()
	{
		currentVal++;
		update();
	}
	
	public void decrement()
	{
		currentVal--;
		update();
	}
	
	private void update()
	{
		counterBox.setText(Integer.toString(currentVal));
	}
	
	public void onButtonClick()
	{
		increment();
	}
}