/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?*/
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> tableValues = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(tableValues.containsKey(nums[i])){
                tableValues.put(nums[i],tableValues.get(nums[i])+1);
            }
            else{
                tableValues.putIfAbsent(nums[i],1);
            }
        }
        int biggestElement = 0;
        int maxCount=0;
        for (int key : tableValues.keySet()){
            int count = tableValues.get(key);
            if(maxCount<=count){
                maxCount = count;
                biggestElement = key;
            }
        }
        return biggestElement;
    }
}
