Task
Given a string, S of length N that is indexed from 0 to N-1 print its 
even-indexed and odd-indexed characters as 2 space-separated strings on a single line
 (see the Sample below for more detail).

Input Format

The first line contains an integer, T (the number of test cases).
Each line i of the T subsequent lines contain a string,S
Output

For each String S print S even-indexed characters, followed by a space, followed by S odd-indexed characters.


Sample Input

2
Hacker
Rank

Sample Output

Hce akr
Rn ak

Code:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int counter,index;
        for(counter=0;counter<N;counter++)
        {
            String value = scan.next();
            String evenString="" ,oddString = "";
            for(index=0;index<value.length();index++)
            {
            if(index==0 || index%2==0)
            {
                evenString += value.charAt(index);
            }
            else{
                oddString += value.charAt(index);
            }
            }
            System.out.println(evenString+" "+oddString); 
             
        }
        
    }
}
