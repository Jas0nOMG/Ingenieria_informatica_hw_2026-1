package principal;
import java.util.ArrayList;
public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ERROR 1: Raw type usage. Fixed by adding <String>.
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");

        // ERROR 2: IndexOutOfBoundsException. 
        // Index 3 does not exist (valid indices are 0, 1, 2).
        // Fixed by changing index to 2 (or checking size first).
        if (lista.size() > 3) {
            System.out.println("Element at index 3: " + lista.get(3));
        } else {
            System.out.println("Index 3 is out of bounds. Showing last element: " + lista.get(lista.size() - 1));
        }

        // ERROR 3: IndexOutOfBounds in loop.
        // The condition 'i <= lista.size()' causes an error on the last iteration.
        // Fixed: changed '<=' to '<'.
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // LOGIC NOTE: "Cuatro" is not in the list, so this does nothing, but it's valid code.
        lista.remove("Cuatro");

        // ERROR 4: Compilation Error.
        // ArrayList uses .size(), not .length().
        // Fixed: changed .length() to .size().
        System.out.println("Final size: " + lista.size());
	}

}
