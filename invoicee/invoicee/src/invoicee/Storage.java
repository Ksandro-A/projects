package invoicee;

import java.util.HashMap;
import java.util.Map;



public class Storage {
	
	
	
	
	HashMap<String, ItemQuantity> map = new HashMap<>();;
	
	
	
	// add items in Storage 
	public void addItemQuantity(Item item, int quantity) {
		
		ItemQuantity itemQuantity =new ItemQuantity(item, quantity);
				map.put(item.getPartDescription(), itemQuantity);
		}
	
	// return items if the  descriptions are  present 
	public ItemQuantity getItemQuantity(String desc) {
		for (Map.Entry<String, ItemQuantity> kv : map.entrySet()) {
		    if(kv.getKey() == desc) {
		    	return kv.getValue();
		    }
		}       return null;
	}

}

