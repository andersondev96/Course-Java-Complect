package util;

public class CurrencyConverter {
	
	public static final double iof = 0.06;
	
	public static double convertion(double dolar, double bought ) {
		return dolar * bought + (dolar * bought)* iof;
	}
	

}
