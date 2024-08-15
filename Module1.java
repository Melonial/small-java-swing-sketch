import javax.swing.*;
import java.awt.Color;
import java.util.LinkedList;

public class Module1 extends Controllable implements Notifier
{
	private JLabel counterBox;
	private int currentVal;
	
	private LinkedList<Notifiable> nList = new LinkedList<Notifiable>();
	
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
		notifyNotifiable();
	}
	
	//=========================================================
	//Controllable implementation
	//=========================================================
	
	public void onButtonClick()
	{
		increment();
	}
	
	//==========================================================
	//Notifier implementation
	//==========================================================
	
	//Called outside the class (should be)
	public void addNotifiable(Notifiable n)
	{
		nList.add(n);
	}
	
	public void removeNotifiable(Notifiable n)
	{
		nList.remove(n);
	}
	
	//This function can be called within this class.
	//Notifier class will implement how/when to notify.
	public void notifyNotifiable()
	{
		for (int i = 0; i < nList.size(); i++)
		{
			nList.get(i).doAction(currentVal);
		}
	}
}