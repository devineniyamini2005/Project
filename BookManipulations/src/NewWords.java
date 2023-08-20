import java.util.*;

public class NewWords
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student's Article:");
        String article = scanner.nextLine();

        String[] words = article.split("[,;:.?!\\s]+");

        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); // Convert to lowercase and add to set
        }

        System.out.println("Number of words " + words.length);
        System.out.println("Number of unique words " + uniqueWords.size());

        System.out.println("The words are");
        int count = 1;
        for (String word : uniqueWords) {
            System.out.println(count + ". " + word);
            count++;
        }
    }
}