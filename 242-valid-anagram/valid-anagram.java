class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            l1.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            l2.add(t.charAt(i));
        }

        Collections.sort(l1);
        Collections.sort(l2);

        return l1.equals(l2);
    }
}