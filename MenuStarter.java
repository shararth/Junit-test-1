
import java.util.ArrayList;

public class MenuStarter {
	public static void main(String args[]) {
		ParathaHouse parathaHouseMenu = new ParathaHouse();
		DinerMenu dinerMenu = new DinerMenu();
		ArrayList<Menu> menus = new ArrayList<Menu>();
		System.out.println("WELCOME TO INDIA GATE");
		System.out.println();
		menus.add(parathaHouseMenu);
		menus.add(dinerMenu);
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();

	}
}
