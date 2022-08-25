package exercises;

import java.util.Arrays;

public class Suess {
    public static void main(String[] args) {
    String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
    String [] words = phrase.split(" ");
    System.out.println(Arrays.toString(words));
    String [] sentences = phrase.split("\\.");
    System.out.println(Arrays.toString(sentences));
    }
}
