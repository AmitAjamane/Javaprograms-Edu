
// 2.Shoping Online **********************

package com.edu27;
class  Customer {
   	int id;
	String name;
	double walletbalence;
	 String adtress;
	public Customer(int id, String name, double walletbalence, String adtress) {
		super();
		this.id = id;
		this.name = name;
		this.walletbalence = walletbalence;
		this.adtress = adtress;
	}
	
}
class Item{
	int id ;
	String name ;
	String companyName;
	double price;
	boolean isInstock;
	public Item(int id, String name, String companyName, double price, boolean isInstock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInstock = isInstock;
	}
	
}
class ShoppingWebsite{
	
	public boolean isInstock;
	public  double price,walletbalence;

	public String purchaseItem(Item i,Customer c)throws ItemOutofStockException,InsufficientBalanceException {
	 
		try {
			
		 if (i.isInstock==false ) {
			 throw new  ItemOutofStockException("Iteam is Out of stock");
			}
		 if (c.walletbalence <i.price) {
			 throw new InsufficientBalanceException("Customer wallet balance is not sufficient");

		 }
		 
		 else {
			System.out.println("Order Successful");
		 }
		 
		}catch ( ItemOutofStockException e) {
			e.printStackTrace();
		         
		}
		catch ( InsufficientBalanceException e) {
			e.printStackTrace();
	         
				}
		
		return null;
		
		
	}
	
}
class ItemOutofStockException extends Exception{

	public ItemOutofStockException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


	
}
class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}

public class Shop_Online {

	public static void main(String[] args) throws ItemOutofStockException, InsufficientBalanceException {
		// TODO Auto-generated method stub

		Customer cusDet = new Customer(927392,"steve",5000.0,"USA");
		Item iteamDet = new Item (27392,"T-Shirt","US-polo",800.0,true);
		ShoppingWebsite obj = new ShoppingWebsite();
		String out =obj.purchaseItem(iteamDet, cusDet);
		//System.out.println("Out :"+out);

	}

}
