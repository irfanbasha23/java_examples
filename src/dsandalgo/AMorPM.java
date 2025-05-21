package dsandalgo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter dtf24 = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime _12hourTime = LocalTime.parse(s,dtf);
        return _12hourTime.format(dtf24);
    }

}

public class AMorPM {
    public static void main(String[] args) throws IOException {
        Result.timeConversion("07:05:45PM");
    }
}
