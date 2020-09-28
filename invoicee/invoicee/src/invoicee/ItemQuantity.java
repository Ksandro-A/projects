package invoicee;



public class ItemQuantity {
	
	private Item item;
	private int Quantity;
	

public ItemQuantity(Item it, int q) {
	this.item=it;
	this.Quantity=q;
	
}
	
	
	// set method checks condition if quantity of item = 0; 
	public void setQuantity(int Quantity) {
		if(Quantity > 0) {
			this.Quantity = Quantity;
			
		} else {
			this.Quantity = 0;
		}
		
	}
	
	public int getQuantity() {
		return Quantity;
	}
	public Item getItem() {
		return this.item;
	}

}
