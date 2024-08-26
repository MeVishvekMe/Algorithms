class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(linearSearchIterative(arr, 9));
        System.out.println(linearSearchRecursive(arr, 9, 0));
    }

    public static int linearSearchIterative(int[] arr, int target) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] == target) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int linearSearchRecursive(int[] arr, int target, int i) {
        if(i > arr.length || i < 0) {
            return -1;
        }
        else if(arr[i] == target) {
            return i;
        }
        return linearSearchRecursive(arr, target, i + 1);
    }
}