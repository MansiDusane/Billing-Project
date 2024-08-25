import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class p extends JFrame
{
	JButton b=new JButton("Print");
	JTextArea ta= new JTextArea(10,10);
	p()
	{
		setLayout(new FlowLayout());
		setSize(500,500);
		add(ta);
		add(b);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent eee)
			{
				try
				{
					ta.print();
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});

	}
	public static void main(String a[])
	{
		p pp = new p();
		pp.setVisible(true);
	}
}