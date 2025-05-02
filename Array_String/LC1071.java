package Array_String;
/*
1071. Greatest Common Divisor of Strings
Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""
 */
public class LC1071 {
    public static void main(String[] args) {
        String str1="ABABAB";
        String str2="ABAB";
        System.out.println(gcd(str1.length(),str2.length()));

    }
    static int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0){
            return b;
        }
        return a;
    }

}
