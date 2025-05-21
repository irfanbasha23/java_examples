package leetcode;

public class _5FirstNonRepeatingElement {


        public static int findFirstNonRepeating(int[] arr) {
            int n = arr.length;

            // Step 1: Initialize an array to store the frequency of each element.
            // Assuming the elements are within a small range (e.g., 0 to 1000),
            // you can use a fixed-size array. Otherwise, use a larger size or
            // consider the max element in the list.
            int[] frequency = new int[1001];

            // Step 2: Populate the frequency array.
            for (int i = 0; i < n; i++) {
                frequency[arr[i]]++;
            }

            // Step 3: Find the first non-repeating element.
            for (int i = 0; i < n; i++) {
                if (frequency[arr[i]] == 1) {
                    return arr[i];
                }
            }

            return -1; // Return -1 if no non-repeating element is found.
        }

        public static void main(String[] args) {
            int[] arr = {4, 5, 1, 2, 0, 4, 1, 5, 2, 0};
            int result = findFirstNonRepeating(arr);
            if (result != -1) {
                System.out.println("The first non-repeating element is: " + result);
            } else {
                System.out.println("No non-repeating element found.");
            }
        }
    }

