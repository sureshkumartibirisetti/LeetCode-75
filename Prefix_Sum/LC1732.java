package Prefix_Sum;
/*
1732. Find the Highest Altitude
Example 1:
Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
Example 2:
Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 */
public class LC1732 {
    public static void main(String[] args) {
        int[] gain={-4,-3,-2,-1,4,3,2};
        int res=0;
        int temp=0;
        for(int i:gain){
            temp+=i;
            if(res<temp){
                res=temp;
            }
        }
        System.out.println(res);
    }
}
