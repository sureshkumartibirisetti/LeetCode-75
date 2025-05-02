package Array_String;
/*
1768. Merge Strings Alternately
Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d
 */
public class LC1768 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        String word1="ab";
        String word2="pqrs";
        int i=0,j=0,a=word1.length(),b=word2.length();
        while(i<a || j<b){
            if(i<a){
                sb.append(word1.charAt(i++));
            }
            if(j<b){
                sb.append(word2.charAt(j++));
            }
        }
        System.out.println(sb);
    }
}
