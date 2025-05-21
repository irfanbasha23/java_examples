package dsandalgo.sorting;

public class _7CountingSort {

    public static void main(String[] args) {
        int[] array = {2, 5, 4, 6, 2, 5, 7};
        int min = 1;
        int max = 7;
        int[] countingArr = new int[(max-min)+1];

        for(int i = 0; i < array.length; i++) {
            int value = array[i];
            countingArr[value-1]++;
        }
        int j = 0;
        for(int i = min; i < max; i++) {
                while(countingArr[i-min] > 0) {
                    array[j++] = i;
                    countingArr[i-min]--;
                }
            }
        printArray(array);
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
