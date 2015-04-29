import java.util.Calendar;
import java.util.Date;


abstract class Time 
{ 
	public static Date c;
	public static Date fullDate()
	{//callender class will give date month and year
		Calendar date= getDate();
		  c = date.getTime();
		 return c;
	}
	
	public static Calendar getDate()
	{// it also gives the time
	     Calendar rightNow = Calendar.getInstance();
		return rightNow;
	}
}