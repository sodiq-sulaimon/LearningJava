public class SelectionSort {
    public static void main(String args[]) {
        int [] arrExample = {4, 5, 8, 20, 2, 3, 7, 1};
        selectionSort(arrExample);
        for (int i : arrExample) {
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] arr) {
        int minIndex = 0;
        int nextSmallest;

        for (int unSortedStart = 0; unSortedStart < arr.length - 1; unSortedStart++) {
            minIndex = unSortedStart;
            for (int currentIndex = unSortedStart+1; currentIndex < arr.length; currentIndex++) {
                if (arr[currentIndex] < arr[minIndex]) {
                    minIndex = currentIndex;
                }
            }
            nextSmallest = arr[minIndex];
            arr[minIndex] = arr[unSortedStart];
            arr[unSortedStart] = nextSmallest;
        }
    }
}