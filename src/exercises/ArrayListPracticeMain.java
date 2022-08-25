package exercises;

import exercises.ArrayListPractice;

public class ArrayListPracticeMain {
    public static void main(String[] args) {
        int[] ArrayList = {1, 3, 4, 2, 3, 1, 4, 3, 2, 3,};
        Integer sum = ArrayListPractice.sumEven(ArrayList);
        System.out.println(sum);
        String[] wordArray = {"boat", "house", "rabbit", "chair"};
        String[] words = ArrayListPractice.printFive(wordArray);
        System.out.println(words);
    }


}
