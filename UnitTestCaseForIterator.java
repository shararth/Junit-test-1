import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class UnitTestCaseForIterator {

	private static final boolean True = false;

	@Test
	void test() {
		ParathaHouse parathaHouseMenu = new ParathaHouse();
		DinerMenu dinerMenu = new DinerMenu();
		ArrayList<Menu> menus = new ArrayList<Menu>();
		System.out.println("                                                   WELCOME TO INDIA GATE");
		System.out.println();
		menus.add(parathaHouseMenu);
		menus.add(dinerMenu);
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
		assertFalse(menus.contains(16));
		assertFalse(menus.isEmpty());
		assertFalse(menus.size()==26);
	}

}
