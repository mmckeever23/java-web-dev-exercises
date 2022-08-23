package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String excerpt = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        String excerptLower = excerpt.toLowerCase();
        System.out.println("Enter a search term:");
        String searchedTerm = input.nextLine().toLowerCase();

        Boolean searchResult = excerptLower.contains(searchedTerm);
        System.out.println("True or false: the excerpt contains your search term: " + searchResult);

        Integer index = excerpt.indexOf(searchedTerm);
        Integer length = searchedTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String excerptMinusTerm = excerpt.replace(searchedTerm, "");
        System.out.println(excerptMinusTerm);
    }
}
