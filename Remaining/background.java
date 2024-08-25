import java.awt.*;
import javax.swing.*;
class background extends JFrame
{
	background()
	{
		setSize(1200,900);
		setTitle("Background Image");
		setLayout(null);
		JLabel l1=new JLabel("WELECOME IN GOD GIFTED THOUGHTS");
		l1.setBounds(200,10,200,200);
		add(l1);

		JTextField t1=new JTextField(20);
		t1.setBounds(50,50,50,50);
		add(t1);
		JButton b1=new JButton("BUTTON ONE");
		b1.setBounds(100,100,90,90);
		add(b1);
		JButton b2=new JButton("BUTTON TWO");
		b2.setBounds(300,300,90,90);
		add(b2);

		ImageIcon img=new ImageIcon("home.png");
		JLabel l2=new JLabel("",img,JLabel.CENTER);
		l2.setLocation(0,0);
		l2.setSize(1200,700);
		//l2.setBounds(0,0,1000,750);
		add(l2);
		JLabel l=new JLabel("hiii");
		l.setBounds(400,200,129,100);
		add(l);
	}
	public static void main(String []a)
	{
		background ft=new background();
		ft.setVisible(true);
	}
}