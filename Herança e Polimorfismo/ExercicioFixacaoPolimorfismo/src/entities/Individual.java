package entities;

public class Individual extends TaxPayer {
	
	private Double healthSpending;

	public Individual(String name, Double income, Double healthSpending) {
		super(name, income);
		this.healthSpending = healthSpending;
	}
	
	

	public Double getHealthSpending() {
		return healthSpending;
	}



	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}



	@Override
	public Double Tax() {
		
		if (getIncome() < 20000) {
			return getIncome() * 0.15 - healthSpending * 0.5;
			
		} else {
			return getIncome() * 0.25 - healthSpending * 0.5;
		}
	}
	
	

}
