package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProducted extends Product{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UsedProducted(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return super.priceTag() + "(Manufacture date: " + sdf.format(manufactureDate) + ")";
	}
	
	
	
	
	

}
