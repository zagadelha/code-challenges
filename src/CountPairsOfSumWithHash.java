import java.util.HashMap;
import java.util.Map;

public class CountPairsOfSumWithHash {

    public static int countPairsWithHash(int[] arr, int targetSum) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = targetSum - num;
            if (frequencyMap.containsKey(complement)) {
                count += frequencyMap.get(complement);
            }
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void swapNumbersWithoutThirdVar(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 3, 8, 5 };
        int targetSum = 10;

        int pairsCount = countPairsWithHash(array, targetSum);
        System.out.println("Pairs with sum " + targetSum + ": " + pairsCount + " pairs");

        int num1 = 5;
        int num2 = 8;
        swapNumbersWithoutThirdVar(num1, num2);
    }
}

