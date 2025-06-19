package Bit_Manipulation;

import java.util.HashMap;

/*
136. Single Number
Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
Example 3:
Input: nums = [1]
Output: 1
 */
public class LC136 {
    public static void main(String[] args) {
        int[] nums={2,2,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int s=0;
        for(int i:map.keySet()){
            if(map.get(i)==1){
                s=i;
                break;
            }
        }
        System.out.println(s);
    }
}
