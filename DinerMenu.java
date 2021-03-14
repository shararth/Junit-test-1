import java.util.Iterator;

public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 30;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("Vegetarian Curry",
				"Potatoes,garlic, red peppers, green peppers, tomatoes, onions, lettuce & tomato ", true, 12.99);
			addItem("Bindi(Okra) Masala",
				"Okra with onion, tomato, garlic & ginger", false, 10.99);
			addItem("Curry of the day",
				"Curry of the day, Chicken Curry with a side of Chicken Pakora", false, 13.99);
			addItem("Samosa Chat",
				"A Samosa Chat, with Chutney, onions, yogurt",
				false, 7.99);
			addItem("Steamed Veggies and Brown Rice",
				"Steamed vegetables over brown rice", true, 5.99);
			addItem("Chicken 65",
				"Chicken with Vinegar, and a Garlic Naan(Bread)",
				true, 15.99);
			addItem("Chole Batoore",
					"Curry of Chickpeas and fried bread",
					true, 10.99);
			addItem("Bhel Puri",
					"Mixture of various snacks with chopped onion, tomato, mashed potato, and sauce on top",
					true, 3.99);
			addItem("Butter Chicken",
					"Chicken with Butter, Vinegar, sauces, and a Garlic Naan(Bread)",
					true, 10.99);
			addItem("Chicken Tikka",
					"Grilled Chicken with Lemon, and a Garlic Naan(Bread)",
					true, 11.99);
			addItem("Pav Bhaji",
					"Made with various vegetables in a curry form with butter, and comes with two buns",
					true, 7.99);
			addItem("Gajar Halwa",
					"Mashed carrots with jaggery and dry fruits",
					true, 3.99);
			addItem("Rasmalai",
					"Cottage Cheese made in sugary milk",
					true, 4.99);
			addItem("Bengali Chum Chum",
					"Cottage Cheese made in sugary water",
					true, 5.99);
			addItem("Kaju Katli",
					"Sweet made with Cashew and dry fruits",
					true, 2.99);
			addItem("Mountain Dew",
					"",
					true, 1.49);
			addItem("Pepsi",
					"",
					true, 1.49);
			addItem("Root Beer",
					"",
					true, 1.49);
			addItem("Fanta",
					"",
					true, 1.49);
	}
  
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
		//return new AlternatingDinerMenuIterator(menuItems);
	}
 
	// other menu methods here
}