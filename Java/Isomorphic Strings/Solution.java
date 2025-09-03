/*Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Explanation:
The strings s and t can be made identical by:
Mapping 'e' to 'a'.
Mapping 'g' to 'd'.

Example 2:
Input: s = "foo", t = "bar"
Output: false

Explanation:
The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:
Input: s = "paper", t = "title"
Output: true

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
    
        if(sCharArray.length != tCharArray.length){
            return false;
        }

        HashMap<Character,Character> charMap = new HashMap<Character, Character>();
        for(int i=0; i<sCharArray.length;i++){
            if(charMap.containsKey(sCharArray[i])){
                if(charMap.get(sCharArray[i])!=tCharArray[i]){
                    return false;
                }
            }
            else if(charMap.containsValue(tCharArray[i])){
                return false;
            }
            else{
                charMap.put(sCharArray[i],tCharArray[i]);
            }
        }
        return true;
    }
}
