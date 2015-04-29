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

public class reciept extends JPanel {

  public void paint(Graphics g) {
    Dimension d = this.getPreferredSize();
    int fontSize = 20;

    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
     
    g.setColor(Color.BLACK);
    
    g.drawString("Would you like a reciept printed out reciept(on file)?", 55, 22);//first number moves string right second moves it up
  }

  public void startreciept()
  {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new reciept());//adds class's activity to the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton yesButton=new JButton("Yes");
    yesButton.addActionListener(new ActionListener()
    {
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Total t = new Total();
			t.printreciept();
		}
    });
    JButton NoButton=new JButton("No");
    NoButton.addActionListener(new ActionListener()
    {
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
    });
    JPanel panel2= new JPanel();
    JPanel panel1= new JPanel();
   
    
	panel2.setLayout(new GridLayout(2,2));//first number moves button up
	frame.add(panel2, BorderLayout.SOUTH);
	panel2.add(yesButton);
    panel2.add(NoButton);
    Random number= new Random(396475909);
	 //System.out.println(number.nextInt());
	frame.setBackground(new Color(number.nextInt()));
    frame.setSize(600,200);
    frame.setVisible(true);
  }
}