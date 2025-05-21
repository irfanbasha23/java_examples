package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        int n = 4;
        List<String> result = generateParenthesis(n);

        // Print all generated combinations
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    public static void backtrack(List<String> result, String current, int open, int close, int max) {
// If the current string is of length 2*n, it's a valid combination
        if (current.length() == max * 2) {
            result.add(current);
            System.out.println("Done");
            return;
        }

        // If we can still add an opening parenthesis, do it
        if (open < max) {
            System.out.println("Open");
            backtrack(result, current + "(", open + 1, close, max);
        }

        // If we can add a closing parenthesis (only if open > close), do it
        if (close < open) {
            System.out.println("Close");
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}
