Objective
Today, we're getting started with Exceptions by learning how to parse an integer from a string and print a custom error message. Check out the Tutorial tab for learning materials and an instructional video!

Task
Read a string S, 

and print its integer value; if S cannot be converted to an integer, print Bad String.

Note: You must use the String-to-Integer and exception handling constructs built into your submission language. If you attempt to use loops/conditional statements, you will get a 0 score.

Input Format

A single string, S.

Output Format

Print the parsed integer value of S, or Bad String if S cannot be converted to an integer.

Sample Input 0

3
Sample Output 0

3
Sample Input 1

za
Sample Output 1

Bad String

Code:
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        try{
        int value = Integer.parseInt(S);
        System.out.println(value);
        }
        catch(Exception e)
        {
            System.out.println("Bad String");
        }

        bufferedReader.close();
    }
}
