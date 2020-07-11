package Entites;

public class CurrencyConvert {
	
	public static double priceDolar;
	
	public static double boughtDolar (double dolar) {
		
		
		double real = priceDolar*dolar*(1.06);
				
		return real;		
		
	}

}
