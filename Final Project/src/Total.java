//import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.TextArea;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Total extends prices
{
	public static JPanel panel2, panel1;
	public static JFrame f;
	public static JTextField textbox;
	@SuppressWarnings("deprecation")
	public  Total()
	{
		f = new JFrame("TextArea Example");
        f.setLayout(new BorderLayout());

        // text area created, set its font and color, then added to the frame
        TextArea text = new TextArea("CASH RECIEPT \n"+Time.fullDate()+" \n "+getBelongings()+"\n SubTotalCost "+getTotalCost()
				+"\n Tax "+getTax()+" Total "+(getTotalCost()+getTax())+"\n Thanks for shopping and have a nice day!!"
				+"\n ((You can also Click on reciept file to view reciept)");
        Font font = new Font("Serif", Font.ITALIC, 20);
        text.setFont(font);
        text.setForeground(Color.BLACK);
        f.add(text, BorderLayout.CENTER);
       
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Listen for the user to click the frame's close box
        f.setSize(600, 400);
        f.show();//displays on window
		reciept r=new reciept();
		r.startreciept();
		String  recieptFile="reciept.txt";
		PrintWriter textStream =Total.createTextWrite(recieptFile);
		{	
			textStream.println("CASH RECIEPT \n"+Time.fullDate()+" \n "+getBelongings()+"\n SubTotalCost "+getTotalCost()
					+"\n Tax "+getTax());			
			textStream.println(" Total "+(getTotalCost()+getTax())+"\n Thanks for shopping and have a nice day!!");
		}
		textStream.close(); // did not require error handling
		Scanner scanFile = Total.createTextRead(recieptFile);// scan a file
		scanFile.close();		
	}
	public void printreciept()
	{
		String  recieptFile="reciept.txt";
		PrintWriter textStream =Total.createTextWrite(recieptFile);
		{	//
			textStream.println("CASH RECIEPT \n"+Time.fullDate()+" \n "+getBelongings()+"\n SubTotalCost "+getTotalCost()
					+"\n Tax "+getTax());			
			textStream.println(" Total "+(getTotalCost()+getTax())+"\n Thanks for shopping and have a nice day!!");
		}
		textStream.close(); // did not require error handling
		Scanner scanFile = Total.createTextRead(recieptFile);// scan a file
		scanFile.close();
		System.exit(0);
	}
	private static Scanner createTextRead(String b)
	{
		Scanner textFile = null;
		try
		{
			textFile = new Scanner(new FileInputStream(new File(b)));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found "+b.toString());
			System.out.println("or could not be opened."+b.toString());
		}
		return textFile;
	}
	private static PrintWriter createTextWrite(String b)
	{
		PrintWriter TStream = null;
		try
		{
			TStream = new PrintWriter(new FileOutputStream(b));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file in createTextWrite "+b.toString());
			System.exit(0);
		}
		return TStream;
	}
}