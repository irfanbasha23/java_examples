package dsandalgo.sorting;

public class _2SelectionSort {

    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for(int lastUnsortedArrIndex = array.length - 1; lastUnsortedArrIndex > 0; lastUnsortedArrIndex--) {
            int largestIndex = 0;
            int i = 1;
            while(i <= lastUnsortedArrIndex) {
                if(array[i] > array[largestIndex]) {
                    largestIndex = i;
                }
                i++;
            }
            swap(array,largestIndex,lastUnsortedArrIndex);
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
