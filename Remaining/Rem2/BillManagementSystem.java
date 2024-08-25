import data.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class BillManagementSystem extends JFrame
{
	JFrame frame1;
	BillManagementSystem()
	{
		setSize(1366,768);
		setTitle("Bill Management System");
		setLayout(null);
		JLabel unm=new JLabel("User Name:");
		JLabel pass=new JLabel("Password :");
		JTextField u=new JTextField(200);
		JPasswordField p=new JPasswordField(200);
		JCheckBox c1=new JCheckBox("Show Password");
		JButton ln=new JButton("Login");
		JButton close=new JButton("Close");
		//Login Label
		ImageIcon img=new ImageIcon("login ani.gif");
		JLabel login=new JLabel("",img,JLabel.CENTER);
		login.setBounds(850,230,550,100);
		add(login);
		//Username Label
		unm.setFont(new Font("Times New Roman",1,30));
		unm.setBounds(950,250,400,200);
		add(unm);
		//Username TextField
		u.setFont(new Font("Times New Roman",1,20));
		u.setBounds(1110,340,200,30);
		add(u);
		//Password TextField
		p.setFont(new Font("Times New Roman",1,20));
		p.setBounds(1110,380,200,30);
		add(p);
		//Checkbox Item
		c1.setBounds(1110,420,150,20);
		add(c1);
		c1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ec)
			{
				if(c1.isSelected())
				{
					p.setEchoChar((char)0);
				}
				else
				{
					p.setEchoChar('.');
				}
			}
		});
		//Password Label
		pass.setFont(new Font("Times New Roman",1,30));
		pass.setBounds(950,290,400,200);
		add(pass);
		//Login button
		ImageIcon limg=new ImageIcon("login.png");
		ln.setIcon(limg);
		ln.setFont(new Font("Times New Roman",1,18));
		ln.setBounds(980,465,120,30);
		add(ln);

		//Developer information
		JLabel mam = new JLabel("Guided By: Mrs. S.A.Sarwade",JLabel.CENTER);
		mam.setFont(new Font("Times New Roman",3,25));
		mam.setBounds(650,640,550,30);
		add(mam);

		JLabel dev = new JLabel("Developed By:\t\t\t\t\t\t\t\t",JLabel.CENTER);
		dev.setFont(new Font("Times New Roman",3,25));
		dev.setBounds(250,680,250,30);
		add(dev);


		JLabel std1 = new JLabel("2. Mansi Dusane ",JLabel.CENTER);
		std1.setFont(new Font("Times New Roman",3,25));
		std1.setBounds(630,680,250,30);
		add(std1);









		ln.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ea)
			{
				if(u.getText().equals("System") && p.getText().equals("Admin"))
				{
					setVisible(false);
					frame1=new JFrame();
					frame1.setVisible(true);
					frame1.setSize(1366,768);

					//JFrame newbFrame=new JFrame();
					JFrame mbFrame=new JFrame();
					JFrame pFrame=new JFrame();
					JFrame mpFrame=new JFrame();
					JFrame pdFrame=new JFrame();
					JFrame billFrame=new JFrame();

					//newbuyer button with label
					ImageIcon bimg=new ImageIcon("new buyer.png");
					JButton newbuyerbt=new JButton("",bimg);
					newbuyerbt.setBounds(10,10,80,80);
					frame1.add(newbuyerbt);

					JLabel newbuyerl=new JLabel("New",JLabel.CENTER);
					newbuyerl.setFont(new Font("Times New Roman",1,20));
					newbuyerl.setBounds(5,70,95,70);
					frame1.add(newbuyerl);
					JLabel newbuyer2=new JLabel("Buyer",JLabel.CENTER);
					newbuyer2.setFont(new Font("Times New Roman",1,20));
					newbuyer2.setBounds(0,82,95,95);
					frame1.add(newbuyer2);

					newbuyerbt.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							newbFrame newbuyerFramepk = new newbFrame();
						}
					});

					//modify button with label
					ImageIcon uimg=new ImageIcon("Update buyer.png");
					JButton upbuyerbt=new JButton("",uimg);
					upbuyerbt.setBounds(105,10,80,80);
					frame1.add(upbuyerbt);

					JLabel upbuyerl=new JLabel("Modify",JLabel.CENTER);
					upbuyerl.setFont(new Font("Times New Roman",1,20));
					upbuyerl.setBounds(90,60,100,100);
					frame1.add(upbuyerl);
					JLabel upbuyerl2=new JLabel("Buyer",JLabel.CENTER);
					upbuyerl2.setFont(new Font("Times New Roman",1,20));
					upbuyerl2.setBounds(90,80,100,100);
					frame1.add(upbuyerl2);
					upbuyerbt.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							modifybFrame modifybuyerFrame = new modifybFrame();
						}
					});

					//new supplier
						ImageIcon simg=new ImageIcon("new buyer.png");
						JButton sbt=new JButton("",simg);
						sbt.setBounds(200,10,80,80);
						frame1.add(sbt);
						//label
						JLabel sl=new JLabel("New",JLabel.CENTER);
						sl.setFont(new Font("Times New Roman",1,20));
						sl.setBounds(192,60,100,100);
						frame1.add(sl);
						JLabel sl2=new JLabel("Supplier",JLabel.CENTER);
						sl2.setFont(new Font("Times New Roman",1,20));
						sl2.setBounds(191,80,100,100);
						frame1.add(sl2);
						sbt.addActionListener(new ActionListener()
						{
						public void actionPerformed(ActionEvent e)
						{
						suplFrame sFrame = new suplFrame();
						}
					});

					//modify supplier
						ImageIcon msimg=new ImageIcon("Update buyer.png");
						JButton msbtn=new JButton("",msimg);
						msbtn.setBounds(295,10,80,80);
						frame1.add(msbtn);
						JLabel msl=new JLabel("Modify",JLabel.CENTER);
						msl.setFont(new Font("Times New Roman",1,20));
						msl.setBounds(290,60,100,100);
					    frame1.add(msl);
						JLabel msl2=new JLabel("Supplier",JLabel.CENTER);
						msl2.setFont(new Font("Times New Roman",1,20));
						msl2.setBounds(280,80,100,100);
						frame1.add(msl2);
						msbtn.addActionListener(new ActionListener()
						{
						public void actionPerformed(ActionEvent e)
						{
						modifysFrame msFrame = new modifysFrame();
						}
					});
					//Supplier Details
					ImageIcon sdimg=new ImageIcon("details product.png");
					JButton sdbt=new JButton("",sdimg);
					sdbt.setBounds(390,10,80,80);
					frame1.add(sdbt);

					JLabel sdbuyerl=new JLabel("Supplier",JLabel.CENTER);
					sdbuyerl.setFont(new Font("Times New Roman",1,20));
					sdbuyerl.setBounds(360,30,150,150);
					frame1.add(sdbuyerl);
					JLabel sdbuyer2=new JLabel("Details",JLabel.CENTER);
					sdbuyer2.setFont(new Font("Times New Roman",1,20));
					sdbuyer2.setBounds(360,50,150,150);
					frame1.add(sdbuyer2);

					    sdbt.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
								sdetails sdt = new sdetails();
								}
					});

					//new staff
					ImageIcon stimg=new ImageIcon("new buyer.png");
					JButton nsbt=new JButton("",stimg);
					nsbt.setBounds(485,10,80,80);
					frame1.add(nsbt);
					//label
					JLabel stl=new JLabel("New",JLabel.CENTER);
					stl.setFont(new Font("Times New Roman",1,20));
					stl.setBounds(470,55,100,100);
					frame1.add(stl);
					JLabel stl2=new JLabel("Staff",JLabel.CENTER);
				stl2.setFont(new Font("Times New Roman",1,20));
					stl2.setBounds(470,75,100,100);
						frame1.add(stl2);
						nsbt.addActionListener(new ActionListener()		{
					public void actionPerformed(ActionEvent e)
					{
						newstFrame stFrame = new newstFrame();
					}
					});
					//Modify Staff
					ImageIcon mstimg=new ImageIcon("Update buyer.png");
					JButton mstbtn=new JButton("",mstimg);
					mstbtn.setBounds(583,10,80,80);
					frame1.add(mstbtn);
					JLabel mstl=new JLabel("Modify",JLabel.CENTER);
					mstl.setFont(new Font("Times New Roman",1,20));
					mstl.setBounds(570,55,100,100);
					frame1.add(mstl);
					JLabel mstl2=new JLabel("Staff",JLabel.CENTER);
					mstl2.setFont(new Font("Times New Roman",1,20));
					mstl2.setBounds(570,75,100,100);
					frame1.add(mstl2);
					mstbtn.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
					modifystFrame mstFrame = new modifystFrame();
					}
					});
					//Staff details
					ImageIcon stdimg=new ImageIcon("details product.png");
					JButton stdbt=new JButton("",stdimg);
					stdbt.setBounds(680,10,80,80);
					frame1.add(stdbt);
					JLabel stdbuyerl=new JLabel("Staff",JLabel.CENTER);
					stdbuyerl.setFont(new Font("Times New Roman",1,20));
					stdbuyerl.setBounds(650,32,150,150);
					frame1.add(stdbuyerl);
					JLabel stdbuyer2=new JLabel("Details",JLabel.CENTER);
					stdbuyer2.setFont(new Font("Times New Roman",1,20));
					stdbuyer2.setBounds(649,48,150,150);
					frame1.add(stdbuyer2);
					   stdbt.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
						stfdetails stdt = new stfdetails();
						}
					});








					//new product
					ImageIcon npimg=new ImageIcon("new product.png");
					JButton npbuyerbt=new JButton("",npimg);
					npbuyerbt.setBounds(775,10,80,80);
					frame1.add(npbuyerbt);
					JLabel npbuyerl=new JLabel("New",JLabel.CENTER);
					npbuyerl.setFont(new Font("Times New Roman",1,20));
					npbuyerl.setBounds(740,30,150,150);
					frame1.add(npbuyerl);
					JLabel npbuyer2=new JLabel("Product",JLabel.CENTER);
					npbuyer2.setFont(new Font("Times New Roman",1,20));
					npbuyer2.setBounds(740,50,150,150);
					frame1.add(npbuyer2);

					npbuyerbt.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							newpFrame npf = new newpFrame();
						}
					});

					//modify product
					ImageIcon mpimg=new ImageIcon("update product.png");
					JButton mpbuyerbt=new JButton("",mpimg);
					mpbuyerbt.setBounds(870,10,80,80);
					frame1.add(mpbuyerbt);

					JLabel mpbuyerl=new JLabel("Modify",JLabel.CENTER);
					mpbuyerl.setFont(new Font("Times New Roman",1,20));
					mpbuyerl.setBounds(830,30,150,150);
					frame1.add(mpbuyerl);
					JLabel mpbuyer2=new JLabel("Product",JLabel.CENTER);
					mpbuyer2.setFont(new Font("Times New Roman",1,20));
					mpbuyer2.setBounds(830,50,150,150);
					frame1.add(mpbuyer2);

					mpbuyerbt.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							modifypFrame mpf = new modifypFrame();
						}
					});

					//Product Details
					ImageIcon pdimg=new ImageIcon("details product.png");
					JButton pdbuyerbt=new JButton("",pdimg);
					pdbuyerbt.setBounds(965,10,80,80);
					frame1.add(pdbuyerbt);

					JLabel pdbuyerl=new JLabel("Product",JLabel.CENTER);
					pdbuyerl.setFont(new Font("Times New Roman",1,20));
					pdbuyerl.setBounds(931,30,150,150);
     				frame1.add(pdbuyerl);
     				JLabel pdbuyer2=new JLabel("Details",JLabel.CENTER);
					pdbuyer2.setFont(new Font("Times New Roman",1,20));
					pdbuyer2.setBounds(930,50,150,150);
     				frame1.add(pdbuyer2);


				    pdbuyerbt.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							pdetails pdt = new pdetails();
						}
					});

					//billing
					ImageIcon blimg=new ImageIcon("billing frame.png");
					JButton blbuyerbt=new JButton("",blimg);
					blbuyerbt.setBounds(1060,10,80,80);
				    frame1.add(blbuyerbt);

				    JLabel blbuyerl=new JLabel("Billing",JLabel.CENTER);
					blbuyerl.setFont(new Font("Times New Roman",1,20));
					blbuyerl.setBounds(1020,40,150,150);
					frame1.add(blbuyerl);

					blbuyerbt.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							billing bil = new billing();
						}
					});
					//close tab
					ImageIcon climg=new ImageIcon("Close.png");
					JButton clsbuyerbt=new JButton("",climg);
					clsbuyerbt.setBounds(1155,10,80,80);
				    frame1.add(clsbuyerbt);

				    JLabel clsbuyerl=new JLabel("Close",JLabel.CENTER);
					clsbuyerl.setFont(new Font("Times New Roman",1,20));
					clsbuyerl.setBounds(1120,40,150,150);
					frame1.add(clsbuyerl);

					clsbuyerbt.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							int x =JOptionPane.showConfirmDialog(null,"Do you realy want to close",
							      "confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			    			if(x==0)
							{
								System.exit(0);
							}
						}
					});

					//logout button
					ImageIcon lgimg=new ImageIcon("logout.png");
					JButton lgbuyerbt=new JButton("",lgimg);
					lgbuyerbt.setBounds(1250,10,80,80);
				    frame1.add(lgbuyerbt);
					JLabel lgbuyerl=new JLabel("Logout",JLabel.CENTER);
					lgbuyerl.setFont(new Font("Times New Roman",1,20));
					lgbuyerl.setBounds(1210,40,150,150);
					frame1.add(lgbuyerl);
					lgbuyerbt.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								int x =JOptionPane.showConfirmDialog(null,"Do you realy want to close",
						      "confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
					  			if(x==0)
								{
									frame1.setVisible(false);
									setVisible(true);
								}	}
					});



					ImageIcon backimg=new ImageIcon("home.PNG");
					JLabel lbackimg=new JLabel("",backimg,JLabel.CENTER);
					lbackimg.setBounds(0,0,1366,768);
					frame1.add(lbackimg);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Incorrect User name and password",
 					"Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		//Close Button
		ImageIcon cimg=new ImageIcon("close Jframe.png");
		close.setIcon(cimg);
		close.setFont(new Font("Times New Roman",1,18));
		close.setBounds(1120,465,120,30);
		add(close);

        close.addActionListener(new ActionListener()
	    {
			public void actionPerformed(ActionEvent e)
			{
				int x =JOptionPane.showConfirmDialog(null,"Do you realy want to close Application",
                  "confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(x==0)
				{
					System.exit(0);
				}
			}
		});

        //Background Image
		ImageIcon back=new ImageIcon("login background.PNG");
		JLabel bimg=new JLabel("",back,JLabel.CENTER);
		bimg.setBounds(0,0,1366,768);
		add(bimg);

	}
	public static void main(String []args)
	{
		BillManagementSystem bms=new BillManagementSystem();
		bms.setVisible(true);
	}
}
