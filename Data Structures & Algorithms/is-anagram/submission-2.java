

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> char_o_s = new HashMap<>();
        HashMap<Character, Integer> char_o_t = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            Character c_s = s.charAt(i);
            Character c_t = t.charAt(i);
            char_o_s.put(c_s, char_o_s.getOrDefault(c_s, 0)+1);
            char_o_t.put(c_t, char_o_t.getOrDefault(c_t, 0)+1);
        }

        return char_o_s.equals(char_o_t);
    }
}