import java.util.*;

public class RemoveDuplicatesOfArray {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 1, 2, 3, 3, 4, 5, 5};
        //System.out.println("Result using Stream: " + Arrays.toString(removeUsingStream(numbers)));
        System.out.println("Result using Hash: " + Arrays.toString(removeWithHash(numbers)));
        //System.out.println("Result not using Hash: " + Arrays.toString(removeUsingHash(numbers)));
    }

    private static int[] removeUsingStream(int[] arr){

        return Arrays.stream(arr).distinct().toArray();
    }

    private static int[] removeWithHash(int[] arr){

        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (int num : arr)
            if (uniqueElements.add(num))
                resultList.add(num);

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int countPairsWithSum(int[] arr, int targetSum) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    count++;
                }
            }
        }

        return count;
    }



}
