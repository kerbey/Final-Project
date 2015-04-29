import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class novels extends prices implements ActionListener
{
		public static BorderLayout Layout; 
		public static JFrame frame;
		public static JButton button1, button2, button3, button4, button5, button6,done;
		public static JPanel panel1, panel2;
		public novels() 
		{
			panel1= new JPanel();
			panel2= new JPanel();
			frame = new JFrame(" Novels ");
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			button1= new JButton(" Catcher In The Rye ($33.00)");
			button2= new JButton(" All The Rage ($44.20)");
			button3= new JButton(" A Tale of a Crusader ($44.44)");
			button4= new JButton(" Adam's Curse ($56.65)");
			button5= new JButton(" Cabin Tale ($98.99)");
			button6= new JButton(" The Little Dog ($76.44)");
			done= new JButton("Done");
			panel1.add(button1);
			panel1.add(button2);
			panel1.add(button3);
			panel1.add(button4);
			panel1.add(button5);
			panel1.add(button6);
			panel1.add(done);		
			panel1.setLayout(new GridLayout(3,2));//first number moves button up
			frame.add(panel1, BorderLayout.SOUTH);
		    Random number= new Random(396475909);
			frame.setBackground(new Color(number.nextInt()));
		    frame.setSize(700,200);//x,y coordinates
		    frame.setVisible(true);
			
			button1.addActionListener(this);
			button1.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					setBelongings(getBelongings()+"All Passion Spent ($21.00) \n");
					setTotalCost(getTotalCost()+21.00);
				}
			});
			button2.addActionListener(this);
			button2.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					setBelongings(getBelongings()+"Antic Hay  ($45.00) \n");
					setTotalCost(getTotalCost()+45.00);
				}
			});
			button3.addActionListener(this);
			button3.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					setBelongings(getBelongings()+"If Not Now, When? ($13.00) \n");
					setTotalCost(getTotalCost()+13.00);
				}
			});
			button4.addActionListener(this);

			button4.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					setBelongings(getBelongings()+"I Will Fear No Evil ($22.00) \n");
					setTotalCost(getTotalCost()+22.00);
				}
			});
			button5.addActionListener(this);

			button5.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					setBelongings(getBelongings()+"It's a BattleField ($43.00) \n");
					setTotalCost(getTotalCost()+43.00);
				}
			});
			button6.addActionListener(this);
			button6.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					setBelongings(getBelongings()+"For Whom the Bell Tolls ($13.00) \n");
					setTotalCost(getTotalCost()+13.00);
				}
			});
			done.addActionListener(this);
			done.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{

				}
			});
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource()==button1 ||e.getSource()==button2 || e.getSource()==button3
					||e.getSource()==button4||e.getSource()==button5||e.getSource()==button6)
			{

			}
			else 
			{
				Total cost = new Total();
			}
		}
	}