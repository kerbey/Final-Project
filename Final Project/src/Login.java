import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame 
{
	Scanner input= new Scanner(System.in);
	String userPassword, Input="";
	public JPanel buttonPanel, textPanel;
	JButton JButtonNumber, enter, clear;
	public JFrame frame;
	JTextField textbox;
	int chances=1, button=0;
	JPasswordField MainPassword= new JPasswordField(4);
	StringBuilder enterPassword= new StringBuilder("");
	public  class buttonAction implements ActionListener 
	{
		public buttonAction()
		{
			buttonPanel= new JPanel();
			textPanel= new JPanel();
			frame = new JFrame("Login");
			frame.setLayout(new BorderLayout());
			frame.setSize(new Dimension(300,300));
			buttonPanel.setLayout(new GridLayout(3,2));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Random colorNumber= new Random(396475909);
			 //System.out.println(number.nextInt());
			frame.setBackground(new Color(colorNumber.nextInt()));
			
			textbox= new JTextField(20);
			MainPassword.setFont(new Font(" MS San Serif", Font.BOLD, 17));

			textPanel.add(textbox);
			for (int number=1;number<=9;number++)
			{
				JButtonNumber= new JButton(number+"");
				JButtonNumber.setBackground(Color.BLACK);
				JButtonNumber.setForeground(Color.BLACK);
				JButtonNumber.addActionListener(this);
				JButtonNumber.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						Input+=((JButton)e.getSource()).getText();
						textbox.setText(Input);
					}
				});
				buttonPanel.add(JButtonNumber);
			}
			JButtonNumber= new JButton(0+"");
			JButtonNumber.addActionListener(this);
			JButtonNumber.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					Input+=((JButton)e.getSource()).getText();
					textbox.setText(Input);
					System.out.println(Input);
				}

			});
			buttonPanel.add(JButtonNumber);
			new clearAction();
			frame.setLocation(600,200);

			frame.add(buttonPanel, BorderLayout.CENTER);
			frame.add(textPanel, BorderLayout.NORTH);
			enterAction action = new enterAction();
			frame.setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		}
		public class enterAction implements ActionListener  
		{
			public enterAction()
			{
				enter= new JButton("enter");

				buttonPanel.add(enter);

				enter.addActionListener(this);
				enter.addActionListener(new ActionListener()
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
				if(e.getSource()==enter)
				{
					userPassword= textbox.getText();
					if (Authentication(userPassword))//takes the users password and compares it to
					{//the other password and if they are the same the welcome window appears 
						JOptionPane.showMessageDialog(null, "welcome");
						purchaseOptions purchase= new purchaseOptions();
						purchase.purchaseOption();
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "wrong password");//if not the wrong password window appears
						if (chances<3)
						{
							Login atm= new Login();
							chances ++;
						}
						else
						{
							System.exit(0);
						}
					}
				}
			}
		}
		public class clearAction implements ActionListener
		{
			public clearAction()
			{
				clear= new JButton("clear");		
				buttonPanel.add(clear);
				clear.addActionListener(this);
				clear.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
					}
				});
			}		
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==clear)
				{
					Input = "";
					textbox.setText("");//clears text box
				}
			}
		}
		public boolean Authentication(String userPassword)
		{
			String Password= "2323";
			return (userPassword.equals(Password));	
		}
	}
}
