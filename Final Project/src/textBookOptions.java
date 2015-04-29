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

//import Parabola.GraphPanel;

public class textBookOptions extends prices implements ActionListener
{
	public static BorderLayout Layout; 
	public static JFrame frame;
	public static JButton button1, button2, button3, button4, button5, button6,done;
	public static JPanel panel1, panel2;
	
	
	public textBookOptions()
	{
		panel1= new JPanel();
		panel2= new JPanel();
		frame = new JFrame(" textBooks ");
		frame.setLayout(new BorderLayout());
		frame.setSize(new Dimension(600,400));
		panel1.setLayout(new GridLayout(2,2));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1= new JButton("Calculus ($37.00)");
		button2= new JButton("Calculus 2 ($44.00)");
		button3= new JButton("Statistics ($29.00)");
		button4= new JButton("History ($15.00)");
		button5= new JButton("Health ($44.00)");
		button6= new JButton("Biology ($55.00)");
		done= new JButton("Done");

		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		panel1.add(button6);
		panel1.add(done);
		frame.add(panel1, BorderLayout.CENTER);
		
		Random number= new Random(396475909);
		 //System.out.println(number.nextInt());
		frame.setBackground(new Color(number.nextInt()));
		
		frame.setVisible(true);
		frame.setLocation(600,200);//(x,y) coordinates
		button1.addActionListener(this);
		button1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings(Belongings+"Calculus ($37.00) \n");
				prices.setTotalCost(prices.getTotalCost()+37.00);

			}
		});
		button2.addActionListener(this);
		button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings(Belongings+"Calculus 2 ($44.00) \n");
				prices.setTotalCost(prices.getTotalCost()+44.00);
			}
		});
		button3.addActionListener(this);
		button3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings(Belongings+"Statistics ($29.00) \n");
				prices.setTotalCost(prices.getTotalCost()+29.00);
			}
		});
		button4.addActionListener(this);

		button4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings(Belongings+"History ($15.00) \n");
				prices.setTotalCost(prices.getTotalCost()+15.00);
			}
		});
		button5.addActionListener(this);

		button5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings(Belongings+"Health ($44.00) \n");
				prices.setTotalCost(prices.getTotalCost()+44.00);
			}
		});
		button6.addActionListener(this);
		button6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings(Belongings+"Biology ($55.00) \n");
				prices.setTotalCost(prices.getTotalCost()+55.00);
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