package dsandalgo.sorting;

public class _5MergeSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(array,0,array.length);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mergeSort(int[] array, int startIndex, int endIndex) {
        if(endIndex - startIndex < 2) {
            return; // This means we have created 1-element arrays
        }
        int mid = (startIndex + endIndex) / 2;
        mergeSort(array,startIndex,mid);
        mergeSort(array,mid,endIndex);
        merge(array,startIndex,mid,endIndex);
    }

    public static void merge(int[] array, int start, int mid, int end) {
        /**
         * This means that the last element in the left array less than first element in the right array
         *  Then simply dont do anything. At the end, both arrays have to be copied to temp array and copied back
         *  to original array. We can avoid all that work by optimizing the code
         */
        if(array[mid-1] < array[mid]) {
            return;
        }
        int i = start; // Index to traverse left array
        int j = mid; // Index to traverse the right array
        int tempIndex = 0; // Index to traverse temp array
        int tempArray[] = new int[end-start]; // temp array with the size to hold sibling arrays
        while(i < mid && j < end) {
            tempArray[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        // 2nd optimization comes here
        /**
         * If you have elements in the right array, we dont need to anything as all the elements in the temp array are
         * less than right array. It is unnecessary to copy them to temp array and then back into actual array
         */
        // This will copy the remaining left array elements directly into actual array
        System.arraycopy(array, i, array, start+ tempIndex, mid - i);
        // This will copy the temp array into actual array
        System.arraycopy(tempArray, 0, array, start, tempIndex);
    }
}
