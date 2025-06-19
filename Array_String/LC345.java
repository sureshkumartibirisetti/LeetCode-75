package Array_String;

import java.util.Arrays;

/*
345. Reverse Vowels of a String
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
Example 2:
Input: s = "leetcode"
Output: "leotcede"
 */
public class LC345 {
    public static void main(String[] args) {
        String s="IceCreAm";
        String[] arr=s.split("");
        int i=0;
        int j=arr.length-1;
        while(i<j){
            String s1="aeiouAEIOU";
            if(s1.contains(arr[i]) && s1.contains(arr[j])){
                String temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            if(!s1.contains(arr[i])){
                i++;
            }if(!s1.contains(arr[j])){
                j--;
            }

        }
        System.out.println(String.join("",arr));
    }
}
