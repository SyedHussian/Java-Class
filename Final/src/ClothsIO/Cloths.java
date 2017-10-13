package ClothsIO;

import java.text.NumberFormat;
public class Cloths 
{

	
		// TODO Auto-generated method stub
// the instance variables
		private String code;
		private String description;
		private double price;
		
		public Cloths() 
		{
			code ="";
			description ="";
			price = 0;
		}
		
		
		
		public void setCode(String code) 
		{
			this.code = code;
		}
		
		public String getCode() 
		{
			return code;
		}
		
		
		public void setDescription(String description)
		{
			this.description = description;
		}
		
		public String getDescription()
		{
			return description;
		}
		
		
				public void setPrice(double price)
				{
					this.price = price;
				}
				
				public double getPrice()
				{
					return price;
				}
				
				
				public String getPriceFormatted()
				{
					NumberFormat currency = NumberFormat.getCurrencyInstance();
					String priceFormatted = currency.format(price);
					return priceFormatted;
				}
				
		
		
	}



