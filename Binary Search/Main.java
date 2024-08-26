class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearchIterative(arr, 3));
        System.out.println(binarySearchRecursive(arr, 3, 0, arr.length - 1));
    }

    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int middle = (left + right) / 2;

        while(left <= right) {
            if(arr[middle] == target) {
                return middle;
            }
            else if(target > arr[middle]) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
            middle = (left + right) / 2;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        int middle = (left + right) / 2;
        if(left > right || right < left) {
            return -1;
        }
        if(arr[middle] == target) {
            return middle;
        }
        else if(target > arr[middle]) {
            return binarySearchRecursive(arr, target, middle + 1, right);
        }
        else {
            return binarySearchRecursive(arr, target, left, middle - 1);
        }
    }
}