class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (!st.isEmpty() && ((ch == 'B' && st.peek() == 'A') || (ch == 'D' && st.peek() == 'C'))) {
                st.pop();
            }else{
                st.push(ch);
            }
        }

        return st.size();
        // StringBuilder sb = new StringBuilder();

        // for (Character ch : st) {
        //     sb.append(ch);
        // }
        // return sb.toString();
    }
}