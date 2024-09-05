import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7,2,8,4,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int i = 1;
        while(i < arr.length) {
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
            i++;
        }
    }
}