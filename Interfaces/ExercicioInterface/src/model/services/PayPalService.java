package model.services;

public class PayPalService implements OnlinePaymentService{
	
	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTERST = 0.01;
	
	@Override
	public double paymentFree(double amount) {
		return amount * FEE_PERCENTAGE;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * MONTHLY_INTERST * months;
	}

}
