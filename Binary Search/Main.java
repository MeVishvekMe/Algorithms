class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearchIterative(arr, 10));
    }

    public static boolean binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int middle = (left + right) / 2;

        while(left <= right) {
            if(arr[middle] == target) {
                return true;
            }
            else if(target > arr[middle]) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
            middle = (left + right) / 2;
        }
        return false;
    }

    public static boolean binarySearchRecursive(int[] arr, int target, int left, int right) {
        if(left > right || right < left) {
            return false;
        }
        int middle = (left + right) / 2;
        if(arr[middle] == target) {
            return true;
        }
        else if(target > arr[middle]) {
            binarySearchIterative(arr, target, middle + 1, right);
        }
        else {
            right = middle - 1;
        }
        middle = (left + right) / 2;
    }
}