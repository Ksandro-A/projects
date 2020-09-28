package invoicee;

public class Item {
	private String partDescription;
	private String partType;
	private double partPrice;
	private int partYearProduction;
	private String partCapacity;
	private String partProcessing;
	
	//constructor of Item class
	Item(String partDescription, String partType, double partPrice, int partYearProduction, String partCapacity, String partProcessing){
		this.partDescription = partDescription;
		this.partType = partType;
		this.partPrice = partPrice;
		this.partYearProduction = partYearProduction;
		this.partCapacity = partCapacity;
		this.partProcessing = partProcessing;
	}
	
	
	
	// getters and setters
	
	public void setPartDescription(String desc) {
		partDescription = desc;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	
	
	public void setPartType(String pType) {
		partType = pType;
	}
	
	public String getPartType() {
		return partType;
	}
	
	
	
	
	public void setPartPrice(double  pPrice ) {
		if(pPrice > 0) {
			partPrice = pPrice;
			
		}else {
			partPrice = 0.0;
		}
		
	}
	
	public double getPartPrice() {
		return partPrice;
	}
	
	
	
	
	
	public void setPartYearProduction(int  year ) {
		partYearProduction = year;
	}
	
	public int getPartYearProduction() {
		return partYearProduction;
	}
	
	
	
	
	
	public void setpartCapacity(String   pCapacity ) {
		partCapacity = pCapacity;
	}
	
	public String getpartCapacity() {
		return partCapacity;
	}
	
	
	
	
	
	
	public void setpartProcessing(String   pProcessing ) {
		partProcessing = pProcessing;
	}
	
	public String getpartProcessing() {
		return partProcessing;
	}
	
	
		

}
