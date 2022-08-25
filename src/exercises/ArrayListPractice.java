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

    public static void main(String[] args) {
        int[] ArrayList = {1, 3, 4, 2, 3, 1, 4, 3, 2, 3,};
        Integer sum = ArrayListPractice.sumEven(ArrayList);
        System.out.println(sum);
    }
};

