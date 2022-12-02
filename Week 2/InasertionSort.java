public class InasertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 10, 5, 3, 8, 4, 7, 9, 6};
        Sort(arr);
        for (int j : arr) System.out.print(j + " ");
    }

    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
