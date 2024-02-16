import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 1, 6, 3};
        int[] reveArray = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reveArray[j] = arr[i];
        }

        System.out.println(Arrays.toString(reveArray));
    }
}
