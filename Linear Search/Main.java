class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(linearSearch(arr, 20));
        
    }

    public static boolean linearSearch(int[] arr, int target) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] == target) {
                return true;
            }
            i++;
        }
        return false;
    }
}