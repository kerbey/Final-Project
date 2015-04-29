import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
public class MainClass 
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame("Start Button");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JButton button = new JButton("Press This Button To Start.");
		Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 0);
		Font newFont = myFont.deriveFont(50F);
		button.setFont(newFont);
		

		Random number= new Random(396475909);
		 //System.out.println(number.nextInt());
		f.setBackground(new Color(number.nextInt()));
		f.add(button, BorderLayout.CENTER);
		f.setSize(600, 200);
		f.setLocation(300, 300);
		f.setVisible(true);
		button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				Login atm= new Login();
				Login.buttonAction button = atm.new buttonAction();
			}		
		});
	}
}