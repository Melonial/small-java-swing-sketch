import javax.swing.*;

public class BaseWindow
{	
	private JFrame f = new JFrame();
	private JPanel p = new JPanel();
	
	public BaseWindow()
	{
		f.setTitle("Test Program");
		f.setSize(200, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}
	
	public void addComponent(JComponent a)
	{
		p.add(a);
	}
	
	public void refresh()
	{
		f.remove(p);
		f.add(p);
	}
}