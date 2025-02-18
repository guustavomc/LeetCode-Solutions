/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 */
class Solution {
    public boolean isValid(String s) {
        char[] charS = s.toCharArray();
        Stack <Character> inputStack = new Stack<>();
        for(Character c: charS){
            if(c=='(' || c=='{' || c=='['){
                inputStack.push(c);
            }
            else{
                if(inputStack.empty()){
                    return false;
                }
                else if(c==')'){
                    if(inputStack.peek()=='('){
                        inputStack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(c=='}'){
                    if(inputStack.peek()=='{'){
                        inputStack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(c==']'){
                    if(inputStack.peek()=='['){
                        inputStack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return inputStack.empty();
    }
}
