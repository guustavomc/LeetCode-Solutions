/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?*/

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sCountOfCharacters = new HashMap<Character, Integer>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            if(sCountOfCharacters.containsKey(currentChar)){
                sCountOfCharacters.put(currentChar, sCountOfCharacters.get(currentChar)+1);
            }
            else{
                sCountOfCharacters.put(currentChar, 1);

            }
        }
        for(int j=0; j<t.length(); j++){
            char currentTChar = t.charAt(j);
            if(sCountOfCharacters.containsKey(currentTChar)==false){
                return false;
            }
            int currentCount = sCountOfCharacters.get(currentTChar);
            if(currentCount-1 <0){
                return false;
            }
            sCountOfCharacters.put(currentTChar, currentCount-1);
                
            
        }
        return true;

    }
}
