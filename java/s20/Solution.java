package Java.s20;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char ch = st.peek();
                    if ((ch != '(' && s.charAt(i) == ')') || (ch != '[' && s.charAt(i) == ']') || (ch != '{' && s.charAt(i) == '}')) {
                        return false;
                    }
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}