public class CountPairsOfSumWithoutHash {

    public static int countPairsWithoutHash(int[] arr, int targetSum) {
        int count = 0;
        int arrSize = arr.length;

        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    count++;
                }
            }
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

        int pairsCount = countPairsWithoutHash(array, targetSum);
        System.out.println("Pairs with sum " + targetSum + ": " + pairsCount + " pairs");

        int num1 = 5;
        int num2 = 8;
        swapNumbersWithoutThirdVar(num1, num2);
    }
}
