package duke.choice;

public class ShopApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Duke Choice Shop");
		
		Customer c1 = new Customer();
		
		c1.name = "Pinky";
		
		System.out.println("Customer is " + c1.name);
		
		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();
		
		item1.description = "Blue Jacket";
		item1.price = 20.9;
		item1.size = "M";
		
		item2.description = "Orange T-Shirt";
		item2.price = 10.5;
		item2.size = "S";

		//items[2].description ="Green Scarf"
		//items[2].price = 5
	//	items[2].size = "S";
	//	items[3].description ="Blue T-Shirt"
	//	items[3].price = 10.5
		//items[3].size = "S";
		
				

	//	items[3].description ="Blue T-Shirt";
	//	items[3].price = 10.5;
//		items[3].size = "S";


		int measurement = 3; 

		switch (measurement) {
			case 1, 2, 3: 
					c1.size = "S";
					break;
			case 4, 5, 6:
					c1.size ="M";
					break;
			case 7, 8, 9:
					c1.size ="L";
					break;
			default :
					c1.size = "X";
				}

	//for (Clothing item: items) {
	//				if (c1.size.equals(item.size)) {
	//				total = total + item.price;
	//				System.out.println("Item " + "," + item.description + "," + item.price + "," + item.size);
	//				if (total > 15) { break; }
	}

	//			System.out.println("Total = " + total);


	}

//}//
