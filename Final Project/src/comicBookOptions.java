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

public class comicBookOptions extends prices implements ActionListener
{	
	public static BorderLayout Layout; 
	public static JFrame frame;
	public static JButton button1, button2, button3, button4, button5, button6,done;
	public static JPanel panel1, panel2;

	public comicBookOptions()
	{
		panel1= new JPanel();
		panel2= new JPanel();
		frame = new JFrame(" comicbooks ");
		frame.setSize(new Dimension(400,400));

		panel2.setLayout(new GridLayout(3,2));//first number moves button up
		frame.add(panel2, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1= new JButton("Superman ($24.10)");
		button2= new JButton("Avengers  ($24.00)");
		button3= new JButton("Daredvil ($13.00)");
		button4= new JButton("Captian America ($22.00)");
		button5= new JButton("Dead Pool ($43.00)");
		button6= new JButton("Iron Man ($15.00)");
		done= new JButton("Done");
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(done);

	    Random number= new Random(396475909);
		 //System.out.println(number.nextInt());
		frame.setBackground(new Color(number.nextInt()));
	    frame.setSize(500,200);
	    frame.setVisible(true);
	    
		button1.addActionListener(this);
		button1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings(Belongings+"Superman ($24.10) \n");
				setTotalCost(getTotalCost()+24.10);
			}
		});
		button2.addActionListener(this);
		button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings(Belongings+"Avengers  ($24.00) \n");
				setTotalCost(getTotalCost()+24.00);
			}
		});
		button3.addActionListener(this);
		button3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings("Daredvil ($13.00) \n");
				setTotalCost(getTotalCost()+13.00);
			}
		});
		button4.addActionListener(this);

		button4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings("Captian America ($22.00) \n");
				setTotalCost(getTotalCost()+22.00);
			}
		});
		button5.addActionListener(this);

		button5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings("Dead Pool ($43.00) \n");
				setTotalCost(getTotalCost()+43.00);
			}
		});
		button6.addActionListener(this);
		button6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setBelongings("Iron Man ($15.00) \n");
				setTotalCost(getTotalCost()+15.00);
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