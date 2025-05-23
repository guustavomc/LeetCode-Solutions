/*A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

 

Example 1:

Input: s = "())"
Output: 1
Example 2:

Input: s = "((("
Output: 3
 

Constraints:

1 <= s.length <= 1000
s[i] is either '(' or ')'.*/
class Solution {
    public int minAddToMakeValid(String s) {
        int openParentheses=0;
        int closeParentheses=0;
        Stack<Character> parenthesesStack = new Stack<>();
        int valueToMakeValid = 0;
        char[] sArray = s.toCharArray(); 
        for(int i=0;i<sArray.length;i++){
            if (sArray[i] =='('){
                openParentheses++;
            }
            else{
                if(openParentheses>0){
                    openParentheses--;
                }
                else{
                    closeParentheses++;
                }
            }

        }
        return openParentheses+closeParentheses;
    
    }
}
