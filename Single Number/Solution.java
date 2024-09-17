/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*/
import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer, Integer> newHash = new HashMap<Integer,Integer>(); 

        for(int i=0; i<nums.length;i++){
            if(!newHash.containsKey(nums[i])){
                System.out.println("indice do for"+ i);
                newHash.put(nums[i],1);
            }
            else{
                System.out.println("indice do for"+ i);
                newHash.put(nums[i], newHash.get(nums[i])+1);
            }
        }
        for(int j=0;j<nums.length;j++){
            System.out.println("cheguei no segundo for");
            System.out.println("nums[j]"+ nums[j]);
            System.out.println(newHash.get(nums[j]) );

            if(newHash.get(nums[j])==1){
                return nums[j];
            }
        }
        return 0;
    }
}
