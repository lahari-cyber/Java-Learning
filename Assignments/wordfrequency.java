import java.util.HashMap;

public class wordfrequency {
    public static void main(String[] args) {

        String text = "Java is easy Java is powerful Java";

        String[] words = text.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Word Frequency:");
        System.out.println(map);
    }
}
// Sentence to count the frequency of each word

// Split the sentence into individual words

// Create a HashMap
// Key = Word
// Value = Frequency (count)

// Go through each word one by one

// Check if the word is already in the HashMap

// If the word exists, increase its count by 1

// If the word does not exist, add it with count 1

// Print the heading

// Print the HashMap containing each word and its frequency