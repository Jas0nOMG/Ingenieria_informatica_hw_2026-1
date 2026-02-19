package principal;
import java.util.ArrayList;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Create an ArrayList of String type named 'frutas'
        ArrayList<String> frutas = new ArrayList<>();

        // 2. Add at least 5 fruits
        frutas.add("Apple");
        frutas.add("Banana");
        frutas.add("Cherry");
        frutas.add("Mango");
        frutas.add("Grape");

        // 3. Print the size of the array
        System.out.println("Size of the list: " + frutas.size());

        // 4. Print all elements using a traditional for loop
        System.out.println("\n--- Traditional For Loop ---");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }

        // Print all elements using a for-each loop
        System.out.println("\n--- For-Each Loop ---");
        for (String fruit : frutas) {
            System.out.println(fruit);
        }
	}

}
