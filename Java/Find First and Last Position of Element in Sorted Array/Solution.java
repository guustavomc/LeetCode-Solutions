/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
 
Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int right=nums.length-1;
        int left=0;
        int firstPosition=-1;
        int lastPosition=-1;
        /*Find left element */
        while(right>=left){
            int middle=left+((right-left)/2);
            if(nums[middle]>target){
                right=middle-1;
            }
            else if(nums[middle]<target){
                left=middle+1;
            }
            else{
                right=middle-1;
                firstPosition=middle;
            }
            System.out.println(middle);
        }
        /*Find second element */

        right=nums.length-1;
        left=0;
        while(right>=left){
            int middle=left+((right-left)/2);
            if(nums[middle]>target){
                right=middle-1;
            }
            else if(nums[middle]<target){
                left=middle+1;
            }
            else{
                left=middle+1;
                lastPosition=middle;
            }
        }
        int[] result= {firstPosition,lastPosition};
        return result;

    }
}
