package principal;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Storage for products
        ArrayList<String> inventario = new ArrayList<>();

        // 2. Add products
        inventario.add("Laptop");
        inventario.add("Mouse");
        inventario.add("Keyboard");
        inventario.add("Monitor");
        System.out.println("Current Inventory: " + inventario);

        // 3. Remove products (e.g., removing 'Mouse')
        if (inventario.contains("Mouse")) {
            inventario.remove("Mouse");
            System.out.println("Removed: Mouse");
        }

        // 4. Sort the list alphabetically
        Collections.sort(inventario);
        System.out.println("Sorted Inventory: " + inventario);

        // 5. Show total product count
        System.out.println("Total products in stock: " + inventario.size());
	}

}
