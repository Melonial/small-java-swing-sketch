import javax.swing.*;

public class BaseWindow extends JFrame
{	
	private JPanel p = new JPanel();
	
	public BaseWindow()
	{
		super();
		this.setTitle("Test Program");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(p);
		this.setVisible(true);
	}
	
	public void addComponent(JComponent a)
	{
		p.add(a);
	}
	
	public void refresh()
	{
		this.remove(p);
		this.add(p);
	}
}