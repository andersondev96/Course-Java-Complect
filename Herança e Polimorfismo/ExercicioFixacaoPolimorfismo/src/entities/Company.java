package entities;

public class Company extends TaxPayer{
	
	private int EmployessNumber;

	public Company(String name, Double income, int employessNumber) {
		super(name, income);
		EmployessNumber = employessNumber;
	}

	public int getEmployessNumber() {
		return EmployessNumber;
	}

	public void setEmployessNumber(int employessNumber) {
		EmployessNumber = employessNumber;
	}

	@Override
	public Double Tax() {
		
		if (EmployessNumber < 10) {
			return getIncome() * 0.16;
			
		} else  {
			return getIncome() * 0.14;
		}
		
	}
	
	
	
	

}
