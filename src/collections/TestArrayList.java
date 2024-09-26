package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestArrayList {
public static void main(String[] args) {
// Create and initialize a countries_list
	 List<String> countriesList = new ArrayList<>();
     countriesList.add("Canada");
     countriesList.add("Brazil");
     countriesList.add("Germany");
     countriesList.add("Australia");
  // display the size of a the countries_list
     System.out.println("Size of countries list: " + countriesList.size());
  // Display the elements of the countries_list
     displayList(countriesList);

     // Modify a list entry (changing "India" to "Brazil")
     countriesList.set(1, "Brazil");
     System.out.println("\nAfter modifying the list:");
     displayList(countriesList);

     // Sort countries_list in ascending order
     Collections.sort(countriesList);
     System.out.println("\nAfter sorting in ascending order:");
     displayList(countriesList);

     // Clear the list
     countriesList.clear();
     System.out.println("\nAfter clearing the list:");
     System.out.println("Size of countries list: " + countriesList.size());
 }

 // Method to display the elements of the list
 private static void displayList(List<String> list) {
     for (String country : list) {
         System.out.println(country);
     }
 }

}
