Objective
Today we will learn about running time, also known as time complexity. Check out the Tutorial tab for learning materials and an instructional video.

Task
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Given a number, n, determine and print whether it is Prime or Not prime.

Note: If possible, try to come up with a O(n1/2) primality algorithm, or see what sort of optimizations you come up with for an  algorithm. Be sure to check out the Editorial after submitting your code.

Input Format
The first line contains an integer, T, the number of test cases.
Each of the T subsequent lines contains an integer, n, to be tested for primality.

Constraints
1 <= T <= 30
1 <= n <= 2 x 109
Output Format
For each test case, print whether n is Prime or Not Prime on a new line.

Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime
Code:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-- != 0)
        {
            int number = scan.nextInt();
            boolean flag=false;
            for(int counter=2;counter<=Math.sqrt(number);counter++)
            {
                if(number%counter==0)
                {
                    //System.out.println("Not prime");
                    flag =true;
                    break;
                }
            }
            if(number==1)
            {
                System.out.println("Not prime");
            }
            else if(!flag)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not prime");
            }
        }
    }
}

Day 26: Nested Logic
Objective
Today we will learn about running time, also known as time complexity. Check out the Tutorial tab for learning materials and an instructional video.

Task
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Given a number, n, determine and print whether it is Prime or Not prime.

Note: If possible, try to come up with a O(n1/2) primality algorithm, or see what sort of optimizations you come up with for an  algorithm. Be sure to check out the Editorial after submitting your code.

Input Format
The first line contains an integer, T, the number of test cases.
Each of the T subsequent lines contains an integer, n, to be tested for primality.

Constraints
1 <= T <= 30
1 <= n <= 2 x 109
Output Format
For each test case, print whether n is Prime or Not Prime on a new line.

Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime
Code:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-- != 0)
        {
            int number = scan.nextInt();
            boolean flag=false;
            for(int counter=2;counter<=Math.sqrt(number);counter++)
            {
                if(number%counter==0)
                {
                    //System.out.println("Not prime");
                    flag =true;
                    break;
                }
            }
            if(number==1)
            {
                System.out.println("Not prime");
            }
            else if(!flag)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not prime");
            }
        }
    }
}
