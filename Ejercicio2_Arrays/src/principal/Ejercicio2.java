package principal;
import java.util.ArrayList;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Create an ArrayList<Integer> named 'numeros'
        ArrayList<Integer> numeros = new ArrayList<>();

        // 2. Add numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        System.out.println("Original list: " + numeros);

        // 3. Change the value at index 4 to 100
        // Note: Index 4 is the 5th element
        numeros.set(4, 100);
        System.out.println("After modifying index 4: " + numeros);

        // 4. Remove the number at position 2
        // Note: Position 2 is the 3rd element (value 3)
        numeros.remove(2);

        // 5. Show the final list
	}

}
