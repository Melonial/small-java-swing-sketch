import javax.swing.*;

public class Module1 extends Controllee
{
	private JLabel counterBox;
	private int currentVal;
	
	public Module1()
	{
		super();
		this.setLayout(null);
		
		currentVal = 0;
		counterBox = new JLabel();
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