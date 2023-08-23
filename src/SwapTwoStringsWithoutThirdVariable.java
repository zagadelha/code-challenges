public class SwapTwoStringsWithoutThirdVariable {

    public static void main(String[] args) {

        String a = "Ana";
        String b = "Bia";
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a.concat(b);
        b = a.substring(0, a.length() - b.length());
        a = a.substring(a.length() - b.length(), a.length());
        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
