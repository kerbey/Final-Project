import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import components.S;

//make buttons abstract

public class purchaseOptions extends JPanel implements ActionListener
{
	public static JButton button1, button2, button3, button4, button5, button6;
	public static JFrame frame;
	public static JPanel  panel2;
	public void paint(Graphics g)
	{
		int fontSize = 20;
		g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));

		g.setColor(Color.BLACK);

		g.drawString("What kinds of books would you like to buy?", 50, 22);//first number moves string right second moves it up
	}
	public void purchaseOption()
	{
		JFrame frame = new JFrame();
	    frame.getContentPane().add(new purchaseOptions());//adds other class's activity to the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    button1= new JButton("textbooks");
	    button1.addActionListener(this);

		button1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		button2= new JButton("comic books");
		button2.addActionListener(this);
		button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		button3= new JButton("storybooks");
		button3.addActionListener(this);
		button3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		button4= new JButton("novels");
		button4.addActionListener(this);
		button4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});	
		JPanel panel2= new JPanel();

		panel2.setLayout(new GridLayout(3,2));//first number moves button up
		frame.add(panel2, BorderLayout.SOUTH);
		panel2.add(button1);
	    panel2.add(button2);
	    panel2.add(button3);
	    panel2.add(button4);

	    Random number= new Random(396475909);
		 //System.out.println(number.nextInt());
		frame.setBackground(new Color(number.nextInt()));
	    frame.setSize(500,200);
	    frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==button1)
		{
			textBookOptions text= new textBookOptions();
		}
		else if (e.getSource()==button2)
		{
			comicBookOptions comic= new comicBookOptions();
		}
		else if (e.getSource()==button3)
		{
			storyBooks story= new storyBooks();
		}
		else if (e.getSource()==button4)
		{
			novels Novels= new novels();
		}
	}
}