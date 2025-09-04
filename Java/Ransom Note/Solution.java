/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.


Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 
Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();
        if(magazineArray.length<ransomNoteArray.length){
            return false;
        }

        HashMap<Character,Integer> magazineMap= new HashMap<>();
        for(int i=0;i<magazineArray.length;i++){
            char characterMagazine = magazineArray[i];
            if(magazineMap.containsKey(characterMagazine)){
                magazineMap.put(characterMagazine, magazineMap.get(characterMagazine)+1);
            }
            else{
                magazineMap.put(characterMagazine,1);
            }
        }
        for(int j=0;j<ransomNoteArray.length;j++){
            char characterRansom = ransomNoteArray[j];
            if(!magazineMap.containsKey(characterRansom)){
                return false;
            }
            else if(magazineMap.get(characterRansom)==0){
                return false;
            }
            else{
                magazineMap.put(characterRansom, magazineMap.get(characterRansom)-1);
            }
        }
        return true;

    }
}
