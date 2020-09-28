package invoicee;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceTest {

	
	public static void main(String[] args) {
		
		
		Invoice invoice = new Invoice();
		Storage s = new Storage();
		
//		         Scanner keyboard = new Scanner(System.in);
//	             System.out.println("Enter item name " );
//	             String partDescription = keyboard.next();
	            
	            // Item inserted for print if available
	            Item item=new Item("Kafe","Pije",400,2002,"11","test");	
					s.addItemQuantity(item,3);
				Item item1=new Item("Caj","Pije",400,2002,"11","test");	
					s.addItemQuantity(item1,3);
				Item item2=new Item("Fanta","Pije",400,2002,"11","test");	
					s.addItemQuantity(item2,4);
				
				

			
			// Creating an array with data that we should check if available in the storage
			ArrayList <Item> itemsCheck=new ArrayList<Item>();
			itemsCheck.add(new Item("Caj","Pije",500,2002,"11","test"));
			itemsCheck.add(new Item("CocaCola","Pije",200,2002,"11","test"));
			itemsCheck.add(new Item("Fanta","Pije",100,2002,"11","test"));
			itemsCheck.add(new Item("Uje","Pije",100,2002,"11","test"));
			itemsCheck.add(new Item("Kafe","Pije",500,2002,"11","test"));
			
			// check for condition , than add obj to ArrayList<ItemQuantity>
			for (Item it : itemsCheck) {
			ItemQuantity ItQuantity = s.getItemQuantity(it.getPartDescription());
			if (ItQuantity != null) { 	
				invoice.setitemQuantityList(ItQuantity);		
			}
			}
			
			// loop to print elements
			for (ItemQuantity itemQuan : invoice.itemQuantityList) {	
				 System.out.println("Item description: "+ 
				 itemQuan.getItem().getPartDescription()+ "\n" +"Item quantity: "+ 
				 itemQuan.getQuantity() + "\n" +"Cost: " + 
				 invoice.getCostAmount(itemQuan)
						 );
				
			}
			System.out.println("Total Cost of Items:" + invoice.totalCost);
			
	
}}
