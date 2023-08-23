import java.util.*;

public class RemoveDuplicatesOfList {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        System.out.println("Result using Hash: " + removeUsingHash(numbers));
    }

    private static <T> List<T> removeUsingHash(List<T> list){
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

}
