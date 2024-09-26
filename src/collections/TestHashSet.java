package collections;
import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        // Create and initialize a countriesSet
        Set<String> countriesSet = new HashSet<>();
        countriesSet.add("Canada");
        countriesSet.add("Germany");
        countriesSet.add("India");
        countriesSet.add("Australia");

        // Display the size of the countriesSet
        System.out.println("Size of countries set: " + countriesSet.size());

        // Display the elements of the countriesSet
        displaySet(countriesSet);

        // Modify Germany by removing it and adding Tunisia
        if (countriesSet.contains("Germany")) {
            countriesSet.remove("Germany");
            countriesSet.add("Tunisia");
        }

        System.out.println("\nAfter modifying the set:");
        displaySet(countriesSet);

        // Clear the set
        countriesSet.clear();
        System.out.println("\nAfter clearing the set:");
        System.out.println("Size of countries set: " + countriesSet.size());
    }

    // Method to display the elements of the set
    private static void displaySet(Set<String> set) {
        if (set.isEmpty()) {
            System.out.println("The set is empty.");
        } else {
            for (String country : set) {
                System.out.println(country);
            }
        }
    }
}
