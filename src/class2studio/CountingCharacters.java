package class2studio;

import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> result = new HashMap<>();
        for (char character : charactersInString) {
            if (result.containsKey(character) == true) {
                result.put(character, result.get(character) + 1);
            } else {
                result.put(character, 1);
            }
            ;
        }
        System.out.println(result);
    }
};