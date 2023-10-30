// Java - Hard

// TODO: Given an array of integers, write a Java program to find the frequency of each element using a Map

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 4, 5, 6, 4, 7, 8, 9, 7, 8, 1};

        // Create a Map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and update the frequency in the map
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                // If the number is already in the map, increment its frequency
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the number is not in the map, add it with a frequency of 1
                frequencyMap.put(num, 1);
            }
        }

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}
