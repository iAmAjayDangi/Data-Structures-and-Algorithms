class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack();

        boolean ans = true;

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else{
                if(st.empty()){
                    ans = false;
                    break;
                }
                else if(c == ')' && st.peek() != '('){
                    ans = false;
                    break;
                }
                else if(c == ']' && st.peek() != '['){
                    ans = false;
                    break;
                }
                else if(c == '}' && st.peek() != '{'){
                    ans = false;
                    break;
                }
                else{
                    st.pop();
                }
            }

        }

        if(!st.empty()){
            ans = false;
        }

        return ans;
        
    }
}