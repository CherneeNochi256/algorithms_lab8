public class ShakerSort {

    public static void shakerSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            left++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        shakerSort(arr);

        System.out.println("\nArray after sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}