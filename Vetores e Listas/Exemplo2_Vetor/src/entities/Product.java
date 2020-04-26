package entities;

public class Product {
	
	private String name;
	private double prace;
	
	public Product(String name, double prace) {
		this.name = name;
		this.prace = prace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrace() {
		return prace;
	}

	public void setPrace(double prace) {
		this.prace = prace;
	}
	
	
	
	

}
