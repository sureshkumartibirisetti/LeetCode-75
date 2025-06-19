package Bit_Manipulation;

import java.util.Arrays;

/*
338. Counting Bits
Example 1:
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 */
public class LC338 {
    public static void main(String[] args) {
        int n=5;
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            int a=Integer.bitCount(i);
            arr[i]=a;
        }
        System.out.println(Arrays.toString(arr));
    }
}
