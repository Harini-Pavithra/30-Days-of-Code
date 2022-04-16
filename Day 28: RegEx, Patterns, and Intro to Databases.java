Objective
Today, we're working with regular expressions. Check out the Tutorial tab for learning materials and an instructional video!

Task
Consider a database table, Emails, which has the attributes First Name and Email ID. Given N rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in @gmail.com.

Input Format
The first line contains an integer, N, total number of rows in the table.
Each of the N subsequent lines contains 2 space-separated strings denoting a person’s first name and email ID, respectively.

Constraints
2 <= N <= 30
Each of the first names consists of lower case letters [a – z] only.
Each of the email IDs consists of lower case letters [a – z], @ and  only.
The length of the first name is no longer than 20.
The length of the email ID is no longer than 50.
Output Format
Print an alphabetically-ordered list of first names for every user with a gmail account. Each name must be printed on a new line.

Sample Input

6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
Sample Output

julia
julia
riya
samantha
tanya
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
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String string = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(string);
        
        List<String> list = new ArrayList<>();
        
        for(int counter=0;counter<N;counter++)
        {
            String firstName = scan.next();
            String emailId = scan.next();
            Matcher matcher = pattern.matcher(emailId);
            if(matcher.find())
            {
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for(String name:list)
        {
            System.out.println(name);
        }
        scan.close();
    }
}
