import java.util.HashSet;

public class CityHashSet {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> cities = new HashSet<>();

        // Add five city names to the set, ensuring at least one duplicate entry
        cities.add("New York");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("London");
        cities.add("Tokyo"); // Duplicate entry

        // Display the elements to show that duplicates are not allowed
        System.out.println("Cities in the set: " + cities);

        // Check if a particular city exists in the set
        String cityToCheck = "Paris";
        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " exists in the set.");
        } else {
            System.out.println(cityToCheck + " does not exist in the set.");
        }

        // Remove a city and display the updated set
        cities.remove("London");
        System.out.println("Updated set after removing London: " + cities);
    }
}

