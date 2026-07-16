import java.util.HashMap;
import java.util.Scanner;

class word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Store word frequencies
        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency of each word
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Display the frequencies
        System.out.println("\nWord Frequencies:");
        for (String word : map.keySet()) {
            System.out.println(word + " = " + map.get(word));
        }

        sc.close();
    }
}
// Import HashMap to store words and their frequencies
// Import Scanner to take input from the user

// Create Scanner object to read input

// Ask the user to enter a sentence

// Read the complete sentence

// Split the sentence into words based on spaces

// Create a HashMap
// Key = Word
// Value = Frequency of the word

// Traverse through each word

// Check if the word already exists in the HashMap

// If it exists, increase its frequency by 1

// Otherwise, add the word with frequency 1

// Print the heading

// Traverse through all the words in the HashMap

// Print each word and its frequency

// Close the Scanner