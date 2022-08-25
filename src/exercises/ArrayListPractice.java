package exercises;

public class ArrayListPractice {
    public static int sumEven(int[] arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static <str> void printFive(String[] wordArray) {
        for (String str : wordArray) {
            if (str.length() == 5) {
                System.out.print(str);
            }
        }
    }
};