package invoicee;
import java.util.ArrayList;


public class Invoice {
		 
		    
		   private String partDescription;
		   double totalCost;
		   
		   ArrayList<ItemQuantity> itemQuantityList = new ArrayList<ItemQuantity>() ;
			
		   
		   public  ArrayList<ItemQuantity> getitemQuantityList(){
	        return this.itemQuantityList;
			}
		   	
		        // add items to ArrayList 
		   public  void setitemQuantityList(ItemQuantity i){
		         itemQuantityList.add(i);
				}
		   
		   	    // calculate the cost of the item 
		   public double getCostAmount(ItemQuantity itemQ) {
				  double amount = 0;
						if (itemQ.getItem().getPartPrice()<0 ) amount= 0.0;
						else {
						amount = itemQ.getQuantity() * itemQ.getItem().getPartPrice();
						     }
						totalCost +=amount;
					
					return amount;
			  }
		   
		   
		   

}
