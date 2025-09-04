/*Given a string s, find the length of the longest substring without duplicate characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 
Constraints:
0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int left=0;
        int maxCount = 0;
        HashSet<Character> currentCharacters = new HashSet<>();
        String[] sArray = s.split("");
        

        for(int right=0; right< s.length(); right++){
            if(!currentCharacters.contains(s.charAt(right))){
                currentCharacters.add(s.charAt(right));
                maxCount= Math.max(maxCount, right - left + 1);
            }
            else{
                while(currentCharacters.contains(s.charAt(right))){
                    currentCharacters.remove(s.charAt(left));
                    left++;
                }
                currentCharacters.add(s.charAt(right));
            }
        }
        return maxCount;
    }
}
