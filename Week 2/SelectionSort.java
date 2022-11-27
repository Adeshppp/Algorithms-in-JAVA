public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 10, 5, 3, 8, 4, 7, 9, 6};
        Sort(arr);
        for (int j : arr) System.out.print(j + " ");
    }

    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int small = findSmallest(arr, i);
            if (small != i) {
                int temp = arr[i];
                arr[i] = arr[small];
                arr[small] = temp;
            }
        }
    }

    public static int findSmallest(int[] arr, int a) {
        int temp = a;
        for (int i = a + 1; i < arr.length; i++) if (arr[temp] > arr[i]) temp = i;
        return temp;
    }
}
