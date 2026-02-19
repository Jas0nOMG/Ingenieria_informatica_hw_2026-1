package principal;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Declare an ArrayList<String> named 'estudiantes'
        ArrayList<String> estudiantes = new ArrayList<>();
        
        // 2. Add 3 names manually
        estudiantes.add("Ana");
        estudiantes.add("Carlos");
        estudiantes.add("Beatriz");

        // Show the list
        System.out.println("Initial student list: " + estudiantes);

        // Check if a name exists using contains()
        String searchName = "Carlos";
        if (estudiantes.contains(searchName)) {
            System.out.println(searchName + " is in the list.");
        } else {
            System.out.println(searchName + " is NOT in the list.");
        }

        // Remove a specific student
        estudiantes.remove("Ana");
        System.out.println("List after removing 'Ana': " + estudiantes);
	}

}
