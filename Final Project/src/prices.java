
public class prices
{
		private static double TotalCost;static String Belongings=""; static double Tax=5.43;
		static String recieptChoice="";
		public static String getRecieptChoice()
		{
			return recieptChoice;
		}
		public static void setRecieptChoice(String recieptChoice)
		{
			prices.recieptChoice = recieptChoice;
		}
		public static double getTax()
		{
			return Tax;
		}
		public static void setTax(double tax)
		{
			Tax = tax;
		}
		public static double getTotalCost()
		{
			return TotalCost;
		}
		public static void setTotalCost(double totalCost)
		{
			TotalCost = totalCost;
		}
		public static String getBelongings()
		{
			return Belongings;
		}
		public static void setBelongings(String belongings)
		{	
			Belongings = belongings;
		}	
		
}