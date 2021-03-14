
import java.util.*;
  
     
public class Waitress {
	ArrayList<Menu> menus;
     
  
	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}
   
	public void printMenu() {
		Iterator<?> menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			printMenu(menu.createIterator());
		}
	}
   
	int count=1;
	void printMenu(Iterator<?> iterator) {
		
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print("Menu Item "+count+":"+menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " ------ ");
			System.out.println();
			System.out.println("Description: " + menuItem.getDescription()+ "\n");
			count+=1;
		}
	}
}