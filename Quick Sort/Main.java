import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,20,30,8,5,22,60,15};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];

        int i = left - 1;
        int j = left;

        while(j <= right - 1) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int par = partition(arr, left, right);
            quickSort(arr, left, par - 1);
            quickSort(arr, par + 1, right);
        }
    }
}

