import java.util.ArrayList;
import java.util.Iterator;

public class ParathaHouse implements Menu {
	ArrayList<MenuItem> menuItems;
 
	public ParathaHouse() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("Aloo Paratha", 
			" Aloo Paratha made with Stuffed Bread and mashed potatoes and comes with Raita(yogurt, mint, black pepper, and salt), and Pickle", 
			true,
			4.99);
 
		addItem("Onion Paratha", 
			"Onion Paratha made with Stuffed Bread and Onion and comes with  Raita(yogurt, mint, black pepper, and salt), and Pickle", 
			false,
			4.99);
 
		addItem("Paneer Paratha",
			"Paneer Paratha made with Stuffed Bread and Cottage Cheese, and comes with  Raita(yogurt, mint, black pepper, and salt), and Pickle",
			true,
			5.99);
 
		addItem("Mixed Vegetable Paratha",
			"Mixed Vegetable made with your choice of vegetables and comes with  Raita(yogurt, mint, black pepper, and salt), and Pickle ",
			true,
			4.99);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
  
	// other menu methods here
}